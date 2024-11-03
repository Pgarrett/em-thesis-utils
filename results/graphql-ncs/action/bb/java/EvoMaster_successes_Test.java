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
*  This file was automatically generated by EvoMaster on 2024-11-03T02:02:44.457-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 6 tests
 * <br>
*  Covered targets: 18
 * <br>
*  Used time: 0h 15m 25s
 * <br>
*  Needed budget for current results: 93%
 * <br>
*  This file contains test cases that represent successful calls.
*/
public class EvoMaster_successes_Test {

    
    private static String baseUrlOfSut = "http://localhost:8080/graphql";
    
    
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
    public void test_0_queryOnGammqReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { gammq  (a : 0.14042373,x : null)         } \" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'gammq'", numberMatches(1.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_1_queryOnBessjReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { bessj  (n : 472,x : null)         } \" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'bessj'", numberMatches(0.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_2_queryOnExpintReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { expint  (x : 0.21811454)         } \" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'expint'", numberMatches(3.686289517485153));
    }
    
    
    @Test(timeout = 60000)
    public void test_3_queryOnFisherReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { fisher  (m : 306,n : 579,x : 0.045969922)         } \" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'fisher'", numberMatches(0.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_4_queryOnTriangleClassificationReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { triangleClassification  (a : 211,b : 133,c : 410)         } \" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'triangleClassification'", numberMatches(0.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_5_queryOnRemainderReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { remainder  (a : null,b : null)         } \" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'remainder'", numberMatches(-1.0));
    }


}