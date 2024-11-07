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
*  This file was automatically generated by EvoMaster on 2024-11-07T01:11:48.481-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 15 tests
 * <br>
*  Covered targets: 122
 * <br>
*  Used time: 0h 12m 32s
 * <br>
*  Needed budget for current results: 93%
 * <br>
*  This file contains test cases that represent successful calls.
*/
public class EvoMaster_successes_Test {

    
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
    public void test_0_getOnHealth_jsonReturnsObject() throws Exception {
        
        given().accept("application/vnd.spring-boot.actuator.v1+json")
                .get(baseUrlOfSut + "/health.json")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/vnd.spring-boot.actuator.v1+json")
                .body("'status'", containsString("UP"));
    }
    
    
    @Test(timeout = 60000)
    public void test_1_getOnHealthReturnsObject() throws Exception {
        
        given().accept("application/vnd.spring-boot.actuator.v1+json")
                .get(baseUrlOfSut + "/health")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/vnd.spring-boot.actuator.v1+json")
                .body("'status'", containsString("UP"));
    }
    
    
    @Test(timeout = 60000)
    public void test_2_getOnExportReturnsObject() throws Exception {
        
        given().accept("application/json;charset=utf-8")
                .get(baseUrlOfSut + "/export")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'contributors'.size()", equalTo(0))
                .body("'projects'.size()", equalTo(0))
                .body("'statistics'.size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_3_getOnApi_docsReturnsObject() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/v2/api-docs")
                .then()
                .statusCode(200);
    }
    
    
    @Test(timeout = 60000)
    public void test_4_getOnLanguagesReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/statistics/languages?organizations=vWrlwlEe1Qx7kdK")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_5_getOnStatisticsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/statistics")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_6_getOnLanguagesReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/statistics/languages")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_7_getOnStatisticsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/statistics?organizations=o2mZ4K")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_8_getOnLanguagesReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/languages?" + 
                    "organizations=D_CnY&" + 
                    "offset=582")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_9_getOnLanguagesReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/languages?" + 
                    "organizations=RxWKly0saqjF4gbu&" + 
                    "limit=241")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_10_getOnLanguagesReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/languages?" + 
                    "organizations=oIZcklbp4Boa4km&" + 
                    "limit=8&" + 
                    "offset=144&" + 
                    "q=JTGdmYr9r8j94KJr")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_11_getOnLanguagesReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/languages?" + 
                    "organizations=&" + 
                    "limit=416&" + 
                    "offset=494")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_12_getOnProjectsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/projects?" + 
                    "organizations=u6wFTi0k&" + 
                    "offset=947&" + 
                    "sortBy=QBGT")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_13_getOnProjectsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/projects?" + 
                    "end_date=1927-02-26T08%3A43%3A12%2B02%3A30&" + 
                    "language=RWiwxq3Te3fXG59")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_14_getOnProjectsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/projects?" + 
                    "organizations=Ao09Rej&" + 
                    "limit=726&" + 
                    "start_date=2032-12-26T09%3A30%3A56.365Z&" + 
                    "sortBy=36Lpcw5ry&" + 
                    "language=SITf8ExLCyYdVWSo")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }


}
