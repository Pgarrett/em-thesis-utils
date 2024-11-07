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
*  This file was automatically generated by EvoMaster on 2024-11-06T21:08:41.418-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 6 tests
 * <br>
*  Covered targets: 19
 * <br>
*  Used time: 0h 10m 35s
 * <br>
*  Needed budget for current results: 73%
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
    public void test_0_getOnRemaindReturns400() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/remainder/494/82221292")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_1_getOnExpintReturns400() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/expint/-1811275256/0.8129272463572252")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_2_getOnRemaindReturns400() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/remainder/542/-1582060202")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_3_getOnRemaindReturns400() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/remainder/-854017199/700")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_4_getOnBessjReturns400() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/bessj/-640507206/0.5078607814287328")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_5_getOnFisherReturns400() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/fisher/366877699/30/0.7975821066589708")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }


}
