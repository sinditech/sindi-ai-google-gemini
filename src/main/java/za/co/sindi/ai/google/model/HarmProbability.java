/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public enum HarmProbability {
	HARM_PROBABILITY_UNSPECIFIED("Harm probability unspecified.")
	,NEGLIGIBLE("Negligible level of harm.")
	,LOW("Low level of harm.")
	,MEDIUM("Medium level of harm.")
	,HIGH("High level of harm.")
	;
	private final String description;

	/**
	 * @param description
	 */
	private HarmProbability(String description) {
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
