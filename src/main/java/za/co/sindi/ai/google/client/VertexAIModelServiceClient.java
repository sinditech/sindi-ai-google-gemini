/**
 * 
 */
package za.co.sindi.ai.google.client;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import za.co.sindi.ai.google.model.CountTokensRequest;
import za.co.sindi.ai.google.model.CountTokensResponse;
import za.co.sindi.ai.google.model.GenerateAnswerRequest;
import za.co.sindi.ai.google.model.GenerateAnswerResponse;
import za.co.sindi.ai.google.model.GenerateContentRequest;
import za.co.sindi.ai.google.model.GenerateContentResponse;
import za.co.sindi.ai.google.model.GenerativeModelName;
import za.co.sindi.ai.google.model.ListModel;
import za.co.sindi.ai.google.model.ListTunedModel;
import za.co.sindi.ai.google.model.Model;
import za.co.sindi.ai.google.model.Region;
import za.co.sindi.ai.google.model.TunedModel;
import za.co.sindi.commons.io.UncheckedException;
import za.co.sindi.commons.net.sse.AllEventsEventHandler;
import za.co.sindi.commons.net.sse.SSEEventSubscriber;
import za.co.sindi.commons.util.Either;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public class VertexAIModelServiceClient extends VertexAIServiceClient implements ModelServiceClient, AsyncModelServiceClient {

	private final String countTokensUriPath;
//	private final String generateAnswerUriPath;
	private final String generateContentUriPath;
	private final String getModelUriPath;
	private final String listModelsUriPath;
	private final String streamGenerateContentUriPath;
	
	/**
	 * 
	 * @param region
	 * @param projectId
	 * @param modelName
	 * @param accessToken
	 */
	public VertexAIModelServiceClient(final Region region, final String projectId, final String modelName, final String accessToken) {
		this(Objects.requireNonNull(region, "A region is required.").getRegion(), projectId, modelName, accessToken);
	}
	
	/**
	 * 
	 * @param region
	 * @param projectId
	 * @param modelName
	 * @param accessToken
	 */
	public VertexAIModelServiceClient(final Region region, final String projectId, final GenerativeModelName modelName, final String accessToken) {
		this(Objects.requireNonNull(region, "A region is required.").getRegion(), projectId, Objects.requireNonNull(modelName, "A generative model name is required.").getName(), accessToken);
	}
	
	/**
	 * 
	 * @param region
	 * @param projectId
	 * @param modelName
	 * @param accessToken
	 */
	public VertexAIModelServiceClient(final String region, final String projectId, final GenerativeModelName modelName, final String accessToken) {
		this(region, projectId, Objects.requireNonNull(modelName, "A generative model name is required.").getName(), accessToken);
	}
	
	/**
	 * @param region
	 * @param projectId
	 * @param modelName
	 * @param accessToken
	 */
	public VertexAIModelServiceClient(String region, String projectId, String modelName, String accessToken) {
		super(region, modelName, accessToken);
		
		this.countTokensUriPath = String.format("%s/v1/projects/%s/locations/%s/publishers/google/models/%s:countTokens", getServiceEndpoint(), projectId, region, modelName);
//		this.generateAnswerUriPath = String.format("%s/projects/%s/locations/%s/publishers/google/models/%s:generateAnswer", getServiceEndpoint(), projectId, region, modelName);
		this.generateContentUriPath = String.format("%s/v1/projects/%s/locations/%s/publishers/google/models/%s:generateContent", getServiceEndpoint(), projectId, region, modelName);
		this.getModelUriPath = String.format("%s/v1/projects/%s/locations/%s/models/%s", getServiceEndpoint(), projectId, region, modelName);
		this.listModelsUriPath = String.format("%s/v1/projects/%s/locations/%s/models", getServiceEndpoint(), projectId, region);
		this.streamGenerateContentUriPath = String.format("%s/v1/projects/%s/locations/%s/publishers/google/models/%s:streamGenerateContent", getServiceEndpoint(), projectId, region, modelName);
	}

	@Override
	public CompletableFuture<CountTokensResponse> countTokensAsync(CountTokensRequest request) {
		// TODO Auto-generated method stub
		HttpRequest.Builder httpRequestBuilder = createHttpPOSTRequestBuilder(URI.create(countTokensUriPath), BodyPublishers.ofString(objectTransformer.transform(request)));
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(httpRequestBuilder, BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), CountTokensResponse.class)).toCompletableFuture();
	}

	@Override
	public CompletableFuture<GenerateAnswerResponse> generateAnswerAsync(GenerateAnswerRequest request) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public CompletableFuture<GenerateContentResponse> generateContentAsync(GenerateContentRequest request) {
		// TODO Auto-generated method stub
		HttpRequest.Builder httpRequestBuilder = createHttpPOSTRequestBuilder(URI.create(generateContentUriPath), BodyPublishers.ofString(objectTransformer.transform(request)));
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(httpRequestBuilder, BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), GenerateContentResponse.class)).toCompletableFuture();
	}

	@Override
	public CompletableFuture<Model> getModelAsync(String modelName) {
		// TODO Auto-generated method stub
		HttpRequest.Builder httpRequestBuilder = createHttpGETRequestBuilder(URI.create(getModelUriPath));
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(httpRequestBuilder, BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), Model.class)).toCompletableFuture();
	}

	@Override
	public CompletableFuture<Stream<GenerateContentResponse>> generateContentStreamAsync(GenerateContentRequest request) {
		// TODO Auto-generated method stub
		HttpRequest.Builder httpRequestBuilder = createHttpPOSTRequestBuilder(URI.create(streamGenerateContentUriPath) ,BodyPublishers.ofString(objectTransformer.transform(request)));
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(httpRequestBuilder, BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> List.of(objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), GenerateContentResponse[].class)).stream()).toCompletableFuture();
	}

	@Override
	public CountTokensResponse countTokens(CountTokensRequest request) {
		// TODO Auto-generated method stub
		try {
			HttpRequest.Builder httpRequestBuilder = createHttpPOSTRequestBuilder(URI.create(countTokensUriPath), BodyPublishers.ofString(objectTransformer.transform(request)));
			HttpResponse<Either<String, String>> httpResponse = send(httpRequestBuilder, BodyHandlers.ofString());
			return objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), CountTokensResponse.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}

	@Override
	public GenerateAnswerResponse generateAnswer(GenerateAnswerRequest request) {
		throw new UnsupportedOperationException("Method not supported.");
	}

	@Override
	public GenerateContentResponse generateContent(GenerateContentRequest request) {
		// TODO Auto-generated method stub
		try {
			HttpRequest.Builder httpRequestBuilder = createHttpPOSTRequestBuilder(URI.create(generateContentUriPath), BodyPublishers.ofString(objectTransformer.transform(request)));
			HttpResponse<Either<String, String>> httpResponse = send(httpRequestBuilder, BodyHandlers.ofString());
			return objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), GenerateContentResponse.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}

	@Override
	public Model getModel() {
		// TODO Auto-generated method stub
		try {
			HttpRequest.Builder httpRequestBuilder = createHttpGETRequestBuilder(URI.create(getModelUriPath));
			HttpResponse<Either<String, String>> httpResponse = send(httpRequestBuilder, BodyHandlers.ofString());
			return objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), Model.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}

	@Override
	public Stream<GenerateContentResponse> generateContentStream(GenerateContentRequest request) {
		// TODO Auto-generated method stub
		try {
			AllEventsEventHandler sseEventHandler = new AllEventsEventHandler();
			SSEEventSubscriber sseEventSubscriber = new SSEEventSubscriber(sseEventHandler);
			HttpRequest.Builder httpRequestBuilder = createHttpPOSTRequestBuilder(URI.create(streamGenerateContentUriPath), BodyPublishers.ofString(objectTransformer.transform(request)));
			HttpResponse<Either<Void, String>> httpResponse = send(httpRequestBuilder, BodyHandlers.fromLineSubscriber(sseEventSubscriber));
			validateAndHandleHttpResponse(httpResponse);
			return handleStream(sseEventHandler.getEventStream(), GenerateContentResponse.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.google.client.AsyncModelServiceClient#listModelsAsync(java.lang.Integer, java.lang.String)
	 */
	@Override
	public CompletableFuture<ListModel> listModelsAsync(Integer pageSize, String pageToken) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		createQueryParameterString(sb, "pageSize", pageSize);
		createQueryParameterString(sb, "pageToken", pageToken);
		HttpRequest.Builder httpRequestBuilder = createHttpGETRequestBuilder(URI.create(listModelsUriPath + (sb.isEmpty() ? "" : "&" + sb.toString())));
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(httpRequestBuilder, BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), ListModel.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.google.client.AsyncModelServiceClient#createTunedModelAsync(java.lang.String, za.co.sindi.ai.google.model.TunedModel)
	 */
	@Override
	public CompletableFuture<Object> createTunedModelAsync(String tunedModelId, TunedModel tunedModel) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Method not supported.");
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.google.client.AsyncModelServiceClient#getTunedModelAsync(java.lang.String)
	 */
	@Override
	public CompletableFuture<TunedModel> getTunedModelAsync(String tunedModelId) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Method not supported.");
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.google.client.AsyncModelServiceClient#listTunedModelAsync(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	@Override
	public CompletableFuture<ListTunedModel> listTunedModelAsync(Integer pageSize, String pageToken, String filter) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Method not supported.");
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.google.client.AsyncModelServiceClient#updateTunedModelAsync(java.lang.String, za.co.sindi.ai.google.model.TunedModel)
	 */
	@Override
	public CompletableFuture<TunedModel> updateTunedModelAsync(String tunedModelId, TunedModel tunedModel) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Method not supported.");
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.google.client.ModelServiceClient#listModels(java.lang.Integer, java.lang.String)
	 */
	@Override
	public ListModel listModels(Integer pageSize, String pageToken) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		createQueryParameterString(sb, "pageSize", pageSize);
		createQueryParameterString(sb, "pageToken", pageToken);
		try {
			HttpRequest.Builder httpRequestBuilder = createHttpGETRequestBuilder(URI.create(listModelsUriPath + (sb.isEmpty() ? "" : "&" + sb.toString())));
			HttpResponse<Either<String, String>> httpResponse = send(httpRequestBuilder, BodyHandlers.ofString());
			return objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), ListModel.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.google.client.ModelServiceClient#createTunedModel(java.lang.String, za.co.sindi.ai.google.model.TunedModel)
	 */
	@Override
	public Object createTunedModel(String tunedModelId, TunedModel tunedModel) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Method not supported.");
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.google.client.ModelServiceClient#getTunedModel(java.lang.String)
	 */
	@Override
	public TunedModel getTunedModel(String tunedModelId) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Method not supported.");
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.google.client.ModelServiceClient#listTunedModel(java.lang.Integer, java.lang.String, java.lang.String)
	 */
	@Override
	public ListTunedModel listTunedModel(Integer pageSize, String pageToken, String filter) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Method not supported.");
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.google.client.ModelServiceClient#updateTunedModel(java.lang.String, za.co.sindi.ai.google.model.TunedModel)
	 */
	@Override
	public TunedModel updateTunedModel(String tunedModelId, TunedModel tunedModel) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Method not supported.");
	}
}
