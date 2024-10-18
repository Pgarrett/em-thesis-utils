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
*  This file was automatically generated by EvoMaster on 2024-10-18T12:27:02.414-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 3 tests
 * <br>
*  Covered targets: 12
 * <br>
*  Used time: 0h 10m 7s
 * <br>
*  Needed budget for current results: 76%
 * <br>
*  This file contains test cases that represent failed calls, but not indicative of faults.
*/
public class EvoMaster_others_Test {

    
    private static final SutHandler controller = new em.embedded.org.springframework.samples.petclinic.EmbeddedEvoMasterController();
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
        controller.resetDatabase(Arrays.asList());
        controller.resetStateOfSUT();
    }
    
    
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: addVisit
    // 			Action parameters:
    // 				input: '{"petId":827, "description":"r", "date":"1919-03-13"}'
    // 				addVisit: '{"visit":{"id":true, "description":true, "pet":{"id":true, "name":false, "birthDate":false, "type":{"id":false, "name":true}}, "date":true}}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.ObjectGene = input:'{"petId":827, "description":"r", "date":"1919-03-13"}'
    // 				org.evomaster.core.search.gene.ObjectGene = addVisit:'{"visit":{"id":true, "description":true, "pet":{"id":true, "name":false, "birthDate":false, "type":{"id":false, "name":true}}, "date":true}}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: addVisit
    @Test(timeout = 60000)
    public void test_0_mUTATIONOnAddVisitReturnsEmpty() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"mutation{    addVisit  ( input:{petId:827, description:\\\"r\\\", date:\\\"1919-03-13\\\"})    {visit{id,description,pet{id,type{name}},date}}    }\" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: updatePet
    // 			Action parameters:
    // 				input: '{"petId":330, "birthDate":"2063-04-29"}'
    // 				updatePet: '{"pet":{"id":false, "name":true, "birthDate":false, "type":{"id":true, "name":false}, "visits":{"totalCount":true, "visits":{"id":true, "description":false, "date":false}}}}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.ObjectGene = input:'{"petId":330, "birthDate":"2063-04-29"}'
    // 				org.evomaster.core.search.gene.ObjectGene = updatePet:'{"pet":{"id":false, "name":true, "birthDate":false, "type":{"id":true, "name":false}, "visits":{"totalCount":true, "visits":{"id":true, "description":false, "date":false}}}}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: updatePet
    @Test(timeout = 60000)
    public void test_1_mUTATIONOnUpdatePetReturnsEmpty() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"mutation{    updatePet  ( input:{petId:330, birthDate:\\\"2063-04-29\\\"})    {pet{name,type{id},visits{totalCount,visits{id}}}}    }\" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: addPet
    // 			Action parameters:
    // 				input: '{"ownerId":45, "name":"_EM_175_XYZ_", "birthDate":"1912-06-02", "typeId":7}'
    // 				addPet: '{"pet":{"id":false, "name":true, "birthDate":true, "owner":{"id":true, "firstName":true, "lastName":true, "address":false, "city":true, "telephone":false}}}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.ObjectGene = input:'{"ownerId":45, "name":"_EM_175_XYZ_", "birthDate":"1912-06-02", "typeId":7}'
    // 				org.evomaster.core.search.gene.ObjectGene = addPet:'{"pet":{"id":false, "name":true, "birthDate":true, "owner":{"id":true, "firstName":true, "lastName":true, "address":false, "city":true, "telephone":false}}}'
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: addPet
    @Test(timeout = 60000)
    public void test_2_mUTATIONOnAddPetReturnsEmpty() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"mutation{    addPet  ( input:{ownerId:45, name:\\\"_EM_175_XYZ_\\\", birthDate:\\\"1912-06-02\\\", typeId:7})    {pet{name,birthDate,owner{id,firstName,lastName,city}}}    }\" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }


}
