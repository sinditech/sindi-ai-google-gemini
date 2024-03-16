/**
 * 
 */
package za.co.sindi.ai.google.model;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public class SemanticRetrieverConfig {

	@JsonbProperty
	private String source;
	
	@JsonbProperty
	private Content query;
	
	@JsonbProperty
	private MetadataFilter[] metadataFilters;
	
	@JsonbProperty
	private Integer maxChunksCount;
	
	@JsonbProperty
	private Double minimumRelevanceScore;

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the query
	 */
	public Content getQuery() {
		return query;
	}

	/**
	 * @param query the query to set
	 */
	public void setQuery(Content query) {
		this.query = query;
	}

	/**
	 * @return the metadataFilters
	 */
	public MetadataFilter[] getMetadataFilters() {
		return metadataFilters;
	}

	/**
	 * @param metadataFilters the metadataFilters to set
	 */
	public void setMetadataFilters(MetadataFilter[] metadataFilters) {
		this.metadataFilters = metadataFilters;
	}

	/**
	 * @return the maxChunksCount
	 */
	public Integer getMaxChunksCount() {
		return maxChunksCount;
	}

	/**
	 * @param maxChunksCount the maxChunksCount to set
	 */
	public void setMaxChunksCount(Integer maxChunksCount) {
		this.maxChunksCount = maxChunksCount;
	}

	/**
	 * @return the minimumRelevanceScore
	 */
	public Double getMinimumRelevanceScore() {
		return minimumRelevanceScore;
	}

	/**
	 * @param minimumRelevanceScore the minimumRelevanceScore to set
	 */
	public void setMinimumRelevanceScore(Double minimumRelevanceScore) {
		this.minimumRelevanceScore = minimumRelevanceScore;
	}
}
