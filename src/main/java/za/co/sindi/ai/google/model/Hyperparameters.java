package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 */
public class Hyperparameters implements Serializable {

	@JsonbProperty
	private Double learningRate;
	
	@JsonbProperty
	private Double learningRateMultiplier;
	
	@JsonbProperty
	private Integer epochCount;
	
	@JsonbProperty
	private Integer batchSize;

	/**
	 * @return the learningRate
	 */
	public Double getLearningRate() {
		return learningRate;
	}

	/**
	 * @param learningRate the learningRate to set
	 */
	public void setLearningRate(Double learningRate) {
		this.learningRate = learningRate;
	}

	/**
	 * @return the learningRateMultiplier
	 */
	public Double getLearningRateMultiplier() {
		return learningRateMultiplier;
	}

	/**
	 * @param learningRateMultiplier the learningRateMultiplier to set
	 */
	public void setLearningRateMultiplier(Double learningRateMultiplier) {
		this.learningRateMultiplier = learningRateMultiplier;
	}

	/**
	 * @return the epochCount
	 */
	public Integer getEpochCount() {
		return epochCount;
	}

	/**
	 * @param epochCount the epochCount to set
	 */
	public void setEpochCount(Integer epochCount) {
		this.epochCount = epochCount;
	}

	/**
	 * @return the batchSize
	 */
	public Integer getBatchSize() {
		return batchSize;
	}

	/**
	 * @param batchSize the batchSize to set
	 */
	public void setBatchSize(Integer batchSize) {
		this.batchSize = batchSize;
	}
}
