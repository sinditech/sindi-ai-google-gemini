/**
 * 
 */
package za.co.sindi.ai.google.model;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public class Model {

	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private String baseModelId;
	
	@JsonbProperty
	private String version;
	
	@JsonbProperty
	private String displayName;
	
	@JsonbProperty
	private String description;
	
	@JsonbProperty
	private Integer inputTokenLimit;
	
	@JsonbProperty
	private Integer outputTokenLimit;
	
	@JsonbProperty
	private String[] supportedGenerationMethods;
	
	@JsonbProperty
	private Double temperature;
	
	@JsonbProperty
	private Double topP;
	
	@JsonbProperty
	private Integer topK;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the baseModelId
	 */
	public String getBaseModelId() {
		return baseModelId;
	}

	/**
	 * @param baseModelId the baseModelId to set
	 */
	public void setBaseModelId(String baseModelId) {
		this.baseModelId = baseModelId;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the inputTokenLimit
	 */
	public Integer getInputTokenLimit() {
		return inputTokenLimit;
	}

	/**
	 * @param inputTokenLimit the inputTokenLimit to set
	 */
	public void setInputTokenLimit(Integer inputTokenLimit) {
		this.inputTokenLimit = inputTokenLimit;
	}

	/**
	 * @return the outputTokenLimit
	 */
	public Integer getOutputTokenLimit() {
		return outputTokenLimit;
	}

	/**
	 * @param outputTokenLimit the outputTokenLimit to set
	 */
	public void setOutputTokenLimit(Integer outputTokenLimit) {
		this.outputTokenLimit = outputTokenLimit;
	}

	/**
	 * @return the supportedGenerationMethods
	 */
	public String[] getSupportedGenerationMethods() {
		return supportedGenerationMethods;
	}

	/**
	 * @param supportedGenerationMethods the supportedGenerationMethods to set
	 */
	public void setSupportedGenerationMethods(String[] supportedGenerationMethods) {
		this.supportedGenerationMethods = supportedGenerationMethods;
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

	/**
	 * @return the topP
	 */
	public Double getTopP() {
		return topP;
	}

	/**
	 * @param topP the topP to set
	 */
	public void setTopP(Double topP) {
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
}
