package com.example.demo;

public class WeatherResponse {
	private location locationOb;
	private currentobservation currentOb;
	private time timeOb;
	private data dataOb;
	public location getLocation() {
		return locationOb;
	}
	public void setLocation(location location) {
		locationOb = location;
	}
	public currentobservation getCurrentOb() {
		return currentOb;
	}
	public void setCurrentOb(currentobservation currentOb) {
		this.currentOb = currentOb;
	}
	public time getTimeOb() {
		return timeOb;
	}
	public void setTimeOb(time timeOb) {
		this.timeOb = timeOb;
	}
	public data getDataOb() {
		return dataOb;
	}
	public void setDataOb(data dataOb) {
		this.dataOb = dataOb;
	}
	public WeatherResponse(location location, currentobservation currentOb, time timeOb, data dataOb) {
		locationOb = location;
		this.currentOb = currentOb;
		this.timeOb = timeOb;
		this.dataOb = dataOb;
	}
	public WeatherResponse() {

	}
	
	
}
