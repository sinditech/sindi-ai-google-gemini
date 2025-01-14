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
public class VideoMetadata implements Serializable {

	@JsonbProperty
	private String videoDuration;

	/**
	 * @return the videoDuration
	 */
	public String getVideoDuration() {
		return videoDuration;
	}

	/**
	 * @param videoDuration the videoDuration to set
	 */
	public void setVideoDuration(String videoDuration) {
		this.videoDuration = videoDuration;
	}
}
