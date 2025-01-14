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
	private CitationSource[] citationSources;

	/**
	 * @return the citationSources
	 */
	public CitationSource[] getCitationSources() {
		return citationSources;
	}

	/**
	 * @param citationSources the citationSources to set
	 */
	public void setCitationSources(CitationSource[] citationSources) {
		this.citationSources = citationSources;
	}
}
