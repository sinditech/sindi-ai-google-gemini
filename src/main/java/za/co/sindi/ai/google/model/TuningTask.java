package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 */
public class TuningTask implements Serializable {

	@JsonbProperty
	private String startTime;
	
	@JsonbProperty
	private String completeTime;
	
	@JsonbProperty
	private TuningSnapshot[] snapshots;
	
	@JsonbProperty
	private Hyperparameters hyperparameters;

	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the completeTime
	 */
	public String getCompleteTime() {
		return completeTime;
	}

	/**
	 * @param completeTime the completeTime to set
	 */
	public void setCompleteTime(String completeTime) {
		this.completeTime = completeTime;
	}

	/**
	 * @return the snapshots
	 */
	public TuningSnapshot[] getSnapshots() {
		return snapshots;
	}

	/**
	 * @param snapshots the snapshots to set
	 */
	public void setSnapshots(TuningSnapshot[] snapshots) {
		this.snapshots = snapshots;
	}

	/**
	 * @return the hyperparameters
	 */
	public Hyperparameters getHyperparameters() {
		return hyperparameters;
	}

	/**
	 * @param hyperparameters the hyperparameters to set
	 */
	public void setHyperparameters(Hyperparameters hyperparameters) {
		this.hyperparameters = hyperparameters;
	}
}
