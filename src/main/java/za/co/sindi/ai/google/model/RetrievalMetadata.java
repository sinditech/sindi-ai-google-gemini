package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 13 January 2025
 * <a href="https://ai.google.dev/api/generate-content#RetrievalMetadata">RetrievalMetadata</a>
 */
public class RetrievalMetadata implements Serializable {

	@JsonbProperty
	private Double googleSearchDynamicRetrievalScore;

	/**
	 * @return the googleSearchDynamicRetrievalScore
	 */
	public Double getGoogleSearchDynamicRetrievalScore() {
		return googleSearchDynamicRetrievalScore;
	}

	/**
	 * @param googleSearchDynamicRetrievalScore the googleSearchDynamicRetrievalScore to set
	 */
	public void setGoogleSearchDynamicRetrievalScore(Double googleSearchDynamicRetrievalScore) {
		this.googleSearchDynamicRetrievalScore = googleSearchDynamicRetrievalScore;
	}
}
