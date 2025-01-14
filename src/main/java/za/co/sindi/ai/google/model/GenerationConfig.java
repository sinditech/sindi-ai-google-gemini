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
public class GenerationConfig implements Serializable {

	@JsonbProperty
	private String[] stopSequences;
	
	@JsonbProperty
	private String responseMimeType;
	
	@JsonbProperty
	private Schema responseSchema;
	
	@JsonbProperty
	private Float temperature;
	
	@JsonbProperty
	private Float topP;
	
	@JsonbProperty
	private Integer topK;
	
	@JsonbProperty
	private Integer candidateCount;
	
	@JsonbProperty
	private Integer maxOutputTokens;
	
	@JsonbProperty
	private Float presencePenalty;
	
	@JsonbProperty
	private Float frequencyPenalty;
	
	@JsonbProperty
	private Boolean responseLogprobs;
	
	@JsonbProperty
	private Integer logprobs;
	
	@JsonbProperty
	private Boolean enableEnhancedCivicAnswers;

	/**
	 * @return the stopSequences
	 */
	public String[] getStopSequences() {
		return stopSequences;
	}

	/**
	 * @param stopSequences the stopSequences to set
	 */
	public void setStopSequences(String[] stopSequences) {
		this.stopSequences = stopSequences;
	}

	/**
	 * @return the responseMimeType
	 */
	public String getResponseMimeType() {
		return responseMimeType;
	}

	/**
	 * @param responseMimeType the responseMimeType to set
	 */
	public void setResponseMimeType(String responseMimeType) {
		this.responseMimeType = responseMimeType;
	}

	/**
	 * @return the responseSchema
	 */
	public Schema getResponseSchema() {
		return responseSchema;
	}

	/**
	 * @param responseSchema the responseSchema to set
	 */
	public void setResponseSchema(Schema responseSchema) {
		this.responseSchema = responseSchema;
	}

	/**
	 * @return the temperature
	 */
	public Float getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the topP
	 */
	public Float getTopP() {
		return topP;
	}

	/**
	 * @param topP the topP to set
	 */
	public void setTopP(Float topP) {
		this.topP = topP;
	}

	/**
	 * @return the topK
	 */
	public Integer getTopK() {
		return topK;
	}

	/**
	 * @param topK the topK to set
	 */
	public void setTopK(Integer topK) {
		this.topK = topK;
	}

	/**
	 * @return the candidateCount
	 */
	public Integer getCandidateCount() {
		return candidateCount;
	}

	/**
	 * @param candidateCount the candidateCount to set
	 */
	public void setCandidateCount(Integer candidateCount) {
		this.candidateCount = candidateCount;
	}

	/**
	 * @return the maxOutputTokens
	 */
	public Integer getMaxOutputTokens() {
		return maxOutputTokens;
	}

	/**
	 * @param maxOutputTokens the maxOutputTokens to set
	 */
	public void setMaxOutputTokens(Integer maxOutputTokens) {
		this.maxOutputTokens = maxOutputTokens;
	}

	/**
	 * @return the presencePenalty
	 */
	public Float getPresencePenalty() {
		return presencePenalty;
	}

	/**
	 * @param presencePenalty the presencePenalty to set
	 */
	public void setPresencePenalty(Float presencePenalty) {
		this.presencePenalty = presencePenalty;
	}

	/**
	 * @return the frequencyPenalty
	 */
	public Float getFrequencyPenalty() {
		return frequencyPenalty;
	}

	/**
	 * @param frequencyPenalty the frequencyPenalty to set
	 */
	public void setFrequencyPenalty(Float frequencyPenalty) {
		this.frequencyPenalty = frequencyPenalty;
	}

	/**
	 * @return the responseLogprobs
	 */
	public Boolean getResponseLogprobs() {
		return responseLogprobs;
	}

	/**
	 * @param responseLogprobs the responseLogprobs to set
	 */
	public void setResponseLogprobs(Boolean responseLogprobs) {
		this.responseLogprobs = responseLogprobs;
	}

	/**
	 * @return the logprobs
	 */
	public Integer getLogprobs() {
		return logprobs;
	}

	/**
	 * @param logprobs the logprobs to set
	 */
	public void setLogprobs(Integer logprobs) {
		this.logprobs = logprobs;
	}

	/**
	 * @return the enableEnhancedCivicAnswers
	 */
	public Boolean getEnableEnhancedCivicAnswers() {
		return enableEnhancedCivicAnswers;
	}

	/**
	 * @param enableEnhancedCivicAnswers the enableEnhancedCivicAnswers to set
	 */
	public void setEnableEnhancedCivicAnswers(Boolean enableEnhancedCivicAnswers) {
		this.enableEnhancedCivicAnswers = enableEnhancedCivicAnswers;
	}
}
