package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 13 January 2025
 */
public class GroundingAttribution implements Serializable {

	@JsonbProperty
	private AttributionSourceId sourceId;
	
	@JsonbProperty
	private Content content;

	/**
	 * @return the sourceId
	 */
	public AttributionSourceId getSourceId() {
		return sourceId;
	}

	/**
	 * @param sourceId the sourceId to set
	 */
	public void setSourceId(AttributionSourceId sourceId) {
		this.sourceId = sourceId;
	}

	/**
	 * @return the content
	 */
	public Content getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(Content content) {
		this.content = content;
	}
}
