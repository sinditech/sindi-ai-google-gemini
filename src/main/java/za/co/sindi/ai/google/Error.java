/**
 * 
 */
package za.co.sindi.ai.google;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 28 February 2024
 */
public class Error {

	@JsonbProperty
	private int code;
	
	@JsonbProperty
	private String message;
	
	@JsonbProperty
	private ErrorStatus status;
	
	@JsonbProperty
	private ErrorDetails details;

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the status
	 */
	public ErrorStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(ErrorStatus status) {
		this.status = status;
	}

	/**
	 * @return the details
	 */
	public ErrorDetails getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(ErrorDetails details) {
		this.details = details;
	}
}
