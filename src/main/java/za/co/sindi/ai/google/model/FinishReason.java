/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public enum FinishReason {
	FINISH_REASON_UNSPECIFIED("The finish reason is unspecified.")
	,STOP("Natural stop point of the model or provided stop sequence.")
	,MAX_TOKENS("The maximum number of tokens as specified in the request was reached.")
	,SAFETY("The token generation was stopped as the response was flagged for safety reasons. NOTE: When streaming the Candidate.content will be empty if content filters blocked the output")
	,RECITATION("The token generation was stopped as the response was flagged for unauthorized citations.")
	,OTHER("All other reasons that stopped the token generation")
	;
	private final String description;

	/**
	 * @param description
	 */
	private FinishReason(String description) {
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
