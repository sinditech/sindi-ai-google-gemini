/**
 * 
 */
package za.co.sindi.ai.google.model;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 25 February 2024
 */
public class BatchEmbedContentsResponse {

	@JsonbProperty
	private ContentEmbedding[] embeddings;

	/**
	 * @return the embeddings
	 */
	public ContentEmbedding[] getEmbeddings() {
		return embeddings;
	}

	/**
	 * @param embeddings the embeddings to set
	 */
	public void setEmbeddings(ContentEmbedding[] embeddings) {
		this.embeddings = embeddings;
	}
}
