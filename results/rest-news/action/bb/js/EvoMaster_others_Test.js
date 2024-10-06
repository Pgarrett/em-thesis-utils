const superagent = require("superagent");
const EM = require("./EMTestUtils.js");
jest.setTimeout(60000);




/**
*  This file was automatically generated by EvoMaster on 2024-10-06T15:18:05.071-03:00[America/Argentina/Buenos_Aires]
*  
*  The generated test suite contains 8 tests
*  
*  Covered targets: 8
*  
*  Used time: 0h 10m 39s
*  
*  Needed budget for current results: 67%
*  
*  This file contains test cases that represent failed calls, but not indicative of faults.
*/

const baseUrlOfSut = "http://localhost:8080";


beforeAll( async () => {
});








// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: PUT:/news/{id}
// 			Action parameters:
// 				id: 'iROwLJ3Pmp'
// 				body: '{"authorId":"kDdF", "country":"skp7Nevkt", "creationTime":"2067-01-06T16:05:50", "id":"iROwLJ3Pmp", "newsId":"61LdNn02leF8"}'
// 			Genes:
// 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:iROwLJ3Pmp
// 				org.evomaster.core.search.gene.optional.OptionalGene = body:{"authorId":"kDdF", "country":"skp7Nevkt", "creationTime":"2067-01-06T16:05:50", "id":"iROwLJ3Pmp", "newsId":"61LdNn02leF8"}
// 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
// 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:true
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: PUT:/news/{id}
test("test_0_PutOnNewReturns400", async () => {
    
    const res_0 = await superagent
            .put(baseUrlOfSut + "/news/iROwLJ3Pmp").set('Accept', "application/vnd.tsdes.news+json;charset=UTF-8;version=2")
            .set('Content-Type','application/json')
            .send(" { " + 
                " \"authorId\": \"kDdF\", " + 
                " \"country\": \"skp7Nevkt\", " + 
                " \"creationTime\": \"2067-01-06T16:05:50\", " + 
                " \"id\": \"iROwLJ3Pmp\", " + 
                " \"newsId\": \"61LdNn02leF8\" " + 
                " } ")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(400);
    expect(res_0.header["content-type"].startsWith("application/vnd.tsdes.news+json")).toBe(true);
    expect(res_0.body.status).toBe(400.0);
    expect(res_0.body.error).toBe("Bad Request");
    expect(res_0.body.message).toBe("JSON parse error: Cannot deserialize value of type `java.time.ZonedDateTime` from String \"2067-01-06T16:05:50\": Failed to deserialize java.time.ZonedDateTime: (java.time.format.DateTimeParseException) Text '2067-01-06T16:05:50' could not be parsed at index 19; nested exception is com.fasterxml.jackson.databind.exc.InvalidFormatException: Cannot deserialize value of type `java.time.ZonedDateTime` from String \"2067-01-06T16:05:50\": Failed to deserialize java.time.ZonedDateTime: (java.time.format.DateTimeParseException) Text '2067-01-06T16:05:50' could not be parsed at index 19\n at [Source: (PushbackInputStream); line: 1, column: 59] (through reference chain: org.tsdes.spring.examples.news.dto.NewsDto[\"creationTime\"])");
    expect(res_0.body.path).toBe("/news/iROwLJ3Pmp");
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/news/{id}
// 			Action parameters:
// 				id: 'UKTgZOlGluMESx9S'
// 			Genes:
// 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:UKTgZOlGluMESx9S
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/news/{id}
test("test_1_DeleteOnNewReturns400", async () => {
    
    const res_0 = await superagent
            .delete(baseUrlOfSut + "/news/UKTgZOlGluMESx9S").set('Accept', "*/*")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(400);
    expect(res_0.body===null || res_0.body===undefined || res_0.body==="" || Object.keys(res_0.body).length === 0).toBe(true);
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: POST:/news
// 			Action parameters:
// 				body: ''
// 			Genes:
// 				org.evomaster.core.search.gene.optional.OptionalGene = body:
// 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json;charset=UTF-8
// 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:true
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: POST:/news
test("test_2_PostOnNewsReturns400", async () => {
    
    const res_0 = await superagent
            .post(baseUrlOfSut + "/news").set('Accept', "application/vnd.tsdes.news+json;charset=UTF-8;version=2")
            .set('Content-Type','application/json;charset=UTF-8')
            .send(" null ")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(400);
    expect(res_0.header["content-type"].startsWith("application/vnd.tsdes.news+json")).toBe(true);
    expect(res_0.body.status).toBe(400.0);
    expect(res_0.body.error).toBe("Bad Request");
    expect(res_0.body.message).toBe("Required request body is missing: public org.springframework.http.ResponseEntity<java.lang.Long> org.tsdes.spring.examples.news.api.NewsRestApi.createNews(org.tsdes.spring.examples.news.dto.NewsDto)");
    expect(res_0.body.path).toBe("/news");
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: PUT:/news/{id}/text
// 			Action parameters:
// 				id: '51'
// 				body: ''
// 			Genes:
// 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:51
// 				org.evomaster.core.search.gene.optional.OptionalGene = body:
// 				org.evomaster.core.search.gene.collection.EnumGene = contentType:text/plain
// 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:true
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: PUT:/news/{id}/text
test("test_3_PutOnTextReturns400", async () => {
    
    const res_0 = await superagent
            .put(baseUrlOfSut + "/news/51/text").set('Accept', "application/vnd.tsdes.news+json;charset=UTF-8;version=2")
            .set('Content-Type','text/plain')
            .send()
            .ok(res => res.status);
    
    expect(res_0.status).toBe(400);
    expect(res_0.header["content-type"].startsWith("application/vnd.tsdes.news+json")).toBe(true);
    expect(res_0.body.status).toBe(400.0);
    expect(res_0.body.error).toBe("Bad Request");
    expect(res_0.body.message).toBe("Required request body is missing: public org.springframework.http.ResponseEntity<java.lang.Object> org.tsdes.spring.examples.news.api.NewsRestApi.updateText(java.lang.Long,java.lang.String)");
    expect(res_0.body.path).toBe("/news/51/text");
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/news/{id}
// 			Action parameters:
// 				id: '4A'
// 			Genes:
// 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:4A
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/news/{id}
test("test_4_GetOnNewReturns404", async () => {
    
    const res_0 = await superagent
            .get(baseUrlOfSut + "/news/4A").set('Accept', "*/*")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(404);
    expect(res_0.body===null || res_0.body===undefined || res_0.body==="" || Object.keys(res_0.body).length === 0).toBe(true);
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: PUT:/news/{id}/text
// 			Action parameters:
// 				id: '18'
// 				body: '18'
// 			Genes:
// 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:18
// 				org.evomaster.core.search.gene.optional.OptionalGene = body:18
// 				org.evomaster.core.search.gene.collection.EnumGene = contentType:text/plain
// 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:false
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: PUT:/news/{id}/text
test("test_5_PutOnTextReturns404", async () => {
    
    const res_0 = await superagent
            .put(baseUrlOfSut + "/news/18/text").set('Accept', "*/*")
            .set('Content-Type','text/plain')
            .send("18")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(404);
    expect(res_0.body===null || res_0.body===undefined || res_0.body==="" || Object.keys(res_0.body).length === 0).toBe(true);
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: PUT:/news/{id}
// 			Action parameters:
// 				id: 'bEQT'
// 				body: '{"country":"2xMtkmoKMO1Zj9", "newsId":"b_olg9nL"}'
// 			Genes:
// 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:bEQT
// 				org.evomaster.core.search.gene.optional.OptionalGene = body:{"country":"2xMtkmoKMO1Zj9", "newsId":"b_olg9nL"}
// 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
// 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:false
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: PUT:/news/{id}
test("test_6_PutOnNewReturns404", async () => {
    
    const res_0 = await superagent
            .put(baseUrlOfSut + "/news/bEQT").set('Accept', "*/*")
            .set('Content-Type','application/json')
            .send(" { " + 
                " \"country\": \"2xMtkmoKMO1Zj9\", " + 
                " \"newsId\": \"b_olg9nL\" " + 
                " } ")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(404);
    expect(res_0.body===null || res_0.body===undefined || res_0.body==="" || Object.keys(res_0.body).length === 0).toBe(true);
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/news/{id}
// 			Action parameters:
// 				id: '1'
// 			Genes:
// 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:1
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/news/{id}
test("test_7_DeleteOnNewReturns404", async () => {
    
    const res_0 = await superagent
            .delete(baseUrlOfSut + "/news/1").set('Accept', "*/*")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(404);
    expect(res_0.body===null || res_0.body===undefined || res_0.body==="" || Object.keys(res_0.body).length === 0).toBe(true);
});
