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
public class FileData implements Serializable {

	@JsonbProperty
	private String mimeType;
	
	@JsonbProperty
	private String fileUri;

	/**
	 * @return the mimeType
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * @param mimeType the mimeType to set
	 */
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	/**
	 * @return the fileUri
	 */
	public String getFileUri() {
		return fileUri;
	}

	/**
	 * @param fileUri the fileUri to set
	 */
	public void setFileUri(String fileUri) {
		this.fileUri = fileUri;
	}
}
