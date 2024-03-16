/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public enum HarmBlockThreshold {
	HARM_BLOCK_THRESHOLD_UNSPECIFIED("Unspecified harm block threshold.")
	,BLOCK_LOW_AND_ABOVE("Block low threshold and above (i.e. block more).")
	,BLOCK_MEDIUM_AND_ABOVE("Block medium threshold and above.")
	,BLOCK_ONLY_HIGH("Block only high threshold (i.e. block less).")
	,BLOCK_NONE("Block none.")
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
