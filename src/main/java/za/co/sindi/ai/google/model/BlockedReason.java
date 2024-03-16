/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public enum BlockedReason {
	BLOCKED_REASON_UNSPECIFIED("Unspecified blocked reason.")
	,SAFETY("Candidates blocked due to safety.")
	,OTHER("Candidates blocked due to other reason.")
	;
	private final String description;

	/**
	 * @param description
	 */
	private BlockedReason(String description) {
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
