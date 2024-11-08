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
import static org.hamcrest.Matchers.*;
import  io.restassured.config.JsonConfig;
import  io.restassured.path.json.config.JsonPathConfig;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;




/**
*  This file was automatically generated by EvoMaster on 2024-11-07T17:07:19.409-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 53 tests
 * <br>
*  Covered targets: 180
 * <br>
*  Used time: 0h 10m 1s
 * <br>
*  Needed budget for current results: 68%
 * <br>
*  This file contains test cases that represent successful calls.
*/
public class EvoMaster_successes_Test {

    
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
    
    
    
    
    @Test(timeout = 60000)
    public void test_0_getOnApi_docsReturnsObject() throws Exception {
        
        given().accept("*/*")
                .get(baseUrlOfSut + "/v2/api-docs")
                .then()
                .statusCode(200);
    }
    
    
    @Test(timeout = 60000)
    public void test_1_getOnOrdered4ReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/ordered4/_EM_0_XYZ_/qx9XEcYIJzpHx8a/_EM_2_XYZ_/_EM_1_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("unordered"));
    }
    
    
    @Test(timeout = 60000)
    public void test_2_getOnFilesuffixReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/filesuffix/Ls0eD25Ed9uaMr/KKvyg3nROv?EMextraParam123=_EM_12_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0"));
    }
    
    
    @Test(timeout = 60000)
    public void test_3_getOnPatReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/_EM_14_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("none"));
    }
    
    
    @Test(timeout = 60000)
    public void test_4_getOnPatReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/pat/RXw6uqQWCKpNvD0h/_EM_16_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0"));
    }
    
    
    @Test(timeout = 60000)
    public void test_5_getOnText2txtReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/text2txt/are/eW1ky3m4s4jfXe/S5h7lHjvfp")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("r"));
    }
    
    
    @Test(timeout = 60000)
    public void test_6_getOnCostfunReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/costfuns/-346019915/UzFKnsO")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("10"));
    }
    
    
    @Test(timeout = 60000)
    public void test_7_getOnDateparsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/_EM_11_XYZ_/FaA?EMextraParam123=42")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0"));
    }
    
    
    @Test(timeout = 60000)
    public void test_8_getOnDateparsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/sat/s6xHyw8FF")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("1"));
    }
    
    
    @Test(timeout = 60000)
    public void test_9_getOnDateparsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/sun/saxz")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("1"));
    }
    
    
    @Test(timeout = 60000)
    public void test_10_getOnDateparsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/m%60d/feb?EMextraParam123=42")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("2"));
    }
    
    
    @Test(timeout = 60000)
    public void test_11_getOnDateparsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/DOO/apr?EMextraParam123=42")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("4"));
    }
    
    
    @Test(timeout = 60000)
    public void test_12_getOnDateparsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/mUd/may")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("5"));
    }
    
    
    @Test(timeout = 60000)
    public void test_13_getOnDateparsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/mUd/jul")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("7"));
    }
    
    
    @Test(timeout = 60000)
    public void test_14_getOnDateparsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/DOO/aug?EMextraParam123=42")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("8"));
    }
    
    
    @Test(timeout = 60000)
    public void test_15_getOnDateparsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/VnZ/sep")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("9"));
    }
    
    
    @Test(timeout = 60000)
    public void test_16_getOnDateparsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/paU/dec")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("12"));
    }
    
    
    @Test(timeout = 60000)
    public void test_17_getOnNotypevarReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/notypevar/244/FOeISl3DfJryW?EMextraParam123=42")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("3"));
    }
    
    
    @Test(timeout = 60000)
    public void test_18_getOnNotypevarReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/notypevar/-1844979917/0kSZRXM")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0"));
    }
    
    
    @Test(timeout = 60000)
    public void test_19_getOnText2txtReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/text2txt/and/OLU_5JTGr1/OI0P4q0J2ANJ4RZJ")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("n"));
    }
    
    
    @Test(timeout = 60000)
    public void test_20_getOnCookiReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/cookie/userid/UsErT_EkUSU/sB8")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("1"));
    }
    
    
    @Test(timeout = 60000)
    public void test_21_getOnCookiReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/cookie/session/am/rnEkbR7BSoev")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("2"));
    }
    
    
    @Test(timeout = 60000)
    public void test_22_getOnText2txtReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/text2txt/for/the/b4N0GY")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("4"));
    }
    
    
    @Test(timeout = 60000)
    public void test_23_getOnText2txtReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/text2txt/four/the/_EM_11383_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("4"));
    }
    
    
    @Test(timeout = 60000)
    public void test_24_getOnCostfunReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/costfuns/38/baab")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("10"));
    }
    
    
    @Test(timeout = 60000)
    public void test_25_getOnDateparsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/mon/jun")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("7"));
    }
    
    
    @Test(timeout = 60000)
    public void test_26_getOnDateparsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/dateparse/tue/mar?EMextraParam123=42")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("4"));
    }
    
    
    @Test(timeout = 60000)
    public void test_27_getOnDateparsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/dateparse/wed/_EM_3299_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("1"));
    }
    
    
    @Test(timeout = 60000)
    public void test_28_getOnDateparsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/fri/jan")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("2"));
    }
    
    
    @Test(timeout = 60000)
    public void test_29_getOnDateparsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/_EM_4979_XYZ_/oct?EMextraParam123=42")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("10"));
    }
    
    
    @Test(timeout = 60000)
    public void test_30_getOnDateparsReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/dateparse/wed/_EM_4936_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("1"));
    }
    
    
    @Test(timeout = 60000)
    public void test_31_getOnTitlReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/female/k")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("-1"));
    }
    
    
    @Test(timeout = 60000)
    public void test_32_getOnTitlReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/none/_EM_10612_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("-1"));
    }
    
    
    @Test(timeout = 60000)
    public void test_33_getOnTitlReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/none/dr")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("2"));
    }
    
    
    @Test(timeout = 60000)
    public void test_34_getOnTitlReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/none/rev")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("2"));
    }
    
    
    @Test(timeout = 60000)
    public void test_35_getOnTitlReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/none/prof")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("2"));
    }
    
    
    @Test(timeout = 60000)
    public void test_36_getOnTitlReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/female/lady")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0"));
    }
    
    
    @Test(timeout = 60000)
    public void test_37_getOnTitlReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/male/ms")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("-1"));
    }
    
    
    @Test(timeout = 60000)
    public void test_38_getOnCalcReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/calc/_EM_3_XYZ_/0.42417927726675797/0.3697168378002159?EMextraParam123=42")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0.0"));
    }
    
    
    @Test(timeout = 60000)
    public void test_39_getOnCalcReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_91_XYZ_")
                .get(baseUrlOfSut + "/api/calc/pi/0.044791896784333485/0.7674791882027291")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("3.141592653589793"));
    }
    
    
    @Test(timeout = 60000)
    public void test_40_getOnCalcReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/calc/e/-4.4942328371557893E307/1.6007841443554816")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("2.718281828459045"));
    }
    
    
    @Test(timeout = 60000)
    public void test_41_getOnCalcReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/calc/sqrt/0.7808/0.20741884144559053")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0.8836288813749809"));
    }
    
    
    @Test(timeout = 60000)
    public void test_42_getOnCalcReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/calc/log/1.54181853650512E8/0.7405683069438617")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("18.85364333156232"));
    }
    
    
    @Test(timeout = 60000)
    public void test_43_getOnCalcReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/calc/sine/0.7808/0.20741884144559053")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0.7038479249207533"));
    }
    
    
    @Test(timeout = 60000)
    public void test_44_getOnCalcReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/calc/subtract/-5.228276237560388E306/8.988465674311579E307")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("-9.511293298067618E307"));
    }
    
    
    @Test(timeout = 60000)
    public void test_45_getOnText2txtReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/text2txt/two/you/FbT7LxQghqeITArq")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("2"));
    }
    
    
    @Test(timeout = 60000)
    public void test_46_getOnText2txtReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/text2txt/you/you/FbT7LxQghqeITArq")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("u"));
    }
    
    
    @Test(timeout = 60000)
    public void test_47_getOnTitlReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/male/miss")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("-1"));
    }
    
    
    @Test(timeout = 60000)
    public void test_48_getOnCalcReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/api/calc/LII/8.988465674311579E307/-0.06?EMextraParam123=_EM_1270_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0.0"));
    }
    
    
    @Test(timeout = 60000)
    public void test_49_getOnCalcReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_542_XYZ_")
                .get(baseUrlOfSut + "/api/calc/idqovi3drv9C/0.0/0.5345638868635239?EMextraParam123=_EM_541_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0.0"));
    }
    
    
    @Test(timeout = 60000)
    public void test_50_getOnCalcReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/calc/_EM_9287_XYZ_/0.3/0.7405683069438617")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0.0"));
    }
    
    
    @Test(timeout = 60000)
    public void test_51_getOnTitlReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/male/mr")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("1"));
    }
    
    
    @Test(timeout = 60000)
    public void test_52_getOnTitlReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/api/title/male/_EM_10720_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("-1"));
    }


}