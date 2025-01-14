/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public enum HarmBlockThreshold {
	HARM_BLOCK_THRESHOLD_UNSPECIFIED("Threshold is unspecified.")
	,BLOCK_LOW_AND_ABOVE("Content with NEGLIGIBLE will be allowed.")
	,BLOCK_MEDIUM_AND_ABOVE("Content with NEGLIGIBLE and LOW will be allowed.")
	,BLOCK_ONLY_HIGH("Content with NEGLIGIBLE, LOW, and MEDIUM will be allowed.")
	,BLOCK_NONE("All content will be allowed.")
	,OFF("Turn off the safety filter.")
	;
	private final String description;

	/**
	 * @param description
	 */
	private HarmBlockThreshold(String description) {
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
