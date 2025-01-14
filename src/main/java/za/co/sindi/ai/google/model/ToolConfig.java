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
public class ToolConfig implements Serializable {

	@JsonbProperty
	private FunctionCallingConfig functionCallingConfig;

	/**
	 * @return the functionCallingConfig
	 */
	public FunctionCallingConfig getFunctionCallingConfig() {
		return functionCallingConfig;
	}

	/**
	 * @param functionCallingConfig the functionCallingConfig to set
	 */
	public void setFunctionCallingConfig(FunctionCallingConfig functionCallingConfig) {
		this.functionCallingConfig = functionCallingConfig;
	}
}
