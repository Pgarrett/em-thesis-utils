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
*  This file was automatically generated by EvoMaster on 2024-10-10T21:46:55.408-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 18 tests
 * <br>
*  Covered targets: 18
 * <br>
*  Used time: 0h 10m 0s
 * <br>
*  Needed budget for current results: 71%
 * <br>
*  This file contains test cases that represent failed calls, but not indicative of faults.
*/
public class EvoMaster_others_Test {

    
    private static final SutHandler controller = new em.embedded.org.restscs.EmbeddedEvoMasterController();
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
        controller.resetStateOfSUT();
    }
    
    
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/text2txt/{word1}/{word2}/{word3}
    // 			Action parameters:
    // 				word1: '{W\I'
    // 				word2: '_EM_1880_XYZ_'
    // 				word3: '_EM_1508_XYZ_'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = word1:{W\I
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = word2:_EM_1880_XYZ_
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = word3:_EM_1508_XYZ_
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/text2txt/{word1}/{word2}/{word3}
    @Test(timeout = 60000)
    public void test_0_getOnText2txtReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/text2txt/%7BW%5CI/_EM_1880_XYZ_/_EM_1508_XYZ_")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/cookie/{name}/{val}/{site}
    // 			Action parameters:
    // 				name: '\_wXtOE'
    // 				site: '_EM_2092_XYZ_'
    // 				val: 'E'
    // 				EMextraParam123: '42'
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = name:\_wXtOE
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = site:_EM_2092_XYZ_
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = val:E
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:42
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/cookie/{name}/{val}/{site}
    @Test(timeout = 60000)
    public void test_1_getOnCookiReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/cookie/%5C_wXtOE/E/_EM_2092_XYZ_?EMextraParam123=42")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/dateparse/{dayname}/{monthname}
    // 			Action parameters:
    // 				dayname: 'Y\U'
    // 				monthname: 'iVx'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: '_EM_2494_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = dayname:Y\U
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = monthname:iVx
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:_EM_2494_XYZ_
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/dateparse/{dayname}/{monthname}
    @Test(timeout = 60000)
    public void test_2_getOnDateparsReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_2494_XYZ_")
                .get(baseUrlOfSut + "/api/dateparse/Y%5CU/iVx")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/notypevar/{i}/{s}
    // 			Action parameters:
    // 				i: '256'
    // 				s: 'irh`HK6_\ITx4'
    // 				EMextraParam123: '42'
    // 				x-EMextraHeader123: '_EM_1335_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = i:256
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = s:irh`HK6_\ITx4
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:42
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:_EM_1335_XYZ_
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/notypevar/{i}/{s}
    @Test(timeout = 60000)
    public void test_3_getOnNotypevarReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_1335_XYZ_")
                .get(baseUrlOfSut + "/api/notypevar/256/irh%60HK6_%5CITx4?EMextraParam123=42")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/ordered4/{w}/{x}/{z}/{y}
    // 			Action parameters:
    // 				w: '_EM_10038_XYZ_'
    // 				x: 'am8o2R'
    // 				y: 'vo_x2n\Fa'
    // 				z: '_EM_10039_XYZ_'
    // 				EMextraParam123: '_EM_9842_XYZ_'
    // 				x-EMextraHeader123: '42'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = w:_EM_10038_XYZ_
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x:am8o2R
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = y:vo_x2n\Fa
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = z:_EM_10039_XYZ_
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:_EM_9842_XYZ_
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:42
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/ordered4/{w}/{x}/{z}/{y}
    @Test(timeout = 60000)
    public void test_4_getOnOrdered4Returns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/ordered4/_EM_10038_XYZ_/am8o2R/_EM_10039_XYZ_/vo_x2n%5CFa?EMextraParam123=_EM_9842_XYZ_")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/title/{sex}/{title}
    // 			Action parameters:
    // 				sex: '_EM_14974_XYZ_'
    // 				title: 'LiY\dJO5'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sex:_EM_14974_XYZ_
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = title:LiY\dJO5
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/title/{sex}/{title}
    @Test(timeout = 60000)
    public void test_5_getOnTitlReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/_EM_14974_XYZ_/LiY%5CdJO5")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/calc/{op}/{arg1}/{arg2}
    // 			Action parameters:
    // 				arg1: '-6.109347763008651E307'
    // 				arg2: '1.1235582092889472E308'
    // 				op: '\DVAAO'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = arg1:-6.109347763008651E307
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = arg2:1.1235582092889472E308
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = op:\DVAAO
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/calc/{op}/{arg1}/{arg2}
    @Test(timeout = 60000)
    public void test_6_getOnCalcReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/calc/%5CDVAAO/-6.109347763008651E307/1.1235582092889472E308")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/pat/{txt}/{pat}
    // 			Action parameters:
    // 				pat: 'RUO'
    // 				txt: 'RdiW\f'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = pat:RUO
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = txt:RdiW\f
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/pat/{txt}/{pat}
    @Test(timeout = 60000)
    public void test_7_getOnPatReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/RdiW%5Cf/RUO")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/costfuns/{i}/{s}
    // 			Action parameters:
    // 				i: '0'
    // 				s: '\QP5T9jysm'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = i:0
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = s:\QP5T9jysm
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/costfuns/{i}/{s}
    @Test(timeout = 60000)
    public void test_8_getOnCostfunReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/costfuns/0/%5CQP5T9jysm")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/filesuffix/{directory}/{file}
    // 			Action parameters:
    // 				directory: 'L\3'
    // 				file: '_EM_12889_XYZ_'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = directory:L\3
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = file:_EM_12889_XYZ_
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/filesuffix/{directory}/{file}
    @Test(timeout = 60000)
    public void test_9_getOnFilesuffixReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/filesuffix/L%5C3/_EM_12889_XYZ_")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/pat/{txt}
    // 			Action parameters:
    // 				txt: 'b\\pQ'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = txt:b\\pQ
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/pat/{txt}
    @Test(timeout = 60000)
    public void test_10_getOnPatReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/b%5C%5CpQ")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/dateparse/{dayname}/{monthname}
    // 			Action parameters:
    // 				dayname: 'XVRh'
    // 				monthname: ';bMU0W2yjkH_'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: '42'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = dayname:XVRh
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = monthname:;bMU0W2yjkH_
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:42
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/dateparse/{dayname}/{monthname}
    @Test(timeout = 60000)
    public void test_11_getOnDateparsReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/dateparse/XVRh/;bMU0W2yjkH_")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/dateparse/XVRh/;bMU0W2yjkH_"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/text2txt/{word1}/{word2}/{word3}
    // 			Action parameters:
    // 				word1: 'aQc'
    // 				word2: '_EM_8802_XYZ_'
    // 				word3: ';batt'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = word1:aQc
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = word2:_EM_8802_XYZ_
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = word3:;batt
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/text2txt/{word1}/{word2}/{word3}
    @Test(timeout = 60000)
    public void test_12_getOnText2txtReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/text2txt/aQc/_EM_8802_XYZ_/;batt")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/text2txt/aQc/_EM_8802_XYZ_/;batt"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/filesuffix/{directory}/{file}
    // 			Action parameters:
    // 				directory: '776fPoEdNxjG3Fh'
    // 				file: ';'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = directory:776fPoEdNxjG3Fh
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = file:;
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/filesuffix/{directory}/{file}
    @Test(timeout = 60000)
    public void test_13_getOnFilesuffixReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/filesuffix/776fPoEdNxjG3Fh/;")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/filesuffix/776fPoEdNxjG3Fh/;"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/pat/{txt}
    // 			Action parameters:
    // 				txt: 'http//:s97/v'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = txt:http//:s97/v
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/pat/{txt}
    @Test(timeout = 60000)
    public void test_14_getOnPatReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/http//:s97/v")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/http//:s97/v"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/title/{sex}/{title}
    // 			Action parameters:
    // 				sex: ';D'
    // 				title: 'N0XVyObZ7kUZ'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sex:;D
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = title:N0XVyObZ7kUZ
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/title/{sex}/{title}
    @Test(timeout = 60000)
    public void test_15_getOnTitlReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/;D/N0XVyObZ7kUZ")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/title/;D/N0XVyObZ7kUZ"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/cookie/{name}/{val}/{site}
    // 			Action parameters:
    // 				name: ';VO5'
    // 				site: 'Hy1vPWdTWFHp1f'
    // 				val: 'RKpMkVq0i3oTm1d'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = name:;VO5
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = site:Hy1vPWdTWFHp1f
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = val:RKpMkVq0i3oTm1d
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/cookie/{name}/{val}/{site}
    @Test(timeout = 60000)
    public void test_16_getOnCookiReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/cookie/;VO5/RKpMkVq0i3oTm1d/Hy1vPWdTWFHp1f")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/cookie/;VO5/RKpMkVq0i3oTm1d/Hy1vPWdTWFHp1f"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/ordered4/{w}/{x}/{z}/{y}
    // 			Action parameters:
    // 				w: '_EM_52063_XYZ_'
    // 				x: '_EM_19238_XYZ_'
    // 				y: ';5y6j8_QuL7'
    // 				z: '_EM_19240_XYZ_'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = w:_EM_52063_XYZ_
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x:_EM_19238_XYZ_
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = y:;5y6j8_QuL7
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = z:_EM_19240_XYZ_
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/ordered4/{w}/{x}/{z}/{y}
    @Test(timeout = 60000)
    public void test_17_getOnOrdered4Returns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/ordered4/_EM_52063_XYZ_/_EM_19238_XYZ_/_EM_19240_XYZ_/;5y6j8_QuL7")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/ordered4/_EM_52063_XYZ_/_EM_19238_XYZ_/_EM_19240_XYZ_/;5y6j8_QuL7"));
    }


}