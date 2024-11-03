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
*  This file was automatically generated by EvoMaster on 2024-11-03T01:04:45.185-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 10 tests
 * <br>
*  Covered targets: 21
 * <br>
*  Used time: 0h 16m 12s
 * <br>
*  Needed budget for current results: 89%
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
                .delete(baseUrlOfSut + "/news/D80l")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_1_postOnNewsReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .contentType("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .post(baseUrlOfSut + "/news")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("Required request body is missing: public org.springframework.http.ResponseEntity<java.lang.Long> org.tsdes.spring.examples.news.api.NewsRestApi.createNews(org.tsdes.spring.examples.news.dto.NewsDto)"))
                .body("'path'", containsString("/news"));
    }
    
    
    @Test(timeout = 60000)
    public void test_2_putOnNewReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .contentType("application/json")
                .put(baseUrlOfSut + "/news/r8aTX5k")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("Required request body is missing: public org.springframework.http.ResponseEntity<java.lang.Object> org.tsdes.spring.examples.news.api.NewsRestApi.update(java.lang.String,org.tsdes.spring.examples.news.dto.NewsDto)"))
                .body("'path'", containsString("/news/r8aTX5k"));
    }
    
    
    @Test(timeout = 60000)
    public void test_3_postOnNewsReturns400() throws Exception {
        
        given().accept("*/*")
                .contentType("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .body(" { " + 
                    " \"country\": \"Sierra Leone\", " + 
                    " \"id\": \"SztrPaM\", " + 
                    " \"newsId\": \"SwKEOlh_nz_cau\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_4_putOnTextReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .contentType("text/plain")
                .body()
                .put(baseUrlOfSut + "/news/991/text")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("Required request body is missing: public org.springframework.http.ResponseEntity<java.lang.Object> org.tsdes.spring.examples.news.api.NewsRestApi.updateText(java.lang.Long,java.lang.String)"))
                .body("'path'", containsString("/news/991/text"));
    }
    
    
    @Test(timeout = 60000)
    public void test_5_getOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/news/BueShO8")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_6_deleteOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .delete(baseUrlOfSut + "/news/86")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_7_putOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"HyEUBw\", " + 
                    " \"creationTime\": \"1980-08-26T06:05:20-11:28\", " + 
                    " \"id\": \"LKANuqulsLQkvv9\", " + 
                    " \"newsId\": \"N5B4Odx6gfqda58\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/LKANuqulsLQkvv9")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_8_putOnTextReturns404() throws Exception {
        
        given().accept("*/*")
                .contentType("text/plain")
                .body("334")
                .put(baseUrlOfSut + "/news/334/text")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_9_putOnTextReturns404() throws Exception {
        
        given().accept("*/*")
                .contentType("text/plain")
                .body("-1286717408")
                .put(baseUrlOfSut + "/news/-1286717408/text")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }


}
