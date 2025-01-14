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
public class CitationSource implements Serializable {

	@JsonbProperty
	private Integer startIndex;
	
	@JsonbProperty
	private Integer endIndex;
	
	@JsonbProperty
	private String uri;
	
//	@JsonbProperty
//	private String title;
	
	@JsonbProperty
	private String license;
	
//	@JsonbProperty
//	private Date publicationDate;

	/**
	 * @return the startIndex
	 */
	public Integer getStartIndex() {
		return startIndex;
	}

	/**
	 * @param startIndex the startIndex to set
	 */
	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * @return the endIndex
	 */
	public Integer getEndIndex() {
		return endIndex;
	}

	/**
	 * @param endIndex the endIndex to set
	 */
	public void setEndIndex(Integer endIndex) {
		this.endIndex = endIndex;
	}

	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @param uri the uri to set
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

//	/**
//	 * @return the title
//	 */
//	public String getTitle() {
//		return title;
//	}
//
//	/**
//	 * @param title the title to set
//	 */
//	public void setTitle(String title) {
//		this.title = title;
//	}

	/**
	 * @return the license
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * @param license the license to set
	 */
	public void setLicense(String license) {
		this.license = license;
	}

//	/**
//	 * @return the publicationDate
//	 */
//	public Date getPublicationDate() {
//		return publicationDate;
//	}
//
//	/**
//	 * @param publicationDate the publicationDate to set
//	 */
//	public void setPublicationDate(Date publicationDate) {
//		this.publicationDate = publicationDate;
//	}
}
