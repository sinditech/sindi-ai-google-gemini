/**
 * 
 */
package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public class UsageMetadata implements Serializable {

	@JsonbProperty
	private Integer promptTokenCount;
	
	@JsonbProperty
	private Integer cachedContentTokenCount;
	
	@JsonbProperty
	private Integer candidatesTokenCount;

	@JsonbProperty
	private Integer totalTokenCount;

	/**
	 * @return the promptTokenCount
	 */
	public Integer getPromptTokenCount() {
		return promptTokenCount;
	}

	/**
	 * @param promptTokenCount the promptTokenCount to set
	 */
	public void setPromptTokenCount(Integer promptTokenCount) {
		this.promptTokenCount = promptTokenCount;
	}

	/**
	 * @return the cachedContentTokenCount
	 */
	public Integer getCachedContentTokenCount() {
		return cachedContentTokenCount;
	}

	/**
	 * @param cachedContentTokenCount the cachedContentTokenCount to set
	 */
	public void setCachedContentTokenCount(Integer cachedContentTokenCount) {
		this.cachedContentTokenCount = cachedContentTokenCount;
	}

	/**
	 * @return the candidatesTokenCount
	 */
	public Integer getCandidatesTokenCount() {
		return candidatesTokenCount;
	}

	/**
	 * @param candidatesTokenCount the candidatesTokenCount to set
	 */
	public void setCandidatesTokenCount(Integer candidatesTokenCount) {
		this.candidatesTokenCount = candidatesTokenCount;
	}

	/**
	 * @return the totalTokenCount
	 */
	public Integer getTotalTokenCount() {
		return totalTokenCount;
	}

	/**
	 * @param totalTokenCount the totalTokenCount to set
	 */
	public void setTotalTokenCount(Integer totalTokenCount) {
		this.totalTokenCount = totalTokenCount;
	}
}
