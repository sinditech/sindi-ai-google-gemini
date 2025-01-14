package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 13 January 2025
 * @see <a href="https://ai.google.dev/api/generate-content#LogprobsResult">LogprobsResult</a>.
 */
public class LogprobsResult implements Serializable {

	@JsonbProperty
	private TopCandidates[] topCandidates;
	
	@JsonbProperty
	private LogprobsCandidate[] chosenCandidates;

	/**
	 * @return the topCandidates
	 */
	public TopCandidates[] getTopCandidates() {
		return topCandidates;
	}

	/**
	 * @param topCandidates the topCandidates to set
	 */
	public void setTopCandidates(TopCandidates[] topCandidates) {
		this.topCandidates = topCandidates;
	}

	/**
	 * @return the chosenCandidates
	 */
	public LogprobsCandidate[] getChosenCandidates() {
		return chosenCandidates;
	}

	/**
	 * @param chosenCandidates the chosenCandidates to set
	 */
	public void setChosenCandidates(LogprobsCandidate[] chosenCandidates) {
		this.chosenCandidates = chosenCandidates;
	}
}
