/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public enum TextEmbeddingModelName {
	TEXTEMBEDDING_GECKO("textembedding-gecko"),
	TEXTEMBEDDING_GECKO_003("textembedding-gecko@003"),
	TEXTEMBEDDING_GECKO_002("textembedding-gecko@002"),
	TEXTEMBEDDING_GECKO_MULTILINGUAL_001("textembedding-gecko-multilingual@001"),
	TEXTEMBEDDING_GECKO_001("textembedding-gecko@001")
	;
	private final String name;

	/**
	 * @param name
	 */
	private TextEmbeddingModelName(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public static TextEmbeddingModelName of(final String name) {
		for (TextEmbeddingModelName model : values()) {
			if (model.name.equals(name)) return model;
		}
		
		throw new IllegalArgumentException(String.format("Invalid model name: %s.", name));
	}
}
