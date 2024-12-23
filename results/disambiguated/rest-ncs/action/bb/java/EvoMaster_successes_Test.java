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
*  This file was automatically generated by EvoMaster on 2024-11-06T21:08:41.381-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 12 tests
 * <br>
*  Covered targets: 59
 * <br>
*  Used time: 0h 10m 35s
 * <br>
*  Needed budget for current results: 73%
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
    public void test_0_getOnApi_docsReturnsObject() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/v2/api-docs")
                .then()
                .statusCode(200);
    }
    
    
    @Test(timeout = 60000)
    public void test_1_getOnRemaindReturnsObject() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/api/remainder/276/517")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", numberMatches(-1.0))
                .body("'resultAsDouble'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_2_getOnGammqReturnsObject() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/api/gammq/0.6242393547031467/0.6858807406801675")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", nullValue())
                .body("'resultAsDouble'", numberMatches(0.3086927667421433));
    }
    
    
    @Test(timeout = 60000)
    public void test_3_getOnExpintReturnsObject() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/api/expint/648/0.7158727209334529")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", nullValue())
                .body("'resultAsDouble'", numberMatches(7.545971246755112E-4));
    }
    
    
    @Test(timeout = 60000)
    public void test_4_getOnBessjReturnsObject() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/api/bessj/669/0.8186181893216373")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", nullValue())
                .body("'resultAsDouble'", numberMatches(0.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_5_getOnTrianglReturnsObject() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/api/triangle/480/260/766")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", numberMatches(0.0))
                .body("'resultAsDouble'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_6_getOnFisherReturnsObject() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/api/fisher/931/747/0.759079642561036")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", nullValue())
                .body("'resultAsDouble'", numberMatches(3.399477938649039E-5));
    }
    
    
    @Test(timeout = 60000)
    public void test_7_getOnFisherReturnsObject() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/api/fisher/62/-385892699/0.7484187651213554")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", nullValue())
                .body("'resultAsDouble'", numberMatches(0.3798101359740265));
    }
    
    
    @Test(timeout = 60000)
    public void test_8_getOnTrianglReturnsObject() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/api/triangle/-503381100/798/23")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", numberMatches(0.0))
                .body("'resultAsDouble'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_9_getOnTrianglReturnsObject() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/api/triangle/89/502/-1763460364")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", numberMatches(0.0))
                .body("'resultAsDouble'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_10_getOnFisherReturnsObject() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/api/fisher/-1243468279/569/0.10897210073489894")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", nullValue())
                .body("'resultAsDouble'", containsString("NaN"));
    }
    
    
    @Test(timeout = 60000)
    public void test_11_getOnTrianglReturnsObject() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/api/triangle/469/-1358403286/543")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'resultAsInt'", numberMatches(0.0))
                .body("'resultAsDouble'", nullValue());
    }


}
