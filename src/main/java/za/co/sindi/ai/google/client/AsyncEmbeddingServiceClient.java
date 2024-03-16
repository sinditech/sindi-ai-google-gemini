/**
 * 
 */
package za.co.sindi.ai.google.client;

import java.util.concurrent.CompletableFuture;

import za.co.sindi.ai.google.model.BatchEmbedContentsRequest;
import za.co.sindi.ai.google.model.BatchEmbedContentsResponse;
import za.co.sindi.ai.google.model.EmbedContentRequest;
import za.co.sindi.ai.google.model.EmbedContentResponse;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public interface AsyncEmbeddingServiceClient extends ServiceClient {
	
	public String getModelName();

	public CompletableFuture<BatchEmbedContentsResponse> batchEmbedContentsAsync(final BatchEmbedContentsRequest request);
	public CompletableFuture<EmbedContentResponse> embedContentAsync(final EmbedContentRequest request);
}
