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
*  This file was automatically generated by EvoMaster on 2024-11-06T21:59:11.565-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 7 tests
 * <br>
*  Covered targets: 17
 * <br>
*  Used time: 0h 10m 1s
 * <br>
*  Needed budget for current results: 95%
 * <br>
*  This file contains test cases that are likely to indicate faults.
*/
public class EvoMaster_faults_Test {

    
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
    public void test_0_queryOnExpintReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { expint           } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/type/Expint_26_exe
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Internal Server Error(s) while executing query"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'.'expint'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_1_queryOnRemainderReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { remainder  (a : 2097405,b : 556)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/resolver/CustomException_88_getMessage
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Unexpected error occurred"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_2_queryOnGammqReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { gammq           } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/type/Gammq_101_exe
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Internal Server Error(s) while executing query"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'.'gammq'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_3_queryOnFisherReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { fisher  (m : null)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/resolver/QueryResolver_35_fisher
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Can't serialize value (/fisher) : Expected type 'Float' but was 'Double'."))
                .body("'errors'[0].'path'.size()", equalTo(1))
                .body("'errors'[0].'path'", hasItems("fisher"))
                .body("'errors'[0].'extensions'.'classification'", containsString("DataFetchingException"))
                .body("'data'.'fisher'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_4_queryOnBessjReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { bessj           } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/resolver/CustomException_88_getMessage
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Unexpected error occurred"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_5_queryOnFisherReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { fisher  (m : 67109039,n : 552,x : 0.82636565)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/resolver/CustomException_88_getMessage
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Unexpected error occurred"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_6_queryOnGammqReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { gammq  (a : 9.538443E37,x : 8.5070587E37)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/type/Gammq_96_gser
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Internal Server Error(s) while executing query"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'.'gammq'", nullValue());
    }


}