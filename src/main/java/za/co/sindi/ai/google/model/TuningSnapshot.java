package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 */
public class TuningSnapshot implements Serializable {

	@JsonbProperty
	private Integer step;
	
	@JsonbProperty
	private Integer epoch;
	
	@JsonbProperty
	private Double meanLoss;
	
	@JsonbProperty
	private String computeTime;

	/**
	 * @return the step
	 */
	public Integer getStep() {
		return step;
	}

	/**
	 * @param step the step to set
	 */
	public void setStep(Integer step) {
		this.step = step;
	}

	/**
	 * @return the epoch
	 */
	public Integer getEpoch() {
		return epoch;
	}

	/**
	 * @param epoch the epoch to set
	 */
	public void setEpoch(Integer epoch) {
		this.epoch = epoch;
	}

	/**
	 * @return the meanLoss
	 */
	public Double getMeanLoss() {
		return meanLoss;
	}

	/**
	 * @param meanLoss the meanLoss to set
	 */
	public void setMeanLoss(Double meanLoss) {
		this.meanLoss = meanLoss;
	}

	/**
	 * @return the computeTime
	 */
	public String getComputeTime() {
		return computeTime;
	}

	/**
	 * @param computeTime the computeTime to set
	 */
	public void setComputeTime(String computeTime) {
		this.computeTime = computeTime;
	}
}
