package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 13 January 2025
 * @see <a href="https://ai.google.dev/api/generate-content#TopCandidates">TopCandidates</a>.
 */
public class TopCandidates implements Serializable {

	@JsonbProperty
	private LogprobsCandidate[] candidates;

	/**
	 * @return the candidates
	 */
	public LogprobsCandidate[] getCandidates() {
		return candidates;
	}

	/**
	 * @param candidates the candidates to set
	 */
	public void setCandidates(LogprobsCandidate[] candidates) {
		this.candidates = candidates;
	}
}
