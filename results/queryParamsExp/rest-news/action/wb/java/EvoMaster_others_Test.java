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
*  This file was automatically generated by EvoMaster on 2024-12-25T17:08:39.654-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 14 tests
 * <br>
*  Covered targets: 46
 * <br>
*  Used time: 0h 15m 1s
 * <br>
*  Needed budget for current results: 73%
 * <br>
*  This file contains test cases that represent failed calls, but not indicative of faults.
*/
public class EvoMaster_others_Test {

    
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
    * (400) DELETE:/news/{id}
    */
    @Test(timeout = 60000)
    public void test_0_deleteOnNewReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_4_XYZ_")
                .delete(baseUrlOfSut + "/news/_EM_2_XYZ_?EMextraParam123=_EM_3_XYZ_")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    /**
    * Calls:
    * (400) POST:/news
    */
    @Test(timeout = 60000)
    public void test_1_postOnNewsReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json;charset=UTF-8")
                .body(" { " + 
                    " \"country\": \"lFB2tUQlgPWXr6K\", " + 
                    " \"text\": \"QF_Mftj9w394CmW\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news?country=San+Marino")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    /**
    * Calls:
    * (400) PUT:/news/{id}
    */
    @Test(timeout = 60000)
    public void test_2_putOnNewReturns400UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 235L)
                .d("ID", "912")
                .d("AUTHOR_ID", "\"wbTI_9Or_JL3NR\"")
                .d("COUNTRY", "\"_EM_5035_XYZ_\"")
                .d("CREATION_TIME", "\"1946-03-20 21:00:42\"")
                .d("TEXT", "\"_EM_5036_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "_EM_5039_XYZ_")
                .contentType("application/json")
                .body(" { " + 
                    " \"country\": \"_EM_5038_XYZ_\", " + 
                    " \"creationTime\": \"1937-12-30T22:21:41-23:54\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/912?" + 
                    "EMextraParam123=42&" + 
                    "country=&" + 
                    "authorId=z")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("JSON parse error: Cannot deserialize value of type `java.time.ZonedDateTime` from String \"1937-12-30T22:21:41-23:54\": Failed to deserialize java.time.ZonedDateTime: (java.time.format.DateTimeParseException) Text '1937-12-30T22:21:41-23:54' could not be parsed: Zone offset not in valid range: -18:00 to +18:00; nested exception is com.fasterxml.jackson.databind.exc.InvalidFormatException: Cannot deserialize value of type `java.time.ZonedDateTime` from String \"1937-12-30T22:21:41-23:54\": Failed to deserialize java.time.ZonedDateTime: (java.time.format.DateTimeParseException) Text '1937-12-30T22:21:41-23:54' could not be parsed: Zone offset not in valid range: -18:00 to +18:00\n at [Source: (ByteArrayInputStream); line: 1, column: 44] (through reference chain: org.tsdes.spring.examples.news.dto.NewsDto[\"creationTime\"])"))
                .body("'path'", containsString("/news/912"));
    }
    
    
    /**
    * Calls:
    * (400) POST:/news
    */
    @Test(timeout = 60000)
    public void test_3_postOnNewsReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("application/json;charset=UTF-8")
                .body(" { " + 
                    " \"creationTime\": \"2063-13-11T08:07:05.171Z\", " + 
                    " \"id\": \"tg4LQAl0R\", " + 
                    " \"newsId\": \"W7Y3\", " + 
                    " \"text\": \"dljONtcZFwddZN\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news?authorId=_xYkXgQgas")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("JSON parse error: Cannot deserialize value of type `java.time.ZonedDateTime` from String \"2063-13-11T08:07:05.171Z\": Failed to deserialize java.time.ZonedDateTime: (java.time.format.DateTimeParseException) Text '2063-13-11T08:07:05.171Z' could not be parsed: Invalid value for MonthOfYear (valid values 1 - 12): 13; nested exception is com.fasterxml.jackson.databind.exc.InvalidFormatException: Cannot deserialize value of type `java.time.ZonedDateTime` from String \"2063-13-11T08:07:05.171Z\": Failed to deserialize java.time.ZonedDateTime: (java.time.format.DateTimeParseException) Text '2063-13-11T08:07:05.171Z' could not be parsed: Invalid value for MonthOfYear (valid values 1 - 12): 13\n at [Source: (ByteArrayInputStream); line: 1, column: 17] (through reference chain: org.tsdes.spring.examples.news.dto.NewsDto[\"creationTime\"])"))
                .body("'path'", containsString("/news"));
    }
    
    
    /**
    * Calls:
    * (400) PUT:/news/{id}
    */
    @Test(timeout = 60000)
    public void test_4_putOnNewReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"creationTime\": \"1959-12-18T07:26:58.547-23:21\", " + 
                    " \"newsId\": \"_EM_5540_XYZ_\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/jAZHic1SkvmRgeq0?country=_EM_5541_XYZ_")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("JSON parse error: Cannot deserialize value of type `java.time.ZonedDateTime` from String \"1959-12-18T07:26:58.547-23:21\": Failed to deserialize java.time.ZonedDateTime: (java.time.format.DateTimeParseException) Text '1959-12-18T07:26:58.547-23:21' could not be parsed: Zone offset not in valid range: -18:00 to +18:00; nested exception is com.fasterxml.jackson.databind.exc.InvalidFormatException: Cannot deserialize value of type `java.time.ZonedDateTime` from String \"1959-12-18T07:26:58.547-23:21\": Failed to deserialize java.time.ZonedDateTime: (java.time.format.DateTimeParseException) Text '1959-12-18T07:26:58.547-23:21' could not be parsed: Zone offset not in valid range: -18:00 to +18:00\n at [Source: (ByteArrayInputStream); line: 1, column: 17] (through reference chain: org.tsdes.spring.examples.news.dto.NewsDto[\"creationTime\"])"))
                .body("'path'", containsString("/news/jAZHic1SkvmRgeq0"));
    }
    
    
    /**
    * Calls:
    * (400) GET:/news/{id}
    */
    @Test(timeout = 60000)
    public void test_5_getOnNewReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/news/0iE4xfNCz%5CKHoFn?" + 
                    "country=VKg1YY_83z5&" + 
                    "authorId=IUaz9V")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    /**
    * Calls:
    * (400) PUT:/news/{id}/text
    */
    @Test(timeout = 60000)
    public void test_6_putOnTextReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("text/plain")
                .body()
                .put(baseUrlOfSut + "/news/46/text?authorId=_EM_2583_XYZ_")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("Required request body is missing: public org.springframework.http.ResponseEntity<java.lang.Object> org.tsdes.spring.examples.news.api.NewsRestApi.updateText(java.lang.Long,java.lang.String)"))
                .body("'path'", containsString("/news/46/text"));
    }
    
    
    /**
    * Calls:
    * (404) DELETE:/news/{id}
    */
    @Test(timeout = 60000)
    public void test_7_deleteOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_4_XYZ_")
                .delete(baseUrlOfSut + "/news/579")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    /**
    * Calls:
    * (404) GET:/news/{id}
    */
    @Test(timeout = 60000)
    public void test_8_getOnNewReturns404UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 77L)
                .d("ID", "32768")
                .d("AUTHOR_ID", "\"_EM_2014_XYZ_\"")
                .d("COUNTRY", "\"h6HG\"")
                .d("CREATION_TIME", "\"1950-06-16 06:19:07\"")
                .d("TEXT", "\"UrhoIwEUam\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/news/-268435456")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    /**
    * Calls:
    * (404) PUT:/news/{id}/text
    */
    @Test(timeout = 60000)
    public void test_9_putOnTextReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_38_XYZ_")
                .contentType("text/plain")
                .body("_EM_36_XYZ_")
                .put(baseUrlOfSut + "/news/865/text?EMextraParam123=_EM_37_XYZ_")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    /**
    * Calls:
    * (404) PUT:/news/{id}
    */
    @Test(timeout = 60000)
    public void test_10_putOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_5433_XYZ_")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"_EM_5431_XYZ_\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/zTYeBlH5AYh9S?" + 
                    "EMextraParam123=_EM_5432_XYZ_&" + 
                    "authorId=_EM_5435_XYZ_")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    /**
    * Calls:
    * (404) GET:/news/{id}
    */
    @Test(timeout = 60000)
    public void test_11_getOnNewWithQueryParamsReturns404UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 82L)
                .d("ID", "908")
                .d("AUTHOR_ID", "\"o\"")
                .d("COUNTRY", "\"_EM_3583_XYZ_\"")
                .d("CREATION_TIME", "\"2020-08-19 21:35:21\"")
                .d("TEXT", "\"4p1MtjEkyE7iRe\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/news/=08?" + 
                    "EMextraParam123=_EM_2220_XYZ_&" + 
                    "country=_EM_3583_XYZ_")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    /**
    * Calls:
    * (405) PUT:/news/{id}
    */
    @Test(timeout = 60000)
    public void test_12_putOnNewReturns405UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 70L)
                .d("ID", "-1048576")
                .d("AUTHOR_ID", "\"dj0AR\"")
                .d("COUNTRY", "\"hTSEWZjNk\"")
                .d("CREATION_TIME", "\"2042-10-17 19:39:25\"")
                .d("TEXT", "\"SxsozOXVD\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"country\": \"_EM_1415_XYZ_\", " + 
                    " \"creationTime\": \"2041-08-26T05:34:30.826+04:43\", " + 
                    " \"id\": \";\", " + 
                    " \"text\": \"RLplWqTC1\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/;")
                .then()
                .statusCode(405)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(405.0))
                .body("'error'", containsString("Method Not Allowed"))
                .body("'message'", containsString("Request method 'PUT' not supported"))
                .body("'path'", containsString("/news/;"));
    }
    
    
    /**
    * Calls:
    * (409) PUT:/news/{id}
    */
    @Test(timeout = 60000)
    public void test_13_putOnNewReturns409() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"_EM_661_XYZ_\", " + 
                    " \"country\": \"Turkey\", " + 
                    " \"creationTime\": \"1936-09-22T07:59:48Z\", " + 
                    " \"id\": \"_EM_679_XYZ_\", " + 
                    " \"newsId\": \"762\", " + 
                    " \"text\": \"_EM_663_XYZ_\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/_EM_660_XYZ_")
                .then()
                .statusCode(409)
                .assertThat()
                .body(isEmptyOrNullString());
    }


}
