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
public class ListTunedModel implements Serializable {

	@JsonbProperty
	private TunedModel[] tunedModels;
	
	@JsonbProperty
	private String nextPageToken;

	/**
	 * @return the tunedModels
	 */
	public TunedModel[] getTunedModels() {
		return tunedModels;
	}

	/**
	 * @param tunedModels the tunedModels to set
	 */
	public void setTunedModels(TunedModel[] tunedModels) {
		this.tunedModels = tunedModels;
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
