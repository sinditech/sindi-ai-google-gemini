package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 13 January 2025
 * @see <a href="https://ai.google.dev/api/generate-content#GroundingMetadata">GroundingMetadata</a>.
 */
public class GroundingMetadata implements Serializable {

	@JsonbProperty
	private GroundingChunk[] groundingChunks;
	
	@JsonbProperty
	private GroundingSupport[] groundingSupports;
	
	@JsonbProperty
	private String[] webSearchQueries;
	
	@JsonbProperty
	private SearchEntryPoint searchEntryPoint;
	
	@JsonbProperty
	private RetrievalMetadata retrievalMetadata;

	/**
	 * @return the groundingChunks
	 */
	public GroundingChunk[] getGroundingChunks() {
		return groundingChunks;
	}

	/**
	 * @param groundingChunks the groundingChunks to set
	 */
	public void setGroundingChunks(GroundingChunk[] groundingChunks) {
		this.groundingChunks = groundingChunks;
	}

	/**
	 * @return the groundingSupports
	 */
	public GroundingSupport[] getGroundingSupports() {
		return groundingSupports;
	}

	/**
	 * @param groundingSupports the groundingSupports to set
	 */
	public void setGroundingSupports(GroundingSupport[] groundingSupports) {
		this.groundingSupports = groundingSupports;
	}

	/**
	 * @return the webSearchQueries
	 */
	public String[] getWebSearchQueries() {
		return webSearchQueries;
	}

	/**
	 * @param webSearchQueries the webSearchQueries to set
	 */
	public void setWebSearchQueries(String[] webSearchQueries) {
		this.webSearchQueries = webSearchQueries;
	}

	/**
	 * @return the searchEntryPoint
	 */
	public SearchEntryPoint getSearchEntryPoint() {
		return searchEntryPoint;
	}

	/**
	 * @param searchEntryPoint the searchEntryPoint to set
	 */
	public void setSearchEntryPoint(SearchEntryPoint searchEntryPoint) {
		this.searchEntryPoint = searchEntryPoint;
	}

	/**
	 * @return the retrievalMetadata
	 */
	public RetrievalMetadata getRetrievalMetadata() {
		return retrievalMetadata;
	}

	/**
	 * @param retrievalMetadata the retrievalMetadata to set
	 */
	public void setRetrievalMetadata(RetrievalMetadata retrievalMetadata) {
		this.retrievalMetadata = retrievalMetadata;
	}
}
