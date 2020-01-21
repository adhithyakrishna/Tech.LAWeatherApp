package com.adhithya.app.ws.ui.controller;

import com.adhithya.app.ws.service.WeatherService;
import com.adhithya.app.ws.shared.dto.WeatherDto;
import com.adhithya.app.ws.ui.model.request.*;
import com.adhithya.app.ws.ui.model.response.UserRest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("weatherinfo") 
public class WeatherController {
	
	@Autowired
	WeatherService weatherService;
	
	//we need to bind to http request
	@GetMapping
	public String getUser()
	{
		return "get user was called";
	}
	
	
	@PostMapping
	public WeatherRequestModel createUser(@RequestBody WeatherRequestModel weatherInfo)
	{
		
		String latitude = weatherInfo.getLatitude();
		String longitude = weatherInfo.getLongitude();
		String exclusions = weatherInfo.getExclusion();
		
		
		
		WeatherDto weatherDto = new WeatherDto();
		BeanUtils.copyProperties(weatherInfo, weatherDto);
		
		weatherService.getWeatherInfo(weatherDto);
		
		return weatherInfo;
	}
	
}
