/**
 * 
 */
package za.co.sindi.ai.google.model;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public class GenerateAnswerResponse {

	@JsonbProperty
	private Candidate answer;
	
	@JsonbProperty
	private Double answerableProbability;
	
	@JsonbProperty
	private InputFeedback inputFeedback;

	/**
	 * @return the answer
	 */
	public Candidate getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(Candidate answer) {
		this.answer = answer;
	}

	/**
	 * @return the answerableProbability
	 */
	public Double getAnswerableProbability() {
		return answerableProbability;
	}

	/**
	 * @param answerableProbability the answerableProbability to set
	 */
	public void setAnswerableProbability(Double answerableProbability) {
		this.answerableProbability = answerableProbability;
	}

	/**
	 * @return the inputFeedback
	 */
	public InputFeedback getInputFeedback() {
		return inputFeedback;
	}

	/**
	 * @param inputFeedback the inputFeedback to set
	 */
	public void setInputFeedback(InputFeedback inputFeedback) {
		this.inputFeedback = inputFeedback;
	}
}
