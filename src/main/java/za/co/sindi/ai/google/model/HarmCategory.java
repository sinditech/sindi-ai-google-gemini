/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public enum HarmCategory {
	HARM_CATEGORY_UNSPECIFIED("The harm category is unspecified.")
	,HARM_CATEGORY_HATE_SPEECH("The harm category is hate speech.")
	,HARM_CATEGORY_DANGEROUS_CONTENT("The harm category is dangerous content.")
	,HARM_CATEGORY_HARASSMENT("The harm category is harassment.")
	,HARM_CATEGORY_SEXUALLY_EXPLICIT("The harm category is sexually explicit content.")
	;
	private final String description;

	/**
	 * @param description
	 */
	private HarmCategory(String description) {
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
