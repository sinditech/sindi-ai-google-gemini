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
public class ContentEmbedding implements Serializable {

	@JsonbProperty
	private float[] values;

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
