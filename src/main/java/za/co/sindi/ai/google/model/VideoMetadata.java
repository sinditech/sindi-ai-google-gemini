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
public class VideoMetadata implements Serializable {

	@JsonbProperty
	private String startOffset;
	
	@JsonbProperty
	private String endOffset;

	/**
	 * @return the startOffset
	 */
	public String getStartOffset() {
		return startOffset;
	}

	/**
	 * @param startOffset the startOffset to set
	 */
	public void setStartOffset(String startOffset) {
		this.startOffset = startOffset;
	}

	/**
	 * @return the endOffset
	 */
	public String getEndOffset() {
		return endOffset;
	}

	/**
	 * @param endOffset the endOffset to set
	 */
	public void setEndOffset(String endOffset) {
		this.endOffset = endOffset;
	}
}
