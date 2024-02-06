package com.myproject.WeatherMicroservice.entity;

public class Coordinate {
	
	private double lon;
	private double lat;
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	@Override
	public String toString() {
		return "Coordinate [lon=" + lon + ", lat=" + lat + "]";
	}
	public Coordinate(double lon, double lat) {
		super();
		this.lon = lon;
		this.lat = lat;
	}
	public Coordinate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
