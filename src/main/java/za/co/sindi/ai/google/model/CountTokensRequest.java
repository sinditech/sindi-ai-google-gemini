/**
 * 
 */
package za.co.sindi.ai.google.model;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 * @see <a href="https://ai.google.dev/api/tokens">Tokens</a>.
 */
public class CountTokensRequest implements Serializable {

	@JsonbProperty
	private Content[] contents;
	
	@JsonbProperty
	private GenerateContentRequest generateContentRequest;

	/**
	 * 
	 */
	public CountTokensRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param contents
	 */
	public CountTokensRequest(Content[] contents) {
		super();
		this.contents = contents;
	}

	/**
	 * @return the contents
	 */
	public Content[] getContents() {
		return contents;
	}

	/**
	 * @param contents the contents to set
	 */
	public void setContents(Content[] contents) {
		this.contents = contents;
	}

	/**
	 * @return the generateContentRequest
	 */
	public GenerateContentRequest getGenerateContentRequest() {
		return generateContentRequest;
	}

	/**
	 * @param generateContentRequest the generateContentRequest to set
	 */
	public void setGenerateContentRequest(GenerateContentRequest generateContentRequest) {
		this.generateContentRequest = generateContentRequest;
	}
}
