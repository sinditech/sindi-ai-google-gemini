/**
 * 
 */
package za.co.sindi.ai.google.model;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 25 February 2024
 */
public class EmbedContentRequest {
	
	@JsonbProperty
	private String model;

	@JsonbProperty
	private Content content;
	
	@JsonbProperty
	private TaskType taskType;
	
	@JsonbProperty
	private String title;
	
	@JsonbProperty
	private Integer outputDimensionality;

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the content
	 */
	public Content getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(Content content) {
		this.content = content;
	}

	/**
	 * @return the taskType
	 */
	public TaskType getTaskType() {
		return taskType;
	}

	/**
	 * @param taskType the taskType to set
	 */
	public void setTaskType(TaskType taskType) {
		this.taskType = taskType;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the outputDimensionality
	 */
	public Integer getOutputDimensionality() {
		return outputDimensionality;
	}

	/**
	 * @param outputDimensionality the outputDimensionality to set
	 */
	public void setOutputDimensionality(Integer outputDimensionality) {
		this.outputDimensionality = outputDimensionality;
	}
}
