/**
 * 
 */
package za.co.sindi.ai.google.model;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public class GenerateContentRequest {

	@JsonbProperty
	private Content[] contents;
	
	@JsonbProperty
	private Tool[] tools;
	
	@JsonbProperty
	private SafetySetting[] safetySettings;
	
	@JsonbProperty
	private GenerationConfig generationConfig;

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
	 * @return the tools
	 */
	public Tool[] getTools() {
		return tools;
	}

	/**
	 * @param tools the tools to set
	 */
	public void setTools(Tool[] tools) {
		this.tools = tools;
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
	 * @return the generationConfig
	 */
	public GenerationConfig getGenerationConfig() {
		return generationConfig;
	}

	/**
	 * @param generationConfig the generationConfig to set
	 */
	public void setGenerationConfig(GenerationConfig generationConfig) {
		this.generationConfig = generationConfig;
	}
}
