package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 14 January 2025
 * @see <a href="https://ai.google.dev/api/caching#Language">Language</a>.
 */
public enum Language {
	LANGUAGE_UNSPECIFIED("Unspecified language. This value should not be used.")
	,PYTHON("Python >= 3.10, with numpy and simpy available.")
	;
	private final String description;

	/**
	 * @param description
	 */
	private Language(String description) {
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
