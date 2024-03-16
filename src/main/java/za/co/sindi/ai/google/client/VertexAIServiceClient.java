/**
 * 
 */
package za.co.sindi.ai.google.client;

import java.net.URI;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.Builder;
import java.util.Objects;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public abstract class VertexAIServiceClient extends BaseServiceClient {

	private static final String SERVICE_ENDPOINT_FORMAT = "https://%s-aiplatform.googleapis.com";
	
	private final String modelName;
	private final String accessToken;
	private final String serviceEndpoint;
	
	/**
	 * @param region
	 * @param modelName
	 * @param accessToken
	 */
	protected VertexAIServiceClient(String region, String modelName, String accessToken) {
		super();
		this.modelName = Objects.requireNonNull(modelName, "A model name is required.");;
		this.accessToken = Objects.requireNonNull(accessToken, "An Access Token is required.");
		this.serviceEndpoint = String.format(SERVICE_ENDPOINT_FORMAT, Objects.requireNonNull(region, "Region is required."));
	}

	public String getModelName() {
		// TODO Auto-generated method stub
		return modelName;
	}

	@Override
	protected Builder createHttpGETRequestBuilder(URI uri) {
		// TODO Auto-generated method stub
		return super.createHttpGETRequestBuilder(uri)
				.header("Authorization", "Bearer " + accessToken);
	}

	@Override
	protected Builder createHttpPOSTRequestBuilder(URI uri, BodyPublisher bodyPublisher) {
		// TODO Auto-generated method stub
		return super.createHttpPOSTRequestBuilder(uri, bodyPublisher)
					.header("Authorization", "Bearer " + accessToken);
	}

	/**
	 * @return the serviceEndpoint
	 */
	public String getServiceEndpoint() {
		return serviceEndpoint;
	}
}
