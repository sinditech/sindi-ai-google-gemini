/**
 * 
 */
package za.co.sindi.ai.google.model;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public class GroundingPassages {

	@JsonbProperty
	private GroundingPassage[] passages;

	/**
	 * @return the passages
	 */
	public GroundingPassage[] getPassages() {
		return passages;
	}

	/**
	 * @param passages the passages to set
	 */
	public void setPassages(GroundingPassage[] passages) {
		this.passages = passages;
	}
}
