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
public class Candidate implements Serializable {

	@JsonbProperty
	private Integer index;
	
	@JsonbProperty
	private Content content;
	
	@JsonbProperty
	private FinishReason finishReason;
	
	@JsonbProperty
	private SafetyRating[] safetyRatings;
	
	@JsonbProperty
	private CitationMetadata citationMetadata;
	
	@JsonbProperty
	private String finishMessage;

	/**
	 * @return the index
	 */
	public Integer getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(Integer index) {
		this.index = index;
	}

	/**
	 * @return the content
	 */
	public Content getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(Content content) {
		this.content = content;
	}

	/**
	 * @return the finishReason
	 */
	public FinishReason getFinishReason() {
		return finishReason;
	}

	/**
	 * @param finishReason the finishReason to set
	 */
	public void setFinishReason(FinishReason finishReason) {
		this.finishReason = finishReason;
	}

	/**
	 * @return the safetyRatings
	 */
	public SafetyRating[] getSafetyRatings() {
		return safetyRatings;
	}

	/**
	 * @param safetyRatings the safetyRatings to set
	 */
	public void setSafetyRatings(SafetyRating[] safetyRatings) {
		this.safetyRatings = safetyRatings;
	}

	/**
	 * @return the citationMetadata
	 */
	public CitationMetadata getCitationMetadata() {
		return citationMetadata;
	}

	/**
	 * @param citationMetadata the citationMetadata to set
	 */
	public void setCitationMetadata(CitationMetadata citationMetadata) {
		this.citationMetadata = citationMetadata;
	}

	/**
	 * @return the finishMessage
	 */
	public String getFinishMessage() {
		return finishMessage;
	}

	/**
	 * @param finishMessage the finishMessage to set
	 */
	public void setFinishMessage(String finishMessage) {
		this.finishMessage = finishMessage;
	}
}
