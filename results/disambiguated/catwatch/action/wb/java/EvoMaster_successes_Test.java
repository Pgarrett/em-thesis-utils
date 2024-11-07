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
*  This file was automatically generated by EvoMaster on 2024-11-06T22:37:36.127-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 15 tests
 * <br>
*  Covered targets: 175
 * <br>
*  Used time: 0h 13m 21s
 * <br>
*  Needed budget for current results: 96%
 * <br>
*  This file contains test cases that represent successful calls.
*/
public class EvoMaster_successes_Test {

    
    private static final SutHandler controller = new em.embedded.org.zalando.EmbeddedEvoMasterController();
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
        controller.resetDatabase(Arrays.asList("CONTRIBUTOR","LANGUAGE_LIST","MAINTAINERS","PROJECT","STATISTICS"));
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
    public void test_1_getOnStatisticsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/statistics?EMextraParam123=_EM_19_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_2_getOnLanguagesWithQueryParamsReturnsEmptyListUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("STATISTICS", 54L)
                .d("ID", "644")
                .d("SNAPSHOT_DATE", "\"1967-11-06 14:22:06\"")
                .d("ALL_CONTRIBUTORS_COUNT", "NULL")
                .d("ALL_FORKS_COUNT", "453")
                .d("ALL_SIZE_COUNT", "494")
                .d("ALL_STARS_COUNT", "NULL")
                .d("MEMBERS_COUNT", "1370195257")
                .d("ORGANIZATION_NAME", "\"_\"")
                .d("PRIVATE_PROJECT_COUNT", "692")
                .d("PROGRAM_LANGUAGES_COUNT", "NULL")
                .d("PUBLIC_PROJECT_COUNT", "NULL")
                .d("TAGS_COUNT", "548")
                .d("TEAMS_COUNT", "155")
                .d("EXTERNAL_CONTRIBUTORS_COUNT", "NULL")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/languages?" + 
                    "organizations=_&" + 
                    "offset=613&" + 
                    "q=RCucow")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_3_getOnLanguagesWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/languages?" + 
                    "organizations=OnQo4_Yzp&" + 
                    "limit=604&" + 
                    "q=K1&" + 
                    "EMextraParam123=42")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_4_getOnLanguagesWithQueryParamsReturnsEmptyListUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("STATISTICS", 61L)
                .d("ID", "583")
                .d("SNAPSHOT_DATE", "\"2010-01-19 11:12:52\"")
                .d("ALL_CONTRIBUTORS_COUNT", "NULL")
                .d("ALL_FORKS_COUNT", "NULL")
                .d("ALL_SIZE_COUNT", "NULL")
                .d("ALL_STARS_COUNT", "NULL")
                .d("MEMBERS_COUNT", "656")
                .d("ORGANIZATION_NAME", "\"22xf4z7rR8\"")
                .d("PRIVATE_PROJECT_COUNT", "997")
                .d("PROGRAM_LANGUAGES_COUNT", "696")
                .d("PUBLIC_PROJECT_COUNT", "NULL")
                .d("TAGS_COUNT", "711")
                .d("TEAMS_COUNT", "NULL")
                .d("EXTERNAL_CONTRIBUTORS_COUNT", "135")
            .and().insertInto("PROJECT", 63L)
                .d("GIT_HUB_PROJECT_ID", "575")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/languages?" + 
                    "organizations=mpxRmD&" + 
                    "limit=75")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_5_getOnLanguagesWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/languages?" + 
                    "organizations=IQfq3qMLVtRdVt_V&" + 
                    "limit=134218297&" + 
                    "offset=228&" + 
                    "q=IQfq7qMLVtRdVt_V&" + 
                    "EMextraParam123=42")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_6_getOnLanguagesWithQueryParamsReturnsEmptyListUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PROJECT", 75L)
                .d("COMMITS_COUNT", "686")
                .d("CONTRIBUTORS_COUNT", "NULL")
                .d("DESCRIPTION", "\"ROpJg1BJ\"")
                .d("FORKS_COUNT", "97")
                .d("GIT_HUB_PROJECT_ID", "260")
                .d("LAST_PUSHED", "NULL")
                .d("NAME", "\"_EM_771_XYZ_\"")
                .d("ORGANIZATION_NAME", "\"\"")
                .d("PRIMARY_LANGUAGE", "NULL")
                .d("SCORE", "789")
                .d("SNAPSHOT_DATE", "\"2071-04-03 01:08:02\"")
                .d("STARS_COUNT", "NULL")
                .d("URL", "\"_EM_500_XYZ_\"")
                .d("TITLE", "\"0bAhsZn\"")
                .d("IMAGE", "\"z_F\"")
                .d("EXTERNAL_CONTRIBUTORS_COUNT", "807")
            .and().insertInto("STATISTICS", 76L)
                .d("ID", "373")
                .d("SNAPSHOT_DATE", "\"1977-10-09 01:08:28\"")
                .d("ALL_CONTRIBUTORS_COUNT", "692")
                .d("ALL_FORKS_COUNT", "960")
                .d("ALL_SIZE_COUNT", "NULL")
                .d("ALL_STARS_COUNT", "NULL")
                .d("MEMBERS_COUNT", "NULL")
                .d("ORGANIZATION_NAME", "\"_qquBGwxCnmMCAn\"")
                .d("PRIVATE_PROJECT_COUNT", "NULL")
                .d("PROGRAM_LANGUAGES_COUNT", "696")
                .d("PUBLIC_PROJECT_COUNT", "NULL")
                .d("TAGS_COUNT", "NULL")
                .d("TEAMS_COUNT", "NULL")
                .d("EXTERNAL_CONTRIBUTORS_COUNT", "NULL")
            .and().insertInto("CONTRIBUTOR", 77L)
                .d("ID", "863")
                .d("ORGANIZATION_ID", "435")
                .d("SNAPSHOT_DATE", "\"1928-06-18 00:04:53\"")
                .d("NAME", "NULL")
                .d("ORGANIZATION_NAME", "NULL")
                .d("ORGANIZATIONAL_COMMITS_COUNT", "-1676609845")
                .d("ORGANIZATIONAL_PROJECTS_COUNT", "686")
                .d("PERSONAL_COMMITS_COUNT", "71")
                .d("PERSONAL_PROJECTS_COUNT", "436")
                .d("URL", "NULL")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .header("x-organizations", "_qquBGwxCnmMCAn")
                .get(baseUrlOfSut + "/statistics/languages?" + 
                    "start_date=2071-08-24T01%3A42%3A55%2B05%3A45&" + 
                    "end_date=2007-08-06T06%3A39%3A38Z&" + 
                    "q=zOhB&" + 
                    "sortBy=")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_7_getOnLanguagesWithQueryParamsReturnsEmptyListUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("STATISTICS", 80L)
                .d("ID", "453")
                .d("SNAPSHOT_DATE", "\"2025-05-02 07:47:02\"")
                .d("ALL_CONTRIBUTORS_COUNT", "NULL")
                .d("ALL_FORKS_COUNT", "1572976776")
                .d("ALL_SIZE_COUNT", "748")
                .d("ALL_STARS_COUNT", "NULL")
                .d("MEMBERS_COUNT", "NULL")
                .d("ORGANIZATION_NAME", "\"6dMg3cmnNDKyT\"")
                .d("PRIVATE_PROJECT_COUNT", "382")
                .d("PROGRAM_LANGUAGES_COUNT", "431")
                .d("PUBLIC_PROJECT_COUNT", "754")
                .d("TAGS_COUNT", "NULL")
                .d("TEAMS_COUNT", "433")
                .d("EXTERNAL_CONTRIBUTORS_COUNT", "779")
            .and().insertInto("PROJECT", 82L)
                .d("GIT_HUB_PROJECT_ID", "642")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .header("x-organizations", "_EM_847_XYZ_")
                .get(baseUrlOfSut + "/statistics/languages?" + 
                    "organizations=3GH&" + 
                    "q=TAJ0&" + 
                    "limit=924&" + 
                    "language=szhA8Snu")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_8_getOnLanguagesWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .header("x-organizations", "PmBHixJ3OHRn")
                .get(baseUrlOfSut + "/statistics/languages?" + 
                    "organizations=&" + 
                    "offset=pGeC8UdJl9n&" + 
                    "sortBy=DswlUYqGhl")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_9_getOnLanguagesWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/statistics/languages?" + 
                    "organizations=_EM_603_XYZ_&" + 
                    "q=LECJqL7P8w&" + 
                    "offset=S_&" + 
                    "sortBy=rHIE&" + 
                    "language=_EM_605_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_10_getOnProjectsWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/projects?" + 
                    "start_date=2007-07-20T23%3A08%3A44.415Z&" + 
                    "sortBy=9obr13MXC5N&" + 
                    "q=Bui7fpoDn4YsQjzc&" + 
                    "EMextraParam123=42")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_11_getOnProjectsWithQueryParamsReturnsEmptyListUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PROJECT", 14L)
                .d("COMMITS_COUNT", "NULL")
                .d("CONTRIBUTORS_COUNT", "68")
                .d("DESCRIPTION", "NULL")
                .d("FORKS_COUNT", "855")
                .d("GIT_HUB_PROJECT_ID", "413")
                .d("LAST_PUSHED", "\"_EM_266_XYZ_\"")
                .d("NAME", "\"SLfWB4Jeu9mP\"")
                .d("ORGANIZATION_NAME", "NULL")
                .d("PRIMARY_LANGUAGE", "NULL")
                .d("SCORE", "NULL")
                .d("SNAPSHOT_DATE", "NULL")
                .d("STARS_COUNT", "NULL")
                .d("URL", "NULL")
                .d("TITLE", "\"xRTmXmYnbxN0O\"")
                .d("IMAGE", "NULL")
                .d("EXTERNAL_CONTRIBUTORS_COUNT", "NULL")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/projects?" + 
                    "organizations=_sr80A7&" + 
                    "limit=188&" + 
                    "end_date=2043-03-27T12%3A23%3A37Z&" + 
                    "q=_EM_269_XYZ_&" + 
                    "language=0BoSJeH14jri")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_12_getOnProjectsWithQueryParamsReturnsEmptyListUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PROJECT", 44L)
                .d("COMMITS_COUNT", "NULL")
                .d("CONTRIBUTORS_COUNT", "672")
                .d("DESCRIPTION", "NULL")
                .d("FORKS_COUNT", "NULL")
                .d("GIT_HUB_PROJECT_ID", "184")
                .d("LAST_PUSHED", "\"_EM_542_XYZ_\"")
                .d("NAME", "\"UWBMa3\"")
                .d("ORGANIZATION_NAME", "NULL")
                .d("PRIMARY_LANGUAGE", "\"Qf\"")
                .d("SCORE", "649")
                .d("SNAPSHOT_DATE", "NULL")
                .d("STARS_COUNT", "NULL")
                .d("URL", "NULL")
                .d("TITLE", "\"_EM_543_XYZ_\"")
                .d("IMAGE", "NULL")
                .d("EXTERNAL_CONTRIBUTORS_COUNT", "841")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/projects?" + 
                    "organizations=v2Tdhx2hyF_sT&" + 
                    "limit=0&" + 
                    "offset=772&" + 
                    "start_date=1944-08-01T22%3A08%3A58%2B07%3A50&" + 
                    "sortBy=pDkCnudH5Fx&" + 
                    "language=Qf")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_13_getOnProjectsWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/projects?" + 
                    "organizations=6&" + 
                    "limit=206&" + 
                    "offset=498&" + 
                    "end_date=2059-09-04T07%3A10%3A09.859%2B20%3A44&" + 
                    "language=H7&" + 
                    "EMextraParam123=42")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    @Test(timeout = 60000)
    public void test_14_getOnProjectsWithQueryParamsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/projects?" + 
                    "limit=360&" + 
                    "offset=563&" + 
                    "start_date=1963-05-18T02%3A55%3A00.693-01%3A26&" + 
                    "sortBy=_EM_16_XYZ_&" + 
                    "q=k&" + 
                    "language=_EM_17_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }


}