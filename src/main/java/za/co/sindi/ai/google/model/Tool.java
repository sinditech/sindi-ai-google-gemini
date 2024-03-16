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
public class Tool implements Serializable {

	@JsonbProperty
	private FunctionDeclaration[] functionDeclarations;

	/**
	 * @return the functionDeclarations
	 */
	public FunctionDeclaration[] getFunctionDeclarations() {
		return functionDeclarations;
	}

	/**
	 * @param functionDeclarations the functionDeclarations to set
	 */
	public void setFunctionDeclarations(FunctionDeclaration[] functionDeclarations) {
		this.functionDeclarations = functionDeclarations;
	}
}
