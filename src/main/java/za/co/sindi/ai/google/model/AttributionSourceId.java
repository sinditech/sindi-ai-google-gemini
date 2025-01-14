package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 13 January 2025
 */
public class AttributionSourceId implements Serializable {
	
//	@JsonbProperty
//	private Object source;

	@JsonbProperty
	private GroundingPassage groundingPassage;
	
	@JsonbProperty
	private SemanticRetrieverChunk semanticRetrieverChunk;

	/**
	 * @return the groundingPassage
	 */
	public GroundingPassage getGroundingPassage() {
		return groundingPassage;
	}

	/**
	 * @param groundingPassage the groundingPassage to set
	 */
	public void setGroundingPassage(GroundingPassage groundingPassage) {
		this.groundingPassage = groundingPassage;
	}

	/**
	 * @return the semanticRetrieverChunk
	 */
	public SemanticRetrieverChunk getSemanticRetrieverChunk() {
		return semanticRetrieverChunk;
	}

	/**
	 * @param semanticRetrieverChunk the semanticRetrieverChunk to set
	 */
	public void setSemanticRetrieverChunk(SemanticRetrieverChunk semanticRetrieverChunk) {
		this.semanticRetrieverChunk = semanticRetrieverChunk;
	}
}
