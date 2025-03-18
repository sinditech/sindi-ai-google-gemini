package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 */
public class ModalityTokenCount implements Serializable {

	@JsonbProperty
	private Modality modality;
	
	@JsonbProperty
	private Integer tokenCount;

	/**
	 * @return the modality
	 */
	public Modality getModality() {
		return modality;
	}

	/**
	 * @param modality the modality to set
	 */
	public void setModality(Modality modality) {
		this.modality = modality;
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
