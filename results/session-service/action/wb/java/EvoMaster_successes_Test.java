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
import static org.evomaster.client.java.controller.mongo.dsl.MongoDsl.mongo;
import  org.evomaster.client.java.controller.api.dto.database.operations.MongoInsertionResultsDto;
import  org.evomaster.client.java.controller.api.dto.database.operations.MongoInsertionDto;
import static org.hamcrest.Matchers.*;
import  io.restassured.config.JsonConfig;
import  io.restassured.path.json.config.JsonPathConfig;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;




/**
*  This file was automatically generated by EvoMaster on 2024-11-03T15:55:06.487-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 15 tests
 * <br>
*  Covered targets: 150
 * <br>
*  Used time: 0h 15m 9s
 * <br>
*  Needed budget for current results: 98%
 * <br>
*  This file contains test cases that represent successful calls.
*/
public class EvoMaster_successes_Test {

    
    private static final SutHandler controller = new em.embedded.org.cbioportal.session_service.EmbeddedEvoMasterController();
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
    public void test_1_getOnInfoReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .get(baseUrlOfSut + "/info?" + 
                    "EMextraParam123=42&" + 
                    "value=Q0GFb")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0.5.0-SNAPSHOT"));
    }
    
    
    @Test(timeout = 60000)
    public void test_2_getOnInfoReturnsContent() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .get(baseUrlOfSut + "/info?field=")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("text/plain")
                .body(containsString("0.5.0-SNAPSHOT"));
    }
    
    
    @Test(timeout = 60000)
    public void test_3_postOnSessionReturns200UsingMongo() throws Exception {
        List<MongoInsertionDto> insertions = mongo().insertInto("session", "main_session")
                .d("{\"id\":\"GATRdLH\", \"checksum\":\"_EM_7028_XYZ_\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"ZETId9RKFiiKwMnJ\", \"type\":\"main_session\", \"_id\":{\"$oid\":\"1e559b1970dfdddecc94b4db\"}}")
            .and().insertInto("session", "main_session")
                .d("{\"id\":\"g\", \"checksum\":\"_EM_7029_XYZ_\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"WA\", \"type\":\"virtual_study\", \"_id\":{\"$oid\":\"d7cee82dcee9c2d2dcf7a62c\"}}")
            .and().insertInto("session", "comparison_session")
                .d("{\"id\":\"XP0mYJbU\", \"checksum\":\"76fi_vszGgk4bBuV\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"DC112H_\", \"type\":\"virtual_study\", \"_id\":{\"$oid\":\"fbf1fbcce750255beb7f8a86\"}}")
            .and().insertInto("session", "comparison_session")
                .d("{\"id\":\"=\", \"checksum\":\"_EM_5356_XYZ_\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_5357_XYZ_\", \"type\":\"custom_data\", \"_id\":{\"$oid\":\"ca706a1ae8f1aeff37093d01\"}}")
            .and().insertInto("session", "custom_data")
                .d("{\"id\":\"yUtjiDnsfwsCrv_p\", \"checksum\":\"g19oiQDIjQu\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"gVULUqRKU\", \"type\":\"genomic_chart\", \"_id\":{\"$oid\":\"f53d8c3e615a16bd76a0d115\"}}")
            .and().insertInto("session", "custom_data")
                .d("{\"id\":\"HH21\", \"checksum\":\"f\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"Z2AVVJG4B1\", \"type\":\"genomic_chart\", \"_id\":{\"$oid\":\"89e2f3b18acd28cf596b5d07\"}}")
            .and().insertInto("session", "virtual_study")
                .d("{\"id\":\"ZL8ptmyo\", \"checksum\":\"eV6Zt3aeWCwA0Ov\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"J_AKakgEJ9ZbdaxQ\", \"type\":\"genomic_chart\", \"_id\":{\"$oid\":\"ddcd3ee088baf9de7d67e4da\"}}")
            .and().insertInto("session", "virtual_study")
                .d("{\"id\":\"_EM_5783_XYZ_\", \"checksum\":\"_EM_7030_XYZ_\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"\", \"type\":\"group\", \"_id\":{\"$oid\":\"b11939d0108d1ada8bbf7cd5\"}}")
            .dtos();
        MongoInsertionResultsDto insertionsresult = controller.execInsertionsIntoMongoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" {} ")
                .post(baseUrlOfSut + "/api/sessions/EVOMASTER/main_session")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }
    
    
    @Test(timeout = 60000)
    public void test_4_postOnSessionReturns200UsingMongo() throws Exception {
        List<MongoInsertionDto> insertions = mongo().insertInto("session", "main_session")
                .d("{\"id\":\"_EM_6671_XYZ_\", \"checksum\":\"_EM_6672_XYZ_\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"ZETId9RKFiiKwMnJ\", \"type\":\"main_session\", \"_id\":{\"$oid\":\"1e559b1970dfdddebc94b4db\"}}")
            .and().insertInto("session", "main_session")
                .d("{\"id\":\"\", \"checksum\":\"ZUUUbebxiSo\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_6865_XYZ_\", \"type\":\"settings\", \"_id\":{\"$oid\":\"d7cfe82dded9d1d2cb07a53c\"}}")
            .and().insertInto("session", "comparison_session")
                .d("{\"id\":\"XP0mYJbU\", \"checksum\":\"76fi_vszGgk4bBuV\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"aFeqXK5O\", \"type\":\"virtual_study\", \"_id\":{\"$oid\":\"0af0fbbde660256aeb708a86\"}}")
            .and().insertInto("session", "comparison_session")
                .d("{\"id\":\"<\", \"checksum\":\"_EM_5356_XYZ_\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_5357_XYZ_\", \"type\":\"comparison_session\", \"_id\":{\"$oid\":\"ca706a1ae8f1aeff37093d01\"}}")
            .and().insertInto("session", "custom_data")
                .d("{\"id\":\"yUtjiDnsfwsCrv_\", \"checksum\":\"g19oiQDIjQu\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_6866_XYZ_\", \"type\":\"group\", \"_id\":{\"$oid\":\"f63d8c3f615b15cd87a0d115\"}}")
            .and().insertInto("session", "custom_data")
                .d("{\"id\":\"HH21\", \"checksum\":\"f\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"Z2AVVJG4B1\", \"type\":\"genomic_chart\", \"_id\":{\"$oid\":\"89e2f3b18acd28cf596b5d07\"}}")
            .and().insertInto("session", "virtual_study")
                .d("{\"id\":\"ZL8ptmyo\", \"checksum\":\"eV6Zt3aeWCwA0Ov\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_5358_XYZ_\", \"type\":\"genomic_chart\", \"_id\":{\"$oid\":\"ddcd3ee188baf9de7d67e4da\"}}")
            .and().insertInto("session", "virtual_study")
                .d("{\"id\":\"_EM_5783_XYZ_\", \"checksum\":\"UJk\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"\", \"type\":\"group\", \"_id\":{\"$oid\":\"b1193ad0108d1ada8bbf7cd5\"}}")
            .dtos();
        MongoInsertionResultsDto insertionsresult = controller.execInsertionsIntoMongoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" {} ")
                .post(baseUrlOfSut + "/api/sessions/_EM_6867_XYZ_/virtual_study")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }
    
    
    @Test(timeout = 60000)
    public void test_5_postOnSessionReturns200UsingMongo() throws Exception {
        List<MongoInsertionDto> insertions = mongo().insertInto("session", "main_session")
                .d("{\"id\":\"_EM_6671_XYZi\", \"checksum\":\"_EM_6672_XYZ_\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"ZETIdUUUBUUKwUUJ\", \"type\":\"genomic_chart\", \"_id\":{\"$oid\":\"1e55ab1970dfdddebc94b4db\"}}")
            .and().insertInto("session", "main_session")
                .d("{\"id\":\"2\", \"checksum\":\"ZYUVUebxiUo\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_8910_XYZ_\", \"type\":\"settings\", \"_id\":{\"$oid\":\"d7cee82dcee9c2d2dcf7a62c\"}}")
            .and().insertInto("session", "comparison_session")
                .d("{\"id\":\"XP0mYJbU\", \"checksum\":\"76fi_vszGgk4bBuV\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"DC112H_\", \"type\":\"comparison_session\", \"_id\":{\"$oid\":\"fbf1fbcce750255beb7f8a86\"}}")
            .and().insertInto("session", "comparison_session")
                .d("{\"id\":\"f\", \"checksum\":\"_EM_5756_XYZ_j\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_5357_XYZ_\", \"type\":\"main_session\", \"_id\":{\"$oid\":\"ca807a0be801aef0360a3c10\"}}")
            .and().insertInto("session", "custom_data")
                .d("{\"id\":\"yUtjiDnsfwsCrv_p\", \"checksum\":\"g19oiQDIjQw\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_6937_XYZ_\", \"type\":\"genomic_chart\", \"_id\":{\"$oid\":\"f43d8b4f615a15cd75afd216\"}}")
            .and().insertInto("session", "custom_data")
                .d("{\"id\":\"_EM_8911_XYZ_\", \"checksum\":\"f\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"Z2AVVJG4B1\", \"type\":\"group\", \"_id\":{\"$oid\":\"89e2f3b18acd28cf596b5d07\"}}")
            .and().insertInto("session", "virtual_study")
                .d("{\"id\":\"ZL8ptmyo\", \"checksum\":\"eV6Zt3aeWCwA0Ov\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_6940_XYZ_\", \"type\":\"main_session\", \"_id\":{\"$oid\":\"ddbd3de178baf9ee6d77e4c9\"}}")
            .and().insertInto("session", "virtual_study")
                .d("{\"id\":\"1eiWbVLwo\", \"checksum\":\"UJkK\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_6944_XYZ_\", \"type\":\"genomic_chart\", \"_id\":{\"$oid\":\"b1193ad0108d1ada9bbf7cd5\"}}")
            .and().insertInto("session", "custom_gene_list")
                .d("{\"id\":\"_EM_6945_XYZ_\", \"checksum\":\">1d5yyc0Al\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_qt6OYro_adzK6cm\", \"type\":\"custom_data\", \"_id\":{\"$oid\":\"bb9be2dc8a47c5c7abf7c4e1\"}}")
            .and().insertInto("session", "custom_gene_list")
                .d("{\"id\":\"bw\", \"checksum\":\"JwH\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"F6u0a3dND2AG\", \"type\":\"virtual_study\", \"_id\":{\"$oid\":\"f0cdcdd3fa625254cbd07cfe\"}}")
            .dtos();
        MongoInsertionResultsDto insertionsresult = controller.execInsertionsIntoMongoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" {} ")
                .post(baseUrlOfSut + "/api/sessions/new/virtual_study?value=virtual_study")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }
    
    
    @Test(timeout = 60000)
    public void test_6_postOnSessionReturns200UsingMongo() throws Exception {
        List<MongoInsertionDto> insertions = mongo().insertInto("session", "main_session")
                .d("{\"id\":\"_EM_6671_XYZ\", \"checksum\":\"_EM_6672_XYZ_\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"ZETId9RKFiiKwMnJ\", \"type\":\"main_session\", \"_id\":{\"$oid\":\"1e559b1970dfdddebc94b4db\"}}")
            .and().insertInto("session", "main_session")
                .d("{\"id\":\"2\", \"checksum\":\"ZUUUbebxiUo\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_6939_XYZ_\", \"type\":\"settings\", \"_id\":{\"$oid\":\"d7cee82dcee9c2d2dcf7a62c\"}}")
            .and().insertInto("session", "comparison_session")
                .d("{\"id\":\"XP0mYJbU\", \"checksum\":\"76fi_vszGgk4bBuV\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"DC112H_\", \"type\":\"virtual_study\", \"_id\":{\"$oid\":\"fbf1fbcce750255beb7f8a86\"}}")
            .and().insertInto("session", "comparison_session")
                .d("{\"id\":\"f\", \"checksum\":\"_EM_5756_XYZ_jI\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_5357_XYZ_\", \"type\":\"virtual_study\", \"_id\":{\"$oid\":\"ca807a0be801aef0360a3c10\"}}")
            .and().insertInto("session", "custom_data")
                .d("{\"id\":\"yUtjiDnsfwsCrv_p\", \"checksum\":\"_EM_7033_XYZ_\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_6937_XYZ_\", \"type\":\"genomic_chart\", \"_id\":{\"$oid\":\"e44c8b40605b15be74afe206\"}}")
            .and().insertInto("session", "custom_data")
                .d("{\"id\":\"UU2U\", \"checksum\":\"f\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"Z2AVVJG4B14\", \"type\":\"custom_data\", \"_id\":{\"$oid\":\"89e2f3b18acd28c0596b5d07\"}}")
            .and().insertInto("session", "virtual_study")
                .d("{\"id\":\"ZL8ptmyo\", \"checksum\":\"eV6Zt3aeWCwA0Ov\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_6940_XYZ_\", \"type\":\"main_session\", \"_id\":{\"$oid\":\"ddbd3de178baf9ee6d77e4c9\"}}")
            .and().insertInto("session", "virtual_study")
                .d("{\"id\":\"1eiWbVLwo\", \"checksum\":\"UJk\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_6944_XYZ_\", \"type\":\"genomic_chart\", \"_id\":{\"$oid\":\"b1193ad0108d1ada8bbf7cd5\"}}")
            .and().insertInto("session", "custom_gene_list")
                .d("{\"id\":\"_EM_6945_XYZ_\", \"checksum\":\"_EM_7034_XYZ_\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_qt6OYro_adzK6cm\", \"type\":\"custom_data\", \"_id\":{\"$oid\":\"bb9be2dc8a48c5c7abf7c4e1\"}}")
            .and().insertInto("session", "custom_gene_list")
                .d("{\"id\":\"bw\", \"checksum\":\"JwH\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"F6u0a3dND2AG\", \"type\":\"virtual_study\", \"_id\":{\"$oid\":\"f0cdcdd3fa625254cbd07cfe\"}}")
            .dtos();
        MongoInsertionResultsDto insertionsresult = controller.execInsertionsIntoMongoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" {} ")
                .post(baseUrlOfSut + "/api/sessions/HexData/comparison_session?" + 
                    "field=comparison_session&" + 
                    "value=comparison_session")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }
    
    
    @Test(timeout = 60000)
    public void test_7_postOnSessionReturns200UsingMongo() throws Exception {
        List<MongoInsertionDto> insertions = mongo().insertInto("session", "main_session")
                .d("{\"id\":\"_EM_6671_XYZ\", \"checksum\":\"_EM_6672_XYZ_\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"ZETId9RKFiiKwMnJ\", \"type\":\"main_session\", \"_id\":{\"$oid\":\"1e559b1970dfdddebc94b4db\"}}")
            .and().insertInto("session", "main_session")
                .d("{\"id\":\"2\", \"checksum\":\"ZUUUbebxiUo\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"nyViGOMtojp2SY9\", \"type\":\"virtual_study\", \"_id\":{\"$oid\":\"d7cee82dcee9c2d2dcf7a62c\"}}")
            .and().insertInto("session", "comparison_session")
                .d("{\"id\":\"XP0uYJbU\", \"checksum\":\"_EM_9062_XYZ_\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"DC112H_\", \"type\":\"comparison_session\", \"_id\":{\"$oid\":\"fb01fbbbd751365aeb7f8a86\"}}")
            .and().insertInto("session", "comparison_session")
                .d("{\"id\":\"f\", \"checksum\":\"_EM_5756_XYZ_j\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_5357_XYZ_\", \"type\":\"main_session\", \"_id\":{\"$oid\":\"ca807a0be801aef0360a3c10\"}}")
            .and().insertInto("session", "custom_data")
                .d("{\"id\":\"yUtjiDnsfwsCrv_p\", \"checksum\":\"g19oiQDIjQw\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_6937_XYZ_\", \"type\":\"genomic_chart\", \"_id\":{\"$oid\":\"f43d8b4f615a15cd75afd216\"}}")
            .and().insertInto("session", "custom_data")
                .d("{\"id\":\"UU2U\", \"checksum\":\"f\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"Z2AVVJG4B1\", \"type\":\"virtual_study\", \"_id\":{\"$oid\":\"89e2f3b18acd28cf596b5d07\"}}")
            .and().insertInto("session", "virtual_study")
                .d("{\"id\":\"_EM_9063_XYZ_\", \"checksum\":\"eV6Zt3aeWCwA0Ov\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"q01mblu\", \"type\":\"main_session\", \"_id\":{\"$oid\":\"ddbd3de178baf9ee6d77e4c9\"}}")
            .and().insertInto("session", "virtual_study")
                .d("{\"id\":\"1eiWbVLwo\", \"checksum\":\"UJk\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_6944_XYZ_\", \"type\":\"genomic_chart\", \"_id\":{\"$oid\":\"b1193ad0108d1ada8bbf7cd5\"}}")
            .and().insertInto("session", "custom_gene_list")
                .d("{\"id\":\"_EM_6945_XYZ_\", \"checksum\":\":1d5yyc0Al\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_qt6OYro_adzK6cm\", \"type\":\"custom_data\", \"_id\":{\"$oid\":\"aa9be3dc9a37b5c79af8c4e1\"}}")
            .and().insertInto("session", "custom_gene_list")
                .d("{\"id\":\"bw\", \"checksum\":\"JwH\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"F6u0a3dND2AG\", \"type\":\"virtual_study\", \"_id\":{\"$oid\":\"f0cdcdd3fa625254cbd07cfe\"}}")
            .dtos();
        MongoInsertionResultsDto insertionsresult = controller.execInsertionsIntoMongoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" {} ")
                .post(baseUrlOfSut + "/api/sessions/Infinity/virtual_study?" + 
                    "field=%7B%7D&" + 
                    "value=3maQN6OT1m")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }
    
    
    @Test(timeout = 60000)
    public void test_8_postOnSessionReturns200() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_317_XYZ_")
                .contentType("application/json")
                .body(" { " + 
                    " \"EM_tainted_map\": \"_EM_318_XYZ_\" " + 
                    " } ")
                .post(baseUrlOfSut + "/api/sessions/kP9siCpY0mG1/group")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }
    
    
    @Test(timeout = 60000)
    public void test_9_postOnSessionReturns200() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_66_XYZ_")
                .contentType("application/json")
                .body(" {} ")
                .post(baseUrlOfSut + "/api/sessions/_EM_415_XYZ_/settings?EMextraParam123=_EM_65_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }
    
    
    @Test(timeout = 60000)
    public void test_10_postOnSessionReturns200UsingMongo() throws Exception {
        List<MongoInsertionDto> insertions = mongo().insertInto("session", "main_session")
                .d("{\"id\":\"_EM_1403_XYZ_\", \"checksum\":\"IPbzI\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"khr5s\", \"type\":\"genomic_chart\", \"_id\":{\"$oid\":\"eda5f7ea1ec79929589ae683\"}}")
            .and().insertInto("session", "main_session")
                .d("{\"id\":\"0\", \"checksum\":\"1DygE\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_1404_XYZ_\", \"type\":\"group\", \"_id\":{\"$oid\":\"4ebc83bac1b4415f18fc2ae1\"}}")
            .dtos();
        MongoInsertionResultsDto insertionsresult = controller.execInsertionsIntoMongoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_235_XYZ_")
                .contentType("application/json")
                .body(" {} ")
                .post(baseUrlOfSut + "/api/sessions/o4FESs54yaS5/custom_data?EMextraParam123=_EM_234_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }
    
    
    @Test(timeout = 60000)
    public void test_11_postOnSessionReturns200UsingMongo() throws Exception {
        List<MongoInsertionDto> insertions = mongo().insertInto("session", "main_session")
                .d("{\"id\":\"\", \"checksum\":\"IPbzI\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_300_XYZ_\", \"type\":\"custom_gene_list\", \"_id\":{\"$oid\":\"edb5e7f90fd6982a58abe693\"}}")
            .and().insertInto("session", "main_session")
                .d("{\"id\":\"0\", \"checksum\":\"ULwJjC\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"sVWLB7bxgka88\", \"type\":\"group\", \"_id\":{\"$oid\":\"4dbd73a9c0b44150290b19e0\"}}")
            .dtos();
        MongoInsertionResultsDto insertionsresult = controller.execInsertionsIntoMongoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "_EM_235_XYZ_")
                .contentType("application/json")
                .body(" {} ")
                .post(baseUrlOfSut + "/api/sessions/o4FESs54yaS5/custom_gene_list?EMextraParam123=_EM_234_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }
    
    
    @Test(timeout = 60000)
    public void test_12_postOnSessionReturns200() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .contentType("application/json")
                .body(" { " + 
                    " \"EM_tainted_map\": \"_EM_304_XYZ_\" " + 
                    " } ")
                .post(baseUrlOfSut + "/api/sessions/KzmHyjLuGhthPZF/main_session")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }
    
    
    @Test(timeout = 60000)
    public void test_13_postOnSessionReturns200() throws Exception {
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "42")
                .contentType("application/json")
                .body(" { " + 
                    " \"EM_tainted_map\": \"_EM_907_XYZ_\" " + 
                    " } ")
                .post(baseUrlOfSut + "/api/sessions/_EM_1397_XYZ_/virtual_study?EMextraParam123=_EM_906_XYZ_")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }
    
    
    @Test(timeout = 60000)
    public void test_14_postOnSessionReturns200UsingMongo() throws Exception {
        List<MongoInsertionDto> insertions = mongo().insertInto("session", "main_session")
                .d("{\"id\":\"_EM_6671_XYZ\", \"checksum\":\"_EM_6672_XYZ_\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"ZETId9RKFiiKwMnJ\", \"type\":\"main_session\", \"_id\":{\"$oid\":\"1e559b1970dfdddebc94b4db\"}}")
            .and().insertInto("session", "main_session")
                .d("{\"id\":\"2\", \"checksum\":\"ZUUUbebxiUo\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_6939_XYZ_\", \"type\":\"settings\", \"_id\":{\"$oid\":\"d7cee82dcee9c2d2dcf7a62c\"}}")
            .and().insertInto("session", "comparison_session")
                .d("{\"id\":\"XP0mYJbU\", \"checksum\":\"76fi_vszGgk4bBuV\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"DC112H_\", \"type\":\"virtual_study\", \"_id\":{\"$oid\":\"fbf1fbcce750255beb7f8a86\"}}")
            .and().insertInto("session", "comparison_session")
                .d("{\"id\":\"f\", \"checksum\":\"_EM_5756_XYZ_j\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"R0W7m\", \"type\":\"virtual_study\", \"_id\":{\"$oid\":\"ca807a0be801aff0360a3c10\"}}")
            .and().insertInto("session", "custom_data")
                .d("{\"id\":\"yUtjiDnsfwsCrv_p\", \"checksum\":\"g19oiQDIjQw\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_6937_XYZ_\", \"type\":\"genomic_chart\", \"_id\":{\"$oid\":\"f43d8b4f615a15cd75afd216\"}}")
            .and().insertInto("session", "custom_data")
                .d("{\"id\":\"UU2U\", \"checksum\":\"f\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"Z2AVVJG4B1\", \"type\":\"virtual_study\", \"_id\":{\"$oid\":\"89e2f3b18acd28cf596b5d07\"}}")
            .and().insertInto("session", "virtual_study")
                .d("{\"id\":\"ZL8ptmy\", \"checksum\":\"eV6Zt3aeWCwA0Ov\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_6940_XYZ_\", \"type\":\"settings\", \"_id\":{\"$oid\":\"edbc3de178ab09ee7d77d4c8\"}}")
            .and().insertInto("session", "virtual_study")
                .d("{\"id\":\"1eiWbVLwo\", \"checksum\":\"UJk\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_EM_6944_XYZ_\", \"type\":\"genomic_chart\", \"_id\":{\"$oid\":\"b1193ad0108d1ada8bbf7cd5\"}}")
            .and().insertInto("session", "custom_gene_list")
                .d("{\"id\":\"_EM_6945_XYZ_\", \"checksum\":\"61d5yyc0Al\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"_qt6OYro_adzK6c\", \"type\":\"custom_data\", \"_id\":{\"$oid\":\"bbabd1dc8a48c5c8abe7c5f2\"}}")
            .and().insertInto("session", "custom_gene_list")
                .d("{\"id\":\"bw\", \"checksum\":\"JwH\", \"data\":{\n                    \"EM_tainted_map\":\"_EM_16_XYZ_\"\n                    }, \"source\":\"F6u0a3dND2AG\", \"type\":\"virtual_study\", \"_id\":{\"$oid\":\"f0cdcdd3fa625254cbd07cfe\"}}")
            .dtos();
        MongoInsertionResultsDto insertionsresult = controller.execInsertionsIntoMongoDatabase(insertions);
        
        given().accept("*/*")
                .header("x-EMextraHeader123", "")
                .contentType("application/json")
                .body(" {} ")
                .post(baseUrlOfSut + "/api/sessions/NumberLong/genomic_chart?" + 
                    "field=genomic_chart&" + 
                    "value=%7B%0A++++++++++++++++++++%22EM_tainted_map%22%3A%22_EM_6679_XYZ_%22%0A++++++++++++++++++++%7D")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }


}