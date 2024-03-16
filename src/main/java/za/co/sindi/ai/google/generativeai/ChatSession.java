/**
 * 
 */
package za.co.sindi.ai.google.generativeai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import za.co.sindi.ai.google.model.Content;
import za.co.sindi.ai.google.model.FinishReason;
import za.co.sindi.ai.google.model.GenerateContentResponse;
import za.co.sindi.ai.google.model.GenerationConfig;
import za.co.sindi.ai.google.model.SafetySetting;
import za.co.sindi.ai.google.utils.ContentUtils;
import za.co.sindi.ai.google.utils.ResponseUtils;

/**
 * @author Buhake Sindi
 * @since 28 February 2024
 */
public class ChatSession {

	private final GenerativeModel model;
	private List<Content> history = new ArrayList<>();
	private GenerateContentResponse currentResponse = null;

	/**
	 * @param model
	 */
	public ChatSession(final GenerativeModel model) {
		super();
		this.model = Objects.requireNonNull(model, "A generative model is required.");
	}

	/**
	 * Sends a message to the model and returns a response.
	 *
	 * @param text the message to be sent.
	 * @return a response.
	 */
	public GenerateContentResponse sendMessage(String text) {
		return sendMessage(text, null, null);
	}

	/**
	 * Sends a message to the model and returns a response.
	 *
	 * @param text             the message to be sent.
	 * @param generationConfig the generation config.
	 * @return a response.
	 */
	public GenerateContentResponse sendMessage(String text, GenerationConfig generationConfig) {
		return sendMessage(text, generationConfig, null);
	}

	/**
	 * Sends a message to the model and returns a response.
	 *
	 * @param text           the message to be sent.
	 * @param safetySettings the safety settings.
	 * @return a response.
	 */
	public GenerateContentResponse sendMessage(String text, List<SafetySetting> safetySettings) {
		return sendMessage(text, null, safetySettings);
	}

	/**
	 * Sends a message to the model and returns a response.
	 *
	 * @param text             the message to be sent.
	 * @param generationConfig the generation config.
	 * @param safetySettings   the safety settings.
	 * @return a response.
	 */
	public GenerateContentResponse sendMessage(String text, GenerationConfig generationConfig, List<SafetySetting> safetySettings) {

		checkLastResponseAndEditHistory();
		history.add(ContentUtils.fromText(text));
		GenerateContentResponse response = model.generateContent(history, generationConfig, safetySettings);
		currentResponse = response;
//		currentResponseStream = null;
		return response;
	}

	/**
	 * Sends a message to the model and returns a response.
	 *
	 * @param content the content to be sent.
	 * @return a response.
	 */
	public GenerateContentResponse sendMessage(Content content) {
		return sendMessage(content, null, null);
	}

	/**
	 * Sends a message to the model and returns a response.
	 *
	 * @param content          the content to be sent.
	 * @param generationConfig the generation config.
	 * @return a response.
	 */
	public GenerateContentResponse sendMessage(Content content, GenerationConfig generationConfig) {
		return sendMessage(content, generationConfig, null);
	}

	/**
	 * Sends a message to the model and returns a response.
	 *
	 * @param content        the content to be sent.
	 * @param safetySettings the safety settings.
	 * @return a response.
	 */
	public GenerateContentResponse sendMessage(Content content, List<SafetySetting> safetySettings) {
		return sendMessage(content, null, safetySettings);
	}

	/**
	 * Sends a message to the model and returns a response.
	 *
	 * @param content          the content to be sent.
	 * @param generationConfig the generation config.
	 * @param safetySettings   the safety settings.
	 * @return a response.
	 */
	public GenerateContentResponse sendMessage(Content content, GenerationConfig generationConfig, List<SafetySetting> safetySettings) {
		checkLastResponseAndEditHistory();
		history.add(content);
		GenerateContentResponse response = model.generateContent(history, generationConfig, safetySettings);
		currentResponse = response;
//		currentResponseStream = null;
		return response;
	}

	private void removeLastContent() {
		int lastIndex = history.size() - 1;
		history.remove(lastIndex);
	}

	/**
	 * Checks whether the last response is available and edit the history if
	 * necessary.
	 *
	 * @throws IllegalStateException if the response stream is not finished.
	 */
	private void checkLastResponseAndEditHistory() throws IllegalStateException {
		if (currentResponse == null) {
			return;
		}

		FinishReason finishReason = ResponseUtils.getFinishReason(currentResponse);
		if (finishReason != FinishReason.STOP && finishReason != FinishReason.MAX_TOKENS) {
			// We also remove the request from the history.
			removeLastContent();
			currentResponse = null;
			throw new IllegalStateException(
					String.format("The last round of conversation will not be added to history because response did"
							+ " not finish normally. Finish reason is %s.", finishReason));
		}

		history.add(ResponseUtils.getContent(currentResponse));
		currentResponse = null;
	}

	/**
	 * Returns the history of the conversation.
	 *
	 * @return an unmodifiable history of the conversation.
	 */
	public List<Content> getHistory() {
		try {
			checkLastResponseAndEditHistory();
		} catch (IllegalStateException e) {
			if (e.getMessage().contains("The last round of conversation will not be added to history because")) {
				IllegalStateException modifiedExecption = new IllegalStateException(
						"Rerun getHistory() to get cleaned history.");
				modifiedExecption.initCause(e);
				throw modifiedExecption;
			}
			throw e;
		}
		return Collections.unmodifiableList(history);
	}

	/** Set the history to a list of Content */
	public void setHistory(List<Content> history) {
		this.history = history;
	}
}
