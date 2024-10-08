const superagent = require("superagent");
const EM = require("./EMTestUtils.js");
jest.setTimeout(60000);




/**
*  This file was automatically generated by EvoMaster on 2024-10-06T17:22:35.550-03:00[America/Argentina/Buenos_Aires]
*  
*  The generated test suite contains 6 tests
*  
*  Covered targets: 18
*  
*  Used time: 0h 10m 34s
*  
*  Needed budget for current results: 98%
*  
*  This file contains test cases that represent successful calls.
*/

const baseUrlOfSut = "http://localhost:8080/graphql";


beforeAll( async () => {
});








// Individual:
// 	Actions:
// 		org.evomaster.core.problem.graphql.GraphQLAction: remainder
// 			Action parameters:
// 				a: ''
// 				b: ''
// 			Genes:
// 				org.evomaster.core.search.gene.optional.OptionalGene = a:
// 				org.evomaster.core.search.gene.optional.OptionalGene = b:
// 	Evaluated Actions:
// 		org.evomaster.core.problem.graphql.GraphQLAction: remainder
test("test_0_QueryOnRemainderReturnsData", async () => {
    
    const res_0 = await superagent
            .post(baseUrlOfSut).set('Accept', "application/json")
            .set('Content-Type','application/json')
            .send(" { " + 
                " \"query\": \"  { remainder           } \" " + 
                " } ")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(200);
    expect(res_0.header["content-type"].startsWith("application/json")).toBe(true);
    expect(res_0.body.data.remainder).toBe(-1.0);
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.graphql.GraphQLAction: gammq
// 			Action parameters:
// 				a: '0.28772694'
// 				x: '0.41103733'
// 			Genes:
// 				org.evomaster.core.search.gene.optional.OptionalGene = a:0.28772694
// 				org.evomaster.core.search.gene.optional.OptionalGene = x:0.41103733
// 	Evaluated Actions:
// 		org.evomaster.core.problem.graphql.GraphQLAction: gammq
test("test_1_QueryOnGammqReturnsData", async () => {
    
    const res_0 = await superagent
            .post(baseUrlOfSut).set('Accept', "application/json")
            .set('Content-Type','application/json')
            .send(" { " + 
                " \"query\": \"  { gammq  (a : 0.28772694,x : 0.41103733)         } \" " + 
                " } ")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(200);
    expect(res_0.header["content-type"].startsWith("application/json")).toBe(true);
    expect(res_0.body.data.gammq).toBe(0.2098432253800444);
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.graphql.GraphQLAction: triangleClassification
// 			Action parameters:
// 				a: ''
// 				b: ''
// 				c: ''
// 			Genes:
// 				org.evomaster.core.search.gene.optional.OptionalGene = a:
// 				org.evomaster.core.search.gene.optional.OptionalGene = b:
// 				org.evomaster.core.search.gene.optional.OptionalGene = c:
// 	Evaluated Actions:
// 		org.evomaster.core.problem.graphql.GraphQLAction: triangleClassification
test("test_2_QueryOnTriangleclassificationReturnsData", async () => {
    
    const res_0 = await superagent
            .post(baseUrlOfSut).set('Accept', "application/json")
            .set('Content-Type','application/json')
            .send(" { " + 
                " \"query\": \"  { triangleClassification           } \" " + 
                " } ")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(200);
    expect(res_0.header["content-type"].startsWith("application/json")).toBe(true);
    expect(res_0.body.data.triangleClassification).toBe(0.0);
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.graphql.GraphQLAction: bessj
// 			Action parameters:
// 				n: '319'
// 				x: '0.9467864'
// 			Genes:
// 				org.evomaster.core.search.gene.optional.OptionalGene = n:319
// 				org.evomaster.core.search.gene.optional.OptionalGene = x:0.9467864
// 	Evaluated Actions:
// 		org.evomaster.core.problem.graphql.GraphQLAction: bessj
test("test_3_QueryOnBessjReturnsData", async () => {
    
    const res_0 = await superagent
            .post(baseUrlOfSut).set('Accept', "application/json")
            .set('Content-Type','application/json')
            .send(" { " + 
                " \"query\": \"  { bessj  (n : 319,x : 0.9467864)         } \" " + 
                " } ")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(200);
    expect(res_0.header["content-type"].startsWith("application/json")).toBe(true);
    expect(res_0.body.data.bessj).toBe(0.0);
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.graphql.GraphQLAction: fisher
// 			Action parameters:
// 				m: '419'
// 				n: '727'
// 				x: '0.12652963'
// 			Genes:
// 				org.evomaster.core.search.gene.optional.OptionalGene = m:419
// 				org.evomaster.core.search.gene.optional.OptionalGene = n:727
// 				org.evomaster.core.search.gene.optional.OptionalGene = x:0.12652963
// 	Evaluated Actions:
// 		org.evomaster.core.problem.graphql.GraphQLAction: fisher
test("test_4_QueryOnFisherReturnsData", async () => {
    
    const res_0 = await superagent
            .post(baseUrlOfSut).set('Accept', "application/json")
            .set('Content-Type','application/json')
            .send(" { " + 
                " \"query\": \"  { fisher  (m : 419,n : 727,x : 0.12652963)         } \" " + 
                " } ")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(200);
    expect(res_0.header["content-type"].startsWith("application/json")).toBe(true);
    expect(res_0.body.data.fisher).toBe(2.298939980713004E-14);
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.graphql.GraphQLAction: expint
// 			Action parameters:
// 				n: '1387080111'
// 				x: 'null'
// 			Genes:
// 				org.evomaster.core.search.gene.optional.OptionalGene = n:1387080111
// 				org.evomaster.core.search.gene.optional.OptionalGene = x:null
// 	Evaluated Actions:
// 		org.evomaster.core.problem.graphql.GraphQLAction: expint
test("test_5_QueryOnExpintReturnsData", async () => {
    
    const res_0 = await superagent
            .post(baseUrlOfSut).set('Accept', "application/json")
            .set('Content-Type','application/json')
            .send(" { " + 
                " \"query\": \"  { expint  (n : 1387080111,x : null)         } \" " + 
                " } ")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(200);
    expect(res_0.header["content-type"].startsWith("application/json")).toBe(true);
    expect(res_0.body.data.expint).toBe(7.209388937168164E-10);
});
