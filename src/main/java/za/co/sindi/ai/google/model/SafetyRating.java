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
public class SafetyRating implements Serializable {

	@JsonbProperty
	private HarmCategory category;
	
	@JsonbProperty
	private HarmProbability probability;
	
	@JsonbProperty
	private Boolean blocked;

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
	 * @return the probability
	 */
	public HarmProbability getProbability() {
		return probability;
	}

	/**
	 * @param probability the probability to set
	 */
	public void setProbability(HarmProbability probability) {
		this.probability = probability;
	}

	/**
	 * @return the blocked
	 */
	public Boolean getBlocked() {
		return blocked;
	}

	/**
	 * @param blocked the blocked to set
	 */
	public void setBlocked(Boolean blocked) {
		this.blocked = blocked;
	}
}
