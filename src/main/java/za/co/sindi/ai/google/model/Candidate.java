/**
 * 
 */
package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 * @see <a href="https://ai.google.dev/api/generate-content#candidate">Candidate</a>.
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
	private Integer tokenCount;
	
	@JsonbProperty
	private GroundingAttribution[] groundingAttributions;
	
	@JsonbProperty
	private GroundingMetadata groundingMetadata;
	
	@JsonbProperty
	private Double avgLogprobs;
	
	@JsonbProperty
	private LogprobsResult logprobsResult;
	
//	@JsonbProperty
//	private String finishMessage;

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

//	/**
//	 * @return the finishMessage
//	 */
//	public String getFinishMessage() {
//		return finishMessage;
//	}
//
//	/**
//	 * @param finishMessage the finishMessage to set
//	 */
//	public void setFinishMessage(String finishMessage) {
//		this.finishMessage = finishMessage;
//	}

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

	/**
	 * @return the groundingAttributions
	 */
	public GroundingAttribution[] getGroundingAttributions() {
		return groundingAttributions;
	}

	/**
	 * @param groundingAttributions the groundingAttributions to set
	 */
	public void setGroundingAttributions(GroundingAttribution[] groundingAttributions) {
		this.groundingAttributions = groundingAttributions;
	}

	/**
	 * @return the groundingMetadata
	 */
	public GroundingMetadata getGroundingMetadata() {
		return groundingMetadata;
	}

	/**
	 * @param groundingMetadata the groundingMetadata to set
	 */
	public void setGroundingMetadata(GroundingMetadata groundingMetadata) {
		this.groundingMetadata = groundingMetadata;
	}

	/**
	 * @return the avgLogprobs
	 */
	public Double getAvgLogprobs() {
		return avgLogprobs;
	}

	/**
	 * @param avgLogprobs the avgLogprobs to set
	 */
	public void setAvgLogprobs(Double avgLogprobs) {
		this.avgLogprobs = avgLogprobs;
	}

	/**
	 * @return the logprobsResult
	 */
	public LogprobsResult getLogprobsResult() {
		return logprobsResult;
	}

	/**
	 * @param logprobsResult the logprobsResult to set
	 */
	public void setLogprobsResult(LogprobsResult logprobsResult) {
		this.logprobsResult = logprobsResult;
	}
}
