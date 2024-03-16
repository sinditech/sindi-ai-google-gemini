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

import za.co.sindi.ai.google.model.BatchEmbedContentsRequest;
import za.co.sindi.ai.google.model.BatchEmbedContentsResponse;
import za.co.sindi.ai.google.model.EmbedContentRequest;
import za.co.sindi.ai.google.model.EmbedContentResponse;
import za.co.sindi.ai.google.model.EmbeddingModelName;
import za.co.sindi.commons.io.UncheckedException;
import za.co.sindi.commons.util.Either;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public class GoogleAIEmbeddingServiceClient extends GoogleAIServiceClient implements EmbeddingServiceClient, AsyncEmbeddingServiceClient {

	private final String batchEmbedContentsUriPath;
	private final String embedContentUriPath;
	
	/**
	 * @param modelName
	 * @param accessToken
	 */
	public GoogleAIEmbeddingServiceClient(EmbeddingModelName modelName, String apiKey) {
		this(Objects.requireNonNull(modelName, "An embedding model name is required.").getName(), Objects.requireNonNull(apiKey, "An API Key is required."));
	}
	
	/**
	 * @param modelName
	 * @param accessToken
	 */
	public GoogleAIEmbeddingServiceClient(String modelName, String apiKey) {
		super(modelName);
		Objects.requireNonNull(apiKey, "An API Key is required.");
		
		this.batchEmbedContentsUriPath = String.format("%s/v1beta/models/%s:batchEmbedContents?key=%s", SERVICE_ENDPOINT, modelName, apiKey);
		this.embedContentUriPath = String.format("%s/v1beta/models/%s:embedContent?key=%s", SERVICE_ENDPOINT, modelName, apiKey);
	}

	@Override
	public CompletableFuture<BatchEmbedContentsResponse> batchEmbedContentsAsync(BatchEmbedContentsRequest request) {
		// TODO Auto-generated method stub
		HttpRequest.Builder httpRequestBuilder = createHttpPOSTRequestBuilder(URI.create(batchEmbedContentsUriPath), BodyPublishers.ofString(objectTransformer.transform(request)));
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(httpRequestBuilder, BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), BatchEmbedContentsResponse.class)).toCompletableFuture();
	}

	@Override
	public CompletableFuture<EmbedContentResponse> embedContentAsync(EmbedContentRequest request) {
		// TODO Auto-generated method stub
		HttpRequest.Builder httpRequestBuilder = createHttpPOSTRequestBuilder(URI.create(embedContentUriPath), BodyPublishers.ofString(objectTransformer.transform(request)));
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(httpRequestBuilder, BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), EmbedContentResponse.class)).toCompletableFuture();
	}

	@Override
	public BatchEmbedContentsResponse batchEmbedContents(BatchEmbedContentsRequest request) {
		// TODO Auto-generated method stub
		try {
			HttpRequest.Builder httpRequestBuilder = createHttpPOSTRequestBuilder(URI.create(batchEmbedContentsUriPath), BodyPublishers.ofString(objectTransformer.transform(request)));
			HttpResponse<Either<String, String>> httpResponse = send(httpRequestBuilder, BodyHandlers.ofString());
			return objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), BatchEmbedContentsResponse.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}

	@Override
	public EmbedContentResponse embedContent(EmbedContentRequest request) {
		// TODO Auto-generated method stub
		try {
			HttpRequest.Builder httpRequestBuilder = createHttpPOSTRequestBuilder(URI.create(embedContentUriPath), BodyPublishers.ofString(objectTransformer.transform(request)));
			HttpResponse<Either<String, String>> httpResponse = send(httpRequestBuilder, BodyHandlers.ofString());
			return objectTransformer.transform(validateAndHandleHttpResponse(httpResponse), EmbedContentResponse.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new UncheckedIOException(e);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new UncheckedException(e);
		}
	}
}
