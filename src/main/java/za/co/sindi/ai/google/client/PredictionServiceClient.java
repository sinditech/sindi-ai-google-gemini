/**
 * 
 */
package za.co.sindi.ai.google.client;

import za.co.sindi.ai.google.model.PredictRequest;
import za.co.sindi.ai.google.model.PredictResponse;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public interface PredictionServiceClient extends ServiceClient {
	
	public String getModelName();
	
	public PredictResponse predict(final PredictRequest request);
}
