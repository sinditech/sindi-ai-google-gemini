/**
 * 
 */
package za.co.sindi.ai.google.model;

import java.io.Serializable;
import java.util.Map;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public class Schema implements Serializable {

	@JsonbProperty
	private Type type;
	
	@JsonbProperty
	private String format;
	
	@JsonbProperty
	private String description;
	
	@JsonbProperty
	private Boolean nullable;
	
	@JsonbProperty
	private Schema items;
	
	@JsonbProperty("enum")
	private String[] enums;
	
	@JsonbProperty
	private String maxItems;
	
	@JsonbProperty
	private String minItems;
	
	@JsonbProperty
	private Map<String, Schema> properties;
	
	@JsonbProperty
	private String[] required;
	
	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the nullable
	 */
	public Boolean getNullable() {
		return nullable;
	}

	/**
	 * @param nullable the nullable to set
	 */
	public void setNullable(Boolean nullable) {
		this.nullable = nullable;
	}

	/**
	 * @return the items
	 */
	public Schema getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(Schema items) {
		this.items = items;
	}

	/**
	 * @return the enums
	 */
	public String[] getEnums() {
		return enums;
	}

	/**
	 * @param enums the enums to set
	 */
	public void setEnums(String[] enums) {
		this.enums = enums;
	}

	/**
	 * @return the maxItems
	 */
	public String getMaxItems() {
		return maxItems;
	}

	/**
	 * @param maxItems the maxItems to set
	 */
	public void setMaxItems(String maxItems) {
		this.maxItems = maxItems;
	}

	/**
	 * @return the minItems
	 */
	public String getMinItems() {
		return minItems;
	}

	/**
	 * @param minItems the minItems to set
	 */
	public void setMinItems(String minItems) {
		this.minItems = minItems;
	}

	/**
	 * @return the properties
	 */
	public Map<String, Schema> getProperties() {
		return properties;
	}

	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Map<String, Schema> properties) {
		this.properties = properties;
	}

	/**
	 * @return the required
	 */
	public String[] getRequired() {
		return required;
	}

	/**
	 * @param required the required to set
	 */
	public void setRequired(String[] required) {
		this.required = required;
	}
}
