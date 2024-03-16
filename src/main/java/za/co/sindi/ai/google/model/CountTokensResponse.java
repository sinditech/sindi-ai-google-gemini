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
	private Integer totalBillableCharacters;

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
	 * @return the totalBillableCharacters
	 */
	public Integer getTotalBillableCharacters() {
		return totalBillableCharacters;
	}

	/**
	 * @param totalBillableCharacters the totalBillableCharacters to set
	 */
	public void setTotalBillableCharacters(Integer totalBillableCharacters) {
		this.totalBillableCharacters = totalBillableCharacters;
	}
}
