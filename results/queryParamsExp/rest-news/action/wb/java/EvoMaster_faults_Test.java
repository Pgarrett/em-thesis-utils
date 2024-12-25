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
import static org.evomaster.client.java.sql.dsl.SqlDsl.sql;
import  org.evomaster.client.java.controller.api.dto.database.operations.InsertionResultsDto;
import  org.evomaster.client.java.controller.api.dto.database.operations.InsertionDto;
import static org.hamcrest.Matchers.*;
import  io.restassured.config.JsonConfig;
import  io.restassured.path.json.config.JsonPathConfig;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;




/**
*  This file was automatically generated by EvoMaster on 2024-12-25T17:08:39.568-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 3 tests
 * <br>
*  Covered targets: 19
 * <br>
*  Used time: 0h 15m 1s
 * <br>
*  Needed budget for current results: 73%
 * <br>
*  This file contains test cases that are likely to indicate faults.
*/
public class EvoMaster_faults_Test {

    
    private static final SutHandler controller = new em.embedded.org.tsdes.EmbeddedEvoMasterController();
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
        controller.resetDatabase(Arrays.asList("NEWS_ENTITY"));
        controller.resetStateOfSUT();
    }
    
    
    
    
    /**
    * Calls:
    * (500) POST:/news
    * Found 1 potential fault of type-code 100
    */
    @Test(timeout = 60000)
    public void test_0_postOnNewsCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/tsdes/spring/examples/news/api/NewsRestApi_123_createNews POST:/news
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("application/json;charset=UTF-8")
                .body(" { " + 
                    " \"authorId\": \"u1\", " + 
                    " \"country\": \"ThAe\", " + 
                    " \"text\": \"Ep1UyflNjONR\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news?EMextraParam123=42")
                .then()
                .statusCode(500)// org/tsdes/spring/examples/news/api/NewsRestApi_123_createNews
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(500.0))
                .body("'error'", containsString("Internal Server Error"))
                .body("'message'", containsString("Could not commit JPA transaction; nested exception is javax.persistence.RollbackException: Error while committing the transaction"))
                .body("'path'", containsString("/news"));
    }
    
    
    /**
    * Calls:
    * (500) PUT:/news/{id}
    * Found 1 potential fault of type-code 100
    */
    @Test(timeout = 60000)
    public void test_1_putOnNewCauses500_internalServerErrorUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 70L)
                .d("ID", "0")
                .d("AUTHOR_ID", "\"_EM_16573_XYZ_\"")
                .d("COUNTRY", "\"hTS5WZjN\"")
                .d("CREATION_TIME", "\"2042-10-17 11:23:41\"")
                .d("TEXT", "\"WxspzOXVD\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        // Fault100. HTTP Status 500. org/tsdes/spring/examples/news/api/NewsRestApi_204_update PUT:/news/{id}
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"wq9\", " + 
                    " \"country\": \"_EM_1415_XYZ_\", " + 
                    " \"creationTime\": \"2041-08-26T05:34:30.826+04:43\", " + 
                    " \"id\": \"0\", " + 
                    " \"text\": \"RLplWqTC1\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/0")
                .then()
                .statusCode(500)// org/tsdes/spring/examples/news/api/NewsRestApi_204_update
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(500.0))
                .body("'error'", containsString("Internal Server Error"))
                .body("'message'", containsString("Could not commit JPA transaction; nested exception is javax.persistence.RollbackException: Error while committing the transaction"))
                .body("'path'", containsString("/news/0"));
    }
    
    
    /**
    * Calls:
    * (500) PUT:/news/{id}/text
    * Found 1 potential fault of type-code 100
    */
    @Test(timeout = 60000)
    public void test_2_putOnTextCauses500_internalServerErrorUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 3L)
                .d("ID", "529")
                .d("AUTHOR_ID", "\"yfgTY\"")
                .d("COUNTRY", "\"y3gYW64Tx5NhsfH\"")
                .d("CREATION_TIME", "\"2075-10-18 07:17:46\"")
                .d("TEXT", "\"_EM_182_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        // Fault100. HTTP Status 500. org/tsdes/spring/examples/news/api/NewsRestApi_233_updateText PUT:/news/{id}/text
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "_EM_185_XYZ_")
                .contentType("text/plain")
                .body("_EM_183_XYZ_")
                .put(baseUrlOfSut + "/news/529/text?EMextraParam123=_EM_184_XYZ_")
                .then()
                .statusCode(500)// org/tsdes/spring/examples/news/api/NewsRestApi_233_updateText
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(500.0))
                .body("'error'", containsString("Internal Server Error"))
                .body("'message'", containsString("Could not commit JPA transaction; nested exception is javax.persistence.RollbackException: Error while committing the transaction"))
                .body("'path'", containsString("/news/529/text"));
    }


}
