/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public enum BlockReason {
	BLOCKED_REASON_UNSPECIFIED("Default value. This value is unused.")
	,SAFETY("Input was blocked due to safety reasons. Inspect safetyRatings to understand which safety category blocked it.")
	,OTHER("Input was blocked due to other reasons.")
	;
	private final String description;

	/**
	 * @param description
	 */
	private BlockReason(String description) {
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
