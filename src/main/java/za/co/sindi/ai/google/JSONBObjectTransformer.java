/**
 * 
 */
package za.co.sindi.ai.google;

import java.io.InputStream;

import jakarta.json.bind.JsonbBuilder;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public class JSONBObjectTransformer implements JSONObjectTransformer {

	@Override
	public <E> String transform(E object) {
		// TODO Auto-generated method stub
		return JsonbBuilder.newBuilder().build().toJson(object);
	}

	@Override
	public <T> T transform(String data, Class<T> type) {
		// TODO Auto-generated method stub
		return JsonbBuilder.newBuilder().build().fromJson(data, type);
	}

	@Override
	public <T> T transform(InputStream stream, Class<T> type) {
		// TODO Auto-generated method stub
		return JsonbBuilder.newBuilder().build().fromJson(stream, type);
	}
}
