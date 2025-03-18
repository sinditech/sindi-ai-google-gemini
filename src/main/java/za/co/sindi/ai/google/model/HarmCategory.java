/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 * @see <a href="https://ai.google.dev/api/generate-content#v1beta.SafetySetting">Safety Settings</a>
 */
public enum HarmCategory {
	HARM_CATEGORY_UNSPECIFIED("The harm category is unspecified.")
	
	//From PaLM
	,HARM_CATEGORY_DEROGATORY("Negative or harmful comments targeting identity and/or protected attribute.")
	,HARM_CATEGORY_TOXICITY("Content that is rude, disrespectful, or profane.")
	,HARM_CATEGORY_VIOLENCE("Describes scenarios depicting violence against an individual or group, or general descriptions of gore.")
	,HARM_CATEGORY_SEXUAL("Contains references to sexual acts or other lewd content.")
	,HARM_CATEGORY_MEDICAL("Promotes unchecked medical advice.")
	,HARM_CATEGORY_DANGEROUS("Dangerous content that promotes, facilitates, or encourages harmful acts.")
	
	//From Gemini
	,HARM_CATEGORY_HATE_SPEECH("The harm category is hate speech.")
	,HARM_CATEGORY_DANGEROUS_CONTENT("The harm category is dangerous content.")
	,HARM_CATEGORY_HARASSMENT("The harm category is harassment.")
	,HARM_CATEGORY_SEXUALLY_EXPLICIT("The harm category is sexually explicit content.")
	,HARM_CATEGORY_CIVIC_INTEGRITY("Content that may be used to harm civic integrity.")
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
