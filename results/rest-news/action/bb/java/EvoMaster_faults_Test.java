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
*  This file was automatically generated by EvoMaster on 2024-11-03T01:04:45.127-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 1 tests
 * <br>
*  Covered targets: 5
 * <br>
*  Used time: 0h 16m 12s
 * <br>
*  Needed budget for current results: 89%
 * <br>
*  This file contains test cases that are likely to indicate faults.
*/
public class EvoMaster_faults_Test {

    
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
    public void test_0_postOnNewsCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. POST:/news
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .contentType("application/json;charset=UTF-8")
                .body(" { " + 
                    " \"authorId\": \"zdjqeA\", " + 
                    " \"country\": \"Saint Kitts and Nevis\", " + 
                    " \"text\": \"\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news")
                .then()
                .statusCode(500)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(500.0))
                .body("'error'", containsString("Internal Server Error"))
                .body("'message'", containsString("Could not commit JPA transaction; nested exception is javax.persistence.RollbackException: Error while committing the transaction"))
                .body("'path'", containsString("/news"));
    }


}
