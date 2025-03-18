package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 */
public class TuningExamples implements Serializable {

	@JsonbProperty
	private TuningExample[] examples;

	/**
	 * @return the examples
	 */
	public TuningExample[] getExamples() {
		return examples;
	}

	/**
	 * @param examples the examples to set
	 */
	public void setExamples(TuningExample[] examples) {
		this.examples = examples;
	}
}
