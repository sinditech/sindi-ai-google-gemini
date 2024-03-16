/**
 * 
 */
package za.co.sindi.ai.google;

/**
 * @author Buhake Sindi
 * @since 28 February 2024
 */
public class ApiException extends RuntimeException {

	private final ApiError apiError;

	/**
	 * @param error
	 */
	public ApiException(ApiError apiError) {
		super(apiError.getError().getMessage());
		this.apiError = apiError;
	}

	/**
	 * @return the error
	 */
	public ApiError getError() {
		return apiError;
	}
}
