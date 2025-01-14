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
public class FunctionCallingConfig implements Serializable {

	@JsonbProperty
	private Mode mode;
	
	@JsonbProperty
	private String[] allowedFunctionNames;

	/**
	 * @return the mode
	 */
	public Mode getMode() {
		return mode;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(Mode mode) {
		this.mode = mode;
	}

	/**
	 * @return the allowedFunctionNames
	 */
	public String[] getAllowedFunctionNames() {
		return allowedFunctionNames;
	}

	/**
	 * @param allowedFunctionNames the allowedFunctionNames to set
	 */
	public void setAllowedFunctionNames(String[] allowedFunctionNames) {
		this.allowedFunctionNames = allowedFunctionNames;
	}
}
