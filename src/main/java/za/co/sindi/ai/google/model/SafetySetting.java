/**
 * 
 */
package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public class SafetySetting implements Serializable {

	@JsonbProperty
	private HarmCategory category;
	
	@JsonbProperty
	private HarmBlockThreshold threshold;

	/**
	 * @return the category
	 */
	public HarmCategory getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(HarmCategory category) {
		this.category = category;
	}

	/**
	 * @return the threshold
	 */
	public HarmBlockThreshold getThreshold() {
		return threshold;
	}

	/**
	 * @param threshold the threshold to set
	 */
	public void setThreshold(HarmBlockThreshold threshold) {
		this.threshold = threshold;
	}
}
