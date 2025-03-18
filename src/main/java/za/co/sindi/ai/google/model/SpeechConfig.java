package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 */
public class SpeechConfig implements Serializable {

	@JsonbProperty
	private VoiceConfig voiceConfig;

	/**
	 * @return the voiceConfig
	 */
	public VoiceConfig getVoiceConfig() {
		return voiceConfig;
	}

	/**
	 * @param voiceConfig the voiceConfig to set
	 */
	public void setVoiceConfig(VoiceConfig voiceConfig) {
		this.voiceConfig = voiceConfig;
	}
}
