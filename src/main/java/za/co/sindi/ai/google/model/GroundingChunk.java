package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 13 January 2025
 * @see <a href="https://ai.google.dev/api/generate-content#GroundingChunk">GroundingChunk</a>.
 */
public class GroundingChunk implements Serializable {

//	@JsonbProperty("chunk_type")
//	private Object chunkType;
	
	@JsonbProperty
	private Web web;

	/**
	 * @return the web
	 */
	public Web getWeb() {
		return web;
	}

	/**
	 * @param web the web to set
	 */
	public void setWeb(Web web) {
		this.web = web;
	}
}
