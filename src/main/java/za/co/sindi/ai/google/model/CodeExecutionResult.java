package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 14 January 2025
 * @see <a href="https://ai.google.dev/api/caching#CodeExecutionResult">CodeExecutionResult</a>.
 */
public class CodeExecutionResult implements Serializable {

	@JsonbProperty
	private Outcome outcome;
	
	@JsonbProperty
	private String output;

	/**
	 * @return the outcome
	 */
	public Outcome getOutcome() {
		return outcome;
	}

	/**
	 * @param outcome the outcome to set
	 */
	public void setOutcome(Outcome outcome) {
		this.outcome = outcome;
	}

	/**
	 * @return the output
	 */
	public String getOutput() {
		return output;
	}

	/**
	 * @param output the output to set
	 */
	public void setOutput(String output) {
		this.output = output;
	}
}
