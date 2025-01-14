package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 13 January 2025
 */
public class Segment implements Serializable {

	@JsonbProperty
	private Integer partIndex;
	
	@JsonbProperty
	private Integer startIndex;
	
	@JsonbProperty
	private Integer endIndex;
	
	@JsonbProperty
	private String text;

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

	/**
	 * @return the startIndex
	 */
	public Integer getStartIndex() {
		return startIndex;
	}

	/**
	 * @param startIndex the startIndex to set
	 */
	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * @return the endIndex
	 */
	public Integer getEndIndex() {
		return endIndex;
	}

	/**
	 * @param endIndex the endIndex to set
	 */
	public void setEndIndex(Integer endIndex) {
		this.endIndex = endIndex;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
}
