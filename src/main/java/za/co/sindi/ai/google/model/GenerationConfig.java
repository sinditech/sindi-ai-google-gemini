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
	private Float temperature;
	
	@JsonbProperty
	private Float topP;
	
	@JsonbProperty
	private Integer topK;
	
	@JsonbProperty
	private Integer candidateCount;
	
	@JsonbProperty
	private Integer maxOutputTokens;

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
}
