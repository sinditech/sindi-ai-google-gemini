/**
 * 
 */
package za.co.sindi.ai.google;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 28 February 2024
 */
public class ErrorDetails implements Serializable {

	@JsonbProperty("@type")
	private String type;
	
	@JsonbProperty
	private FieldViolation[] fieldViolations;

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the fieldViolations
	 */
	public FieldViolation[] getFieldViolations() {
		return fieldViolations;
	}

	/**
	 * @param fieldViolations the fieldViolations to set
	 */
	public void setFieldViolations(FieldViolation[] fieldViolations) {
		this.fieldViolations = fieldViolations;
	}
}
