/**
 * 
 */
package za.co.sindi.ai.google.client;

import java.util.Objects;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public abstract class GoogleAIServiceClient extends BaseServiceClient {

	protected static final String SERVICE_ENDPOINT = "https://generativelanguage.googleapis.com";
	
	private final String modelName;
	
	/**
	 * @param modelName
	 */
	protected GoogleAIServiceClient(String modelName) {
		super();
		this.modelName = Objects.requireNonNull(modelName, "A model name is required.");;
	}

	public String getModelName() {
		// TODO Auto-generated method stub
		return modelName;
	}
}
