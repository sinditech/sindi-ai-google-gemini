/**
 * 
 */
package za.co.sindi.ai.google.client;

import java.util.concurrent.CompletableFuture;

import za.co.sindi.ai.google.model.PredictRequest;
import za.co.sindi.ai.google.model.PredictResponse;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public interface AsyncPredictionServiceClient extends ServiceClient {
	
	public String getModelName();
	
	public CompletableFuture<PredictResponse> predictAsync(final PredictRequest request);
}
