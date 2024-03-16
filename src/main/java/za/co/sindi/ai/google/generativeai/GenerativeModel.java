/**
 * 
 */
package za.co.sindi.ai.google.generativeai;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import za.co.sindi.ai.google.model.BatchEmbedContentsRequest;
import za.co.sindi.ai.google.model.BatchEmbedContentsResponse;
import za.co.sindi.ai.google.model.Content;
import za.co.sindi.ai.google.model.CountTokensRequest;
import za.co.sindi.ai.google.model.CountTokensResponse;
import za.co.sindi.ai.google.model.EmbedContentRequest;
import za.co.sindi.ai.google.model.EmbedContentResponse;
import za.co.sindi.ai.google.model.GenerateAnswerRequest;
import za.co.sindi.ai.google.model.GenerateAnswerResponse;
import za.co.sindi.ai.google.model.GenerateContentRequest;
import za.co.sindi.ai.google.model.GenerateContentResponse;
import za.co.sindi.ai.google.model.GenerationConfig;
import za.co.sindi.ai.google.model.ListModel;
import za.co.sindi.ai.google.model.Model;
import za.co.sindi.ai.google.model.SafetySetting;
import za.co.sindi.ai.google.model.Tool;
import za.co.sindi.ai.google.utils.ContentUtils;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public interface GenerativeModel {

	public String getGenerativeModelName();
	public String getEmbeddingModelName();

	public BatchEmbedContentsResponse batchEmbedContents(final BatchEmbedContentsRequest request);
	public CountTokensResponse countTokens(final CountTokensRequest request);
	public EmbedContentResponse embedContent(final EmbedContentRequest request);
	public GenerateAnswerResponse generateAnswer(final GenerateAnswerRequest request);
	public GenerateContentResponse generateContent(final GenerateContentRequest request);
	public Model getModel();
	public ListModel listModels();
	public Stream<GenerateContentResponse> generateContentStream(final GenerateContentRequest request);
	
	default CountTokensResponse countTokens(final Content content) {
		return countTokens(Arrays.asList(content));
	}
	
	default CountTokensResponse countTokens(final String text) {
		return countTokens(ContentUtils.fromText(text));
	}
	
	default CountTokensResponse countTokens(final List<Content> contents) {
		CountTokensRequest request = new CountTokensRequest(contents.toArray(Content[]::new));
		return countTokens(request);
	}
	
	/**
	 * Generate content from this model given a single content.
	 *
	 * @param content a {@link Content} to send to the generative model
	 * @return a {@link GenerateContentResponse} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default GenerateContentResponse generateContent(Content content) {
		return generateContent(content, null, null);
	}

	/**
	 * Generate content from this model given a single content and generation
	 * config.
	 *
	 * @param content          a {@link Content} to send to the generative model
	 * @param generationConfig a {@link GenerationConfig} instance for
	 *                         generating response. {@link #getGenerationConfig}
	 *                         will not be used if this is set
	 * @return a {@link GenerateContentResponse} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default GenerateContentResponse generateContent(Content content, GenerationConfig generationConfig) {
		return generateContent(content, generationConfig, null);
	}

	/**
	 * Generate content from this model given a single content and safety settings.
	 *
	 * @param content        a {@link Content} to send to the generative model
	 * @param safetySettings a list of {@link SafetySetting} for
	 *                       generating response. {@link #getSafetySettings} will
	 *                       not be used if this is set
	 * @return a {@link GenerateContentResponse} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default GenerateContentResponse generateContent(Content content, List<SafetySetting> safetySettings) {
		return generateContent(content, null, safetySettings);
	}

	/**
	 * Generate content from generative model given a single content, generation
	 * config, and safety
	 * settings.
	 *
	 * @param content          a {@link Content} to send to the generative model
	 * @param generationConfig a {@link GenerationConfig} instance for
	 *                         generating response. {@link #getGenerationConfig}
	 *                         will not be used if this is set
	 * @param safetySettings   a list of {@link SafetySetting} for
	 *                         generating response. {@link #getSafetySettings} will
	 *                         not be used if this is set
	 * @return a {@link GenerateContentResponse} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default GenerateContentResponse generateContent(Content content, GenerationConfig generationConfig, List<SafetySetting> safetySettings) {
		return generateContent(content, null, generationConfig, safetySettings);
	}
	
	/**
	 * Generate content from generative model given a single content, generation
	 * config, and safety
	 * settings.
	 *
	 * @param content          a {@link Content} to send to the generative model
	 * @param tools			   a list of {@link Tool} for generating response.
	 * @param generationConfig a {@link GenerationConfig} instance for
	 *                         generating response. {@link #getGenerationConfig}
	 *                         will not be used if this is set
	 * @param safetySettings   a list of {@link SafetySetting} for
	 *                         generating response. {@link #getSafetySettings} will
	 *                         not be used if this is set
	 * @return a {@link GenerateContentResponse} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default GenerateContentResponse generateContent(Content content, List<Tool> tools, GenerationConfig generationConfig, List<SafetySetting> safetySettings) {
		return generateContent(Arrays.asList(content), generationConfig, safetySettings);
	}

	/**
	 * Generate content with streaming support from generative model given a text.
	 *
	 * @param text a text message to send to the generative model
	 * @return a {@link GenerateContentResponse} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default GenerateContentResponse generateContent(String text) {
		return generateContent(text, null, null);
	}

	/**
	 * Generate content with streaming support from generative model given a text
	 * and generation
	 * config.
	 *
	 * @param text             a text message to send to the generative model
	 * @param generationConfig a {@link GenerationConfig} instance for
	 *                         generating response. {@link #getGenerationConfig}
	 *                         will not be used if this is set
	 * @return a {@link GenerateContentResponse} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default GenerateContentResponse generateContent(String text, GenerationConfig generationConfig) {
		return generateContent(text, generationConfig, null);
	}

	/**
	 * Generate content with streaming support from generative model given a text
	 * and safety settings.
	 *
	 * @param text           a text message to send to the generative model
	 * @param safetySettings a list of {@link SafetySetting} for
	 *                       generating response. {@link #getSafetySettings} will
	 *                       not be used if this is set
	 * @return a {@link GenerateContentResponse} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default GenerateContentResponse generateContent(String text, List<SafetySetting> safetySettings) {
		return generateContent(text, null, safetySettings);
	}

	/**
	 * Generate content with streaming support from generative model given a text,
	 * generation config,
	 * and safety settings.
	 *
	 * @param text             a text message to send to the generative model
	 * @param generationConfig a {@link GenerationConfig} instance for
	 *                         generating response. {@link #getGenerationConfig}
	 *                         will not be used if this is set
	 * @param safetySettings   a list of {@link SafetySetting} for
	 *                         generating response. {@link #getSafetySettings} will
	 *                         not be used if this is set
	 * @return a {@link GenerateContentResponse} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default GenerateContentResponse generateContent(String text, GenerationConfig generationConfig, List<SafetySetting> safetySettings) {
		return generateContent(Arrays.asList(ContentUtils.fromText(text)), generationConfig, safetySettings);
	}

	/**
	 * Generate content with streaming support from generative model given a list of
	 * contents,
	 * generation config, and safety settings.
	 *
	 * @param contents         a list of {@link Content} to send to the
	 *                         generative model
	 * @param generationConfig a {@link GenerationConfig} instance for
	 *                         generating response. {@link #getGenerationConfig}
	 *                         will not be used if this is set
	 * @param safetySettings   a list of {@link SafetySetting} for
	 *                         generating response. {@link #getSafetySettings} will
	 *                         not be used if this is set
	 * @return a {@link GenerateContentResponse} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default GenerateContentResponse generateContent(List<Content> contents, GenerationConfig generationConfig, List<SafetySetting> safetySettings) {
		return generateContent(contents, null, generationConfig, safetySettings);
	}
	
	/**
	 * Generate content with streaming support from generative model given a list of
	 * contents,
	 * generation config, and safety settings.
	 *
	 * @param contents         a list of {@link Content} to send to the
	 *                         generative model
	 * @param tools			   a list of {@link Tool} for generating response.                     
	 * @param generationConfig a {@link GenerationConfig} instance for
	 *                         generating response. {@link #getGenerationConfig}
	 *                         will not be used if this is set
	 * @param safetySettings   a list of {@link SafetySetting} for
	 *                         generating response. {@link #getSafetySettings} will
	 *                         not be used if this is set
	 * @return a {@link GenerateContentResponse} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default GenerateContentResponse generateContent(List<Content> contents, List<Tool> tools, GenerationConfig generationConfig, List<SafetySetting> safetySettings) {
		GenerateContentRequest request = new GenerateContentRequest();
		request.setContents(contents.toArray(Content[]::new));
		if (tools != null) {
			request.setTools(tools.toArray(Tool[]::new));
		}
		if (generationConfig != null)
			request.setGenerationConfig(generationConfig);
		if (safetySettings != null) {
			request.setSafetySettings(safetySettings.toArray(SafetySetting[]::new));
		}
		return generateContent(request);
	}	
	/**
	 * Generate content from this model given a single content.
	 *
	 * @param content a {@link Content} to send to the generative model
	 * @return a {@link Stream<GenerateContentResponse>} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default Stream<GenerateContentResponse> generateContentStream(Content content) {
		return generateContentStream(content, null, null);
	}

	/**
	 * Generate content from this model given a single content and generation
	 * config.
	 *
	 * @param content          a {@link Content} to send to the generative model
	 * @param generationConfig a {@link GenerationConfig} instance for
	 *                         generating response. {@link #getGenerationConfig}
	 *                         will not be used if this is set
	 * @return a {@link Stream<GenerateContentResponse>} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default Stream<GenerateContentResponse> generateContentStream(Content content, GenerationConfig generationConfig) {
		return generateContentStream(content, generationConfig, null);
	}

	/**
	 * Generate content from this model given a single content and safety settings.
	 *
	 * @param content        a {@link Content} to send to the generative model
	 * @param safetySettings a list of {@link SafetySetting} for
	 *                       generating response. {@link #getSafetySettings} will
	 *                       not be used if this is set
	 * @return a {@link Stream<GenerateContentResponse>} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default Stream<GenerateContentResponse> generateContentStream(Content content, List<SafetySetting> safetySettings) {
		return generateContentStream(content, null, safetySettings);
	}

	/**
	 * Generate content from generative model given a single content, generation
	 * config, and safety
	 * settings.
	 *
	 * @param content          a {@link Content} to send to the generative model
	 * @param generationConfig a {@link GenerationConfig} instance for
	 *                         generating response. {@link #getGenerationConfig}
	 *                         will not be used if this is set
	 * @param safetySettings   a list of {@link SafetySetting} for
	 *                         generating response. {@link #getSafetySettings} will
	 *                         not be used if this is set
	 * @return a {@link Stream<GenerateContentResponse>} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default Stream<GenerateContentResponse> generateContentStream(Content content, GenerationConfig generationConfig, List<SafetySetting> safetySettings) {
		return generateContentStream(content, null, generationConfig, safetySettings);
	}
	
	/**
	 * Generate content from generative model given a single content, generation
	 * config, and safety
	 * settings.
	 *
	 * @param content          a {@link Content} to send to the generative model
	 * @param tools			   a list of {@link Tool} for generating response.
	 * @param generationConfig a {@link GenerationConfig} instance for
	 *                         generating response. {@link #getGenerationConfig}
	 *                         will not be used if this is set
	 * @param safetySettings   a list of {@link SafetySetting} for
	 *                         generating response. {@link #getSafetySettings} will
	 *                         not be used if this is set
	 * @return a {@link Stream<GenerateContentResponse>} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default Stream<GenerateContentResponse> generateContentStream(Content content, List<Tool> tools, GenerationConfig generationConfig, List<SafetySetting> safetySettings) {
		return generateContentStream(Arrays.asList(content), generationConfig, safetySettings);
	}

	/**
	 * Generate content with streaming support from generative model given a text.
	 *
	 * @param text a text message to send to the generative model
	 * @return a {@link Stream<GenerateContentResponse>} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default Stream<GenerateContentResponse> generateContentStream(String text) {
		return generateContentStream(text, null, null);
	}

	/**
	 * Generate content with streaming support from generative model given a text
	 * and generation
	 * config.
	 *
	 * @param text             a text message to send to the generative model
	 * @param generationConfig a {@link GenerationConfig} instance for
	 *                         generating response. {@link #getGenerationConfig}
	 *                         will not be used if this is set
	 * @return a {@link Stream<GenerateContentResponse>} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default Stream<GenerateContentResponse> generateContentStream(String text, GenerationConfig generationConfig) {
		return generateContentStream(text, generationConfig, null);
	}

	/**
	 * Generate content with streaming support from generative model given a text
	 * and safety settings.
	 *
	 * @param text           a text message to send to the generative model
	 * @param safetySettings a list of {@link SafetySetting} for
	 *                       generating response. {@link #getSafetySettings} will
	 *                       not be used if this is set
	 * @return a {@link Stream<GenerateContentResponse>} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default Stream<GenerateContentResponse> generateContentStream(String text, List<SafetySetting> safetySettings) {
		return generateContentStream(text, null, safetySettings);
	}

	/**
	 * Generate content with streaming support from generative model given a text,
	 * generation config,
	 * and safety settings.
	 *
	 * @param text             a text message to send to the generative model
	 * @param generationConfig a {@link GenerationConfig} instance for
	 *                         generating response. {@link #getGenerationConfig}
	 *                         will not be used if this is set
	 * @param safetySettings   a list of {@link SafetySetting} for
	 *                         generating response. {@link #getSafetySettings} will
	 *                         not be used if this is set
	 * @return a {@link Stream<GenerateContentResponse>} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default Stream<GenerateContentResponse> generateContentStream(String text, GenerationConfig generationConfig, List<SafetySetting> safetySettings) {
		return generateContentStream(Arrays.asList(ContentUtils.fromText(text)), generationConfig, safetySettings);
	}

	/**
	 * Generate content with streaming support from generative model given a list of
	 * contents,
	 * generation config, and safety settings.
	 *
	 * @param contents         a list of {@link Content} to send to the
	 *                         generative model
	 * @param generationConfig a {@link GenerationConfig} instance for
	 *                         generating response. {@link #getGenerationConfig}
	 *                         will not be used if this is set
	 * @param safetySettings   a list of {@link SafetySetting} for
	 *                         generating response. {@link #getSafetySettings} will
	 *                         not be used if this is set
	 * @return a {@link Stream<GenerateContentResponse>} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default Stream<GenerateContentResponse> generateContentStream(List<Content> contents, GenerationConfig generationConfig, List<SafetySetting> safetySettings) {
		return generateContentStream(contents, null, generationConfig, safetySettings);
	}
	
	/**
	 * Generate content with streaming support from generative model given a list of
	 * contents,
	 * generation config, and safety settings.
	 *
	 * @param contents         a list of {@link Content} to send to the
	 *                         generative model
	 * @param tools			   a list of {@link Tool} for generating response.                     
	 * @param generationConfig a {@link GenerationConfig} instance for
	 *                         generating response. {@link #getGenerationConfig}
	 *                         will not be used if this is set
	 * @param safetySettings   a list of {@link SafetySetting} for
	 *                         generating response. {@link #getSafetySettings} will
	 *                         not be used if this is set
	 * @return a {@link Stream<GenerateContentResponse>} instance that contains
	 *         response contents and other metadata
	 * @if an I/O error occurs while making the API call
	 */
	default Stream<GenerateContentResponse> generateContentStream(List<Content> contents, List<Tool> tools, GenerationConfig generationConfig, List<SafetySetting> safetySettings) {
		GenerateContentRequest request = new GenerateContentRequest();
		request.setContents(contents.toArray(Content[]::new));
		if (tools != null) {
			request.setTools(tools.toArray(Tool[]::new));
		}
		if (generationConfig != null)
			request.setGenerationConfig(generationConfig);
		if (safetySettings != null) {
			request.setSafetySettings(safetySettings.toArray(SafetySetting[]::new));
		}
		return generateContentStream(request);
	}
}
