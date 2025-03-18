package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 */
public class VoiceConfig implements Serializable {

	@JsonbProperty
	private PrebuiltVoiceConfig prebuiltVoiceConfig;

	/**
	 * @return the prebuiltVoiceConfig
	 */
	public PrebuiltVoiceConfig getPrebuiltVoiceConfig() {
		return prebuiltVoiceConfig;
	}

	/**
	 * @param prebuiltVoiceConfig the prebuiltVoiceConfig to set
	 */
	public void setPrebuiltVoiceConfig(PrebuiltVoiceConfig prebuiltVoiceConfig) {
		this.prebuiltVoiceConfig = prebuiltVoiceConfig;
	}
}
