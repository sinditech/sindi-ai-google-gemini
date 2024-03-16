/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 25 February 2024
 */
public enum TaskType {
	TASK_TYPE_UNSPECIFIED("Unset value, which will default to one of the other enum values.")
	,RETRIEVAL_QUERY("Specifies the given text is a query in a search/retrieval setting.")
	,RETRIEVAL_DOCUMENT("Specifies the given text is a document from the corpus being searched.")
	,SEMANTIC_SIMILARITY("Specifies the given text will be used for STS.")
	,CLASSIFICATION("Specifies that the given text will be classified.")
	,CLUSTERING("Specifies that the embeddings will be used for clustering.")
	;
	private final String description;

	/**
	 * @param description
	 */
	private TaskType(String description) {
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
}
