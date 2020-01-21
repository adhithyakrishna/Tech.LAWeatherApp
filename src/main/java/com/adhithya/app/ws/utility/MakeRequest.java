package com.adhithya.app.ws.utility;

import java.io.IOException;

import com.adhithya.app.ws.shared.dto.WeatherDto;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MakeRequest {
	
	private final OkHttpClient httpClient = new OkHttpClient();
	
	public String makeGetCall (WeatherDto weatherInformation) throws Exception
	{
		String latitude = weatherInformation.getLatitude();
		String longitude = weatherInformation.getLongitude();
		return sendGet(latitude, longitude);
	}
	
	private String sendGet(String latitude, String longitude) throws Exception {

		String requestUrl = "https://api.darksky.net/forecast/6bca890ceffebe371f57cefbb9a2c0fc/"+latitude+","+longitude;
        Request request = new Request.Builder()
                .url(requestUrl)
                .addHeader("User-Agent", "PostmanRuntime/7.22.0")
                .build();

        try (Response response = httpClient.newCall(request).execute()) {

            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            // Get response body
            return response.body().string();
        }

    }

}
