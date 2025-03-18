package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 */
public class TunedModelSource implements Serializable {

	@JsonbProperty
	private String tunedModel;
	
	@JsonbProperty
	private String baseModel;

	/**
	 * @return the tunedModel
	 */
	public String getTunedModel() {
		return tunedModel;
	}

	/**
	 * @param tunedModel the tunedModel to set
	 */
	public void setTunedModel(String tunedModel) {
		this.tunedModel = tunedModel;
	}

	/**
	 * @return the baseModel
	 */
	public String getBaseModel() {
		return baseModel;
	}

	/**
	 * @param baseModel the baseModel to set
	 */
	public void setBaseModel(String baseModel) {
		this.baseModel = baseModel;
	}
}
