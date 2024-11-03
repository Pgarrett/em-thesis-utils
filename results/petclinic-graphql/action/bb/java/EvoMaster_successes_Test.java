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
*  This file was automatically generated by EvoMaster on 2024-11-03T01:47:03.669-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 13 tests
 * <br>
*  Covered targets: 34
 * <br>
*  Used time: 0h 16m 12s
 * <br>
*  Needed budget for current results: 87%
 * <br>
*  This file contains test cases that represent successful calls.
*/
public class EvoMaster_successes_Test {

    
    private static String baseUrlOfSut = "http://localhost:9977/graphql";
    
    
    @BeforeClass
    public static void initClass() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.urlEncodingEnabled = false;
        RestAssured.config = RestAssured.config()
            .jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE))
            .redirect(redirectConfig().followRedirects(false));
    }
    
    
    
    
    
    
    
    
    @Test(timeout = 60000)
    public void test_0_mutationOnUpdatePetReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"mutation{    updatePet  ( input:{petId:111, name:null, typeId:65})    {pet{id,name,birthDate,type{name},owner{id}}}    }\" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'", nullValue())
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Internal Server Error(s) while executing query"))
                .body("'errors'[0].'path'", nullValue())
                .body("'errors'[0].'extensions'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_1_queryOnPetReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { pet  (id : 273)  {id,name,type{name},visits{visits{date}}}       } \" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'", nullValue())
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Cannot return null for non-nullable type: 'Pet' within parent 'Query' (/pet)"))
                .body("'errors'[0].'path'.size()", equalTo(1))
                .body("'errors'[0].'path'", hasItems("pet"))
                .body("'errors'[0].'errorType'", containsString("DataFetchingException"))
                .body("'errors'[0].'locations'", nullValue())
                .body("'errors'[0].'extensions'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_2_mutationOnAddOwnerReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"mutation{    addOwner  ( input:{address:null, telephone:null})    {owner{firstName,lastName,address,telephone,pets{birthDate,visits{totalCount}}}}    }\" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'", nullValue())
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Internal Server Error(s) while executing query"))
                .body("'errors'[0].'path'", nullValue())
                .body("'errors'[0].'extensions'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_3_mutationOnRemoveSpecialtyReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"mutation{    removeSpecialty  ( input:{specialtyId:150})    {specialties{id}}    }\" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'", nullValue())
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Internal Server Error(s) while executing query"))
                .body("'errors'[0].'path'", nullValue())
                .body("'errors'[0].'extensions'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_4_mutationOnUpdateOwnerReturnsError() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"mutation{    updateOwner  ( input:{ownerId:291, firstName:\\\"cMxEVjcYdiKlsXI\\\", address:\\\"Nhbeg_3i\\\"})    {owner{id,firstName,lastName,address,telephone}}    }\" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'", nullValue())
                .body("'errors'.size()", equalTo(1))
                .body("'errors'[0].'message'", containsString("Internal Server Error(s) while executing query"))
                .body("'errors'[0].'path'", nullValue())
                .body("'errors'[0].'extensions'", nullValue());
    }
    
    
    @Test(timeout = 60000)
    public void test_5_queryOnSpecialtiesReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \" {  specialties  {name}   }   \" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'specialties'.size()", equalTo(60))
                .body("'data'.'specialties'[0].'name'", containsString("radiology"))
                .body("'data'.'specialties'[1].'name'", containsString("surgery"))
                .body("'data'.'specialties'[2].'name'", containsString("dentistry"))
                ; // Skipping assertions on the remaining 57 elements. This limit of 3 elements can be increased in the configurations
    }
    
    
    @Test(timeout = 60000)
    public void test_6_mutationOnUpdateSpecialtyReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"mutation{    updateSpecialty  ( input:{specialtyId:35, name:\\\"HKCKy1_kNK\\\"})    {specialty{id,name}}    }\" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'updateSpecialty'.'specialty'.'name'", containsString("HKCKy1_kNK"));
    }
    
    
    @Test(timeout = 60000)
    public void test_7_queryOnOwnersReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { owners    {address,telephone,pets{id,visits{totalCount}}}       } \" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'owners'.size()", equalTo(10))
                .body("'data'.'owners'[0].'address'", containsString("110 W. Liberty St."))
                .body("'data'.'owners'[0].'telephone'", containsString("6085551023"))
                .body("'data'.'owners'[0].'pets'.size()", equalTo(1))
                .body("'data'.'owners'[0].'pets'[0].'visits'.'totalCount'", numberMatches(0.0))
                .body("'data'.'owners'[1].'address'", containsString("638 Cardinal Ave."))
                .body("'data'.'owners'[1].'telephone'", containsString("6085551749"))
                .body("'data'.'owners'[1].'pets'.size()", equalTo(1))
                .body("'data'.'owners'[1].'pets'[0].'visits'.'totalCount'", numberMatches(0.0))
                .body("'data'.'owners'[2].'address'", containsString("2693 Commerce St."))
                .body("'data'.'owners'[2].'telephone'", containsString("6085558763"))
                .body("'data'.'owners'[2].'pets'.size()", equalTo(2))
                .body("'data'.'owners'[2].'pets'[0].'visits'.'totalCount'", numberMatches(0.0))
                .body("'data'.'owners'[2].'pets'[1].'visits'.'totalCount'", numberMatches(0.0))
                ; // Skipping assertions on the remaining 7 elements. This limit of 3 elements can be increased in the configurations
    }
    
    
    @Test(timeout = 60000)
    public void test_8_queryOnOwnerReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { owner  (id : 9)  {address,city,telephone,pets{id,type{name}}}       } \" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'owner'.'address'", containsString("2749 Blackhawk Trail"))
                .body("'data'.'owner'.'city'", containsString("Madison"))
                .body("'data'.'owner'.'telephone'", containsString("6085559435"))
                .body("'data'.'owner'.'pets'.size()", equalTo(1))
                .body("'data'.'owner'.'pets'[0].'type'.'name'", containsString("bird"));
    }
    
    
    @Test(timeout = 60000)
    public void test_9_mutationOnAddSpecialtyReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"mutation{    addSpecialty  ( input:{name:\\\"S\\\"})    {specialty{id}}    }\" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }
    
    
    @Test(timeout = 60000)
    public void test_10_queryOnPetsReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \" {  pets  {id,type{id,name},owner{id,address,city},visits{totalCount}}   }   \" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'pets'.size()", equalTo(13))
                .body("'data'.'pets'[0].'type'.'name'", containsString("cat"))
                .body("'data'.'pets'[0].'owner'.'address'", containsString("110 W. Liberty St."))
                .body("'data'.'pets'[0].'owner'.'city'", containsString("Madison"))
                .body("'data'.'pets'[0].'visits'.'totalCount'", numberMatches(0.0))
                .body("'data'.'pets'[1].'type'.'name'", containsString("hamster"))
                .body("'data'.'pets'[1].'owner'.'address'", containsString("638 Cardinal Ave."))
                .body("'data'.'pets'[1].'owner'.'city'", containsString("Sun Prairie"))
                .body("'data'.'pets'[1].'visits'.'totalCount'", numberMatches(0.0))
                .body("'data'.'pets'[2].'type'.'name'", containsString("dog"))
                .body("'data'.'pets'[2].'owner'.'address'", containsString("2693 Commerce St."))
                .body("'data'.'pets'[2].'owner'.'city'", containsString("McFarland"))
                .body("'data'.'pets'[2].'visits'.'totalCount'", numberMatches(0.0))
                ; // Skipping assertions on the remaining 10 elements. This limit of 3 elements can be increased in the configurations
    }
    
    
    @Test(timeout = 60000)
    public void test_11_queryOnPettypesReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \" {  pettypes  {id}   }   \" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'pettypes'.size()", equalTo(6))
                ; // Skipping assertions on the remaining 3 elements. This limit of 3 elements can be increased in the configurations
    }
    
    
    @Test(timeout = 60000)
    public void test_12_queryOnVetsReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \" {  vets  {firstName,lastName}   }   \" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'vets'.size()", equalTo(6))
                .body("'data'.'vets'[0].'firstName'", containsString("James"))
                .body("'data'.'vets'[0].'lastName'", containsString("Carter"))
                .body("'data'.'vets'[1].'firstName'", containsString("Helen"))
                .body("'data'.'vets'[1].'lastName'", containsString("Leary"))
                .body("'data'.'vets'[2].'firstName'", containsString("Linda"))
                .body("'data'.'vets'[2].'lastName'", containsString("Douglas"))
                ; // Skipping assertions on the remaining 3 elements. This limit of 3 elements can be increased in the configurations
    }


}
