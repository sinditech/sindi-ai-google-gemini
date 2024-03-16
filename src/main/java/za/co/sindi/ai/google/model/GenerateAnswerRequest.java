/**
 * 
 */
package za.co.sindi.ai.google.model;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public class GenerateAnswerRequest {

	@JsonbProperty
	private Content[] contents;
	
	@JsonbProperty
	private AnswerStyle answerStyle;
	
	@JsonbProperty
	private SafetySetting[] safetySettings;
	
	@JsonbProperty
	private GroundingPassages inlinePassages;
	
	@JsonbProperty
	private SemanticRetrieverConfig semanticRetriever;
	
	@JsonbProperty
	private Double temperature;

	/**
	 * @return the contents
	 */
	public Content[] getContents() {
		return contents;
	}

	/**
	 * @param contents the contents to set
	 */
	public void setContents(Content[] contents) {
		this.contents = contents;
	}

	/**
	 * @return the answerStyle
	 */
	public AnswerStyle getAnswerStyle() {
		return answerStyle;
	}

	/**
	 * @param answerStyle the answerStyle to set
	 */
	public void setAnswerStyle(AnswerStyle answerStyle) {
		this.answerStyle = answerStyle;
	}

	/**
	 * @return the safetySettings
	 */
	public SafetySetting[] getSafetySettings() {
		return safetySettings;
	}

	/**
	 * @param safetySettings the safetySettings to set
	 */
	public void setSafetySettings(SafetySetting[] safetySettings) {
		this.safetySettings = safetySettings;
	}

	/**
	 * @return the inlinePassages
	 */
	public GroundingPassages getInlinePassages() {
		return inlinePassages;
	}

	/**
	 * @param inlinePassages the inlinePassages to set
	 */
	public void setInlinePassages(GroundingPassages inlinePassages) {
		this.inlinePassages = inlinePassages;
	}

	/**
	 * @return the semanticRetriever
	 */
	public SemanticRetrieverConfig getSemanticRetriever() {
		return semanticRetriever;
	}

	/**
	 * @param semanticRetriever the semanticRetriever to set
	 */
	public void setSemanticRetriever(SemanticRetrieverConfig semanticRetriever) {
		this.semanticRetriever = semanticRetriever;
	}

	/**
	 * @return the temperature
	 */
	public Double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}
}
