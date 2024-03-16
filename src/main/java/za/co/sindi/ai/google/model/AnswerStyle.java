/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 25 February 2024
 */
public enum AnswerStyle {
	ANSWER_STYLE_UNSPECIFIED("Unspecified answer style.")
	,ABSTRACTIVE("Succint but abstract style.")
	,EXTRACTIVE("Very brief and extractive style.")
	,VERBOSE("Verbose style including extra details. The response may be formatted as a sentence, paragraph, multiple paragraphs, or bullet points, etc.")
	;
	private final String description;

	/**
	 * @param description
	 */
	private AnswerStyle(String description) {
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
