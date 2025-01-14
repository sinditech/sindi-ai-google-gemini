package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 13 January 2025
 */
public class SearchEntryPoint implements Serializable {

	@JsonbProperty
	private String renderedContent;
	
	@JsonbProperty
	private String sdkBlob;

	/**
	 * @return the renderedContent
	 */
	public String getRenderedContent() {
		return renderedContent;
	}

	/**
	 * @param renderedContent the renderedContent to set
	 */
	public void setRenderedContent(String renderedContent) {
		this.renderedContent = renderedContent;
	}

	/**
	 * @return the sdkBlob
	 */
	public String getSdkBlob() {
		return sdkBlob;
	}

	/**
	 * @param sdkBlob the sdkBlob to set
	 */
	public void setSdkBlob(String sdkBlob) {
		this.sdkBlob = sdkBlob;
	}
}
