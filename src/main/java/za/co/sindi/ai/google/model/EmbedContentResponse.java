/**
 * 
 */
package za.co.sindi.ai.google.model;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 25 February 2024
 */
public class EmbedContentResponse {

	@JsonbProperty
	private ContentEmbedding embedding;

	/**
	 * @return the embedding
	 */
	public ContentEmbedding getEmbedding() {
		return embedding;
	}

	/**
	 * @param embedding the embedding to set
	 */
	public void setEmbedding(ContentEmbedding embedding) {
		this.embedding = embedding;
	}
}
