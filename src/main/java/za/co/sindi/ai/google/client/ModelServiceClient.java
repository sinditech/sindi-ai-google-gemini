/**
 * 
 */
package za.co.sindi.ai.google.client;

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
public interface ModelServiceClient extends ServiceClient {

	public String getModelName();
	
	public CountTokensResponse countTokens(final CountTokensRequest request);
	public GenerateAnswerResponse generateAnswer(final GenerateAnswerRequest request);
	public GenerateContentResponse generateContent(final GenerateContentRequest request);
	public Model getModel();
	public ListModel listModels();
	public Stream<GenerateContentResponse> generateContentStream(final GenerateContentRequest request);
}
