/**
 * 
 */
package za.co.sindi.ai.google.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

import za.co.sindi.ai.google.model.Blob;
import za.co.sindi.ai.google.model.Content;
import za.co.sindi.ai.google.model.Part;
import za.co.sindi.commons.utils.IOUtils;

/**
 * @author Buhake Sindi
 * @since 28 February 2024
 */
public class ContentUtils {

	private static final String CONTENT_ROLE_USER = "user";
	
	private ContentUtils() {
		throw new AssertionError("Private constructor.");
	}
	
	public static Content fromText(final String text) {
		return fromTextWithRole(CONTENT_ROLE_USER, text);
	}
	
	public static Content fromTextWithRole(final String role, final String text) {
		Content content = new Content();
		content.setRole(role);
		
		Part part = new Part();
		part.setText(text);
		content.setParts(new Part[] { part });
		
		return content;
	}
	
	public static Blob createBlob(final InputStream inputStream, final String mimeType) throws IOException {
		
		Blob blob = new Blob();
		blob.setData(Base64.getEncoder().encodeToString(IOUtils.toByteArray(inputStream)));
		blob.setMimeType(mimeType);
		
		return blob;
	}
}
