/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public enum GenerativeModelName {
	GEMINI_PRO("gemini-pro"),
	@Deprecated
	GEMINI_PRO_VISION("gemini-pro-vision"),
	GEMINI_1_5_PRO("gemini-1.5-pro"),
	GEMINI_1_5_FLASH("gemini-1.5-flash"),
	GEMINI_1_0_PRO("gemini-1.0-pro"),
	GEMINI_1_0_PRO_VISION("gemini-1.0-pro-vision"),
	GEMINI_ULTRA("gemini-ultra"),
	GEMINI_ULTRA_VISION("gemini-ultra-vision"),
	;
	private final String name;

	/**
	 * @param name
	 */
	private GenerativeModelName(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public static GenerativeModelName of(final String name) {
		for (GenerativeModelName model : values()) {
			if (model.name.equals(name)) return model;
		}
		
		throw new IllegalArgumentException(String.format("Invalid model name: %s.", name));
	}
	
	public static GenerativeModelName getLatest() {
		return GEMINI_1_5_PRO;
	}
}
