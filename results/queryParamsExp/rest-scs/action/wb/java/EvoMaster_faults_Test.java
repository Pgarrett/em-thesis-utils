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
*  This file was automatically generated by EvoMaster on 2024-11-28T22:55:21.665-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 46 tests
 * <br>
*  Covered targets: 109
 * <br>
*  Used time: 0h 10m 1s
 * <br>
*  Needed budget for current results: 75%
 * <br>
*  This file contains test cases that are likely to indicate faults.
*/
public class EvoMaster_faults_Test {

    
    private static final SutHandler controller = new em.embedded.org.restscs.EmbeddedEvoMasterController();
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
    public void test_0_getOnText2txtWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/text2txt/{word1}/{word2}/{word3} -> GET on path '/api/text2txt/{word1}/{word2}/{word3}' defines a response schema but no response body found.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/text2txt/_EM_3561_XYZ_/_EM_3562_XYZ_/zPNlN618O3WOzr")
                .then()
                .statusCode(200)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_1_getOnText2txtWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/text2txt/{word1}/{word2}/{word3} -> GET on path '/api/text2txt/{word1}/{word2}/{word3}' defines a response schema but no response body found.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/text2txt/ihM0wC4uW15/_EM_12962_XYZ_/_EM_7867_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_2_getOnText2txtWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/text2txt/{word1}/{word2}/{word3} -> GET on path '/api/text2txt/{word1}/{word2}/{word3}' defines a response schema but no response body found.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/text2txt/by/the/F52rTR_%5DUs3U")
                .then()
                .statusCode(200)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_3_getOnCookiWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/cookie/{name}/{val}/{site} -> Response status 400 not defined for path '/api/cookie/{name}/{val}/{site}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/cookie/p2KbZMe/%5C/i1rWCPV4SXl1m8")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_4_getOnDateparsWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/dateparse/{dayname}/{monthname} -> Response status 400 not defined for path '/api/dateparse/{dayname}/{monthname}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_4003_XYZ_")
                .get(baseUrlOfSut + "/api/dateparse/%5CGg/_EM_6329_XYZ_")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_5_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> Response status 400 not defined for path '/api/pat/{txt}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_2710_XYZ_")
                .get(baseUrlOfSut + "/api/pat/ee%5C")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_6_getOnText2txtWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/text2txt/{word1}/{word2}/{word3} -> Response status 400 not defined for path '/api/text2txt/{word1}/{word2}/{word3}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/text2txt/Gbsn/_EM_422_XYZ_/_EM%5C423PUUZU")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_7_getOnOrdered4WithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/ordered4/{w}/{x}/{z}/{y} -> Response status 400 not defined for path '/api/ordered4/{w}/{x}/{z}/{y}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_4877_XYZ_")
                .get(baseUrlOfSut + "/api/ordered4/SexyL/YOqPcC/cGCchQn8k%5C/q?EMextraParam123=42")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_8_getOnTitlWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/title/{sex}/{title} -> Response status 400 not defined for path '/api/title/{sex}/{title}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/Rb%7Dc/%5CEA")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_9_getOnFilesuffixWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/filesuffix/{directory}/{file} -> Response status 400 not defined for path '/api/filesuffix/{directory}/{file}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/filesuffix/%5CXUUE_gfn_dH/GU")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_10_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt}/{pat} -> Response status 400 not defined for path '/api/pat/{txt}/{pat}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/_EM_4976_XYZ_/ZO_h4%5C;YjPk9")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_11_getOnNotypevarReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/notypevar/{i}/{s} -> Response status 400 not defined for path '/api/notypevar/{i}/{s}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/notypevar/73/MF2EiLoN%5C3jf3LMP")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_12_getOnCalcReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/calc/{op}/{arg1}/{arg2} -> Response status 400 not defined for path '/api/calc/{op}/{arg1}/{arg2}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/calc/F%5C/-0.4297650890901503/-4306369.0")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_13_getOnCostfunReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/costfuns/{i}/{s} -> Response status 400 not defined for path '/api/costfuns/{i}/{s}'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/costfuns/-8389375/bEQ_6471IkXY%5C")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_14_getOnText2txtWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/text2txt/{word1}/{word2}/{word3} -> No response body is expected but one was found.
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_425_XYZ_")
                .get(baseUrlOfSut + "/api/text2txt/%3Fb/C3TSfuvo/;?EMextraParam123=_EM_424_XYZ_")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/text2txt/%3Fb/C3TSfuvo/;"));
    }
    
    
    @Test(timeout = 60000)
    public void test_15_getOnFilesuffixWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/filesuffix/{directory}/{file} -> No response body is expected but one was found.
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/filesuffix/_EM_10381_XYZ_/M%C2%85e4iTar?EMextraParam123=42")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/filesuffix/_EM_10381_XYZ_/M%C2%85e4iTar"));
    }
    
    
    @Test(timeout = 60000)
    public void test_16_getOnOrdered4WithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/ordered4/{w}/{x}/{z}/{y} -> No response body is expected but one was found.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/ordered4/_EM_30518_XYZ_/;amtQ/Fl%3FTSj/FX_TAj")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/ordered4/_EM_30518_XYZ_/;amtQ/Fl%3FTSj/FX_TAj"));
    }
    
    
    @Test(timeout = 60000)
    public void test_17_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/afs//:oq/ps'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/afs//:oq/ps")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/afs//:oq/ps"));
    }
    
    
    @Test(timeout = 60000)
    public void test_18_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:c5s/er'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:c5s/er")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:c5s/er"));
    }
    
    
    @Test(timeout = 60000)
    public void test_19_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:c5t/es'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:c5t/es")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:c5t/es"));
    }
    
    
    @Test(timeout = 60000)
    public void test_20_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/afs//:z/f1'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/afs//:z/f1")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/afs//:z/f1"));
    }
    
    
    @Test(timeout = 60000)
    public void test_21_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/http//:k57/ae'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:k57/ae")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:k57/ae"));
    }
    
    
    @Test(timeout = 60000)
    public void test_22_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:l57/ae'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:l57/ae")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:l57/ae"));
    }
    
    
    @Test(timeout = 60000)
    public void test_23_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:l58/be'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:l58/be")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:l58/be"));
    }
    
    
    @Test(timeout = 60000)
    public void test_24_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:_/q'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:_/q")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:_/q"));
    }
    
    
    @Test(timeout = 60000)
    public void test_25_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:-/q'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:-/q")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:-/q"));
    }
    
    
    @Test(timeout = 60000)
    public void test_26_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:a/r'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:a/r")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:a/r"));
    }
    
    
    @Test(timeout = 60000)
    public void test_27_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:b/r'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:b/r")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:b/r"));
    }
    
    
    @Test(timeout = 60000)
    public void test_28_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:cr/r'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:cr/r")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:cr/r"));
    }
    
    
    @Test(timeout = 60000)
    public void test_29_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/http//:d9y/w6'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:d9y/w6")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:d9y/w6"));
    }
    
    
    @Test(timeout = 60000)
    public void test_30_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/http//:e9y/x'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:e9y/x")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:e9y/x"));
    }
    
    
    @Test(timeout = 60000)
    public void test_31_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/http//:f9y/ym'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:f9y/ym")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:f9y/ym"));
    }
    
    
    @Test(timeout = 60000)
    public void test_32_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/http//:g9y/zm'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:g9y/zm")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:g9y/zm"));
    }
    
    
    @Test(timeout = 60000)
    public void test_33_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/afs//:uh/fc3'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/afs//:uh/fc3")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/afs//:uh/fc3"));
    }
    
    
    @Test(timeout = 60000)
    public void test_34_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/http//:f/g'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:f/g")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:f/g"));
    }
    
    
    @Test(timeout = 60000)
    public void test_35_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:z2/sl'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:z2/sl")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:z2/sl"));
    }
    
    
    @Test(timeout = 60000)
    public void test_36_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:z2/sm'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:z2/sm")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:z2/sm"));
    }
    
    
    @Test(timeout = 60000)
    public void test_37_getOnCookiWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/cookie/{name}/{val}/{site} -> No response body is expected but one was found.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/cookie/syfRxaqu1FSBDasp/;0/_EM_48016_XYZ_")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/cookie/syfRxaqu1FSBDasp/;0/_EM_48016_XYZ_"));
    }
    
    
    @Test(timeout = 60000)
    public void test_38_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/http//:cbx/sp7'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:cbx/sp7")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:cbx/sp7"));
    }
    
    
    @Test(timeout = 60000)
    public void test_39_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:cbx/sp7'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:cbx/sp7")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:cbx/sp7"));
    }
    
    
    @Test(timeout = 60000)
    public void test_40_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:ccx/s7'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:ccx/s7")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:ccx/s7"));
    }
    
    
    @Test(timeout = 60000)
    public void test_41_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:dcx/s8'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:dcx/s8")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:dcx/s8"));
    }
    
    
    @Test(timeout = 60000)
    public void test_42_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:dcx/s8g'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:dcx/s8g")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:dcx/s8g"));
    }
    
    
    @Test(timeout = 60000)
    public void test_43_getOnPatWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/pat/{txt} -> No API path found that matches request '/api/pat/ftp//:ecx/t8g'.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/ftp//:ecx/t8g")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/ftp//:ecx/t8g"));
    }
    
    
    @Test(timeout = 60000)
    public void test_44_getOnTitlWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/title/{sex}/{title} -> No response body is expected but one was found.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/;tMX/Y3xbmSovT")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/title/;tMX/Y3xbmSovT"));
    }
    
    
    @Test(timeout = 60000)
    public void test_45_getOnDateparsWithQueryParamReturnsSchemaInvalidResponse() throws Exception {
        
        // Fault200. Received A Response From API That Is Not Valid According To Its Schema. GET:/api/dateparse/{dayname}/{monthname} -> No response body is expected but one was found.
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/qsp/;I5ECl5i?EMextraParam123=_EM_1277_XYZ_")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/dateparse/qsp/;I5ECl5i"));
    }


}
