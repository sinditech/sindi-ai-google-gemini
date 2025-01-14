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
public class FunctionCall implements Serializable {

	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private Struct args;

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
	 * @return the args
	 */
	public Struct getArgs() {
		return args;
	}

	/**
	 * @param args the args to set
	 */
	public void setArgs(Struct args) {
		this.args = args;
	}
}
