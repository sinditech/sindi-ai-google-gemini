/**
 * 
 */
package za.co.sindi.ai.google.utils;

import za.co.sindi.ai.google.model.Content;
import za.co.sindi.ai.google.model.FinishReason;
import za.co.sindi.ai.google.model.GenerateContentResponse;
import za.co.sindi.ai.google.model.Part;

/**
 * @author Buhake Sindi
 * @since 28 February 2024
 */
public class ResponseUtils {
	
	private ResponseUtils() {
		throw new AssertionError("Private Constructor.");
	}
	
	/**
	 * Get the text message in a GenerateContentResponse.
	 *
	 * @param response a
	 *                 {@link GenerateContentResponse}
	 *                 instance
	 * @return a String that aggregates all the text parts in the response
	 * @throws IllegalArgumentException if the response has 0 or more than 1
	 *                                  candidates, or if the
	 *                                  response is blocked by safety reason or
	 *                                  unauthorized citations
	 */
	public static String getText(GenerateContentResponse response) {
		FinishReason finishReason = getFinishReason(response);
		if (finishReason == FinishReason.SAFETY) {
			throw new IllegalArgumentException("The response is blocked due to safety reason.");
		} else if (finishReason == FinishReason.RECITATION) {
			throw new IllegalArgumentException("The response is blocked due to unauthorized citations.");
		}

		String text = "";
		Part[] parts = response.getCandidates()[0].getContent().getParts();
		for (Part part : parts) {
			text += part.getText();
		}

		return text;
	}

	/**
	 * Get the content in a GenerateContentResponse.
	 *
	 * @param response a
	 *                 {@link GenerateContentResponse}
	 *                 instance
	 * @return the {@link com.google.cloud.vertexai.api.Content} in the response
	 * @throws IllegalArgumentException if the response has 0 or more than 1
	 *                                  candidates, or if the
	 *                                  response is blocked by safety reason or
	 *                                  unauthorized citations
	 */
	public static Content getContent(GenerateContentResponse response) {
		FinishReason finishReason = getFinishReason(response);
		if (finishReason == FinishReason.SAFETY) {
			throw new IllegalArgumentException("The response is blocked due to safety reason.");
		} else if (finishReason == FinishReason.RECITATION) {
			throw new IllegalArgumentException("The response is blocked due to unauthorized citations.");
		}

		return response.getCandidates()[0].getContent();
	}

	/**
	 * Get the finish reason in a GenerateContentResponse.
	 *
	 * @param response a
	 *                 {@link GenerateContentResponse}
	 *                 instance
	 * @return the {@link FinishReason} in the
	 *         response
	 * @throws IllegalArgumentException if the response has 0 or more than 1
	 *                                  candidates
	 */
	public static FinishReason getFinishReason(GenerateContentResponse response) {
		if (response.getCandidates().length != 1) {
			throw new IllegalArgumentException(
					String.format("This response should have exactly 1 candidate, but it has %d.", response.getCandidates().length));
		}
		
		return response.getCandidates()[0].getFinishReason();
	}
}
