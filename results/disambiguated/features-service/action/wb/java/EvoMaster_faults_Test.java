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
*  This file was automatically generated by EvoMaster on 2024-11-06T22:48:30.927-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 18 tests
 * <br>
*  Covered targets: 88
 * <br>
*  Used time: 0h 10m 4s
 * <br>
*  Needed budget for current results: 76%
 * <br>
*  This file contains test cases that are likely to indicate faults.
*/
public class EvoMaster_faults_Test {

    
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
        controller.resetDatabase(Arrays.asList("CONSTRAINT_EXCLUDES","CONSTRAINT_REQUIRES","FEATURE","PRODUCT","PRODUCT_CONFIGURATION","PRODUCT_CONFIGURATION_ACTIVED_FEATURES","product"));
        controller.resetStateOfSUT();
    }
    
    
    
    
    @Test(timeout = 60000)
    public void test_0_deleteOnFeaturCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName DELETE:/products/{productName}/features/{featureName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .delete(baseUrlOfSut + "/products/q2QqUS/features/_EM_4_XYZ_")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_1_getOnProductFeaturesCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName GET:/products/{productName}/features
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/products/4N9T1r3I3j8PXFcu/features?EMextraParam123=42")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_2_getOnProductCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName GET:/products/{productName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/products/FU9wCaqhTamYZX")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_3_deleteOnProductCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName DELETE:/products/{productName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .delete(baseUrlOfSut + "/products/QJrz8zGCwD9G_Bm?EMextraParam123=_EM_12_XYZ_")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_4_postOnConfigurCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName POST:/products/{productName}/configurations/{configurationName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .post(baseUrlOfSut + "/products/GZeK/configurations/_EM_20_XYZ_")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_5_postOnProductCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_64_insert POST:/products/{productName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_29_XYZ_")
                .post(baseUrlOfSut + "/products/D8iVL?EMextraParam123=_EM_28_XYZ_")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_64_insert
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_6_postOnProductCauses500_internalServerErrorUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PRODUCT", 61L)
                .d("NAME", "\"Y82eyvZ9Kte\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 60L)
                .d("NAME", "\"_EM_176_XYZ_\"")
                .d("VALID", "false")
                .d("PRODUCT_ID", "NULL")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        // Fault100. HTTP Status 500. org/javiermf/features/services/rest/ProductsResource_58_addProduct POST:/products/{productName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .post(baseUrlOfSut + "/products/KDQM%7C3")
                .then()
                .statusCode(500)// org/javiermf/features/services/rest/ProductsResource_58_addProduct
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_7_getOnConfigurFeaturesCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/services/ProductsConfigurationsService_46_getConfigurationActivedFeaturesNames GET:/products/{productName}/configurations/{configurationName}/features
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/products/PHEVw/configurations/_EM_3_XYZ_/features?EMextraParam123=42")
                .then()
                .statusCode(500)// org/javiermf/features/services/ProductsConfigurationsService_46_getConfigurationActivedFeaturesNames
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_8_deleteOnConfigurCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsConfigurationsDAO_71_deleteConfigurationForProduct DELETE:/products/{productName}/configurations/{configurationName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .delete(baseUrlOfSut + "/products/jxKYIpid/configurations/_EM_9_XYZ_")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsConfigurationsDAO_71_deleteConfigurationForProduct
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_9_postOnProductFeaturCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName POST:/products/{productName}/features/{featureName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .contentType("application/x-www-form-urlencoded")
                .body("description=_EM_19_XYZ_")
                .post(baseUrlOfSut + "/products/6wWYAZ/features/_EM_18_XYZ_")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_10_putOnFeaturCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName PUT:/products/{productName}/features/{featureName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .contentType("application/x-www-form-urlencoded")
                .body("description=_EM_33_XYZ_")
                .put(baseUrlOfSut + "/products/7BOywZM8xNV/features/_EM_32_XYZ_")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_11_getOnFeaturesWithQueryParamCauses500_internalServerErrorUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PRODUCT", 19L)
                .d("NAME", "\"xk\"")
            .and().insertInto("CONSTRAINT_EXCLUDES", 18L)
                .d("ID", "-6867237680777912320")
                .d("FOR_PRODUCT_ID", "NULL")
                .d("EXCLUDED_FEATURE_NAME", "\"CObkpE1W2pxeK1\"")
                .d("SOURCE_FEATURE_NAME", "\"ZPT0m\"")
            .and().insertInto("PRODUCT", 21L)
                .d("NAME", "\"0JVDcR7gyC_\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 20L)
                .d("ID", "323")
                .r("FOR_PRODUCT_ID", 21L)
                .d("REQUIRED_FEATURE_NAME", "\"u6pk8uVNe\"")
                .d("SOURCE_FEATURE_NAME", "\"6k\"")
            .and().insertInto("PRODUCT", 75L)
                .d("NAME", "\"e\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 74L)
                .d("NAME", "\"5Icc6eBTd7rvpW\"")
                .d("VALID", "true")
                .d("PRODUCT_ID", "NULL")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        // Fault100. HTTP Status 500. org/javiermf/features/services/ProductsConfigurationsService_46_getConfigurationActivedFeaturesNames GET:/products/{productName}/configurations/{configurationName}/features
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/products/E5O/configurations/_EM_207_XYZ_/features")
                .then()
                .statusCode(500)// org/javiermf/features/services/ProductsConfigurationsService_46_getConfigurationActivedFeaturesNames
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_12_getOnFeaturesWithQueryParamCauses500_internalServerErrorUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PRODUCT", 65L)
                .d("NAME", "\"KfmAV\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 64L)
                .d("NAME", "\"veD0\"")
                .d("VALID", "NULL")
                .d("PRODUCT_ID", "1")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        // Fault100. HTTP Status 500. org/javiermf/features/services/ProductsConfigurationsService_46_getConfigurationActivedFeaturesNames GET:/products/{productName}/configurations/{configurationName}/features
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/products/PHEVw/configurations/PHEVw/features")
                .then()
                .statusCode(500)// org/javiermf/features/services/ProductsConfigurationsService_46_getConfigurationActivedFeaturesNames
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_13_postOnConfigurFeaturCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/services/ProductsConfigurationsService_79_addFeatureFromConfiguration POST:/products/{productName}/configurations/{configurationName}/features/{featureName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .post(baseUrlOfSut + "/products/_EM_15_XYZ_/configurations/_EM_16_XYZ_/features/_EM_17_XYZ_")
                .then()
                .statusCode(500)// org/javiermf/features/services/ProductsConfigurationsService_79_addFeatureFromConfiguration
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_14_postOnRequiresCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName POST:/products/{productName}/constraints/requires
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .contentType("application/x-www-form-urlencoded")
                .body("sourceFeature=_EM_24_XYZ_")
                .post(baseUrlOfSut + "/products/_EM_23_XYZ_/constraints/requires?EMextraParam123=42")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_15_postOnExcludesCauses500_internalServerError() throws Exception {
        
        // Fault100. HTTP Status 500. org/javiermf/features/daos/ProductsDAO_41_findByName POST:/products/{productName}/constraints/excludes
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/x-www-form-urlencoded")
                .body("")
                .post(baseUrlOfSut + "/products/_EM_26_XYZ_/constraints/excludes?EMextraParam123=42")
                .then()
                .statusCode(500)// org/javiermf/features/daos/ProductsDAO_41_findByName
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_16_deleteOnFeaturWithQueryParamCauses500_internalServerErrorUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PRODUCT", 30L)
                .d("NAME", "\"2pdOqMPeE8lyI1Z4\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 29L)
                .d("NAME", "\"F\"")
                .d("VALID", "true")
                .d("PRODUCT_ID", "NULL")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        // Fault100. HTTP Status 500. org/javiermf/features/services/ProductsConfigurationsService_70_removeFeatureFromConfiguration DELETE:/products/{productName}/configurations/{configurationName}/features/{featureName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .delete(baseUrlOfSut + "/products/FMcMMLj4NBjie/configurations/UNIVERSITY_X/features/_EM_71_XYZ_")
                .then()
                .statusCode(500)// org/javiermf/features/services/ProductsConfigurationsService_70_removeFeatureFromConfiguration
                .assertThat()
                .contentType("text/html");
    }
    
    
    @Test(timeout = 60000)
    public void test_17_deleteOnFeaturWithQueryParamCauses500_internalServerErrorUsingSql() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("PRODUCT", 30L)
                .d("NAME", "\"2pdOqMPeE8lyI1Z4\"")
            .and().insertInto("PRODUCT_CONFIGURATION", 29L)
                .d("NAME", "\"F\"")
                .d("VALID", "true")
                .r("PRODUCT_ID", 30L)
            .and().insertInto("PRODUCT", 48L)
                .d("NAME", "\"YXZpCMevCiyH\"")
            .and().insertInto("CONSTRAINT_EXCLUDES", 47L)
                .d("ID", "310")
                .r("FOR_PRODUCT_ID", 48L)
                .d("EXCLUDED_FEATURE_NAME", "NULL")
                .d("SOURCE_FEATURE_NAME", "NULL")
            .and().insertInto("PRODUCT", 50L)
                .d("NAME", "\"7QpgxCi7MkU9taJ\"")
            .and().insertInto("CONSTRAINT_REQUIRES", 49L)
                .d("ID", "250")
                .d("FOR_PRODUCT_ID", "NULL")
                .d("REQUIRED_FEATURE_NAME", "\"_Di9tLS\"")
                .d("SOURCE_FEATURE_NAME", "NULL")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        // Fault100. HTTP Status 500. org/javiermf/features/services/ProductsConfigurationsService_70_removeFeatureFromConfiguration DELETE:/products/{productName}/configurations/{configurationName}/features/{featureName}
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .delete(baseUrlOfSut + "/products/FMcMMLj4NBjie/configurations/_EM_0_XYZ_/features/rOrLyaTkYTP")
                .then()
                .statusCode(500)// org/javiermf/features/services/ProductsConfigurationsService_70_removeFeatureFromConfiguration
                .assertThat()
                .contentType("text/html");
    }


}
