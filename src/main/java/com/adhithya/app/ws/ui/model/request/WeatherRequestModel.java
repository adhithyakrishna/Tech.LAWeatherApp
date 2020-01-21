package com.adhithya.app.ws.ui.model.request;

//incoming json document to a java class
// user information submitted to us

public class WeatherRequestModel {

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
	
	
		
}
