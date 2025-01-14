package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 14 January 2025
 */
public class PredictSchemata implements Serializable {

	@JsonbProperty
	private String instanceSchemaUri;
	
	@JsonbProperty
	private String parametersSchemaUri;
	
	@JsonbProperty
	private String predictionSchemaUri;

	/**
	 * @return the instanceSchemaUri
	 */
	public String getInstanceSchemaUri() {
		return instanceSchemaUri;
	}

	/**
	 * @param instanceSchemaUri the instanceSchemaUri to set
	 */
	public void setInstanceSchemaUri(String instanceSchemaUri) {
		this.instanceSchemaUri = instanceSchemaUri;
	}

	/**
	 * @return the parametersSchemaUri
	 */
	public String getParametersSchemaUri() {
		return parametersSchemaUri;
	}

	/**
	 * @param parametersSchemaUri the parametersSchemaUri to set
	 */
	public void setParametersSchemaUri(String parametersSchemaUri) {
		this.parametersSchemaUri = parametersSchemaUri;
	}

	/**
	 * @return the predictionSchemaUri
	 */
	public String getPredictionSchemaUri() {
		return predictionSchemaUri;
	}

	/**
	 * @param predictionSchemaUri the predictionSchemaUri to set
	 */
	public void setPredictionSchemaUri(String predictionSchemaUri) {
		this.predictionSchemaUri = predictionSchemaUri;
	}
}
