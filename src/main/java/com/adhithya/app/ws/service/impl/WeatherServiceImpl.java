package com.adhithya.app.ws.service.impl;


import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.adhithya.app.ws.service.WeatherService;
import com.adhithya.app.ws.shared.dto.WeatherDto;
import com.adhithya.app.ws.utility.MakeRequest;

@Service
public class WeatherServiceImpl implements WeatherService {

	
	@Override
	public String getWeatherInfo(WeatherDto weatherInformation) {
		
		System.out.println(weatherInformation.getExclusion());
		String response = "";
		MakeRequest makeRequest = new MakeRequest();
		try {
			response = makeRequest.makeGetCall(weatherInformation);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
		return response;
	}

}
