/**
 * 
 */
package za.co.sindi.ai.google.generativeai;

import java.util.Objects;
import java.util.stream.Stream;

import za.co.sindi.ai.google.client.EmbeddingServiceClient;
import za.co.sindi.ai.google.client.ModelServiceClient;
import za.co.sindi.ai.google.model.BatchEmbedContentsRequest;
import za.co.sindi.ai.google.model.BatchEmbedContentsResponse;
import za.co.sindi.ai.google.model.CountTokensRequest;
import za.co.sindi.ai.google.model.CountTokensResponse;
import za.co.sindi.ai.google.model.EmbedContentRequest;
import za.co.sindi.ai.google.model.EmbedContentResponse;
import za.co.sindi.ai.google.model.GenerateAnswerRequest;
import za.co.sindi.ai.google.model.GenerateAnswerResponse;
import za.co.sindi.ai.google.model.GenerateContentRequest;
import za.co.sindi.ai.google.model.GenerateContentResponse;
import za.co.sindi.ai.google.model.ListModel;
import za.co.sindi.ai.google.model.Model;

/**
 * @author Buhake Sindi
 * @since 27 February 2024
 */
public class GeminiGenerativeModel implements GenerativeModel {
	
	private EmbeddingServiceClient embeddingServiceClient;
	private ModelServiceClient modelServiceClient;
	
	/**
	 * @param embeddingServiceClient
	 * @param modelServiceClient
	 */
	public GeminiGenerativeModel(EmbeddingServiceClient embeddingServiceClient, ModelServiceClient modelServiceClient) {
		super();
		this.embeddingServiceClient = Objects.requireNonNull(embeddingServiceClient, "An embedding service client is required.");
		this.modelServiceClient = Objects.requireNonNull(modelServiceClient, "A model service client is required.");
	}

	@Override
	public String getGenerativeModelName() {
		// TODO Auto-generated method stub
		return modelServiceClient.getModelName();
	}

	@Override
	public String getEmbeddingModelName() {
		// TODO Auto-generated method stub
		return embeddingServiceClient.getModelName();
	}

	@Override
	public BatchEmbedContentsResponse batchEmbedContents(BatchEmbedContentsRequest request) {
		// TODO Auto-generated method stub
		return embeddingServiceClient.batchEmbedContents(request);
	}

	@Override
	public CountTokensResponse countTokens(CountTokensRequest request) {
		// TODO Auto-generated method stub
		return modelServiceClient.countTokens(request);
	}

	@Override
	public EmbedContentResponse embedContent(EmbedContentRequest request) {
		// TODO Auto-generated method stub
		return embeddingServiceClient.embedContent(request);
	}

	@Override
	public GenerateAnswerResponse generateAnswer(GenerateAnswerRequest request) {
		// TODO Auto-generated method stub
		return modelServiceClient.generateAnswer(request);
	}

	@Override
	public GenerateContentResponse generateContent(GenerateContentRequest request) {
		// TODO Auto-generated method stub
		return modelServiceClient.generateContent(request);
	}

	@Override
	public Model getModel() {
		// TODO Auto-generated method stub
		return modelServiceClient.getModel();
	}

	@Override
	public ListModel listModels() {
		// TODO Auto-generated method stub
		return modelServiceClient.listModels();
	}

	@Override
	public Stream<GenerateContentResponse> generateContentStream(GenerateContentRequest request) {
		// TODO Auto-generated method stub
		return modelServiceClient.generateContentStream(request);
	}
}
