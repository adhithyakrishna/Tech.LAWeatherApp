package com.adhithya.app.ws.shared.dto;

import java.io.Serializable;

public class WeatherDto implements Serializable {
	
	private static final long serialVersionUID = 6883472850101472292L;
	private String latitude;
	private String longitude;
	private String exclusion;
	
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getExclusion() {
		return exclusion;
	}
	public void setExclusion(String exclusion) {
		this.exclusion = exclusion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
