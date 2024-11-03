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
*  This file was automatically generated by EvoMaster on 2024-11-03T15:03:49.855-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 18 tests
 * <br>
*  Covered targets: 197
 * <br>
*  Used time: 0h 15m 2s
 * <br>
*  Needed budget for current results: 76%
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
    public void test_0_putOnTextReturns400() throws Exception {
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("text/plain")
                .body()
                .put(baseUrlOfSut + "/news/739/text?EMextraParam123=42")
                .then()
                .statusCode(400)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(400.0))
                .body("'error'", containsString("Bad Request"))
                .body("'message'", containsString("Required request body is missing: public org.springframework.http.ResponseEntity<java.lang.Object> org.tsdes.spring.examples.news.api.NewsRestApi.updateText(java.lang.Long,java.lang.String)"))
                .body("'path'", containsString("/news/739/text"));
    }
    
    
    @Test(timeout = 60000)
    public void test_1_deleteOnNewReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .delete(baseUrlOfSut + "/news/_EM_24810_XYZ_?" + 
                    "country=%5Ed&" + 
                    "authorId=_EM_24811_XYZ_")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_2_deleteOnNewReturns400UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 456L)
                .d("ID", "366")
                .d("AUTHOR_ID", "\"uo_cY\"")
                .d("COUNTRY", "\"\"")
                .d("CREATION_TIME", "\"2087-10-11 07:45:01\"")
                .d("TEXT", "\"_IS2gZiIkkM\"")
            .and().insertInto("NEWS_ENTITY", 207L)
                .d("ID", "211")
                .d("AUTHOR_ID", "\"_EM_15202_XYZ_\"")
                .d("COUNTRY", "\"_EM_15201_XYZ_\"")
                .d("CREATION_TIME", "\"1906-07-16 14:00:09\"")
                .d("TEXT", "\"kn1N2fCT3lSf\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .delete(baseUrlOfSut + "/news/2U0?" + 
                    "country=_EM_15201_XYZ_&" + 
                    "authorId=_EM_15202_XYZ_")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_3_postOnNewsReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json;charset=UTF-8")
                .body(" { " + 
                    " \"authorId\": \"sBUu1P\", " + 
                    " \"country\": \"VAXsxW\", " + 
                    " \"creationTime\": \"1987-05-01T14:40:27.226Z\", " + 
                    " \"text\": \"i46PFVp8dQz\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news?EMextraParam123=42")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_4_postOnNewsReturns400UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 1753L)
                .d("ID", "-7385")
                .d("AUTHOR_ID", "\"TUEQb\"")
                .d("COUNTRY", "\"Aa9Z_I_4SM9Q\"")
                .d("CREATION_TIME", "\"2059-08-16 06:18:47\"")
                .d("TEXT", "\"_EM_27326_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json;charset=UTF-8")
                .body(" { " + 
                    " \"authorId\": \"px4J,C\", " + 
                    " \"country\": \"_EM_27325_XYZ_\", " + 
                    " \"newsId\": \"0EUVnMVjrDNT\", " + 
                    " \"text\": \"pxf4mK4V6\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news?" + 
                    "country=_EM_27328_XYZ_&" + 
                    "authorId=_EM_27329_XYZ_")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_5_postOnNewsReturns400UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 2513L)
                .d("ID", "223")
                .d("AUTHOR_ID", "\"wPyy3l_tnLnbhNj\"")
                .d("COUNTRY", "\"Dp\"")
                .d("CREATION_TIME", "\"2090-11-16 02:06:31\"")
                .d("TEXT", "\"jnmLZ\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json;charset=UTF-8")
                .body(" { " + 
                    " \"country\": \"7W_soY2za0MN99ME\" " + 
                    " } ")
                .post(baseUrlOfSut + "/news?" + 
                    "country=X2JhyS0efaX&" + 
                    "authorId=xfLFBmI")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_6_putOnNewReturns400UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 252L)
                .d("ID", "0")
                .d("AUTHOR_ID", "\"_EM_4113_XYZ_\"")
                .d("COUNTRY", "\"nsKzAuzGP1\"")
                .d("CREATION_TIME", "\"1926-10-18 07:01:56\"")
                .d("TEXT", "\"kzUTv6mqXIs\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"0\", " + 
                    " \"creationTime\": \"2034-09-20T12:47:58.990-17:47\", " + 
                    " \"id\": \"0\", " + 
                    " \"text\": \"73ED4rR0mL_I\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/0?EMextraParam123=42")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_7_putOnNewReturns400UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 927L)
                .d("ID", "873")
                .d("AUTHOR_ID", "\"Ccqg\"")
                .d("COUNTRY", "\"South Sudan\"")
                .d("CREATION_TIME", "\"2091-09-13 04:57:21\"")
                .d("TEXT", "\"xT\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"873\", " + 
                    " \"country\": \"873\", " + 
                    " \"newsId\": \"873\", " + 
                    " \"text\": \"icEQiIdTXS2sm4\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/873")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_8_getOnNewReturns404UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 243L)
                .d("ID", "453")
                .d("AUTHOR_ID", "\"wy8K5EN1YLLHhywi\"")
                .d("COUNTRY", "\"XFQzBzA7xXVno3\"")
                .d("CREATION_TIME", "\"2048-11-26 21:24:46\"")
                .d("TEXT", "\"_EM_4058_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/news/tOBOWDahSUX5hWqq?" + 
                    "EMextraParam123=_EM_2651_XYZ_&" + 
                    "authorId=wYIjv")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_9_putOnTextReturns404UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 456L)
                .d("ID", "366")
                .d("AUTHOR_ID", "\"uo_cY\"")
                .d("COUNTRY", "\"\"")
                .d("CREATION_TIME", "\"2087-10-11 07:45:01\"")
                .d("TEXT", "\"_IS2gZiIkkM\"")
            .and().insertInto("NEWS_ENTITY", 207L)
                .d("ID", "211")
                .d("AUTHOR_ID", "\"_EM_15202_XYZ_\"")
                .d("COUNTRY", "\"_EM_15201_XYZ_\"")
                .d("CREATION_TIME", "\"1906-07-16 14:00:09\"")
                .d("TEXT", "\"kn1N2fCT3lSf\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("text/plain")
                .body("Go9vl5pA")
                .put(baseUrlOfSut + "/news/332/text?country=_EM_15203_XYZ_")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_10_getOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/news/995")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_11_deleteOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .delete(baseUrlOfSut + "/news/-1411767871?" + 
                    "country=NugschX&" + 
                    "authorId=wZe8o7B1")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_12_putOnNewReturns404UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 377L)
                .d("ID", "-81")
                .d("AUTHOR_ID", "\"_EM_5826_XYZ_\"")
                .d("COUNTRY", "\"ClEwPpIGwc4\"")
                .d("CREATION_TIME", "\"2071-09-16 17:44:39\"")
                .d("TEXT", "\"ArirxZV\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .contentType("application/json")
                .body(" { " + 
                    " \"country\": \"Yj\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/_EM_5825_XYZ_")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_13_putOnNewReturns404UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 172L)
                .d("ID", "832")
                .d("AUTHOR_ID", "\"YnKQoK\"")
                .d("COUNTRY", "\"cT\"")
                .d("CREATION_TIME", "\"1922-02-18 10:38:31\"")
                .d("TEXT", "\"UgS_GYM0D\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"Tfad0xX4AAjR\", " + 
                    " \"creationTime\": \"2058-07-15T17:26:23Z\", " + 
                    " \"id\": \"3b9F\", " + 
                    " \"newsId\": \"MBl\", " + 
                    " \"text\": \"ArqkItwyQHOw4_c\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/832?" + 
                    "country=JntXk&" + 
                    "authorId=_EM_2899_XYZ_")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_14_putOnNewReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"I0mFz3ufkJuG36NB\", " + 
                    " \"id\": \"985\", " + 
                    " \"text\": \"_EM_91_XYZ_\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/985")
                .then()
                .statusCode(404)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_15_putOnNewReturns405UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 456L)
                .d("ID", "398")
                .d("AUTHOR_ID", "\"uo_cY\"")
                .d("COUNTRY", "\"\"")
                .d("CREATION_TIME", "\"2087-10-11 11:29:29\"")
                .d("TEXT", "\"_EM_17429_XYZ_\"")
            .and().insertInto("NEWS_ENTITY", 207L)
                .d("ID", "211")
                .d("AUTHOR_ID", "\"q1FOvVuDx2w2Ae1\"")
                .d("COUNTRY", "\"rrdK0nx9\"")
                .d("CREATION_TIME", "\"1908-05-16 06:00:09\"")
                .d("TEXT", "\"_EM_17430_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/vnd.tsdes.news+json;charset=UTF-8;version=2")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"756\", " + 
                    " \"country\": \"756\", " + 
                    " \"creationTime\": \"2093-13-29T05:39:45Z\", " + 
                    " \"text\": \"SMY\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/;56")
                .then()
                .statusCode(405)
                .assertThat()
                .contentType("application/vnd.tsdes.news+json")
                .body("'status'", numberMatches(405.0))
                .body("'error'", containsString("Method Not Allowed"))
                .body("'message'", containsString("Request method 'PUT' not supported"))
                .body("'path'", containsString("/news/;56"));
    }
    
    
    @Test(timeout = 60000)
    public void test_16_putOnNewReturns409() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_2919_XYZ_")
                .contentType("application/json")
                .body(" { " + 
                    " \"country\": \"p760I_eblelk\", " + 
                    " \"newsId\": \"6\", " + 
                    " \"text\": \"_EM_2918_XYZ_\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/QauKE?" + 
                    "EMextraParam123=_EM_2664_XYZ_&" + 
                    "authorId=_EM_2920_XYZ_")
                .then()
                .statusCode(409)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_17_putOnNewReturns409UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("NEWS_ENTITY", 456L)
                .d("ID", "0")
                .d("AUTHOR_ID", "\"uo_cY\"")
                .d("COUNTRY", "\"\"")
                .d("CREATION_TIME", "\"2087-10-11 07:45:01\"")
                .d("TEXT", "\"_IS2gZiIkkM\"")
            .and().insertInto("NEWS_ENTITY", 207L)
                .d("ID", "211")
                .d("AUTHOR_ID", "\"i1FOvVuDx2w2Ae1\"")
                .d("COUNTRY", "\"rrdK0nx\"")
                .d("CREATION_TIME", "\"1904-07-16 14:04:09\"")
                .d("TEXT", "\"kn1N2fCT3lSf\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" { " + 
                    " \"authorId\": \"379030356\", " + 
                    " \"country\": \"379030356\", " + 
                    " \"id\": \"379030356\" " + 
                    " } ")
                .put(baseUrlOfSut + "/news/8Wv0iB2hj")
                .then()
                .statusCode(409)
                .assertThat()
                .body(isEmptyOrNullString());
    }


}