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
public class InputFeedback implements Serializable {
	
	@JsonbProperty
	private SafetyRating[] safetyRatings;
	
	@JsonbProperty
	private BlockReason blockReason;

	/**
	 * @return the blockReason
	 */
	public BlockReason getBlockReason() {
		return blockReason;
	}

	/**
	 * @param blockReason the blockReason to set
	 */
	public void setBlockReason(BlockReason blockReason) {
		this.blockReason = blockReason;
	}

	/**
	 * @return the safetyRatings
	 */
	public SafetyRating[] getSafetyRatings() {
		return safetyRatings;
	}

	/**
	 * @param safetyRatings the safetyRatings to set
	 */
	public void setSafetyRatings(SafetyRating[] safetyRatings) {
		this.safetyRatings = safetyRatings;
	}
}
