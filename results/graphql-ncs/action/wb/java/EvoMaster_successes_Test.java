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
*  This file was automatically generated by EvoMaster on 2024-11-03T12:44:56.778-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 41 tests
 * <br>
*  Covered targets: 545
 * <br>
*  Used time: 0h 15m 3s
 * <br>
*  Needed budget for current results: 98%
 * <br>
*  This file contains test cases that represent successful calls.
*/
public class EvoMaster_successes_Test {

    
    private static final SutHandler controller = new em.embedded.org.graphqlncs.EmbeddedEvoMasterController();
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
    public void test_0_queryOnTriangleClassificationReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { triangleClassification  (b : 446)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'triangleClassification'", numberMatches(0.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_1_queryOnTriangleClassificationReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { triangleClassification  (a : 989,c : 62)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'triangleClassification'", numberMatches(0.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_2_queryOnTriangleClassificationReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { triangleClassification  (a : 8126863,b : 494)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'triangleClassification'", numberMatches(0.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_3_queryOnRemainderReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { remainder  (b : 546)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'remainder'", numberMatches(-1.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_4_queryOnRemainderReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { remainder  (a : 125)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'remainder'", numberMatches(-1.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_5_queryOnTriangleClassificationReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { triangleClassification  (a : 134218613,b : 10,c : 173)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'triangleClassification'", numberMatches(0.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_6_queryOnBessjReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { bessj  (n : 371)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'bessj'", numberMatches(0.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_7_queryOnExpintReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { expint  (x : 0.89031965)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'expint'", numberMatches(0.46109788503303195));
    }
    
    
    @Test(timeout = 60000)
    public void test_8_queryOnTriangleClassificationReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { triangleClassification  (a : 945,b : 171802,c : 13)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'triangleClassification'", numberMatches(0.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_9_queryOnTriangleClassificationReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { triangleClassification  (a : 884,b : 722,c : 1034711638)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'triangleClassification'", numberMatches(0.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_10_queryOnExpintReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { expint  (n : 32990)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'expint'", numberMatches(3.0313134681257387E-5));
    }
    
    
    @Test(timeout = 60000)
    public void test_11_queryOnRemainderReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { remainder  (a : 407,b : 325)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'remainder'", numberMatches(82.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_12_queryOnTriangleClassificationReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { triangleClassification  (a : 299,b : 299,c : 247)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'triangleClassification'", numberMatches(2.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_13_queryOnTriangleClassificationReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { triangleClassification  (a : 381,b : 266,c : 560)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'triangleClassification'", numberMatches(1.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_14_queryOnTriangleClassificationReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { triangleClassification  (a : 257,b : 233,c : 72)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'triangleClassification'", numberMatches(1.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_15_queryOnTriangleClassificationReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { triangleClassification  (a : 489,b : 302,c : 489)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'triangleClassification'", numberMatches(2.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_16_queryOnRemainderReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { remainder  (a : 820,b : -82)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'remainder'", numberMatches(0.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_17_queryOnRemainderReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { remainder  (a : -208,b : 16)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'remainder'", numberMatches(0.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_18_queryOnRemainderReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { remainder  (a : -7860,b : -6)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'remainder'", numberMatches(0.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_19_queryOnFisherReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { fisher  (m : 252,n : 349,x : 0.27173713)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'fisher'", numberMatches(0.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_20_queryOnFisherReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { fisher  (m : 284,n : -33554079,x : 0.27173713)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'fisher'", numberMatches(0.33333256503135195));
    }
    
    
    @Test(timeout = 60000)
    public void test_21_queryOnFisherReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { fisher  (m : 890,n : 919,x : 0.9904128)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'fisher'", numberMatches(0.4425747459005311));
    }
    
    
    @Test(timeout = 60000)
    public void test_22_queryOnFisherReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { fisher  (m : 252,n : 353,x : -0.4899371)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'fisher'", numberMatches(1.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_23_queryOnFisherReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { fisher  (m : 269,n : 632,x : 507641.66)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'fisher'", numberMatches(1.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_24_queryOnFisherReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { fisher  (m : 739,n : 150,x : 0.050903797)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'fisher'", numberMatches(2.270546469650947E-17));
    }
    
    
    @Test(timeout = 60000)
    public void test_25_queryOnExpintReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { expint  (n : 17,x : 1.0)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'expint'", numberMatches(0.02156134368804879));
    }
    
    
    @Test(timeout = 60000)
    public void test_26_queryOnExpintReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { expint  (n : 1,x : 0.35180598)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'expint'", numberMatches(0.7905919042556174));
    }
    
    
    @Test(timeout = 60000)
    public void test_27_queryOnExpintReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { expint  (n : 1125240662,x : 0.13332742)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'expint'", numberMatches(7.777700581087214E-10));
    }
    
    
    @Test(timeout = 60000)
    public void test_28_queryOnExpintReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { expint  (n : 245931,x : 1.0015243)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'expint'", numberMatches(1.4935860360085967E-6));
    }
    
    
    @Test(timeout = 60000)
    public void test_29_queryOnGammqReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { gammq  (a : 0.6896096,x : null)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'gammq'", numberMatches(1.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_30_queryOnExpintReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { expint  (n : 10,x : 0.9458795)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'expint'", numberMatches(0.03864445529036636));
    }
    
    
    @Test(timeout = 60000)
    public void test_31_queryOnBessjReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { bessj  (n : 5,x : 0.5353953)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'bessj'", numberMatches(1.1320094248850288E-5));
    }
    
    
    @Test(timeout = 60000)
    public void test_32_queryOnBessjReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { bessj  (n : 8,x : -8.0)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'bessj'", numberMatches(0.22345498635390812));
    }
    
    
    @Test(timeout = 60000)
    public void test_33_queryOnBessjReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { bessj  (n : 6,x : -6.6645374)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'bessj'", numberMatches(0.3149653477055918));
    }
    
    
    @Test(timeout = 60000)
    public void test_34_queryOnGammqReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { gammq  (a : 4.2535293E37,x : 0.93918836)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'gammq'", numberMatches(1.0));
    }
    
    
    @Test(timeout = 60000)
    public void test_35_queryOnGammqReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { gammq  (a : 0.31826308,x : 0.8795525)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'gammq'", numberMatches(0.1080219056262316));
    }
    
    
    @Test(timeout = 60000)
    public void test_36_queryOnGammqReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { gammq  (a : 0.2570055,x : 1.4562371)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'gammq'", numberMatches(0.03671528731300242));
    }
    
    
    @Test(timeout = 60000)
    public void test_37_queryOnBessjReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { bessj  (n : 783,x : 157632.14)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'bessj'", numberMatches(-0.0013644069595453875));
    }
    
    
    @Test(timeout = 60000)
    public void test_38_queryOnBessjReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { bessj  (n : 6,x : -8.260866)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'bessj'", numberMatches(0.3152667035271125));
    }
    
    
    @Test(timeout = 60000)
    public void test_39_queryOnBessjReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { bessj  (n : 217,x : -246.13559)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'bessj'", numberMatches(0.056141463554452334));
    }
    
    
    @Test(timeout = 60000)
    public void test_40_queryOnBessjReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { bessj  (n : 6,x : -8.0)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'bessj'", numberMatches(0.33757590000907034));
    }


}