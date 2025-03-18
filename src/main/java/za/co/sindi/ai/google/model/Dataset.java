package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 */
public class Dataset implements Serializable {

	@JsonbProperty
	private TuningExamples examples;

	/**
	 * @return the examples
	 */
	public TuningExamples getExamples() {
		return examples;
	}

	/**
	 * @param examples the examples to set
	 */
	public void setExamples(TuningExamples examples) {
		this.examples = examples;
	}
}
