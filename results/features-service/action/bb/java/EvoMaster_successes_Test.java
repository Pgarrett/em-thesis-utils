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
*  This file was automatically generated by EvoMaster on 2024-10-06T13:07:50.051-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 6 tests
 * <br>
*  Covered targets: 12
 * <br>
*  Used time: 0h 10m 58s
 * <br>
*  Needed budget for current results: 92%
 * <br>
*  This file contains test cases that represent successful calls.
*/
public class EvoMaster_successes_Test {

    
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
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/products/{productName}/configurations
    // 			Action parameters:
    // 				productName: 'WRdP'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:WRdP
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/products/{productName}/configurations
    @Test(timeout = 60000)
    public void test_0_getOnConfigurationsReturns200() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/products/WRdP/configurations")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(0));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/products
    // 			Action parameters:
    // 			Genes:
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/products
    @Test(timeout = 60000)
    public void test_1_getOnProductsReturns200() throws Exception {
        
        given().accept("application/json")
                .get(baseUrlOfSut + "/products")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("size()", equalTo(90))
                .body("", hasItems("ELEARNING_SITE", "h3yK", "j34TyA9a", "5xbHkD4qYMUx6", "BQZawY", "vS77JZ3QaFtYL", "O_4dI", "kEx", "V2DGRG", "6qTjf3NZH", "xKZSX4y", "Dn", "debXwq3xEBG8", "ToifK", "O_kLCrPJ1keZv", "v61F2atYLmcz", "CvzR2XTTkCEdxW", "BeI2wH", "8t0MbkF8a9bhSyc", "4JVbp", "_juTayql", "8k4WfF", "V8JjZ3dcgMyD", "9RYSkWeS", "G1W", "pQjD2", "OfnY6Xk", "A", "BQZawY", "BQZawY", "WOjs", "3ugXHs9_okCYuiib", "rqsT", "Y4", "9EMRtGIqFmn3", "Wk61Ya5V", "5LLlD", "j8KaPLCl", "VCIY9YcsU", "SwlW01V0", "bez6C", "J_", "NVEvMaGX5A", "gnBHkbimh1", "iTj7cJ4F", "o", "P", "4a", "ba", "ndfRrtxudhBdq", "g1CmpqJlsQ8SaTlk", "wLzwZqxzwjW0i", "liqI9_JFV4sDSNnu", "WOjs", "WOjs", "W_pCmdj", "rdOkBuBc", "rZoe8hCAKS6", "1ZfYZqBuJ7dddvty", "gYkjru4YMJoQaPN", "b4B3Dx", "r3nfWhYaEllS", "pZYbUjf6vmj", "4e2YkpOPvho2", "71APDHQtdvhC", "WyH", "W3jNkSbLUjV6zMgK", "jSyE8Kdvr", "hl", "dbZ3vmwSe", "s22Cuxq", "fNvKWcqet", "5P0i", "6pUmKDuwgkIB", "zBcHkv31EtvT", "k6i", "v9xvT4xilep", "O1MPE878nr", "4jvVCAgrpsMtq26", "2nLvY0pka6oyfEt", "kBOI9rZc", "BFF80zxw72i", "pRavj9T", "azZrQ", "vX6k2Ws0INpN", "B9TpFrT", "Duvg3aVd63TaIf", "9ORVObqMoihKLmtx", "v9xvT4xilep", "hl"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/swagger.json
    // 			Action parameters:
    // 			Genes:
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/swagger.json
    @Test(timeout = 60000)
    public void test_2_getOnSwagger_jsonReturns200() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/swagger.json")
                .then()
                .statusCode(200);
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: POST:/products/{productName}
    // 			Action parameters:
    // 				productName: 'v9xvT4xilep'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:v9xvT4xilep
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: POST:/products/{productName}
    @Test(timeout = 60000)
    public void test_3_postOnProductReturns201() throws Exception {
        
        given().accept("*/*")
                .post(baseUrlOfSut + "/products/v9xvT4xilep")
                .then()
                .statusCode(201)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/products/{productName}/configurations/{configurationName}
    // 			Action parameters:
    // 				productName: 'AXj8isFW3zK'
    // 				configurationName: 'v1P2and'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:AXj8isFW3zK
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = configurationName:v1P2and
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/products/{productName}/configurations/{configurationName}
    @Test(timeout = 60000)
    public void test_4_getOnConfigurReturns204() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/products/AXj8isFW3zK/configurations/v1P2and")
                .then()
                .statusCode(204)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/products/{productName}/constraints/{constraintId}
    // 			Action parameters:
    // 				productName: 'Qj'
    // 				constraintId: '2026552682'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = productName:Qj
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = constraintId:2026552682
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/products/{productName}/constraints/{constraintId}
    @Test(timeout = 60000)
    public void test_5_deleteOnConstraintReturns204() throws Exception {
        
        given().accept("*/*")
                .delete(baseUrlOfSut + "/products/Qj/constraints/2026552682")
                .then()
                .statusCode(204)
                .assertThat()
                .body(isEmptyOrNullString());
    }


}
