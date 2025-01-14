/**
 * 
 */
package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public class GenerateContentResponse implements Serializable {

	@JsonbProperty
	private Candidate[] candidates;
	
	@JsonbProperty
	private PromptFeedback promptFeedback;

	@JsonbProperty
	private UsageMetadata usageMetadata;
	
	@JsonbProperty
	private String modelVersion;

	/**
	 * @return the candidates
	 */
	public Candidate[] getCandidates() {
		return candidates;
	}

	/**
	 * @param candidates the candidates to set
	 */
	public void setCandidates(Candidate[] candidates) {
		this.candidates = candidates;
	}

	/**
	 * @return the promptFeedback
	 */
	public PromptFeedback getPromptFeedback() {
		return promptFeedback;
	}

	/**
	 * @param promptFeedback the promptFeedback to set
	 */
	public void setPromptFeedback(PromptFeedback promptFeedback) {
		this.promptFeedback = promptFeedback;
	}

	/**
	 * @return the usageMetadata
	 */
	public UsageMetadata getUsageMetadata() {
		return usageMetadata;
	}

	/**
	 * @param usageMetadata the usageMetadata to set
	 */
	public void setUsageMetadata(UsageMetadata usageMetadata) {
		this.usageMetadata = usageMetadata;
	}

	/**
	 * @return the modelVersion
	 */
	public String getModelVersion() {
		return modelVersion;
	}

	/**
	 * @param modelVersion the modelVersion to set
	 */
	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}
}
