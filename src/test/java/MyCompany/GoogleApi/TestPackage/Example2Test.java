package MyCompany.GoogleApi.TestPackage;


import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

import MyCompany.GoogleApi.HelperMethods.HelperMethods;
import MyCompany.GoogleApi.HelperMethods.Utility;

import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.Map;
 
 
public class Example2Test {
 
    private Response res = null; //Response object
    private JsonPath jp = null; //JsonPath object
    // String assetStr="{font_to_hueco={6A+=V3, 8C+=V16, 7A+=V7, 8A+=V12, 8A=V11, 8B=V13, 6A=V3, 8C=V15, 6B=V4, 6C=V5, 5+=V2, 6B+=V4, 7B+=V8, 8B+=V14, 9A=V17, 7A=V6, 7B=V8, 7C=V9, 1=VB, 2=VB, 3=VB, 4=V0, 5=V1, 4+=V0, 6C+=V5, 7C+=V10}, hueco_to_font={V6=7A, V7=7A+, V8=7B, V9=7C, VB=3, V10=7C+, V12=8A+, V11=8A, V14=8B+, V13=8B, V0=7C, V16=8C+, V1=5, V15=8D, V2=5+, V3=6A, V17=9A, V4=6B, V5=6C}}";
 
    @DataProvider()
    @BeforeTest
    public void setup (){
        //Test Setup
        Utility.setBaseURI("http://localhost:8080"); //Setup Base URI
        Utility.setBasePathGet("convert/hueco"); //Setup Base Path
        Utility.setContentType(ContentType.JSON); //Setup Content Type
        res = Utility.getBasePathGetHuecoToFont("V7"); //Get response
        jp = Utility.getJsonPath(res); //Get JsonPath
    }
 
    @Test
    public void T01_StatusCodeTest() {
        //Verify the http response status returned. Check Status Code is 200?
        HelperMethods.checkStatusIs200(res);
    }
 
    @Test
    public void T02_SearchTermTest() {
        
    	System.out.println(jp.get().toString());
    	System.out.println(jp.get("original_grade"));
    	//System.out.println(assetStr);
    	Assert.assertEquals("V7",jp.get("original_grade"));
    	
       // Assert.assertEquals(assetStr, jp.get().toString());
        
    }
 
    @Test
    public void T03_verifyOnlyFourVideosReturned() {
        
    	//System.out.println(jp.get());
    }
 
    
    @AfterTest
    public void afterTest (){
        //Reset Values
    	Utility.resetBaseURI();
    	Utility.resetBasePathGet();
    }
 

}
