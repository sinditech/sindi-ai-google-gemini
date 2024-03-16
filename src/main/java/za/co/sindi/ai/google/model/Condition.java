/**
 * 
 */
package za.co.sindi.ai.google.model;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public class Condition {

	@JsonbProperty
	private Operator operation;
	
	@JsonbProperty
	private String stringValue;
	
	@JsonbProperty
	private Double numericValue;

	/**
	 * @return the operation
	 */
	public Operator getOperation() {
		return operation;
	}

	/**
	 * @param operation the operation to set
	 */
	public void setOperation(Operator operation) {
		this.operation = operation;
	}

	/**
	 * @return the stringValue
	 */
	public String getStringValue() {
		return stringValue;
	}

	/**
	 * @param stringValue the stringValue to set
	 */
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	/**
	 * @return the numericValue
	 */
	public Double getNumericValue() {
		return numericValue;
	}

	/**
	 * @param numericValue the numericValue to set
	 */
	public void setNumericValue(Double numericValue) {
		this.numericValue = numericValue;
	}
}
