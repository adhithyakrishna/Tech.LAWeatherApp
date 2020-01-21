package com.adhithya.app.ws.service;

import com.adhithya.app.ws.shared.dto.WeatherDto;

//skeleton of all the weather logic
public interface WeatherService {
	WeatherDto getWeatherInfo(WeatherDto locationInfo);
}
