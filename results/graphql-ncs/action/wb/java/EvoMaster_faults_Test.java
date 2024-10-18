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
*  This file was automatically generated by EvoMaster on 2024-10-18T11:59:21.823-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 18 tests
 * <br>
*  Covered targets: 217
 * <br>
*  Used time: 0h 10m 5s
 * <br>
*  Needed budget for current results: 99%
 * <br>
*  This file contains test cases that are likely to indicate faults.
*/
public class EvoMaster_faults_Test {

    
    private static final SutHandler controller = new em.embedded.org.graphqlncs.EmbeddedEvoMasterController();
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
    // 		org.evomaster.core.problem.graphql.GraphQLAction: expint
    // 			Action parameters:
    // 				n: '-16172'
    // 				x: 'null'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = n:'-16172'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = x:'null'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: expint
    @Test(timeout = 60000)
    public void test_0_qUERYOnExpintWithParams__16172_null_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { expint  (n : -16172,x : null)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/type/Expint_26_exe
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Internal Server Error(s) while executing query"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'.'expint'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: gammq
    // 			Action parameters:
    // 				a: ''
    // 				x: '-2938931.5'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = a:''
    // 				org.evomaster.core.search.gene.optional.OptionalGene = x:'-2938931.5'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: gammq
    @Test(timeout = 60000)
    public void test_1_qUERYOnGammqWithParams__2938931_5_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { gammq  (x : -2938931.5)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/type/Gammq_101_exe
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Internal Server Error(s) while executing query"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'.'gammq'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: expint
    // 			Action parameters:
    // 				n: 'null'
    // 				x: '-0.43284416'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = n:'null'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = x:'-0.43284416'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: expint
    @Test(timeout = 60000)
    public void test_2_qUERYOnExpintWithParams_null__0_43284416_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { expint  (n : null,x : -0.43284416)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/type/Expint_26_exe
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Internal Server Error(s) while executing query"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'.'expint'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: gammq
    // 			Action parameters:
    // 				a: ''
    // 				x: 'null'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = a:''
    // 				org.evomaster.core.search.gene.optional.OptionalGene = x:'null'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: gammq
    @Test(timeout = 60000)
    public void test_3_qUERYOnGammqWithParams_null_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { gammq  (x : null)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/type/Gammq_101_exe
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Internal Server Error(s) while executing query"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'.'gammq'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: gammq
    // 			Action parameters:
    // 				a: '-2.8964654E7'
    // 				x: '0.47827607'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = a:'-2.8964654E7'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = x:'0.47827607'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: gammq
    @Test(timeout = 60000)
    public void test_4_qUERYOnGammqWithParams__2_8964654E7__0_47827607_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { gammq  (a : -2.8964654E7,x : 0.47827607)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/type/Gammq_101_exe
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Internal Server Error(s) while executing query"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'.'gammq'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: expint
    // 			Action parameters:
    // 				n: ''
    // 				x: 'null'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = n:''
    // 				org.evomaster.core.search.gene.optional.OptionalGene = x:'null'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: expint
    @Test(timeout = 60000)
    public void test_5_qUERYOnExpintWithParams_null_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { expint  (x : null)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/type/Expint_26_exe
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Internal Server Error(s) while executing query"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'.'expint'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: expint
    // 			Action parameters:
    // 				n: '1'
    // 				x: '0.0'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = n:'1'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = x:'0.0'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: expint
    @Test(timeout = 60000)
    public void test_6_qUERYOnExpintWithParams__1__0_0_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { expint  (n : 1,x : 0.0)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/type/Expint_26_exe
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Internal Server Error(s) while executing query"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'.'expint'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: bessj
    // 			Action parameters:
    // 				n: ''
    // 				x: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = n:''
    // 				org.evomaster.core.search.gene.optional.OptionalGene = x:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: bessj
    @Test(timeout = 60000)
    public void test_7_qUERYOnBessjWithParams_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { bessj           } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/resolver/CustomException_88_getMessage
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Unexpected error occurred"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: fisher
    // 			Action parameters:
    // 				m: '262488'
    // 				n: ''
    // 				x: '0.8788011'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = m:'262488'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = n:''
    // 				org.evomaster.core.search.gene.optional.OptionalGene = x:'0.8788011'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: fisher
    @Test(timeout = 60000)
    public void test_8_qUERYOnFisherWithParams__262488__0_8788011_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { fisher  (m : 262488,x : 0.8788011)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/resolver/CustomException_88_getMessage
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Unexpected error occurred"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: bessj
    // 			Action parameters:
    // 				n: '1290482129'
    // 				x: '104.03489'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = n:'1290482129'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = x:'104.03489'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: bessj
    @Test(timeout = 60000)
    public void test_9_qUERYOnBessjWithParams__1290482129__104_03489_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { bessj  (n : 1290482129,x : 104.03489)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/resolver/CustomException_88_getMessage
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Unexpected error occurred"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: remainder
    // 			Action parameters:
    // 				a: '131541'
    // 				b: ''
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = a:'131541'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = b:''
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: remainder
    @Test(timeout = 60000)
    public void test_10_qUERYOnRemainderWithParams__131541_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { remainder  (a : 131541)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/resolver/CustomException_88_getMessage
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Unexpected error occurred"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: fisher
    // 			Action parameters:
    // 				m: '128'
    // 				n: '64480'
    // 				x: '1.4330952'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = m:'128'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = n:'64480'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = x:'1.4330952'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: fisher
    @Test(timeout = 60000)
    public void test_11_qUERYOnFisherWithParams__128__64480__1_4330952_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { fisher  (m : 128,n : 64480,x : 1.4330952)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/resolver/CustomException_88_getMessage
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Unexpected error occurred"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: remainder
    // 			Action parameters:
    // 				a: '-32349'
    // 				b: '167'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = a:'-32349'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = b:'167'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: remainder
    @Test(timeout = 60000)
    public void test_12_qUERYOnRemainderWithParams__32349__167_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { remainder  (a : -32349,b : 167)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/resolver/CustomException_88_getMessage
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Unexpected error occurred"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: remainder
    // 			Action parameters:
    // 				a: '471'
    // 				b: '1417554051'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = a:'471'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = b:'1417554051'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: remainder
    @Test(timeout = 60000)
    public void test_13_qUERYOnRemainderWithParams__471__1417554051_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { remainder  (a : 471,b : 1417554051)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/resolver/CustomException_88_getMessage
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Unexpected error occurred"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: remainder
    // 			Action parameters:
    // 				a: '419'
    // 				b: '-1672129438'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = a:'419'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = b:'-1672129438'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: remainder
    @Test(timeout = 60000)
    public void test_14_qUERYOnRemainderWithParams__419__1672129438_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { remainder  (a : 419,b : -1672129438)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/resolver/CustomException_88_getMessage
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Unexpected error occurred"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: fisher
    // 			Action parameters:
    // 				m: '734'
    // 				n: '605'
    // 				x: 'null'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = m:'734'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = n:'605'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = x:'null'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: fisher
    @Test(timeout = 60000)
    public void test_15_qUERYOnFisherWithParams__734__605_null_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { fisher  (m : 734,n : 605,x : null)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/resolver/QueryResolver_35_fisher
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Can't serialize value (/fisher) : Expected type 'Float' but was 'Double'."))
                .body("'errors'[0].'path'.size()", equalTo(1))
                .body("'errors'[0].'path'", hasItems("fisher"))
                .body("'errors'[0].'extensions'.'classification'", containsString("DataFetchingException"))
                .body("'data'.'fisher'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: gammq
    // 			Action parameters:
    // 				a: '77650.99'
    // 				x: '74866.11'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = a:'77650.99'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = x:'74866.11'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: gammq
    @Test(timeout = 60000)
    public void test_16_qUERYOnGammqWithParams__77650_99__74866_11_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { gammq  (a : 77650.99,x : 74866.11)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/type/Gammq_96_gser
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Internal Server Error(s) while executing query"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'.'gammq'", nullValue());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: gammq
    // 			Action parameters:
    // 				a: '1.7014117E38'
    // 				x: '1.7014117E38'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = a:'1.7014117E38'
    // 				org.evomaster.core.search.gene.optional.OptionalGene = x:'1.7014117E38'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: gammq
    @Test(timeout = 60000)
    public void test_17_qUERYOnGammqWithParams__1_7014117E38__1_7014117E38_ReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { gammq  (a : 1.7014117E38,x : 1.7014117E38)         } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)// org/graphqlncs/type/Gammq_68_gcf
                .assertThat()
                .contentType("application/json")
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Internal Server Error(s) while executing query"))
                .body("'errors'[0].'locations'.size()", equalTo(0))
                .body("'data'.'gammq'", nullValue());
    }


}
