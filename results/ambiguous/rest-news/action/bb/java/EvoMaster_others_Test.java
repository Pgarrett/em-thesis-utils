import  org.junit.AfterClass;
import  org.junit.BeforeClass;
import  org.junit.Before;
import  org.junit.Test;
import static org.junit.Assert.*;
import  java.util.Map;
import  java.util.Arrays;
import  java.util.List;
import static org.evomaster.test.utils.EMTestUtils.*;
import  org.evomaster.client.java.controller.SutHandler;
import  io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import  io.restassured.response.ValidatableResponse;
import static org.hamcrest.Matchers.*;
import  io.restassured.config.JsonConfig;
import  io.restassured.path.json.config.JsonPathConfig;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;




/**
*  This file was automatically generated by EvoMaster on 2024-11-07T01:44:08.973-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 8 tests
 * <br>
*  Covered targets: 19
 * <br>
*  Used time: 0h 10m 33s
 * <br>
*  Needed budget for current results: 83%
 * <br>
*  This file contains test cases that represent failed calls, but not indicative of faults.
*/
public class EvoMaster_others_Test {

    
    private static String baseUrlOfSut = "http://localhost:8080";
    
    
    @BeforeClass
    public static void initClass() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.urlEncodingEnabled = false;
        RestAssured.config = RestAssured.config()
            .jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE))
            .redirect(redirectConfig().followRedirects(false));
    }
    
    
    
    
    
    
    
    
    @Test(timeout = 60000)
    public void test_0_deleteOnNewReturns400() throws Exception {
        
        given().accept("*/*")
                .delete(baseUrlOfSut + "/news/c1CXhOHag")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_1_putOnNewReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .contentType("application/json")
                .put(baseUrlOfSut + "/news/8VMRs8")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("Required request body is missing: public org.springframework.http.ResponseEntity<java.lang.Object> org.tsdes.spring.examples.news.api.NewsRestApi.update(java.lang.String,org.tsdes.spring.examples.news.dto.NewsDto)"))
                .body("'path'", containsString("/news/8VMRs8"));
    }
    
    
    @Test(timeout = 60000)
    public void test_2_postOnNewsReturns400() throws Exception {
        
        given().accept("*/*")
                .contentType("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .body(" { " + 
                    " \"authorId\": \"3JKnQMFOlOP9lim\", " + 
                    " \"country\": \"45HaUN8a_I\", " + 
                    " \"creationTime\": \"1959-06-30T14:43:59.244-04:15\", " + 
                    " \"id\": \"YJDuObcV5pS6g\", " + 
                    " \"newsId\": \"nhvGxYC\", " + 
                    " \"text\": \"\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_3_putOnTextReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .contentType("text/plain")
                .body()
                .put(baseUrlOfSut + "/news/123/text")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("Required request body is missing: public org.springframework.http.ResponseEntity<java.lang.Object> org.tsdes.spring.examples.news.api.NewsRestApi.updateText(java.lang.Long,java.lang.String)"))
                .body("'path'", containsString("/news/123/text"));
    }
    
    
    @Test(timeout = 60000)
    public void test_4_putOnTextReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .contentType("text/plain")
                .body()
                .put(baseUrlOfSut + "/news/-2577602893903591701/text")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("Required request body is missing: public org.springframework.http.ResponseEntity<java.lang.Object> org.tsdes.spring.examples.news.api.NewsRestApi.updateText(java.lang.Long,java.lang.String)"))
                .body("'path'", containsString("/news/-2577602893903591701/text"));
    }
    
    
    @Test(timeout = 60000)
    public void test_5_getOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/news/YdIWGQq5GVFU8m")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_6_putOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"c3W1opnve\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/5CIi2Gac4iG")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_7_putOnTextReturns404() throws Exception {
        
        given().accept("*/*")
                .contentType("text/plain")
                .body("382")
                .put(baseUrlOfSut + "/news/382/text")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }


}
