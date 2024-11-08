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
*  This file was automatically generated by EvoMaster on 2024-11-06T22:00:59.533-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 3 tests
 * <br>
*  Covered targets: 9
 * <br>
*  Used time: 0h 11m 18s
 * <br>
*  Needed budget for current results: 100%
 * <br>
*  This file contains test cases that represent failed calls, but not indicative of faults.
*/
public class EvoMaster_others_Test {

    
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
    public void test_0_mutationOnAddPetReturnsEmpty() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"mutation{    addPet  ( input:{ownerId:110, name:\\\"P\\\", birthDate:\\\"2058-08-17\\\", typeId:831})    {pet{birthDate,type{id},owner{id,address,city,telephone}}}    }\" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_1_mutationOnUpdatePetReturnsEmpty() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"mutation{    updatePet  ( input:{petId:608, birthDate:\\\"1927-02-17\\\"})    {pet{id,type{id}}}    }\" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }
    
    
    @Test(timeout = 60000)
    public void test_2_mutationOnAddVisitReturnsEmpty() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"mutation{    addVisit  ( input:{petId:675, description:\\\"9hXjj7\\\", date:\\\"2060-09-22\\\"})    {visit{id,description,date}}    }\" " + 
                    " } ")
                .post(baseUrlOfSut)
                .then()
                .statusCode(400)
                .assertThat()
                .body(isEmptyOrNullString());
    }


}