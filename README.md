# This project is hosted at 
https://techlaweatherapp.herokuapp.com/weather

# Tech.LAWeatherApp
This project is a part of the engineering challenge for tech.La internship. The core idea of this project is to fetch weather information based on location pointed out by the user on google maps. This repository contains the backend part of the application.

The backend was created using Springboot, and it uses darksky API to predict the weather based on the location pointed by google maps. The frontend was built using html5, css3 and jQuery. Nodejs was used as a server, and Expressjs was used for routing. The frontend repository is at https://github.com/adhithyakrishna/Tech.LAWeatherAppFrontend.


A Post request is made with two parameters latitude and longitude for which the weather information would be returned in JSON format.

Please find the sample request below

# Sample request url 

```javascript
curl --location --request POST 'http://localhost:8080/weatherinfo' \
--header 'Content-Type: application/json' \
--data-raw '{
	"latitude" : "37.8267",
	"longitude" : "-122.4233"
}'
```

# Update 1

The backend has been deployed at https://techlabackend.herokuapp.com/weatherinfo

```javascript
curl --location --request POST 'https://techlabackend.herokuapp.com/weatherinfo' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
--data-raw '{
	"latitude" : "37.8267",
	"longitude" : "-122.4233"
}'
```

# Update 2

The frontend has been completed and the frontend respository is at https://github.com/adhithyakrishna/Tech.LAWeatherAppFrontend. The application was hosted at https://techlaweatherapp.herokuapp.com/weather
