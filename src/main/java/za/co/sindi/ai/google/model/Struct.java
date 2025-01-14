package za.co.sindi.ai.google.model;

import java.io.Serializable;
import java.util.Map;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 14 January 2025
 * @see <a href="https://protobuf.dev/reference/protobuf/google.protobuf/#struct">Struct</a>.
 */
public class Struct implements Serializable {

	@JsonbProperty
	private Map<String, Object> fields;

	/**
	 * @return the fields
	 */
	public Map<String, Object> getFields() {
		return fields;
	}

	/**
	 * @param fields the fields to set
	 */
	public void setFields(Map<String, Object> fields) {
		this.fields = fields;
	}
}
