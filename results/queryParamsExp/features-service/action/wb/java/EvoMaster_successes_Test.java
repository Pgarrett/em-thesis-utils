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
*  This file was automatically generated by EvoMaster on 2024-12-25T15:00:56.209-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 6 tests
 * <br>
*  Covered targets: 31
 * <br>
*  Used time: 0h 15m 6s
 * <br>
*  Needed budget for current results: 95%
 * <br>
*  This file contains test cases that represent successful calls.
*/
public class EvoMaster_successes_Test {

    
    private static final SutHandler controller = new em.embedded.org.javiermf.features.EmbeddedEvoMasterController();
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
        controller.resetDatabase(Arrays.asList("CONSTRAINT_EXCLUDES","CONSTRAINT_REQUIRES","FEATURE","PRODUCT","PRODUCT_CONFIGURATION","PRODUCT_CONFIGURATION_ACTIVED_FEATURES","constraint_excludes","constraint_requires","product"));
        controller.resetStateOfSUT();
    }
    
    
    
    
    /**
    * Calls:
    * (200) GET:/swagger.json
    */
    @Test(timeout = 60000)
    public void test_0_getOnSwagger_jsonReturnsObject() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/swagger.json")
                .then()
                .statusCode(200);
    }
    
    
    /**
    * Calls:
    * (200) GET:/products/{productName}/configurations
    */
    @Test(timeout = 60000)
    public void test_1_getOnConfigurationsReturnsEmptyList() throws Exception {
        
        given().accept("application/json")
                .header("x-EMextraHeader123", "_EM_17_XYZ_")
                .get(baseUrlOfSut + "/products/_EM_16_XYZ_/configurations")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    /**
    * Calls:
    * (201) POST:/products/{productName}
    */
    @Test(timeout = 60000)
    public void test_2_postOnProductReturns201UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PRODUCT", 22L)
                .d("NAME", "\"p7Nwlu1PnbDP2\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 21L)
                .d("NAME", "\"U1dxctGsfaBYC\"")
                .d("VALID", "false")
                .d("PRODUCT_ID", "NULL")
            .and().insertInto("PRODUCT", 48L)
                .d("NAME", "\"NUU5\"")
            .and().insertInto("CONSTRAINT_EXCLUDES", 47L)
                .d("ID", "575")
                .d("FOR_PRODUCT_ID", "NULL")
                .d("EXCLUDED_FEATURE_NAME", "\"\"")
                .d("SOURCE_FEATURE_NAME", "\"\"")
            .and().insertInto("PRODUCT", 50L)
                .d("NAME", "\"A2I6_6jHu7\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 49L)
                .d("ID", "-512")
                .r("FOR_PRODUCT_ID", 22L)
                .d("REQUIRED_FEATURE_NAME", "\"_EM_82_XYZ_\"")
                .d("SOURCE_FEATURE_NAME", "\"_EM_85_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .post(baseUrlOfSut + "/products/r_11jDUKa")
                .then()
                .statusCode(201)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    /**
    * Calls:
    * (204) GET:/products/{productName}/configurations/{configurationName}
    */
    @Test(timeout = 60000)
    public void test_3_getOnConfigurReturns204() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_5_XYZ_")
                .get(baseUrlOfSut + "/products/_EM_4_XYZ_/configurations/NPXTqJVLVZ?EMextraParam123=42")
                .then()
                .statusCode(204)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    /**
    * Calls:
    * (204) DELETE:/products/{productName}/constraints/{constraintId}
    */
    @Test(timeout = 60000)
    public void test_4_deleteOnConstraintReturns204() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_11_XYZ_")
                .delete(baseUrlOfSut + "/products/_EM_9_XYZ_/constraints/869")
                .then()
                .statusCode(204)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    /**
    * Calls:
    * (204) DELETE:/products/{productName}/constraints/{constraintId}
    */
    @Test(timeout = 60000)
    public void test_5_deleteOnConstraintReturns204UsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PRODUCT", 22L)
                .d("NAME", "\"p7Nwlu1PnbDP2\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 21L)
                .d("NAME", "\"U1dxctGsfaBYC\"")
                .d("VALID", "false")
                .d("PRODUCT_ID", "NULL")
            .and().insertInto("PRODUCT", 48L)
                .d("NAME", "\"NUU5\"")
            .and().insertInto("CONSTRAINT_EXCLUDES", 47L)
                .d("ID", "575")
                .d("FOR_PRODUCT_ID", "NULL")
                .d("EXCLUDED_FEATURE_NAME", "\"\"")
                .d("SOURCE_FEATURE_NAME", "\"\"")
            .and().insertInto("PRODUCT", 50L)
                .d("NAME", "\"A2I6_6jHu7\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 49L)
                .d("ID", "-512")
                .r("FOR_PRODUCT_ID", 22L)
                .d("REQUIRED_FEATURE_NAME", "\"_EM_82_XYZ_\"")
                .d("SOURCE_FEATURE_NAME", "\"_EM_85_XYZ_\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .delete(baseUrlOfSut + "/products/r_11jDUKa/constraints/-4193447")
                .then()
                .statusCode(204)
                .assertThat()
                .body(isEmptyOrNullString());
    }


}
