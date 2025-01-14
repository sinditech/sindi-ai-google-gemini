/**
 * 
 */
package za.co.sindi.ai.google;

/**
 * @author Buhake Sindi
 * @since 28 February 2024
 */
public enum ErrorStatus {

	INVALID_ARGUMENT(400)
	,FAILED_PRECONDITION(400)
	,PERMISSION_DENIED(403)
	,NOT_FOUND(404)
	,RESOURCE_EXHAUSTED(429)
	,CANCELLED(499)
	,UNKNOWN(500)
	,INTERNAL(500)
	,UNAVAILABLE(503)
	,DEADLINE_EXCEEDED(504)
	
	;
	private final int httpErrorCode;

	/**
	 * @param httpErrorCode
	 */
	private ErrorStatus(int httpErrorCode) {
		this.httpErrorCode = httpErrorCode;
	}

	/**
	 * @return the httpErrorCode
	 */
	public int getHttpErrorCode() {
		return httpErrorCode;
	}
}
