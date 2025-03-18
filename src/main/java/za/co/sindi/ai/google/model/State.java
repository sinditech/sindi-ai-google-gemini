package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://ai.google.dev/api/tuning#State">State</a>.
 */
public enum State {
	STATE_UNSPECIFIED("The default value. This value is unused.")
	,CREATING("The model is being created.")
	,ACTIVE("The model is ready to be used.")
	,FAILED("The model failed to be created.")
	;
	private final String description;

	/**
	 * @param description
	 */
	private State(String description) {
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
