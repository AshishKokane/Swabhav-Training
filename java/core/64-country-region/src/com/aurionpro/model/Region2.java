package com.aurionpro.model;

public class Region2 {

	private String regionId;
	private String regionName;

	public Region2(String regionId, String regionName) {
		super();
		this.regionId = regionId;
		this.regionName = regionName;
	}

	public String getRegionId() {
		return regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	@Override
	public String toString() {
		return "Region2 [regionId=" + regionId + ", regionName=" + regionName + "]";
	}

}
