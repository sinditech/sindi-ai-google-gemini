package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 13 January 2025
 */
public class GroundingPassageId implements Serializable {

	@JsonbProperty
	private String passageId;
	
	@JsonbProperty
	private Integer partIndex;

	/**
	 * @return the passageId
	 */
	public String getPassageId() {
		return passageId;
	}

	/**
	 * @param passageId the passageId to set
	 */
	public void setPassageId(String passageId) {
		this.passageId = passageId;
	}

	/**
	 * @return the partIndex
	 */
	public Integer getPartIndex() {
		return partIndex;
	}

	/**
	 * @param partIndex the partIndex to set
	 */
	public void setPartIndex(Integer partIndex) {
		this.partIndex = partIndex;
	}
}
