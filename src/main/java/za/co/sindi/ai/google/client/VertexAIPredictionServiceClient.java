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
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

import za.co.sindi.ai.google.model.GenerativeModelName;
import za.co.sindi.ai.google.model.MultimodalEmbeddingModelName;
import za.co.sindi.ai.google.model.PredictRequest;
import za.co.sindi.ai.google.model.PredictResponse;
import za.co.sindi.ai.google.model.Region;
import za.co.sindi.ai.google.model.TextEmbeddingModelName;
import za.co.sindi.commons.io.UncheckedException;
import za.co.sindi.commons.util.Either;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public class VertexAIPredictionServiceClient extends VertexAIServiceClient implements PredictionServiceClient, AsyncPredictionServiceClient {

	private final String predictUriPath;
	
	/**
	 * 
	 * @param region
	 * @param projectId
	 * @param modelName
	 * @param accessToken
	 */
	public VertexAIPredictionServiceClient(final Region region, final String projectId, final String modelName, final String accessToken) {
		this(Objects.requireNonNull(region, "A region is required.").getRegion(), projectId, modelName, accessToken);
	}
	
	/**
	 * 
	 * @param region
	 * @param projectId
	 * @param modelName
	 * @param accessToken
	 */
	public VertexAIPredictionServiceClient(final Region region, final String projectId, final TextEmbeddingModelName modelName, final String accessToken) {
		this(Objects.requireNonNull(region, "A region is required.").getRegion(), projectId, Objects.requireNonNull(modelName, "A text embedding model name is required.").getName(), accessToken);
	}
	
	/**
	 * 
	 * @param region
	 * @param projectId
	 * @param modelName
	 * @param accessToken
	 */
	public VertexAIPredictionServiceClient(final Region region, final String projectId, final MultimodalEmbeddingModelName modelName, final String accessToken) {
		this(Objects.requireNonNull(region, "A region is required.").getRegion(), projectId, Objects.requireNonNull(modelName, "A multimodal embedding model name is required.").getName(), accessToken);
	}
	
	/**
	 * 
	 * @param region
	 * @param projectId
	 * @param modelName
	 * @param accessToken
	 */
	public VertexAIPredictionServiceClient(final String region, final String projectId, final GenerativeModelName modelName, final String accessToken) {
		this(region, projectId, Objects.requireNonNull(modelName, "A generative model name is required.").getName(), accessToken);
	}
	
	/**
	 * @param region
	 * @param projectId
	 * @param modelName
	 * @param accessToken
	 */
	public VertexAIPredictionServiceClient(String region, String projectId, String modelName, String accessToken) {
		super(region, modelName, accessToken);
		
		this.predictUriPath = String.format("%s/v1/projects/%s/locations/%s/publishers/google/models/%s:predict", getServiceEndpoint(), projectId, region, modelName);
	}

	@Override
	public CompletableFuture<PredictResponse> predictAsync(PredictRequest request) {
		// TODO Auto-generated method stub
		HttpRequest.Builder httpRequestBuilder = createHttpPOSTRequestBuilder(URI.create(predictUriPath), BodyPublishers.ofString(objectTransformer.transform(request)));
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(httpRequestBuilder, BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), PredictResponse.class)).toCompletableFuture();
	}

	@Override
	public PredictResponse predict(PredictRequest request) {
		// TODO Auto-generated method stub
		try {
			HttpRequest.Builder httpRequestBuilder = createHttpPOSTRequestBuilder(URI.create(predictUriPath), BodyPublishers.ofString(objectTransformer.transform(request)));
			HttpResponse<Either<String, String>> httpResponse = send(httpRequestBuilder, BodyHandlers.ofString());
			return objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), PredictResponse.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}
}
