/**
 * 
 */
package za.co.sindi.ai.google.model;

/**
 * @author Buhake Sindi
 * @since 09 February 2024
 */
public enum Region {
	IOWA("us-central1")
	,LAS_VEGAS_NEVADA("us-west4")
	,MONTREAL_CANADA("northamerica-northeast1")
	,NORTHERN_VIRGINIA("us-east4")
	,OREGON("us-west1")
	,SEOUL_KOREA("asia-northeast3")
	,SINGAPORE("asia-southeast1")
	,TOKYO_JAPAN("asia-northeast1")
	;
	private final String region;

	/**
	 * @param region
	 */
	private Region(final String region) {
		this.region = region;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	
	public static Region of(final String name) {
		for (Region region : values()) {
			if (region.region.equals(name)) return region;
		}
		
		throw new IllegalArgumentException(String.format("Invalid region: %s.", name));
	}
}
