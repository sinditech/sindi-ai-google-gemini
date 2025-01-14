/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public enum GenerativeModelName {
	@Deprecated
	GEMINI_PRO("gemini-pro"),
	@Deprecated
	GEMINI_PRO_VISION("gemini-pro-vision"),
	GEMINI_1_5_PRO("gemini-1.5-pro"),
	GEMINI_1_5_PRO_LATEST("gemini-1.5-pro-latest"),
	GEMINI_1_5_FLASH("gemini-1.5-flash"),
	GEMINI_1_5_FLASH_LATEST("gemini-1.5-flash-latest"),
	GEMINI_1_5_FLASH_8B("gemini-1.5-flash-8b"),
	GEMINI_1_5_FLASH_8B_LATEST("gemini-1.5-flash-8b-latest"),
	@Deprecated
	GEMINI_1_0_PRO("gemini-1.0-pro"),
	@Deprecated
	GEMINI_1_0_PRO_LATEST("gemini-1.0-pro-latest"),
	@Deprecated
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
		return GEMINI_1_5_PRO_LATEST;
	}
}
