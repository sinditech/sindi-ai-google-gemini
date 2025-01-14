package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 13 January 2025
 * @see <a href="https://ai.google.dev/api/generate-content#SemanticRetrieverChunk">SemanticRetrieverChunk</a>.
 */
public class SemanticRetrieverChunk implements Serializable {

	@JsonbProperty
	private String source;
	
	@JsonbProperty
	private String chunk;

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the chunk
	 */
	public String getChunk() {
		return chunk;
	}

	/**
	 * @param chunk the chunk to set
	 */
	public void setChunk(String chunk) {
		this.chunk = chunk;
	}
}
