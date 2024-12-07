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
*  This file was automatically generated by EvoMaster on 2024-11-28T19:58:50.038-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 10 tests
 * <br>
*  Covered targets: 21
 * <br>
*  Used time: 0h 15m 34s
 * <br>
*  Needed budget for current results: 92%
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
                .delete(baseUrlOfSut + "/news/xLutQyhKktu4Puz")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_1_putOnNewReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"8GZz6rEZW4Yh\", " + 
                    " \"country\": \"kGEGY\", " + 
                    " \"creationTime\": \"1962-11-01T14:17:32.254-19:34\", " + 
                    " \"text\": \"M2Qnf3i\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/NmZ")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("JSON parse error: Cannot deserialize value of type `java.time.ZonedDateTime` from String \"1962-11-01T14:17:32.254-19:34\": Failed to deserialize java.time.ZonedDateTime: (java.time.format.DateTimeParseException) Text '1962-11-01T14:17:32.254-19:34' could not be parsed: Zone offset not in valid range: -18:00 to +18:00; nested exception is com.fasterxml.jackson.databind.exc.InvalidFormatException: Cannot deserialize value of type `java.time.ZonedDateTime` from String \"1962-11-01T14:17:32.254-19:34\": Failed to deserialize java.time.ZonedDateTime: (java.time.format.DateTimeParseException) Text '1962-11-01T14:17:32.254-19:34' could not be parsed: Zone offset not in valid range: -18:00 to +18:00\n at [Source: (PushbackInputStream); line: 1, column: 63] (through reference chain: org.tsdes.spring.examples.news.dto.NewsDto[\"creationTime\"])"))
                .body("'path'", containsString("/news/NmZ"));
    }
    
    
    @Test(timeout = 60000)
    public void test_2_postOnNewsReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .contentType("application/json;charset=UTF-8")
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
    public void test_3_postOnNewsReturns400() throws Exception {
        
        given().accept("*/*")
                .contentType("application/json;charset=UTF-8")
                .body(" { " + 
                    " \"authorId\": \"5\", " + 
                    " \"creationTime\": \"1974-10-21T13:06:39Z\", " + 
                    " \"text\": \"WrmjfP4jXkvRv\" " + 
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
                .put(baseUrlOfSut + "/news/8495038864812432904/text")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("Required request body is missing: public org.springframework.http.ResponseEntity<java.lang.Object> org.tsdes.spring.examples.news.api.NewsRestApi.updateText(java.lang.Long,java.lang.String)"))
                .body("'path'", containsString("/news/8495038864812432904/text"));
    }
    
    
    @Test(timeout = 60000)
    public void test_5_putOnTextReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .contentType("text/plain")
                .body()
                .put(baseUrlOfSut + "/news/-5975005684482925610/text")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("Required request body is missing: public org.springframework.http.ResponseEntity<java.lang.Object> org.tsdes.spring.examples.news.api.NewsRestApi.updateText(java.lang.Long,java.lang.String)"))
                .body("'path'", containsString("/news/-5975005684482925610/text"));
    }
    
    
    @Test(timeout = 60000)
    public void test_6_getOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/news/LCmHY8")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_7_deleteOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .delete(baseUrlOfSut + "/news/7")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_8_putOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"BohQnZKH\", " + 
                    " \"creationTime\": \"1941-08-02T14:50:16Z\", " + 
                    " \"newsId\": \"4w6glHh\", " + 
                    " \"text\": \"Uv0W9CGX\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/kn4HHB5S2SVpTX")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_9_putOnTextReturns404() throws Exception {
        
        given().accept("*/*")
                .contentType("text/plain")
                .body("295")
                .put(baseUrlOfSut + "/news/295/text")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }


}
