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
public class Part implements Serializable {

	@JsonbProperty
	private String text;
	
	@JsonbProperty
	private Blob inlineData;
	
	@JsonbProperty
	private FileData fileData;
	
	@JsonbProperty
	private FunctionCall functionCall;
	
	@JsonbProperty
	private FunctionResponse functionResponse;
	
	@JsonbProperty
	private VideoMetadata videoMetadata;

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the inlineData
	 */
	public Blob getInlineData() {
		return inlineData;
	}

	/**
	 * @param inlineData the inlineData to set
	 */
	public void setInlineData(Blob inlineData) {
		this.inlineData = inlineData;
	}

	/**
	 * @return the fileData
	 */
	public FileData getFileData() {
		return fileData;
	}

	/**
	 * @param fileData the fileData to set
	 */
	public void setFileData(FileData fileData) {
		this.fileData = fileData;
	}

	/**
	 * @return the functionCall
	 */
	public FunctionCall getFunctionCall() {
		return functionCall;
	}

	/**
	 * @param functionCall the functionCall to set
	 */
	public void setFunctionCall(FunctionCall functionCall) {
		this.functionCall = functionCall;
	}

	/**
	 * @return the functionResponse
	 */
	public FunctionResponse getFunctionResponse() {
		return functionResponse;
	}

	/**
	 * @param functionResponse the functionResponse to set
	 */
	public void setFunctionResponse(FunctionResponse functionResponse) {
		this.functionResponse = functionResponse;
	}

	/**
	 * @return the videoMetadata
	 */
	public VideoMetadata getVideoMetadata() {
		return videoMetadata;
	}

	/**
	 * @param videoMetadata the videoMetadata to set
	 */
	public void setVideoMetadata(VideoMetadata videoMetadata) {
		this.videoMetadata = videoMetadata;
	}
}
