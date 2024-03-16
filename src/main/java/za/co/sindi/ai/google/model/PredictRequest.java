/**
 * 
 */
package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 27 February 2024
 */
public class PredictRequest {

	@JsonbProperty
	private PredictionInstance[] instances;
	
	@JsonbProperty
	private Serializable parameters;

	/**
	 * @return the instances
	 */
	public PredictionInstance[] getInstances() {
		return instances;
	}

	/**
	 * @param instances the instances to set
	 */
	public void setInstances(PredictionInstance[] instances) {
		this.instances = instances;
	}

	/**
	 * @return the parameters
	 */
	public Serializable getParameters() {
		return parameters;
	}

	/**
	 * @param parameters the parameters to set
	 */
	public void setParameters(Serializable parameters) {
		this.parameters = parameters;
	}
}
