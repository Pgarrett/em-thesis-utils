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
*  This file was automatically generated by EvoMaster on 2024-11-06T23:33:10.280-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 6 tests
 * <br>
*  Covered targets: 29
 * <br>
*  Used time: 0h 10m 23s
 * <br>
*  Needed budget for current results: 91%
 * <br>
*  This file contains test cases that represent successful calls.
*/
public class EvoMaster_successes_Test {

    
    private static final SutHandler controller = new em.embedded.org.cbioportal.session_service.EmbeddedEvoMasterController();
    private static String baseUrlOfSut;
    
    
    @BeforeClass
    public static void initClass() {
        controller.setupForGeneratedTest();
        baseUrlOfSut = controller.startSut();
        controller.registerOrExecuteInitSqlCommandsIfNeeded();
        assertNotNull(baseUrlOfSut);
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.urlEncodingEnabled = false;
        RestAssured.config = RestAssured.config()
            .jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE))
            .redirect(redirectConfig().followRedirects(false));
    }
    
    
    @AfterClass
    public static void tearDown() {
        controller.stopSut();
    }
    
    
    @Before
    public void initTest() {
        controller.resetStateOfSUT();
    }
    
    
    
    
    @Test(timeout = 60000)
    public void test_0_getOnApi_docsReturnsObject() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/v2/api-docs")
                .then()
                .statusCode(200);
    }
    
    
    @Test(timeout = 60000)
    public void test_1_postOnSessionWithQueryParamReturns200() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" {} ")
                .post(baseUrlOfSut + "/api/sessions/_EM_905_XYZ_/settings")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }
    
    
    @Test(timeout = 60000)
    public void test_2_getOnInfoWithQueryParamsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_842_XYZ_")
                .get(baseUrlOfSut + "/info")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0.5.0-SNAPSHOT"));
    }
    
    
    @Test(timeout = 60000)
    public void test_3_getOnInfoWithQueryParamsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_883_XYZ_")
                .get(baseUrlOfSut + "/info?" + 
                    "field=i&" + 
                    "value=ai")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0.5.0-SNAPSHOT"));
    }
    
    
    @Test(timeout = 60000)
    public void test_4_postOnSessionWithQueryParamReturns200() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" {} ")
                .post(baseUrlOfSut + "/api/sessions/_EM_905_XYZ_/virtual_study")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }
    
    
    @Test(timeout = 60000)
    public void test_5_postOnSessionWithQueryParamReturns200() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" {} ")
                .post(baseUrlOfSut + "/api/sessions/M1oE/main_session")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }


}
