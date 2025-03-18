/**
 * 
 */
package za.co.sindi.ai.google.client;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import za.co.sindi.ai.google.model.CountTokensRequest;
import za.co.sindi.ai.google.model.CountTokensResponse;
import za.co.sindi.ai.google.model.GenerateAnswerRequest;
import za.co.sindi.ai.google.model.GenerateAnswerResponse;
import za.co.sindi.ai.google.model.GenerateContentRequest;
import za.co.sindi.ai.google.model.GenerateContentResponse;
import za.co.sindi.ai.google.model.ListModel;
import za.co.sindi.ai.google.model.ListTunedModel;
import za.co.sindi.ai.google.model.Model;
import za.co.sindi.ai.google.model.TunedModel;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public interface AsyncModelServiceClient extends ServiceClient {
	
	public String getModelName();
	
	public CompletableFuture<CountTokensResponse> countTokensAsync(final CountTokensRequest request);
	public CompletableFuture<GenerateAnswerResponse> generateAnswerAsync(final GenerateAnswerRequest request);
	public CompletableFuture<GenerateContentResponse> generateContentAsync(final GenerateContentRequest request);
	public CompletableFuture<Model> getModelAsync(final String modelName);
	default CompletableFuture<ListModel> listModelsAsync() {
		return listModelsAsync(null, null);
	}
	public CompletableFuture<ListModel> listModelsAsync(final Integer pageSize, final String pageToken);
	public CompletableFuture<Stream<GenerateContentResponse>> generateContentStreamAsync(final GenerateContentRequest request);
	
	//Tuned Model
	default CompletableFuture<Object> createTunedModelAsync(final TunedModel tunedModel) {
		return createTunedModelAsync(null, tunedModel);
	}
	public CompletableFuture<Object> createTunedModelAsync(final String tunedModelId, final TunedModel tunedModel);
	
	public CompletableFuture<TunedModel> getTunedModelAsync(final String tunedModelId);
	default CompletableFuture<ListTunedModel> listTunedModelAsync() {
		return listTunedModelAsync(null, null, null);
	}
	public CompletableFuture<ListTunedModel> listTunedModelAsync(final Integer pageSize, final String pageToken, final String filter);
	public CompletableFuture<TunedModel> updateTunedModelAsync(final String tunedModelId, final TunedModel tunedModel);
}
