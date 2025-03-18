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
	private Integer toolUsePromptTokenCount;
	
	@JsonbProperty
	private Integer thoughtsTokenCount;

	@JsonbProperty
	private Integer totalTokenCount;
	
	@JsonbProperty
	private ModalityTokenCount[] promptTokensDetails;
	
	@JsonbProperty
	private ModalityTokenCount[] candidatesTokensDetails;
	
	@JsonbProperty
	private ModalityTokenCount[] toolUsePromptTokensDetails;

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
	 * @return the toolUsePromptTokenCount
	 */
	public Integer getToolUsePromptTokenCount() {
		return toolUsePromptTokenCount;
	}

	/**
	 * @param toolUsePromptTokenCount the toolUsePromptTokenCount to set
	 */
	public void setToolUsePromptTokenCount(Integer toolUsePromptTokenCount) {
		this.toolUsePromptTokenCount = toolUsePromptTokenCount;
	}

	/**
	 * @return the thoughtsTokenCount
	 */
	public Integer getThoughtsTokenCount() {
		return thoughtsTokenCount;
	}

	/**
	 * @param thoughtsTokenCount the thoughtsTokenCount to set
	 */
	public void setThoughtsTokenCount(Integer thoughtsTokenCount) {
		this.thoughtsTokenCount = thoughtsTokenCount;
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

	/**
	 * @return the promptTokensDetails
	 */
	public ModalityTokenCount[] getPromptTokensDetails() {
		return promptTokensDetails;
	}

	/**
	 * @param promptTokensDetails the promptTokensDetails to set
	 */
	public void setPromptTokensDetails(ModalityTokenCount[] promptTokensDetails) {
		this.promptTokensDetails = promptTokensDetails;
	}

	/**
	 * @return the candidatesTokensDetails
	 */
	public ModalityTokenCount[] getCandidatesTokensDetails() {
		return candidatesTokensDetails;
	}

	/**
	 * @param candidatesTokensDetails the candidatesTokensDetails to set
	 */
	public void setCandidatesTokensDetails(ModalityTokenCount[] candidatesTokensDetails) {
		this.candidatesTokensDetails = candidatesTokensDetails;
	}

	/**
	 * @return the toolUsePromptTokensDetails
	 */
	public ModalityTokenCount[] getToolUsePromptTokensDetails() {
		return toolUsePromptTokensDetails;
	}

	/**
	 * @param toolUsePromptTokensDetails the toolUsePromptTokensDetails to set
	 */
	public void setToolUsePromptTokensDetails(ModalityTokenCount[] toolUsePromptTokensDetails) {
		this.toolUsePromptTokensDetails = toolUsePromptTokensDetails;
	}
}
