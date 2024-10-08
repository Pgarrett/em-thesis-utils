import  org.junit.AfterClass;
import  org.junit.BeforeClass;
import  org.junit.Before;
import  org.junit.Test;
import static org.junit.Assert.*;
import  java.util.Map;
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
*  This file was automatically generated by EvoMaster on 2024-10-06T13:07:50.038-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 13 tests
 * <br>
*  Covered targets: 39
 * <br>
*  Used time: 0h 10m 58s
 * <br>
*  Needed budget for current results: 92%
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
    
    
    
    
    
    
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/products/{productName}/configurations/{configurationName}
    // 			Action parameters:
    // 				productName: 'rYy9X_D1l1U'
    // 				configurationName: 'bB8q_ytQ'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:rYy9X_D1l1U
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = configurationName:bB8q_ytQ
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/products/{productName}/configurations/{configurationName}
    @Test(timeout = 60000)
    public void test_0_deleteOnConfigurCauses500_internalservererror() throws Exception {
        
        // Fault100. HTTP Status 500. DELETE:/products/{productName}/configurations/{configurationName}
        given().accept("*/*")
                .delete(baseUrlOfSut + "/products/rYy9X_D1l1U/configurations/bB8q_ytQ")
                .then()
                .statusCode(500)
                .assertThat()
                .contentType("text/html");
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/products/{productName}/configurations/{configurationName}/features
    // 			Action parameters:
    // 				productName: 'HTzvB0gT'
    // 				configurationName: 'XADY6'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:HTzvB0gT
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = configurationName:XADY6
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/products/{productName}/configurations/{configurationName}/features
    @Test(timeout = 60000)
    public void test_1_getOnFeaturesCauses500_internalservererror() throws Exception {
        
        // Fault100. HTTP Status 500. GET:/products/{productName}/configurations/{configurationName}/features
        given().accept("*/*")
                .get(baseUrlOfSut + "/products/HTzvB0gT/configurations/XADY6/features")
                .then()
                .statusCode(500)
                .assertThat()
                .contentType("text/html");
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: POST:/products/{productName}/constraints/requires
    // 			Action parameters:
    // 				productName: 'PRC'
    // 				body: '{"requiredFeature":"G"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:PRC
    // 				org.evomaster.core.search.gene.optional.OptionalGene = body:{"requiredFeature":"G"}
    // 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/x-www-form-urlencoded
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:false
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: POST:/products/{productName}/constraints/requires
    @Test(timeout = 60000)
    public void test_2_postOnRequiresCauses500_internalservererror() throws Exception {
        
        // Fault100. HTTP Status 500. POST:/products/{productName}/constraints/requires
        given().accept("*/*")
                .contentType("application/x-www-form-urlencoded")
                .body("requiredFeature=G")
                .post(baseUrlOfSut + "/products/PRC/constraints/requires")
                .then()
                .statusCode(500)
                .assertThat()
                .contentType("text/html");
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: POST:/products/{productName}/features/{featureName}
    // 			Action parameters:
    // 				productName: 'JBF76pJgxl'
    // 				featureName: '9AYtfhOXQNc6ey'
    // 				body: '{"description":"RTwkEPaMc"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:JBF76pJgxl
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = featureName:9AYtfhOXQNc6ey
    // 				org.evomaster.core.search.gene.optional.OptionalGene = body:{"description":"RTwkEPaMc"}
    // 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/x-www-form-urlencoded
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:true
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: POST:/products/{productName}/features/{featureName}
    @Test(timeout = 60000)
    public void test_3_postOnFeaturCauses500_internalservererror() throws Exception {
        
        // Fault100. HTTP Status 500. POST:/products/{productName}/features/{featureName}
        given().accept("*/*")
                .contentType("application/x-www-form-urlencoded")
                .body("description=RTwkEPaMc")
                .post(baseUrlOfSut + "/products/JBF76pJgxl/features/9AYtfhOXQNc6ey")
                .then()
                .statusCode(500)
                .assertThat()
                .contentType("text/html");
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: POST:/products/{productName}/constraints/excludes
    // 			Action parameters:
    // 				productName: 'uU6te8KxVyLKO9vJ'
    // 				body: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:uU6te8KxVyLKO9vJ
    // 				org.evomaster.core.search.gene.optional.OptionalGene = body:
    // 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/x-www-form-urlencoded
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:true
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: POST:/products/{productName}/constraints/excludes
    @Test(timeout = 60000)
    public void test_4_postOnExcludesCauses500_internalservererror() throws Exception {
        
        // Fault100. HTTP Status 500. POST:/products/{productName}/constraints/excludes
        given().accept("*/*")
                .contentType("application/x-www-form-urlencoded")
                .body("")
                .post(baseUrlOfSut + "/products/uU6te8KxVyLKO9vJ/constraints/excludes")
                .then()
                .statusCode(500)
                .assertThat()
                .contentType("text/html");
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: PUT:/products/{productName}/features/{featureName}
    // 			Action parameters:
    // 				productName: '18MRPifWfaJ'
    // 				featureName: 'x5'
    // 				body: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:18MRPifWfaJ
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = featureName:x5
    // 				org.evomaster.core.search.gene.optional.OptionalGene = body:
    // 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/x-www-form-urlencoded
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:true
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: PUT:/products/{productName}/features/{featureName}
    @Test(timeout = 60000)
    public void test_5_putOnFeaturCauses500_internalservererror() throws Exception {
        
        // Fault100. HTTP Status 500. PUT:/products/{productName}/features/{featureName}
        given().accept("*/*")
                .contentType("application/x-www-form-urlencoded")
                .body("")
                .put(baseUrlOfSut + "/products/18MRPifWfaJ/features/x5")
                .then()
                .statusCode(500)
                .assertThat()
                .contentType("text/html");
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/products/{productName}/features/{featureName}
    // 			Action parameters:
    // 				productName: 'G'
    // 				featureName: 'cI'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:G
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = featureName:cI
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/products/{productName}/features/{featureName}
    @Test(timeout = 60000)
    public void test_6_deleteOnFeaturCauses500_internalservererror() throws Exception {
        
        // Fault100. HTTP Status 500. DELETE:/products/{productName}/features/{featureName}
        given().accept("*/*")
                .delete(baseUrlOfSut + "/products/G/features/cI")
                .then()
                .statusCode(500)
                .assertThat()
                .contentType("text/html");
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/products/{productName}/features
    // 			Action parameters:
    // 				productName: 'TxIhQr3'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:TxIhQr3
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/products/{productName}/features
    @Test(timeout = 60000)
    public void test_7_getOnFeaturesCauses500_internalservererror() throws Exception {
        
        // Fault100. HTTP Status 500. GET:/products/{productName}/features
        given().accept("*/*")
                .get(baseUrlOfSut + "/products/TxIhQr3/features")
                .then()
                .statusCode(500)
                .assertThat()
                .contentType("text/html");
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/products/{productName}/configurations/{configurationName}/features/{featureName}
    // 			Action parameters:
    // 				productName: 'ma'
    // 				configurationName: 'WZKsZpRpJux3xUul'
    // 				featureName: 'gFUmbU_5I29V5v'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:ma
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = configurationName:WZKsZpRpJux3xUul
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = featureName:gFUmbU_5I29V5v
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/products/{productName}/configurations/{configurationName}/features/{featureName}
    @Test(timeout = 60000)
    public void test_8_deleteOnFeaturCauses500_internalservererror() throws Exception {
        
        // Fault100. HTTP Status 500. DELETE:/products/{productName}/configurations/{configurationName}/features/{featureName}
        given().accept("*/*")
                .delete(baseUrlOfSut + "/products/ma/configurations/WZKsZpRpJux3xUul/features/gFUmbU_5I29V5v")
                .then()
                .statusCode(500)
                .assertThat()
                .contentType("text/html");
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: POST:/products/{productName}/configurations/{configurationName}/features/{featureName}
    // 			Action parameters:
    // 				productName: 'noUlZ1P70efw'
    // 				configurationName: 'kxogpbCaa33PjO'
    // 				featureName: 'GKCTQj'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:noUlZ1P70efw
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = configurationName:kxogpbCaa33PjO
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = featureName:GKCTQj
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: POST:/products/{productName}/configurations/{configurationName}/features/{featureName}
    @Test(timeout = 60000)
    public void test_9_postOnFeaturCauses500_internalservererror() throws Exception {
        
        // Fault100. HTTP Status 500. POST:/products/{productName}/configurations/{configurationName}/features/{featureName}
        given().accept("*/*")
                .post(baseUrlOfSut + "/products/noUlZ1P70efw/configurations/kxogpbCaa33PjO/features/GKCTQj")
                .then()
                .statusCode(500)
                .assertThat()
                .contentType("text/html");
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/products/{productName}
    // 			Action parameters:
    // 				productName: 'h1Wz1G0eArdbWe'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:h1Wz1G0eArdbWe
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/products/{productName}
    @Test(timeout = 60000)
    public void test_10_deleteOnProductCauses500_internalservererror() throws Exception {
        
        // Fault100. HTTP Status 500. DELETE:/products/{productName}
        given().accept("*/*")
                .delete(baseUrlOfSut + "/products/h1Wz1G0eArdbWe")
                .then()
                .statusCode(500)
                .assertThat()
                .contentType("text/html");
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: POST:/products/{productName}/configurations/{configurationName}
    // 			Action parameters:
    // 				productName: '4JrH0E7SlLF'
    // 				configurationName: 'UhdGZwIDH48c8'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:4JrH0E7SlLF
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = configurationName:UhdGZwIDH48c8
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: POST:/products/{productName}/configurations/{configurationName}
    @Test(timeout = 60000)
    public void test_11_postOnConfigurCauses500_internalservererror() throws Exception {
        
        // Fault100. HTTP Status 500. POST:/products/{productName}/configurations/{configurationName}
        given().accept("*/*")
                .post(baseUrlOfSut + "/products/4JrH0E7SlLF/configurations/UhdGZwIDH48c8")
                .then()
                .statusCode(500)
                .assertThat()
                .contentType("text/html");
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/products/{productName}
    // 			Action parameters:
    // 				productName: '1eVo'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:1eVo
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/products/{productName}
    @Test(timeout = 60000)
    public void test_12_getOnProductCauses500_internalservererror() throws Exception {
        
        // Fault100. HTTP Status 500. GET:/products/{productName}
        given().accept("*/*")
                .get(baseUrlOfSut + "/products/1eVo")
                .then()
                .statusCode(500)
                .assertThat()
                .contentType("text/html");
    }


}
