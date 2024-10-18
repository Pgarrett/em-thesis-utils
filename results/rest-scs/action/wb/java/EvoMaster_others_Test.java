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
*  This file was automatically generated by EvoMaster on 2024-10-18T14:06:33.516-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 19 tests
 * <br>
*  Covered targets: 19
 * <br>
*  Used time: 0h 10m 1s
 * <br>
*  Needed budget for current results: 77%
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
    // 				word1: '_EM_2163_XYZ_'
    // 				word2: 'WEU_U0UU_`\Z_'
    // 				word3: 'HQUi6hSS1A'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: '_EM_1059_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = word1:'_EM_2163_XYZ_'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = word2:'WEU_U0UU_`\Z_'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = word3:'HQUi6hSS1A'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:'_EM_1059_XYZ_'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/text2txt/{word1}/{word2}/{word3}
    @Test(timeout = 60000)
    public void test_0_getOnText2txtReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_1059_XYZ_")
                .get(baseUrlOfSut + "/api/text2txt/_EM_2163_XYZ_/WEU_U0UU_%60%5CZ_/HQUi6hSS1A")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/cookie/{name}/{val}/{site}
    // 			Action parameters:
    // 				name: 'session'
    // 				site: 'QHys84\W\WWW,'
    // 				val: 'am'
    // 				EMextraParam123: '42'
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = name:'session'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = site:'QHys84\W\WWW,'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = val:'am'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:'42'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/cookie/{name}/{val}/{site}
    @Test(timeout = 60000)
    public void test_1_getOnCookiReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/cookie/session/am/QHys84%5CW%5CWWW,?EMextraParam123=42")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/dateparse/{dayname}/{monthname}
    // 			Action parameters:
    // 				dayname: 'p_\>'
    // 				monthname: 'mar'
    // 				EMextraParam123: '_EM_32_XYZ_'
    // 				x-EMextraHeader123: '_EM_33_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = dayname:'p_\>'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = monthname:'mar'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:'_EM_32_XYZ_'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:'_EM_33_XYZ_'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/dateparse/{dayname}/{monthname}
    @Test(timeout = 60000)
    public void test_2_getOnDateparsReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_33_XYZ_")
                .get(baseUrlOfSut + "/api/dateparse/p_%5C%3E/mar?EMextraParam123=_EM_32_XYZ_")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/pat/{txt}
    // 			Action parameters:
    // 				txt: 'D\sv1Lf'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = txt:'D\sv1Lf'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/pat/{txt}
    @Test(timeout = 60000)
    public void test_3_getOnApiPatReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/D%5Csv1Lf")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/title/{sex}/{title}
    // 			Action parameters:
    // 				sex: '_EM_12400_XYZ_'
    // 				title: 'D\xV__r6YRY'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sex:'_EM_12400_XYZ_'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = title:'D\xV__r6YRY'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/title/{sex}/{title}
    @Test(timeout = 60000)
    public void test_4_getOnTitlReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/_EM_12400_XYZ_/D%5CxV__r6YRY")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/calc/{op}/{arg1}/{arg2}
    // 			Action parameters:
    // 				arg1: '-5.951642009672825'
    // 				arg2: '0.350693714191'
    // 				op: 'O\'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = arg1:'-5.951642009672825'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = arg2:'0.350693714191'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = op:'O\'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/calc/{op}/{arg1}/{arg2}
    @Test(timeout = 60000)
    public void test_5_getOnCalcReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/calc/O%5C/-5.951642009672825/0.350693714191")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/ordered4/{w}/{x}/{z}/{y}
    // 			Action parameters:
    // 				w: 'muI'
    // 				x: '6'
    // 				y: 'bgLqp__M6\ZFXzhd'
    // 				z: 'IVo5JwaGDzHjX9'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = w:'muI'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x:'6'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = y:'bgLqp__M6\ZFXzhd'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = z:'IVo5JwaGDzHjX9'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/ordered4/{w}/{x}/{z}/{y}
    @Test(timeout = 60000)
    public void test_6_getOnOrdered4Returns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/ordered4/muI/6/IVo5JwaGDzHjX9/bgLqp__M6%5CZFXzhd")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/pat/{txt}/{pat}
    // 			Action parameters:
    // 				pat: '9KGaGNxw\'
    // 				txt: '_5soIwxNG_GG9'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = pat:'9KGaGNxw\'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = txt:'_5soIwxNG_GG9'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/pat/{txt}/{pat}
    @Test(timeout = 60000)
    public void test_7_getOnPatWithUriParams__9KGaGNxw___5soIwxNG_GG9_Returns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/_5soIwxNG_GG9/9KGaGNxw%5C")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/notypevar/{i}/{s}
    // 			Action parameters:
    // 				i: '-1332883783'
    // 				s: '\'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = i:'-1332883783'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = s:'\'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/notypevar/{i}/{s}
    @Test(timeout = 60000)
    public void test_8_getOnNotypevarReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/notypevar/-1332883783/%5C")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/costfuns/{i}/{s}
    // 			Action parameters:
    // 				i: '8549'
    // 				s: 'ihnMY7i\hzY'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = i:'8549'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = s:'ihnMY7i\hzY'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/costfuns/{i}/{s}
    @Test(timeout = 60000)
    public void test_9_getOnCostfunReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/costfuns/8549/ihnMY7i%5ChzY")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/filesuffix/{directory}/{file}
    // 			Action parameters:
    // 				directory: 'K3Q'
    // 				file: '_EM_]4931_XY\_'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = directory:'K3Q'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = file:'_EM_]4931_XY\_'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/filesuffix/{directory}/{file}
    @Test(timeout = 60000)
    public void test_10_getOnFilesuffixReturns400() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/filesuffix/K3Q/_EM_%5D4931_XY%5C_")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/text2txt/{word1}/{word2}/{word3}
    // 			Action parameters:
    // 				word1: '_EM_7278_XYZ_'
    // 				word2: '_EM_1027_XYZ_'
    // 				word3: 'eCpO1hLu26'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: '42'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = word1:'_EM_7278_XYZ_'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = word2:'_EM_1027_XYZ_'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = word3:'eCpO1hLu26'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:'42'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/text2txt/{word1}/{word2}/{word3}
    @Test(timeout = 60000)
    public void test_11_getOnText2txtReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/text2txt/_EM_7278_XYZ_/_EM_1027_XYZ_/eCpO1hLu%C2%8526")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/text2txt/_EM_7278_XYZ_/_EM_1027_XYZ_/eCpO1hLu%C2%8526"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/pat/{txt}
    // 			Action parameters:
    // 				txt: 'gopher//:r/sn'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: '_EM_3825_XYZ_'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = txt:'gopher//:r/sn'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:'_EM_3825_XYZ_'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/pat/{txt}
    @Test(timeout = 60000)
    public void test_12_getOnPatReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_3825_XYZ_")
                .get(baseUrlOfSut + "/api/pat/gopher//:r/sn")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/pat/gopher//:r/sn"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/title/{sex}/{title}
    // 			Action parameters:
    // 				sex: 'BPHfC'
    // 				title: ';H'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sex:'BPHfC'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = title:';H'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/title/{sex}/{title}
    @Test(timeout = 60000)
    public void test_13_getOnTitlReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/BPHfC/;H")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/title/BPHfC/;H"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/ordered4/{w}/{x}/{z}/{y}
    // 			Action parameters:
    // 				w: 'g`nlbN'
    // 				x: '_EM_26640_XYZ_'
    // 				y: 'e_e7`'
    // 				z: ';>U:L;5yW8'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = w:'g`nlbN'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x:'_EM_26640_XYZ_'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = y:'e_e7`'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = z:';>U:L;5yW8'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/ordered4/{w}/{x}/{z}/{y}
    @Test(timeout = 60000)
    public void test_14_getOnOrdered4Returns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/ordered4/g%60nlbN/_EM_26640_XYZ_/;%3EU:L;5yW8/e_e7%60")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/ordered4/g%60nlbN/_EM_26640_XYZ_/;%3EU:L;5yW8/e_e7%60"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/cookie/{name}/{val}/{site}
    // 			Action parameters:
    // 				name: 'session'
    // 				site: ';iCE'
    // 				val: 'am'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = name:'session'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = site:';iCE'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = val:'am'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/cookie/{name}/{val}/{site}
    @Test(timeout = 60000)
    public void test_15_getOnCookiReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/cookie/session/am/;iCE")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/cookie/session/am/;iCE"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/filesuffix/{directory}/{file}
    // 			Action parameters:
    // 				directory: ';jT'
    // 				file: '_EM_25175_XYZ_'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = directory:';jT'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = file:'_EM_25175_XYZ_'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/filesuffix/{directory}/{file}
    @Test(timeout = 60000)
    public void test_16_getOnFilesuffixReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/filesuffix/;jT/_EM_25175_XYZ_")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/filesuffix/;jT/_EM_25175_XYZ_"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/costfuns/{i}/{s}
    // 			Action parameters:
    // 				i: '291'
    // 				s: ';j'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = i:'291'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = s:';j'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/costfuns/{i}/{s}
    @Test(timeout = 60000)
    public void test_17_getOnCostfunReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/costfuns/291/;j")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/costfuns/291/;j"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/dateparse/{dayname}/{monthname}
    // 			Action parameters:
    // 				dayname: ';3oOQOE'
    // 				monthname: 'AStpudG4Dj2eEhY'
    // 				EMextraParam123: ''
    // 				x-EMextraHeader123: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = dayname:';3oOQOE'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = monthname:'AStpudG4Dj2eEhY'
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = EMextraParam123:''
    // 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x-EMextraHeader123:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/dateparse/{dayname}/{monthname}
    @Test(timeout = 60000)
    public void test_18_getOnDateparsReturns404() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/;3oOQOE/AStpudG4Dj2eEhY")
                .then()
                .statusCode(404)
                .assertThat()
                .contentType("application/json")
                .body("'status'", numberMatches(404.0))
                .body("'error'", containsString("Not Found"))
                .body("'message'", containsString("No message available"))
                .body("'path'", containsString("/api/dateparse/;3oOQOE/AStpudG4Dj2eEhY"));
    }


}
