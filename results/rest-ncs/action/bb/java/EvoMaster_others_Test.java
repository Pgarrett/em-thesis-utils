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
*  This file was automatically generated by EvoMaster on 2024-10-06T14:24:28.071-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 4 tests
 * <br>
*  Covered targets: 4
 * <br>
*  Used time: 0h 10m 36s
 * <br>
*  Needed budget for current results: 86%
 * <br>
*  This file contains test cases that represent failed calls, but not indicative of faults.
*/
public class EvoMaster_others_Test {

    
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
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/remainder/{a}/{b}
    // 			Action parameters:
    // 				a: '1300781636'
    // 				b: '180'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = a:1300781636
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = b:180
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/remainder/{a}/{b}
    @Test(timeout = 60000)
    public void test_0_getOnRemaindReturns400() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/remainder/1300781636/180")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/bessj/{n}/{x}
    // 			Action parameters:
    // 				n: '-355882137'
    // 				x: '0.9684043673738557'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = n:-355882137
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x:0.9684043673738557
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/bessj/{n}/{x}
    @Test(timeout = 60000)
    public void test_1_getOnBessjReturns400() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/bessj/-355882137/0.9684043673738557")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/fisher/{m}/{n}/{x}
    // 			Action parameters:
    // 				m: '670'
    // 				n: '1246314814'
    // 				x: '0.05650406232817817'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = m:670
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = n:1246314814
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x:0.05650406232817817
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/fisher/{m}/{n}/{x}
    @Test(timeout = 60000)
    public void test_2_getOnFisherReturns400() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/fisher/670/1246314814/0.05650406232817817")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/expint/{n}/{x}
    // 			Action parameters:
    // 				n: '-1298221259'
    // 				x: '0.15223963609533298'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = n:-1298221259
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x:0.15223963609533298
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/expint/{n}/{x}
    @Test(timeout = 60000)
    public void test_3_getOnExpintReturns400() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/api/expint/-1298221259/0.15223963609533298")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }


}
