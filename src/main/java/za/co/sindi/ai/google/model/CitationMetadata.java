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
public class CitationMetadata implements Serializable {

	@JsonbProperty
	private Citation[] citations;

	/**
	 * @return the citations
	 */
	public Citation[] getCitations() {
		return citations;
	}

	/**
	 * @param citations the citations to set
	 */
	public void setCitations(Citation[] citations) {
		this.citations = citations;
	}
}
