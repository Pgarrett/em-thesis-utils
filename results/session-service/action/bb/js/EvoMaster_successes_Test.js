const superagent = require("superagent");
const EM = require("./EMTestUtils.js");
jest.setTimeout(60000);




/**
*  This file was automatically generated by EvoMaster on 2024-10-06T16:11:32.649-03:00[America/Argentina/Buenos_Aires]
*  
*  The generated test suite contains 1 tests
*  
*  Covered targets: 2
*  
*  Used time: 0h 21m 52s
*  
*  Needed budget for current results: 100%
*  
*  This file contains test cases that represent successful calls.
*/

const baseUrlOfSut = "http://localhost:8080";


beforeAll( async () => {
});








// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/v2/api-docs
// 			Action parameters:
// 			Genes:
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/v2/api-docs
test("test_0_GetOnApi_docsReturns200", async () => {
    
    const res_0 = await superagent
            .get(baseUrlOfSut + "/v2/api-docs").set('Accept', "*/*")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(200);
});
