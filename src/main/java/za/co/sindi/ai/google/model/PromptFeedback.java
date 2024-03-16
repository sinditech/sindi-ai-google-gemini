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
public class PromptFeedback implements Serializable {
	
	@JsonbProperty
	private BlockedReason blockReason;

	@JsonbProperty
	private SafetyRating[] safetyRatings;
	
	@JsonbProperty
	private String blockReasonMessage;

	/**
	 * @return the blockReason
	 */
	public BlockedReason getBlockReason() {
		return blockReason;
	}

	/**
	 * @param blockReason the blockReason to set
	 */
	public void setBlockReason(BlockedReason blockReason) {
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

	/**
	 * @return the blockReasonMessage
	 */
	public String getBlockReasonMessage() {
		return blockReasonMessage;
	}

	/**
	 * @param blockReasonMessage the blockReasonMessage to set
	 */
	public void setBlockReasonMessage(String blockReasonMessage) {
		this.blockReasonMessage = blockReasonMessage;
	}
}
