package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 13 January 2025
 */
public class GroundingSupport implements Serializable {

	@JsonbProperty
	private Integer[] groundingChunkIndices;
	
	@JsonbProperty
	private Double[] confidenceScores;
	
	@JsonbProperty
	private Segment segment;

	/**
	 * @return the groundingChunkIndices
	 */
	public Integer[] getGroundingChunkIndices() {
		return groundingChunkIndices;
	}

	/**
	 * @param groundingChunkIndices the groundingChunkIndices to set
	 */
	public void setGroundingChunkIndices(Integer[] groundingChunkIndices) {
		this.groundingChunkIndices = groundingChunkIndices;
	}

	/**
	 * @return the confidenceScores
	 */
	public Double[] getConfidenceScores() {
		return confidenceScores;
	}

	/**
	 * @param confidenceScores the confidenceScores to set
	 */
	public void setConfidenceScores(Double[] confidenceScores) {
		this.confidenceScores = confidenceScores;
	}

	/**
	 * @return the segment
	 */
	public Segment getSegment() {
		return segment;
	}

	/**
	 * @param segment the segment to set
	 */
	public void setSegment(Segment segment) {
		this.segment = segment;
	}
}
