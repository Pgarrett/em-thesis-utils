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
*  This file was automatically generated by EvoMaster on 2024-11-28T23:06:45.134-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 17 tests
 * <br>
*  Covered targets: 49
 * <br>
*  Used time: 0h 10m 1s
 * <br>
*  Needed budget for current results: 85%
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
    
    
    
    
    @Test(timeout = 60000)
    public void test_0_deleteOnNewReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .delete(baseUrlOfSut + "/news/_EM_1_XYZ_?EMextraParam123=_EM_2_XYZ_")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_1_postOnNewsReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_3386_XYZ_")
                .contentType("application/json;charset=UTF-8")
                .body(" { " + 
                    " \"authorId\": \"ByYXBRGw\", " + 
                    " \"id\": \"F1zaW1u8FCx1MX\", " + 
                    " \"newsId\": \"_EM_3384_XYZ_\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news?" + 
                    "EMextraParam123=_EM_3385_XYZ_&" + 
                    "country=y4tni")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_2_putOnNewReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"creationTime\": \"2067-08-32T16:25:28.757+20:39\", " + 
                    " \"id\": \"cz3_C\", " + 
                    " \"newsId\": \"l0Oz_YUX\", " + 
                    " \"text\": \"iaObEcHIcs\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/cz3_C?EMextraParam123=42")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("JSON parse error: Cannot deserialize value of type `java.time.ZonedDateTime` from String \"2067-08-32T16:25:28.757+20:39\": Failed to deserialize java.time.ZonedDateTime: (java.time.format.DateTimeParseException) Text '2067-08-32T16:25:28.757+20:39' could not be parsed: Invalid value for DayOfMonth (valid values 1 - 28/31): 32; nested exception is com.fasterxml.jackson.databind.exc.InvalidFormatException: Cannot deserialize value of type `java.time.ZonedDateTime` from String \"2067-08-32T16:25:28.757+20:39\": Failed to deserialize java.time.ZonedDateTime: (java.time.format.DateTimeParseException) Text '2067-08-32T16:25:28.757+20:39' could not be parsed: Invalid value for DayOfMonth (valid values 1 - 28/31): 32\n at [Source: (ByteArrayInputStream); line: 1, column: 17] (through reference chain: org.tsdes.spring.examples.news.dto.NewsDto[\"creationTime\"])"))
                .body("'path'", containsString("/news/cz3_C"));
    }
    
    
    @Test(timeout = 60000)
    public void test_3_postOnNewsWithQueryParamsReturns400UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 744L)
                .d("ID", "0")
                .d("AUTHOR_ID", "\"b\"")
                .d("COUNTRY", "\"KoUYUwsO7UUoUU\"")
                .d("CREATION_TIME", "\"1985-08-08 08:50:55\"")
                .d("TEXT", "\"_EM_10683_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("application/json;charset=UTF-8")
                .post(baseUrlOfSut + "/news?" + 
                    "country=0&" + 
                    "authorId=0")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("Required request body is missing: public org.springframework.http.ResponseEntity<java.lang.Long> org.tsdes.spring.examples.news.api.NewsRestApi.createNews(org.tsdes.spring.examples.news.dto.NewsDto)"))
                .body("'path'", containsString("/news"));
    }
    
    
    @Test(timeout = 60000)
    public void test_4_postOnNewsWithQueryParamsReturns400UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 11L)
                .d("ID", "497")
                .d("AUTHOR_ID", "\"nV8GEbLyTrLz\"")
                .d("COUNTRY", "\"pyP0F7ou0\"")
                .d("CREATION_TIME", "\"1929-03-25 01:59:54\"")
                .d("TEXT", "\"\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .contentType("application/json;charset=UTF-8")
                .body(" { " + 
                    " \"authorId\": \"qVSQDRO86\", " + 
                    " \"country\": \"Xe2n43\", " + 
                    " \"id\": \"zJG4K\", " + 
                    " \"newsId\": \"zSwZi8yiGQlZy\", " + 
                    " \"text\": \"OspsC8MCq1xuD\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news?EMextraParam123=42")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_5_putOnTextReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("text/plain")
                .body()
                .put(baseUrlOfSut + "/news/672/text")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("Required request body is missing: public org.springframework.http.ResponseEntity<java.lang.Object> org.tsdes.spring.examples.news.api.NewsRestApi.updateText(java.lang.Long,java.lang.String)"))
                .body("'path'", containsString("/news/672/text"));
    }
    
    
    @Test(timeout = 60000)
    public void test_6_deleteOnNewReturns404UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 1L)
                .d("ID", "2834")
                .d("AUTHOR_ID", "\"_EM_136_XYZ_\"")
                .d("COUNTRY", "\"_UM_7U_UYZ_\"")
                .d("CREATION_TIME", "\"1938-01-18 16:08:10\"")
                .d("TEXT", "\"4KRRm6PQony\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .delete(baseUrlOfSut + "/news/-67108119?EMextraParam123=_EM_49_XYZ_")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_7_getOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/news/xm8AF_wYAOk?EMextraParam123=42")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_8_getOnNewReturns404UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 14L)
                .d("ID", "0")
                .d("AUTHOR_ID", "\"ABrG30CND01eowXz\"")
                .d("COUNTRY", "\"0VMwGAlx\"")
                .d("CREATION_TIME", "\"2072-01-09 03:25:18\"")
                .d("TEXT", "\"\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/news/SJXBY9uEa_7Dqg?" + 
                    "country=2S5DHv3M&" + 
                    "authorId=CzaeG")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_9_deleteOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .delete(baseUrlOfSut + "/news/0?" + 
                    "EMextraParam123=_EM_189_XYZ_&" + 
                    "country=LyPe7uc4s30Pr5")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_10_putOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"newsId\": \"0vVF24c6Hl1xlQ\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/JcRMxZLN58zXAY?" + 
                    "country=u4MpknXbRS&" + 
                    "authorId=DQe2CVU0u6b")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_11_putOnTextReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("text/plain")
                .body("vi6AZv0")
                .put(baseUrlOfSut + "/news/856/text?" + 
                    "country=856&" + 
                    "authorId=856")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_12_putOnNewReturns405UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 14L)
                .d("ID", "0")
                .d("AUTHOR_ID", "\"ABrG30CND01eowXz\"")
                .d("COUNTRY", "\"0VMwGAlx\"")
                .d("CREATION_TIME", "\"2072-01-09 03:25:18\"")
                .d("TEXT", "\"\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"cBD\", " + 
                    " \"id\": \"0\", " + 
                    " \"text\": \"GwumUCq4NI4L6\" " + 
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
    
    
    @Test(timeout = 60000)
    public void test_13_putOnNewWithQueryParamReturns409UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 14L)
                .d("ID", "260")
                .d("AUTHOR_ID", "\"ABrG30CND01eowXz\"")
                .d("COUNTRY", "\"0VMgGAlx\"")
                .d("CREATION_TIME", "\"2072-01-09 09:41:18\"")
                .d("TEXT", "\"s\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"cBD\", " + 
                    " \"id\": \"497\", " + 
                    " \"text\": \"GwumUCq4NI4L6\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/_EM_2742_XYZ_?EMextraParam123=42")
                .then()
                .statusCode(409)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_14_putOnNewReturns409() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"856\", " + 
                    " \"country\": \"856\", " + 
                    " \"creationTime\": \"1957-09-15T17:00:37Z\", " + 
                    " \"id\": \"856\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/_EM_17365_XYZ_")
                .then()
                .statusCode(409)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_15_putOnNewWithQueryParamReturns409UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 10L)
                .d("ID", "32832")
                .d("AUTHOR_ID", "\"7kamR0fiMX9D7pQ\"")
                .d("COUNTRY", "\"y_k0aTWutL\"")
                .d("CREATION_TIME", "\"1999-02-11 19:15:06\"")
                .d("TEXT", "\"_EM_2816_XYZ_\"")
            .and().insertInto("NEWS_ENTITY", 3L)
                .d("ID", "14")
                .d("AUTHOR_ID", "\"EC_f\"")
                .d("COUNTRY", "\"3DZWcOi2aSQmqLW\"")
                .d("CREATION_TIME", "\"2086-12-08 23:14:47\"")
                .d("TEXT", "\"PSrGFQD\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"1975707081\", " + 
                    " \"country\": \"1975707081\", " + 
                    " \"id\": \"1975707081\", " + 
                    " \"text\": \"szPyky7a\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/_EM_18945_XYZ_")
                .then()
                .statusCode(409)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_16_putOnNewWithQueryParamsReturns409UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 14L)
                .d("ID", "0")
                .d("AUTHOR_ID", "\"ABrG30CND01eowXz\"")
                .d("COUNTRY", "\"0VMwGAlx\"")
                .d("CREATION_TIME", "\"2072-01-09 05:09:18\"")
                .d("TEXT", "\"\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"FSLN\", " + 
                    " \"country\": \"i4tDNKqXYdV6P\", " + 
                    " \"id\": \"luNKkP9bG3\", " + 
                    " \"newsId\": \"6\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/luNKkP9bG3?country=i4tDNKqXYdV6P")
                .then()
                .statusCode(409)
                .assertThat()
                .body(isEmptyOrNullString());
    }


}
