/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public enum EmbeddingModelName {
	EMBEDDING_001("embedding-001"),
	;
	private final String name;

	/**
	 * @param name
	 */
	private EmbeddingModelName(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public static EmbeddingModelName of(final String name) {
		for (EmbeddingModelName model : values()) {
			if (model.name.equals(name)) return model;
		}
		
		throw new IllegalArgumentException(String.format("Invalid model name: %s.", name));
	}
}
