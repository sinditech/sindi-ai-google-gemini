package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 14 January 2025
 * @see <a href="https://ai.google.dev/api/caching#Outcome">Outcome</a>.
 */
public enum Outcome {
	OUTCOME_UNSPECIFIED("Unspecified status. This value should not be used.")
	,OUTCOME_OK("Code execution completed successfully.")
	,OUTCOME_FAILED("Code execution finished but with a failure. stderr should contain the reason.")
	,OUTCOME_DEADLINE_EXCEEDED("Code execution ran for too long, and was cancelled. There may or may not be a partial output present.")
	;
	private final String description;

	/**
	 * @param description
	 */
	private Outcome(String description) {
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
