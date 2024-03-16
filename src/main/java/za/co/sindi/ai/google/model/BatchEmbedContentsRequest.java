/**
 * 
 */
package za.co.sindi.ai.google.model;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 25 February 2024
 */
public class BatchEmbedContentsRequest {

	@JsonbProperty
	private EmbedContentRequest[] requests;

	/**
	 * @return the requests
	 */
	public EmbedContentRequest[] getRequests() {
		return requests;
	}

	/**
	 * @param requests the requests to set
	 */
	public void setRequests(EmbedContentRequest[] requests) {
		this.requests = requests;
	}
}
