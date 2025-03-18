/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 25 February 2024
 */
public enum MediaResolution {
	MEDIA_RESOLUTION_UNSPECIFIED("Media resolution has not been set.")
	,MEDIA_RESOLUTION_LOW("Media resolution set to low (64 tokens).")
	,MEDIA_RESOLUTION_MEDIUM("Media resolution set to medium (256 tokens).")
	,MEDIA_RESOLUTION_HIGH("Media resolution set to high (zoomed reframing with 256 tokens).")
	;
	private final String description;

	/**
	 * @param description
	 */
	private MediaResolution(String description) {
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
