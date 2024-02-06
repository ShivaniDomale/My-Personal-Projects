package com.myproject.WeatherMicroservice.entity;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
	
	@JsonProperty("coord")
	private Coordinate coordinate;
	private Weather[] weather;
	private Main main;
	public Coordinate getCoordinate() {
		return coordinate;
	}
	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	public Weather[] getWeather() {
		return weather;
	}
	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	@Override
	public String toString() {
		return "Response [coordinate=" + coordinate + ", weather=" + Arrays.toString(weather) + ", main=" + main + "]";
	}
	public Response(Coordinate coordinate, Weather[] weather, Main main) {
		super();
		this.coordinate = coordinate;
		this.weather = weather;
		this.main = main;
	}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
