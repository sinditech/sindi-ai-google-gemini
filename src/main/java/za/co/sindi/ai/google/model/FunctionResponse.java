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
public class FunctionResponse implements Serializable {

	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private Struct response;

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
	 * @return the response
	 */
	public Struct getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(Struct response) {
		this.response = response;
	}
}
