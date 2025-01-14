package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 13 January 2025
 * @see <a href="https://ai.google.dev/api/generate-content#Candidate">Candidate</a>
 */
public class LogprobsCandidate implements Serializable {

	@JsonbProperty
	private String token;
	
	@JsonbProperty
	private Integer tokenId;
	
	@JsonbProperty
	private Double logProbability;

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the tokenId
	 */
	public Integer getTokenId() {
		return tokenId;
	}

	/**
	 * @param tokenId the tokenId to set
	 */
	public void setTokenId(Integer tokenId) {
		this.tokenId = tokenId;
	}

	/**
	 * @return the logProbability
	 */
	public Double getLogProbability() {
		return logProbability;
	}

	/**
	 * @param logProbability the logProbability to set
	 */
	public void setLogProbability(Double logProbability) {
		this.logProbability = logProbability;
	}
}
