package com.adhithya.app.ws.service;

import com.adhithya.app.ws.shared.dto.WeatherDto;

//skeleton of all the weather logic
public interface WeatherService {
	String getWeatherInfo(WeatherDto locationInfo);
}
