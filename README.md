# Tech.LAWeatherApp
This project is a part of the engineering challenge for tech La internship. This is a springboot application that takes in two parameters latitude and longitude and provides weather information as a response to the post request made. Time taken to complete this part is 1 hour. 

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

# Reference
https://spring.io/guides/gs/rest-service/ - for making http request.

# Time taken 
Start time : 11.48 AM
Total time taken is around 1 hour 15 minutes
