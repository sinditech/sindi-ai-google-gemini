package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 */
public class PrebuiltVoiceConfig implements Serializable {

	@JsonbProperty
	private String voiceName;

	/**
	 * @return the voiceName
	 */
	public String getVoiceName() {
		return voiceName;
	}

	/**
	 * @param voiceName the voiceName to set
	 */
	public void setVoiceName(String voiceName) {
		this.voiceName = voiceName;
	}
}
