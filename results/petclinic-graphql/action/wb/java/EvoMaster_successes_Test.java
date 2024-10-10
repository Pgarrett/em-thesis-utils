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
import static org.evomaster.client.java.sql.dsl.SqlDsl.sql;
import  org.evomaster.client.java.controller.api.dto.database.operations.InsertionResultsDto;
import  org.evomaster.client.java.controller.api.dto.database.operations.InsertionDto;
import static org.hamcrest.Matchers.*;
import  io.restassured.config.JsonConfig;
import  io.restassured.path.json.config.JsonPathConfig;
import static io.restassured.config.RedirectConfig.redirectConfig;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;




/**
*  This file was automatically generated by EvoMaster on 2024-10-10T19:25:12.780-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 10 tests
 * <br>
*  Covered targets: 384
 * <br>
*  Used time: 0h 10m 6s
 * <br>
*  Needed budget for current results: 59%
 * <br>
*  This file contains test cases that represent successful calls.
*/
public class EvoMaster_successes_Test {

    
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
        controller.resetDatabase(Arrays.asList("owners","pets","specialties","types","vet_specialties","visits"));
        controller.resetStateOfSUT();
    }
    
    
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: pets
    // 			Action parameters:
    // 				pets: '{"id":true, "name":true, "birthDate":true, "owner":{"id":true, "firstName":true, "lastName":false, "address":true, "city":true, "telephone":false}}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.ObjectGene = pets:{"id":true, "name":true, "birthDate":true, "owner":{"id":true, "firstName":true, "lastName":false, "address":true, "city":true, "telephone":false}}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: pets
    @Test(timeout = 60000)
    public void test_0_queryOnPetsReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \" {  pets  {id,name,birthDate,owner{id,firstName,address,city}}   }   \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'pets'.size()", equalTo(0));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: pettypes
    // 			Action parameters:
    // 				pettypes: '{"id":true, "name":false}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.ObjectGene = pettypes:{"id":true, "name":false}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: pettypes
    @Test(timeout = 60000)
    public void test_1_queryOnPettypesReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \" {  pettypes  {id}   }   \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'pettypes'.size()", equalTo(0));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: vets
    // 			Action parameters:
    // 				vets: '{"id":false, "firstName":true, "lastName":true, "specialties":{"id":true, "name":false}}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.ObjectGene = vets:{"id":false, "firstName":true, "lastName":true, "specialties":{"id":true, "name":false}}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: vets
    @Test(timeout = 60000)
    public void test_2_queryOnVetsReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \" {  vets  {firstName,lastName,specialties{id}}   }   \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'vets'.size()", equalTo(0));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: specialties
    // 			Action parameters:
    // 				specialties: '{"id":true, "name":true}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.ObjectGene = specialties:{"id":true, "name":true}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: specialties
    @Test(timeout = 60000)
    public void test_3_queryOnSpecialtiesReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \" {  specialties  {id,name}   }   \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'specialties'.size()", equalTo(3))
                .body("'data'.'specialties'[0].'name'", containsString("radiology"))
                .body("'data'.'specialties'[1].'name'", containsString("surgery"))
                .body("'data'.'specialties'[2].'name'", containsString("dentistry"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:1
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:1
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:2
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:2
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:3
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:3
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:4
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:4
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:5
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:5
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:6
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:6
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:7
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:7
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:8
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:8
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:9
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:9
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:10
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:10
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:1
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:1
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:2
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:2
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:3
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:3
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:4
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:4
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:5
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:5
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:6
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:6
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:7
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:7
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:8
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:8
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:9
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:9
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:10
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:10
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:11
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:11
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:12
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:12
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:13
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:13
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_specialties_id
    // 			Action parameters:
    // 				SQL_Insert_specialties_id:1
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:1
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_specialties_id
    // 			Action parameters:
    // 				SQL_Insert_specialties_id:2
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:2
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_specialties_id
    // 			Action parameters:
    // 				SQL_Insert_specialties_id:3
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:3
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_types_id
    // 			Action parameters:
    // 				SQL_Insert_types_id:1
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:1
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_types_id
    // 			Action parameters:
    // 				SQL_Insert_types_id:2
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:2
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_types_id
    // 			Action parameters:
    // 				SQL_Insert_types_id:3
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:3
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_types_id
    // 			Action parameters:
    // 				SQL_Insert_types_id:4
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:4
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_types_id
    // 			Action parameters:
    // 				SQL_Insert_types_id:5
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:5
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_types_id
    // 			Action parameters:
    // 				SQL_Insert_types_id:6
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:6
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_vets_id
    // 			Action parameters:
    // 				SQL_Insert_vets_id:1
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:1
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_vets_id
    // 			Action parameters:
    // 				SQL_Insert_vets_id:2
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:2
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_vets_id
    // 			Action parameters:
    // 				SQL_Insert_vets_id:3
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:3
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_vets_id
    // 			Action parameters:
    // 				SQL_Insert_vets_id:4
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:4
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_vets_id
    // 			Action parameters:
    // 				SQL_Insert_vets_id:5
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:5
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_vets_id
    // 			Action parameters:
    // 				SQL_Insert_vets_id:6
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:6
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_visits_id
    // 			Action parameters:
    // 				SQL_Insert_visits_id:1
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:1
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_visits_id
    // 			Action parameters:
    // 				SQL_Insert_visits_id:2
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:2
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_visits_id
    // 			Action parameters:
    // 				SQL_Insert_visits_id:3
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:3
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_visits_id
    // 			Action parameters:
    // 				SQL_Insert_visits_id:4
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:4
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_address_city_first_name_id_last_name_telephone
    // 			Action parameters:
    // 				SQL_Insert_owners_address:XU8xfUHUr_city:SKlZJwtp_first_name:UPS9MEn_id:null_last_name:CaDLU_telephone:E5
    // 			Genes:// 				Error trying to print org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene information: AutoIncrement fields should never be printed
    // 				org.evomaster.core.search.gene.optional.NullableGene = first_name:UPS9MEn
    // 				org.evomaster.core.search.gene.optional.NullableGene = last_name:CaDLU
    // 				org.evomaster.core.search.gene.optional.NullableGene = address:XU8xfUHUr
    // 				org.evomaster.core.search.gene.optional.NullableGene = city:SKlZJwtp
    // 				org.evomaster.core.search.gene.optional.NullableGene = telephone:E5
    // 		org.evomaster.core.problem.graphql.GraphQLAction: owner
    // 			Action parameters:
    // 				id: '1'
    // 				owner: '{"id":false, "firstName":false, "lastName":true, "address":true, "city":false, "telephone":false, "pets":{"id":false, "name":false, "birthDate":false, "type":{"id":true, "name":false}, "visits":{"totalCount":true}}}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.numeric.IntegerGene = id:1
    // 				org.evomaster.core.search.gene.ObjectGene = owner:{"id":false, "firstName":false, "lastName":true, "address":true, "city":false, "telephone":false, "pets":{"id":false, "name":false, "birthDate":false, "type":{"id":true, "name":false}, "visits":{"totalCount":true}}}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: owner
    @Test(timeout = 60000)
    public void test_4_queryOnOwnerReturnsData() throws Exception {
        List<InsertionDto> insertions = sql().insertInto("owners", 899L)
                .d("first_name", "\"UPS9MEn\"")
                .d("last_name", "\"CaDLU\"")
                .d("address", "\"XU8xfUHUr\"")
                .d("city", "\"SKlZJwtp\"")
                .d("telephone", "\"E5\"")
            .dtos();
        InsertionResultsDto insertionsresult = controller.execInsertionsIntoDatabase(insertions);
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { owner  (id : 1)  {lastName,address,pets{type{id},visits{totalCount}}}       } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'owner'.'lastName'", containsString("CaDLU"))
                .body("'data'.'owner'.'address'", containsString("XU8xfUHUr"))
                .body("'data'.'owner'.'pets'.size()", equalTo(0));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: addSpecialty
    // 			Action parameters:
    // 				input: '{"name":"s4iy4apVeuT86f"}'
    // 				addSpecialty: '{"specialty":{"id":true, "name":true}}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.ObjectGene = input:{"name":"s4iy4apVeuT86f"}
    // 				org.evomaster.core.search.gene.ObjectGene = addSpecialty:{"specialty":{"id":true, "name":true}}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: addSpecialty
    @Test(timeout = 60000)
    public void test_5_mutationOnAddspecialtyReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"mutation{    addSpecialty  ( input:{name:\\\"s4iy4apVeuT86f\\\"})    {specialty{id,name}}    }\" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'addSpecialty'.'specialty'.'name'", containsString("s4iy4apVeuT86f"));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: updateSpecialty
    // 			Action parameters:
    // 				input: '{"specialtyId":3, "name":"jzu"}'
    // 				updateSpecialty: '{"specialty":{"id":true, "name":false}}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.ObjectGene = input:{"specialtyId":3, "name":"jzu"}
    // 				org.evomaster.core.search.gene.ObjectGene = updateSpecialty:{"specialty":{"id":true, "name":false}}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: updateSpecialty
    @Test(timeout = 60000)
    public void test_6_mutationOnUpdatespecialtyReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"mutation{    updateSpecialty  ( input:{specialtyId:3, name:\\\"jzu\\\"})    {specialty{id}}    }\" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json");
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: removeSpecialty
    // 			Action parameters:
    // 				input: '{"specialtyId":2}'
    // 				removeSpecialty: '{"specialties":{"id":true, "name":false}}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.ObjectGene = input:{"specialtyId":2}
    // 				org.evomaster.core.search.gene.ObjectGene = removeSpecialty:{"specialties":{"id":true, "name":false}}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: removeSpecialty
    @Test(timeout = 60000)
    public void test_7_mutationOnRemovespecialtyReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"mutation{    removeSpecialty  ( input:{specialtyId:2})    {specialties{id}}    }\" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'removeSpecialty'.'specialties'.size()", equalTo(2));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: addOwner
    // 			Action parameters:
    // 				input: '{"firstName":"v2y7904gOTM3YRu", "lastName":"_EM_7895_XYZ_", "address":"_EM_7896_XYZ_", "city":"_EM_5829_XYZ_", "telephone":"0"}'
    // 				addOwner: '{"owner":{"id":false, "firstName":true, "lastName":false, "address":false, "city":true, "telephone":false, "pets":{"id":true, "name":true, "birthDate":false, "visits":{"totalCount":true}}}}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.ObjectGene = input:{"firstName":"v2y7904gOTM3YRu", "lastName":"_EM_7895_XYZ_", "address":"_EM_7896_XYZ_", "city":"_EM_5829_XYZ_", "telephone":"0"}
    // 				org.evomaster.core.search.gene.ObjectGene = addOwner:{"owner":{"id":false, "firstName":true, "lastName":false, "address":false, "city":true, "telephone":false, "pets":{"id":true, "name":true, "birthDate":false, "visits":{"totalCount":true}}}}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: addOwner
    @Test(timeout = 60000)
    public void test_8_mutationOnAddownerReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"mutation{    addOwner  ( input:{firstName:\\\"v2y7904gOTM3YRu\\\", lastName:\\\"_EM_7895_XYZ_\\\", address:\\\"_EM_7896_XYZ_\\\", city:\\\"_EM_5829_XYZ_\\\", telephone:\\\"0\\\"})    {owner{firstName,city,pets{id,name,visits{totalCount}}}}    }\" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'addOwner'.'owner'.'firstName'", containsString("v2y7904gOTM3YRu"))
                .body("'data'.'addOwner'.'owner'.'city'", containsString("_EM_5829_XYZ_"))
                .body("'data'.'addOwner'.'owner'.'pets'.size()", equalTo(0));
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:1
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:1
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:2
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:2
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:3
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:3
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:4
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:4
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:5
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:5
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:6
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:6
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:7
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:7
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:8
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:8
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:9
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:9
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:10
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:10
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:1
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:1
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:2
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:2
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:3
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:3
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:4
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:4
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:5
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:5
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:6
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:6
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:7
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:7
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:8
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:8
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:9
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:9
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:10
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:10
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:11
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:11
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:12
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:12
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_id
    // 			Action parameters:
    // 				SQL_Insert_pets_id:13
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:13
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_specialties_id
    // 			Action parameters:
    // 				SQL_Insert_specialties_id:1
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:1
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_specialties_id
    // 			Action parameters:
    // 				SQL_Insert_specialties_id:2
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:2
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_specialties_id
    // 			Action parameters:
    // 				SQL_Insert_specialties_id:3
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:3
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_types_id
    // 			Action parameters:
    // 				SQL_Insert_types_id:1
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:1
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_types_id
    // 			Action parameters:
    // 				SQL_Insert_types_id:2
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:2
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_types_id
    // 			Action parameters:
    // 				SQL_Insert_types_id:3
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:3
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_types_id
    // 			Action parameters:
    // 				SQL_Insert_types_id:4
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:4
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_types_id
    // 			Action parameters:
    // 				SQL_Insert_types_id:5
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:5
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_types_id
    // 			Action parameters:
    // 				SQL_Insert_types_id:6
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:6
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_vets_id
    // 			Action parameters:
    // 				SQL_Insert_vets_id:1
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:1
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_vets_id
    // 			Action parameters:
    // 				SQL_Insert_vets_id:2
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:2
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_vets_id
    // 			Action parameters:
    // 				SQL_Insert_vets_id:3
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:3
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_vets_id
    // 			Action parameters:
    // 				SQL_Insert_vets_id:4
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:4
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_vets_id
    // 			Action parameters:
    // 				SQL_Insert_vets_id:5
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:5
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_vets_id
    // 			Action parameters:
    // 				SQL_Insert_vets_id:6
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:6
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_visits_id
    // 			Action parameters:
    // 				SQL_Insert_visits_id:1
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:1
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_visits_id
    // 			Action parameters:
    // 				SQL_Insert_visits_id:2
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:2
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_visits_id
    // 			Action parameters:
    // 				SQL_Insert_visits_id:3
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:3
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_visits_id
    // 			Action parameters:
    // 				SQL_Insert_visits_id:4
    // 			Genes:
    // 				org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene = id:4
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_types_id
    // 			Action parameters:
    // 				SQL_Insert_types_id:null
    // 			Genes:// 				Error trying to print org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene information: AutoIncrement fields should never be printed
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_owners_id
    // 			Action parameters:
    // 				SQL_Insert_owners_id:null
    // 			Genes:// 				Error trying to print org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene information: AutoIncrement fields should never be printed
    // 		org.evomaster.core.sql.SqlAction: SQL_Insert_pets_birth_date_id_name_owner_id_type_id
    // 			Action parameters:
    // 				SQL_Insert_pets_birth_date:1927-11-05_id:null_name:NULL_owner_id:null_type_id:null
    // 			Genes:// 				Error trying to print org.evomaster.core.search.gene.sql.SqlPrimaryKeyGene information: AutoIncrement fields should never be printed
    // 				org.evomaster.core.search.gene.optional.NullableGene = name:NULL
    // 				org.evomaster.core.search.gene.optional.NullableGene = birth_date:1927-11-05// 				Error trying to print org.evomaster.core.search.gene.sql.SqlForeignKeyGene information: Input genes do not contain primary key with id 28// 				Error trying to print org.evomaster.core.search.gene.sql.SqlForeignKeyGene information: Input genes do not contain primary key with id 8
    // 		org.evomaster.core.problem.graphql.GraphQLAction: owners
    // 			Action parameters:
    // 				filter: '{"firstName":"fUvmm4dec0Cca", "lastName":"_ahz6D", "address":"WtXJX6K0ZE", "city":"_EM_107_XYZ_", "telephone":null}'
    // 				orders: 'null'
    // 				owners: '{"id":true, "firstName":true, "lastName":true, "address":false, "city":false, "telephone":true, "pets":{"id":false, "name":true, "birthDate":true}}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = filter:{"firstName":"fUvmm4dec0Cca", "lastName":"_ahz6D", "address":"WtXJX6K0ZE", "city":"_EM_107_XYZ_", "telephone":null}
    // 				org.evomaster.core.search.gene.optional.OptionalGene = orders:null
    // 				org.evomaster.core.search.gene.ObjectGene = owners:{"id":true, "firstName":true, "lastName":true, "address":false, "city":false, "telephone":true, "pets":{"id":false, "name":true, "birthDate":true}}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.graphql.GraphQLAction: owners
    @Test(timeout = 60000)
    public void test_9_queryOnOwnersReturnsData() throws Exception {
        
        given().accept("application/json")
                .contentType("application/json")
                .body(" { " + 
                    " \"query\": \"  { owners  ( filter:{firstName:\\\"fUvmm4dec0Cca\\\", lastName:\\\"_ahz6D\\\", address:\\\"WtXJX6K0ZE\\\", city:\\\"_EM_107_XYZ_\\\", telephone:null},orders : null)  {id,firstName,lastName,telephone,pets{name,birthDate}}       } \" " + 
                    " } ")
                .post(baseUrlOfSut + "/graphql")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("application/json")
                .body("'data'.'owners'.size()", equalTo(0));
    }


}