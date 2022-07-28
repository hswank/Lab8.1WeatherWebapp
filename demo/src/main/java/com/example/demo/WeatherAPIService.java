package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherAPIService {
	private RestTemplate restTemplate = new RestTemplate();
	
	public WeatherResponse getWeather(String latitude, String longitude) {
		String  url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
		WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class, latitude, longitude);
		return response;
	}
}
