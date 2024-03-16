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
public class PredictResponse implements Serializable {
	
	@JsonbProperty
	private Prediction[] predictions;
	
	@JsonbProperty
	private String deployedModelId;
	
	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private String modelVersionId;
	
	@JsonbProperty
	private String modelDisplayName;
	
	@JsonbProperty
	private Serializable metadata;

	/**
	 * @return the predictions
	 */
	public Prediction[] getPredictions() {
		return predictions;
	}

	/**
	 * @param predictions the predictions to set
	 */
	public void setPredictions(Prediction[] predictions) {
		this.predictions = predictions;
	}

	/**
	 * @return the deployedModelId
	 */
	public String getDeployedModelId() {
		return deployedModelId;
	}

	/**
	 * @param deployedModelId the deployedModelId to set
	 */
	public void setDeployedModelId(String deployedModelId) {
		this.deployedModelId = deployedModelId;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the modelVersionId
	 */
	public String getModelVersionId() {
		return modelVersionId;
	}

	/**
	 * @param modelVersionId the modelVersionId to set
	 */
	public void setModelVersionId(String modelVersionId) {
		this.modelVersionId = modelVersionId;
	}

	/**
	 * @return the modelDisplayName
	 */
	public String getModelDisplayName() {
		return modelDisplayName;
	}

	/**
	 * @param modelDisplayName the modelDisplayName to set
	 */
	public void setModelDisplayName(String modelDisplayName) {
		this.modelDisplayName = modelDisplayName;
	}

	/**
	 * @return the metadata
	 */
	public Serializable getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Serializable metadata) {
		this.metadata = metadata;
	}
}
