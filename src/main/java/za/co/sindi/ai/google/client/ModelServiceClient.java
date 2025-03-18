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
import za.co.sindi.ai.google.model.ListTunedModel;
import za.co.sindi.ai.google.model.Model;
import za.co.sindi.ai.google.model.TunedModel;

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
	default ListModel listModels() {
		return listModels(null, null);
	}
	public ListModel listModels(final Integer pageSize, final String pageToken);
	public Stream<GenerateContentResponse> generateContentStream(final GenerateContentRequest request);
	
	//Tuned Model
	default Object createTunedModel(final TunedModel tunedModel) {
		return createTunedModel(null, tunedModel);
	}
	public Object createTunedModel(final String tunedModelId, final TunedModel tunedModel);
	
	public TunedModel getTunedModel(final String tunedModelId);
	default ListTunedModel listTunedModel() {
		return listTunedModel(null, null, null);
	}
	public ListTunedModel listTunedModel(final Integer pageSize, final String pageToken, final String filter);
	public TunedModel updateTunedModel(final String tunedModelId, final TunedModel tunedModel);
}
