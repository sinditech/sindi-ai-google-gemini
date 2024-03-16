/**
 * 
 */
package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 25 February 2024
 */
public class Embeddings implements Serializable {

	@JsonbProperty
	private EmbeddingStatistics statistics;
	
	@JsonbProperty
	private float[] values;

	/**
	 * @return the statistics
	 */
	public EmbeddingStatistics getStatistics() {
		return statistics;
	}

	/**
	 * @param statistics the statistics to set
	 */
	public void setStatistics(EmbeddingStatistics statistics) {
		this.statistics = statistics;
	}

	/**
	 * @return the values
	 */
	public float[] getValues() {
		return values;
	}

	/**
	 * @param values the values to set
	 */
	public void setValues(float[] values) {
		this.values = values;
	}
}
