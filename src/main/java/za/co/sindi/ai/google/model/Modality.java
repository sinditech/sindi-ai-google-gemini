/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public enum Modality {
	MODALITY_UNSPECIFIED("Unspecified modality.")
	,TEXT("Plain text.")
	,IMAGE("Image.")
	,VIDEO("Video.")
	,AUDIO("Audio.")
	,DOCUMENT("Document, e.g. PDF.")
	;
	private final String description;

	/**
	 * @param description
	 */
	private Modality(String description) {
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
