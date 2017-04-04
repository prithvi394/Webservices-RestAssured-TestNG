/*package MyCompany.GoogleApi.TestPackage;

import java.util.HashMap;

import org.junit.*;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import MyCompany.GoogleApi.HelperMethods.Utility;

public class ExampleTest3 {
	
	private Response res= null;
	private JsonPath jp = null;
	private String jsonStr="{"
 +"\"location\": {"
 +"\"lat\": -33.8669710,"
 +"\"lng\": 151.1958750"
 +" },"
 +"\"accuracy\": 50,"
 +"\"name\": \"Google Shoes!\","
 +"\"phone_number\": \"(02) 9374 4000\","
 +"\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\","
 +"\"types\": [\"shoe_store\"],"
 +"\"website\": \"http://www.google.com.au/\","
 +"\"language\": \"en-AU\""
+"}";


	
	@Before
	public void setUP(){
		
		Utility.setBaseURI("https://maps.googleapis.com");
		Utility.setBasePath("maps/api"); //Setup Base Path
        Utility.setContentType(ContentType.JSON); //Setup Content Type
        Utility.createSearchQueryPath("place/add", "json", "key=AIzaSyDO3Spat8mU7vcpwX55M0RhdWVQYL0_Lr8"); //Construct the path
        //res = Utility.getResponse(); //Get response
        res = Utility.post(jsonStr);
        jp = Utility.getJsonPath(res); //Get XMLPath
		
		
	}
	
	@Test
	public void checkResponse(){
	
		System.out.println(jp.get("reference"));
		
	}

}
*/