/**
 * 
 */
package za.co.sindi.ai.google.model;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 27 February 2024 
 */
public class Prediction {

	@JsonbProperty
	private Embeddings[] embeddings;

	/**
	 * @return the embeddings
	 */
	public Embeddings[] getEmbeddings() {
		return embeddings;
	}

	/**
	 * @param embeddings the embeddings to set
	 */
	public void setEmbeddings(Embeddings[] embeddings) {
		this.embeddings = embeddings;
	}
}
