package com.adhithya.app.ws.service.impl;


import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.adhithya.app.ws.service.WeatherService;
import com.adhithya.app.ws.shared.dto.WeatherDto;

@Service
public class WeatherServiceImpl implements WeatherService {

	
	@Override
	public WeatherDto getWeatherInfo(WeatherDto weatherInformation) {
		
		System.out.println(weatherInformation.getExclusion());
		
//		BeanUtils.copyProperties();

		
		return null;
	}

}
