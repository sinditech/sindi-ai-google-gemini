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
public class Content implements Serializable {

	@JsonbProperty
	private String role;
	
	@JsonbProperty
	private Part[] parts;

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the parts
	 */
	public Part[] getParts() {
		return parts;
	}

	/**
	 * @param parts the parts to set
	 */
	public void setParts(Part[] parts) {
		this.parts = parts;
	}
}
