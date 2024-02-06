package com.myproject.WeatherMicroservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.myproject.WeatherMicroservice.entity.Response;

@RestController
@RequestMapping("pages")
public class WeatherController {
	
	private static final String API_KEY = "9d68e66e03028b517ffe138be87b7e44";

	@RequestMapping("getWeather/lat={lat}&lon={lon}")
	public Response getWeather(@PathVariable("lat") double lat,@PathVariable("lon") double lon) {				
		ResponseEntity<Response> response =  new RestTemplate().getForEntity("https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid="+API_KEY, Response.class);
		
		System.out.println(response.getBody());		
		return response.getBody();
	}
}
