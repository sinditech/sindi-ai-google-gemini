/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public enum MultimodalEmbeddingModelName {
	MULTIMODALEMBEDDING("multimodalembedding"),
	;
	private final String name;

	/**
	 * @param name
	 */
	private MultimodalEmbeddingModelName(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public static MultimodalEmbeddingModelName of(final String name) {
		for (MultimodalEmbeddingModelName model : values()) {
			if (model.name.equals(name)) return model;
		}
		
		throw new IllegalArgumentException(String.format("Invalid model name: %s.", name));
	}
}
