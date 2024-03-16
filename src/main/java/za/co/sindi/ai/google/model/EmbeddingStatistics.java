/**
 * 
 */
package za.co.sindi.ai.google.model;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 27 February 2024 
 */
public class EmbeddingStatistics {

	@JsonbProperty
	private Boolean truncated;
	
	@JsonbProperty("token_count")
	private Integer tokenCount;

	/**
	 * @return the truncated
	 */
	public Boolean getTruncated() {
		return truncated;
	}

	/**
	 * @param truncated the truncated to set
	 */
	public void setTruncated(Boolean truncated) {
		this.truncated = truncated;
	}

	/**
	 * @return the tokenCount
	 */
	public Integer getTokenCount() {
		return tokenCount;
	}

	/**
	 * @param tokenCount the tokenCount to set
	 */
	public void setTokenCount(Integer tokenCount) {
		this.tokenCount = tokenCount;
	}
}
