package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 */
public class TunedModel implements Serializable {

	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private String displayName;
	
	@JsonbProperty
	private String description;
	
	@JsonbProperty
	private State state;
	
	@JsonbProperty
	private String createTime;
	
	@JsonbProperty
	private String updateTime;
	
	@JsonbProperty
	private TuningTask tuningTask;
	
	@JsonbProperty
	private String[] readerProjectNumbers;
	
	@JsonbProperty
	private TunedModelSource tunedModelSource;
	
	@JsonbProperty
	private String baseModel;
	
	@JsonbProperty
	private Double temperature;
	
	@JsonbProperty
	private Double topP;
	
	@JsonbProperty
	private Integer topK;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}

	/**
	 * @return the createTime
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the updateTime
	 */
	public String getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @return the tuningTask
	 */
	public TuningTask getTuningTask() {
		return tuningTask;
	}

	/**
	 * @param tuningTask the tuningTask to set
	 */
	public void setTuningTask(TuningTask tuningTask) {
		this.tuningTask = tuningTask;
	}

	/**
	 * @return the readerProjectNumbers
	 */
	public String[] getReaderProjectNumbers() {
		return readerProjectNumbers;
	}

	/**
	 * @param readerProjectNumbers the readerProjectNumbers to set
	 */
	public void setReaderProjectNumbers(String[] readerProjectNumbers) {
		this.readerProjectNumbers = readerProjectNumbers;
	}

	/**
	 * @return the tunedModelSource
	 */
	public TunedModelSource getTunedModelSource() {
		return tunedModelSource;
	}

	/**
	 * @param tunedModelSource the tunedModelSource to set
	 */
	public void setTunedModelSource(TunedModelSource tunedModelSource) {
		this.tunedModelSource = tunedModelSource;
	}

	/**
	 * @return the baseModel
	 */
	public String getBaseModel() {
		return baseModel;
	}

	/**
	 * @param baseModel the baseModel to set
	 */
	public void setBaseModel(String baseModel) {
		this.baseModel = baseModel;
	}

	/**
	 * @return the temperature
	 */
	public Double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the topP
	 */
	public Double getTopP() {
		return topP;
	}

	/**
	 * @param topP the topP to set
	 */
	public void setTopP(Double topP) {
		this.topP = topP;
	}

	/**
	 * @return the topK
	 */
	public Integer getTopK() {
		return topK;
	}

	/**
	 * @param topK the topK to set
	 */
	public void setTopK(Integer topK) {
		this.topK = topK;
	}
}
