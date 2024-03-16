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
import za.co.sindi.ai.google.model.Model;

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
	public CompletableFuture<ListModel> listModelsAsync();
	public CompletableFuture<Stream<GenerateContentResponse>> generateContentStreamAsync(final GenerateContentRequest request);
}
