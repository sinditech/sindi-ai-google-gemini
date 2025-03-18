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
public class CountTokensResponse implements Serializable {

	@JsonbProperty
	private Integer totalTokens;
	
	@JsonbProperty
	private Integer cachedContentTokenCount;
	
	@JsonbProperty
	private ModalityTokenCount[] promptTokensDetails;

	/**
	 * @return the totalTokens
	 */
	public Integer getTotalTokens() {
		return totalTokens;
	}

	/**
	 * @param totalTokens the totalTokens to set
	 */
	public void setTotalTokens(Integer totalTokens) {
		this.totalTokens = totalTokens;
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
}
