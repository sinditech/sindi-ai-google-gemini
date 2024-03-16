/**
 * 
 */
package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public class ListModel implements Serializable {

	@JsonbProperty
	private Model[] models;
	
	@JsonbProperty
	private String nextPageToken;

	/**
	 * @return the models
	 */
	public Model[] getModels() {
		return models;
	}

	/**
	 * @param models the models to set
	 */
	public void setModels(Model[] models) {
		this.models = models;
	}

	/**
	 * @return the nextPageToken
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}

	/**
	 * @param nextPageToken the nextPageToken to set
	 */
	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
}
