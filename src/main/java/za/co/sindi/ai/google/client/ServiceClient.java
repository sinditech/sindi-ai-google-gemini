/**
 * 
 */
package za.co.sindi.ai.google.client;

import java.net.ProxySelector;
import java.time.Duration;
import java.util.concurrent.Executor;

import za.co.sindi.ai.google.JSONObjectTransformer;

/**
 * @author Buhake Sindi
 * @since 26 February 2024
 */
public interface ServiceClient {
	
	/**
	 * @param connectionTimeout the connectionTimeout to set
	 */
	public void setConnectionTimeout(Duration connectionTimeout);

	/**
	 * @param proxy the proxy to set
	 */
	public void setProxy(ProxySelector proxy);

	/**
	 * @param executor the executor to set
	 */
	public void setExecutor(Executor executor);
	
	public void setJSONObjectTransformer(JSONObjectTransformer objectTransformer);
}
