/**
 * 
 */
package za.co.sindi.ai.google.client;

import za.co.sindi.ai.google.model.BatchEmbedContentsRequest;
import za.co.sindi.ai.google.model.BatchEmbedContentsResponse;
import za.co.sindi.ai.google.model.EmbedContentRequest;
import za.co.sindi.ai.google.model.EmbedContentResponse;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public interface EmbeddingServiceClient extends ServiceClient {
	
	public String getModelName();
	
	public BatchEmbedContentsResponse batchEmbedContents(final BatchEmbedContentsRequest request);
	public EmbedContentResponse embedContent(final EmbedContentRequest request);
}
