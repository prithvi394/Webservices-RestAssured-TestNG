package MyCompany.GoogleApi.HelperMethods;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.path.xml.XmlPath;
import com.jayway.restassured.response.Response;
 
import static com.jayway.restassured.RestAssured.*;
 
public class Utility {
    
    public static String path; //Rest request path
 
   
    public static void setBaseURI (String baseURI){
        RestAssured.baseURI = baseURI;
    }
 
 
    public static void setBasePathGet(String basePathTerm){
        RestAssured.basePath = basePathTerm;
    }
    
    public static void setBasePathGetHuecoToFont(String basePathTerm){
        RestAssured.basePath = basePathTerm;
    }
    
    public static void setBasePathGetFontToHueco(String basePathTerm){
        RestAssured.basePath = basePathTerm;
    }
 
  
    public static void resetBaseURI (){
        RestAssured.baseURI = null;
    }
 
  
    public static void resetBasePathGet(){
        RestAssured.basePath = null;
    }
    
    public static void resetBasePathGetHuecoToFont(String basePathTerm){
    	RestAssured.basePath = null;
    }
    
    public static void resetBasePathGetFontToHueco(String basePathTerm){
    	RestAssured.basePath = null;
    }
 
 
    public static void setContentType (ContentType Type){
        given().contentType(Type);
    }
 
  
   /* public static void  createSearchQueryPath(String searchTerm, String jsonPathTerm, String paramStr) {
        path = searchTerm + "/" + jsonPathTerm + "?" +paramStr;        
        System.out.println(path);
        
    }*/
 
   
    public static Response getBasePathResponse() {
        //System.out.print("path: " + path +"\n");
        return get();
    }
    
    public static Response getBasePathGetHuecoToFont(String str) {
        return get(str);
    }
    
    public static Response getBasePathGetFontToHueco(String str) {
        //System.out.print("path: " + path +"\n");
        return get(str);
    }
 
 
    public static JsonPath getJsonPath (Response res) {
        String json = res.asString();
        //System.out.print("returned json: " + json +"\n");
        return new JsonPath(json);
    }

	/* XMLPath and Post methods not needed for this project
	 * 
	 * public static XmlPath getXMLPath(Response res) {
		// TODO Auto-generated method stub
		String xml = res.asString();
		return new XmlPath(xml);
	}


	public static Response post(String jsonStr) {
		// TODO Auto-generated method stub
		return given()
		    	.body(jsonStr).
		        when().
		        post(path);
	}*/

}
