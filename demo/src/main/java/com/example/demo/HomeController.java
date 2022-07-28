package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@Autowired
	private WeatherAPIService apiService;

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@PostMapping("/weather-display")
	public String displayWeather(Model model, @RequestParam String latitude, @RequestParam String longitude) {
		WeatherResponse weather = apiService.getWeather(latitude, longitude);
		
		model.addAttribute("latitude", latitude);
		model.addAttribute("longitude", longitude);
		model.addAttribute("weather", weather);
	
			return "weather";
	}
}
