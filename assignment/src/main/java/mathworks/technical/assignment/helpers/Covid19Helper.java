package mathworks.technical.assignment.helpers;

import java.lang.reflect.Type;
import org.apache.http.HttpStatus;
import org.junit.Assert;

import com.fasterxml.jackson.core.type.TypeReference;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import mathworks.technical.assignment.constants.EndPoints;
import mathworks.technical.assignment.model.StatisticsObject;
import mathworks.technical.assignment.utils.ConfigManager;

/*
	This class will help in fetching data from EndPoints.
	This class returns statistics object which contains all all current statistics
	This class is for test scenario 1 for covid 19 fetch statistics
	along with API methods like GET, POST, DELETE, PUT
*/
public class Covid19Helper {
	//Get Request on URL and send data to test scenario 1
	private static final String BASE_URL_T1  = ConfigManager.getInstance().getString("base_url_t1");
	private static final String API_KEY_NAME  = ConfigManager.getInstance().getString("t1_api_key_name");
	private static final String API_KEY_VALUE  = ConfigManager.getInstance().getString("t1_api_key");
	private static final String API_HOST_NAME  = ConfigManager.getInstance().getString("t1_api_host_name");
	private static final String API_HOST_VALUE = ConfigManager.getInstance().getString("t1_api_host_value");
	private static final String Q_PARAMETER = ConfigManager.getInstance().getString("t1_query");
	private static final String COUNTRY = ConfigManager.getInstance().getString("t1_country_name");
	
	public Covid19Helper() {
		RestAssured.baseURI = BASE_URL_T1;
	}
	//User  .log().all() to check the logs 
	//This function will hit the api (GET) and send back a object have all the response containing statistics details. 
	public StatisticsObject getStatistics(){
		Response response = RestAssured
				.given()
				.queryParam(Q_PARAMETER,COUNTRY)
				.headers(API_KEY_NAME,API_KEY_VALUE)
				.headers(API_HOST_NAME,API_HOST_VALUE)
				.contentType(ContentType.JSON)
				.get(EndPoints.GET_STATISTICS)
				.andReturn();
		
		Type type = new TypeReference<StatisticsObject>(){}.getType();
		//Assert the status code
		Assert.assertEquals(response.getStatusCode(),HttpStatus.SC_OK);
		StatisticsObject statistics = response.as(type);
//		System.out.print("-----------------------------------------");
		
		return statistics;
	}
}
