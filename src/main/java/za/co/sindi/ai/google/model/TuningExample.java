package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 */
public class TuningExample implements Serializable {

	@JsonbProperty
	private String output;
	
	@JsonbProperty
	private String textInput;

	/**
	 * @return the output
	 */
	public String getOutput() {
		return output;
	}

	/**
	 * @param output the output to set
	 */
	public void setOutput(String output) {
		this.output = output;
	}

	/**
	 * @return the textInput
	 */
	public String getTextInput() {
		return textInput;
	}

	/**
	 * @param textInput the textInput to set
	 */
	public void setTextInput(String textInput) {
		this.textInput = textInput;
	}
}
