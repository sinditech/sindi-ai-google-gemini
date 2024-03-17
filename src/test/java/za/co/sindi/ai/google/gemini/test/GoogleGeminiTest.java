/**
 * 
 */
package za.co.sindi.ai.google.gemini.test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;

import za.co.sindi.ai.google.client.GoogleAIModelServiceClient;
import za.co.sindi.ai.google.model.Content;
import za.co.sindi.ai.google.model.GenerateContentRequest;
import za.co.sindi.ai.google.model.GenerateContentResponse;
import za.co.sindi.ai.google.model.GenerativeModelName;
import za.co.sindi.ai.google.model.Part;
import za.co.sindi.ai.google.utils.ContentUtils;

/**
 * @author Buhake Sindi
 * @since 10 February 2024
 */
public class GoogleGeminiTest {
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		textTest();
		System.out.println();
		textAndImageTest();
	}
	
	private static void textTest() {
		GoogleAIModelServiceClient modelServiceClient = new GoogleAIModelServiceClient(GenerativeModelName.GEMINI_1_0_PRO, "sdfasdfsadfadfs");
		GenerateContentRequest request = new GenerateContentRequest();
//		request.setContents(new Content[] { new Content() });
//		request.getContents()[0].setParts(new Part[] { new Part() });
//		request.getContents()[0].getParts()[0].setText("Write a story about a magic backpack.");
		request.setContents(new Content[] { ContentUtils.fromText("Write a story about a magic backpack.") });
		GenerateContentResponse response = modelServiceClient.generateContent(request);
		System.out.println(response.getCandidates()[0].getContent().getParts()[0].getText());
	}
	
	private static void textAndImageTest() throws MalformedURLException, IOException {
		GoogleAIModelServiceClient modelServiceClient = new GoogleAIModelServiceClient(GenerativeModelName.GEMINI_PRO_VISION, "adfasdfasdfsdf");
		String imageUri = "https://storage.googleapis.com/generativeai-downloads/images/scones.jpg";
		
		GenerateContentRequest request = new GenerateContentRequest();
		request.setContents(new Content[] { new Content() });
		Part textPart = new Part();
		textPart.setText("What is this picture?");
		
		Part imagePart = new Part();
		imagePart.setInlineData(ContentUtils.createBlob(URI.create(imageUri).toURL().openStream(), "image/jpeg"));
//		imagePart.setFileData(new FileData());
//		imagePart.getFileData().setFileUri(imageUri);
//		imagePart.getFileData().setMimeType("image/jpeg");
		request.getContents()[0].setParts(new Part[] { textPart, imagePart });
		GenerateContentResponse response = modelServiceClient.generateContent(request);
		System.out.println(response.getCandidates()[0].getContent().getParts()[0].getText());
	}
}
