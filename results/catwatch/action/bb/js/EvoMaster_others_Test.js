const superagent = require("superagent");
const EM = require("./EMTestUtils.js");
jest.setTimeout(60000);




/**
*  This file was automatically generated by EvoMaster on 2024-10-06T13:38:39.601-03:00[America/Argentina/Buenos_Aires]
*  
*  The generated test suite contains 10 tests
*  
*  Covered targets: 10
*  
*  Used time: 0h 15m 10s
*  
*  Needed budget for current results: 100%
*  
*  This file contains test cases that represent failed calls, but not indicative of faults.
*/

const baseUrlOfSut = "http://localhost:8080";


beforeAll( async () => {
});








// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/fetch
// 			Action parameters:
// 			Genes:
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/fetch
test("test_0_GetOnFetchReturnsNull", async () => {
    
    try{
        await superagent
                .get(baseUrlOfSut + "/fetch").set('Accept', "*/*")
                .ok(res => res.status);
    } catch(e){
    }
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/projects
// 			Action parameters:
// 				organizations: ''
// 				limit: ''
// 				offset: '579'
// 				start_date: ''
// 				end_date: '1979-04-32T20:51:24'
// 				sortBy: 'D_qgqwqX'
// 				q: '3anqnyIvAxth7'
// 				language: 'ZtdcFFotLbcdi8P'
// 			Genes:
// 				org.evomaster.core.search.gene.optional.OptionalGene = organizations:
// 				org.evomaster.core.search.gene.optional.OptionalGene = limit:
// 				org.evomaster.core.search.gene.optional.OptionalGene = offset:579
// 				org.evomaster.core.search.gene.optional.OptionalGene = start_date:
// 				org.evomaster.core.search.gene.optional.OptionalGene = end_date:1979-04-32T20:51:24
// 				org.evomaster.core.search.gene.optional.OptionalGene = sortBy:D_qgqwqX
// 				org.evomaster.core.search.gene.optional.OptionalGene = q:3anqnyIvAxth7
// 				org.evomaster.core.search.gene.optional.OptionalGene = language:ZtdcFFotLbcdi8P
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/projects
test("test_1_GetOnProjectsReturns400", async () => {
    
    const res_0 = await superagent
            .get(baseUrlOfSut + "/projects?" + 
                "offset=579&" + 
                "end_date=1979-04-32T20%3A51%3A24&" + 
                "sortBy=D_qgqwqX&" + 
                "q=3anqnyIvAxth7&" + 
                "language=ZtdcFFotLbcdi8P").set('Accept', "application/json")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(400);
    expect(res_0.header["content-type"].startsWith("application/json")).toBe(true);
    expect(res_0.body.status).toBe(400.0);
    expect(res_0.body.error).toBe("Bad Request");
    expect(res_0.body.exception).toBe("org.springframework.web.method.annotation.MethodArgumentTypeMismatchException");
    expect(res_0.body.message).toBe("Failed to convert value of type 'java.lang.String' to required type 'java.util.Date'; nested exception is org.springframework.core.convert.ConversionFailedException: Failed to convert from type [java.lang.String] to type [@io.swagger.annotations.ApiParam @org.springframework.web.bind.annotation.RequestParam @org.springframework.format.annotation.DateTimeFormat java.util.Date] for value '1979-04-32T20:51:24'; nested exception is java.lang.IllegalArgumentException: Parse attempt failed for value [1979-04-32T20:51:24]");
    expect(res_0.body.path).toBe("/projects");
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/statistics/contributors
// 			Action parameters:
// 				organizations: 'nZr'
// 				start_date: '8zRSE_v1E5x'
// 				end_date: ''
// 			Genes:
// 				org.evomaster.core.search.gene.optional.OptionalGene = organizations:nZr
// 				org.evomaster.core.search.gene.optional.OptionalGene = start_date:8zRSE_v1E5x
// 				org.evomaster.core.search.gene.optional.OptionalGene = end_date:
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/statistics/contributors
test("test_2_GetOnContributorsReturns400", async () => {
    
    const res_0 = await superagent
            .get(baseUrlOfSut + "/statistics/contributors?" + 
                "organizations=nZr&" + 
                "start_date=8zRSE_v1E5x").set('Accept', "application/json")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(400);
    expect(res_0.header["content-type"].startsWith("application/json")).toBe(true);
    expect(res_0.text).toBe("Couldn't parse date string 8zRSE_v1E5x.");
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/statistics/projects
// 			Action parameters:
// 				organizations: ''
// 				start_date: 'zhV2d'
// 				end_date: ''
// 			Genes:
// 				org.evomaster.core.search.gene.optional.OptionalGene = organizations:
// 				org.evomaster.core.search.gene.optional.OptionalGene = start_date:zhV2d
// 				org.evomaster.core.search.gene.optional.OptionalGene = end_date:
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/statistics/projects
test("test_3_GetOnProjectsReturns400", async () => {
    
    const res_0 = await superagent
            .get(baseUrlOfSut + "/statistics/projects?start_date=zhV2d").set('Accept', "application/json")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(400);
    expect(res_0.header["content-type"].startsWith("application/json")).toBe(true);
    expect(res_0.text).toBe("Couldn't parse date string zhV2d.");
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/statistics
// 			Action parameters:
// 				organizations: 'nmt'
// 				start_date: ''
// 				end_date: 'XU1kvBt4eqR1RNK'
// 			Genes:
// 				org.evomaster.core.search.gene.optional.OptionalGene = organizations:nmt
// 				org.evomaster.core.search.gene.optional.OptionalGene = start_date:
// 				org.evomaster.core.search.gene.optional.OptionalGene = end_date:XU1kvBt4eqR1RNK
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/statistics
test("test_4_GetOnStatisticsReturns400", async () => {
    
    const res_0 = await superagent
            .get(baseUrlOfSut + "/statistics?" + 
                "organizations=nmt&" + 
                "end_date=XU1kvBt4eqR1RNK").set('Accept', "application/json")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(400);
    expect(res_0.header["content-type"].startsWith("application/json")).toBe(true);
    expect(res_0.text).toBe("Invalid date format for endDate");
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/statistics/languages
// 			Action parameters:
// 				organizations: ''
// 				start_date: '_98TMmYlfIuULZG'
// 				end_date: ''
// 			Genes:
// 				org.evomaster.core.search.gene.optional.OptionalGene = organizations:
// 				org.evomaster.core.search.gene.optional.OptionalGene = start_date:_98TMmYlfIuULZG
// 				org.evomaster.core.search.gene.optional.OptionalGene = end_date:
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/statistics/languages
test("test_5_GetOnLanguagesReturns400", async () => {
    
    const res_0 = await superagent
            .get(baseUrlOfSut + "/statistics/languages?start_date=_98TMmYlfIuULZG").set('Accept', "application/json")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(400);
    expect(res_0.header["content-type"].startsWith("application/json")).toBe(true);
    expect(res_0.text).toBe("Couldn't parse date string _98TMmYlfIuULZG.");
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/init
// 			Action parameters:
// 			Genes:
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/init
test("test_6_GetOnInitReturns401", async () => {
    
    const res_0 = await superagent
            .get(baseUrlOfSut + "/init").set('Accept', "application/json;charset=utf-8")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(401);
    expect(res_0.header["content-type"].startsWith("application/json")).toBe(true);
    expect(res_0.body.error).toBe("unauthorized");
    expect(res_0.body["error_description"]).toBe("Full authentication is required to access this resource");
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/delete
// 			Action parameters:
// 			Genes:
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: GET:/delete
test("test_7_GetOnDeleteReturns401", async () => {
    
    const res_0 = await superagent
            .get(baseUrlOfSut + "/delete").set('Accept', "application/json;charset=utf-8")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(401);
    expect(res_0.header["content-type"].startsWith("application/json")).toBe(true);
    expect(res_0.body.error).toBe("unauthorized");
    expect(res_0.body["error_description"]).toBe("Full authentication is required to access this resource");
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: POST:/config/scoring.project
// 			Action parameters:
// 				X-Organizations: 'SJStfMnJc'
// 				body: 'SJStfMnJc'
// 			Genes:
// 				org.evomaster.core.search.gene.optional.OptionalGene = X-Organizations:SJStfMnJc
// 				org.evomaster.core.search.gene.optional.OptionalGene = body:SJStfMnJc
// 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
// 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:true
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: POST:/config/scoring.project
test("test_8_PostOnScoring_projectReturns403", async () => {
    
    const res_0 = await superagent
            .post(baseUrlOfSut + "/config/scoring.project").set('Accept', "application/json;charset=utf-8")
            .set("X-Organizations", "SJStfMnJc")
            .set('Content-Type','application/json')
            .send(" SJStfMnJc ")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(403);
    expect(res_0.header["content-type"].startsWith("application/json")).toBe(true);
    expect(res_0.text).toBe("This endpoint is deactivated.");
});


// Individual:
// 	Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: POST:/import
// 			Action parameters:
// 				body: '{"contributors":[{"key":{"id":581}, "loginId":"4l6FRQFRxh_iMc1Q", "name":"5Ggus", "organizationId":-3543733377151039447, "organizationName":"KaLK_gchJw3uT", "organizationalCommitsCount":457, "organizationalProjectsCount":664, "snapshotDate":"1991-05-28T25:04:08", "url":"6lJNC2xH"}, {"name":"a", "organizationalProjectsCount":1518959347, "snapshotDate":"2028-13-02T21:08:30", "url":"UTyFOQh"}, {"name":"KXk", "organizationName":"2gEghlSM5PC", "organizationalCommitsCount":956, "url":"I4nm4J46"}], "projects":[], "statistics":[{"allContributorsCount":520, "allForksCount":317, "key":{"id":368}, "membersCount":721, "organizationName":"5eAcklvBf4E_zMQ", "privateProjectCount":157, "programLanguagesCount":2041674186, "snapshotDate":"1962-05-32T20:52:02"}, {"allContributorsCount":53, "allStarsCount":258, "externalContributorsCount":75, "id":498, "organizationName":"bY", "privateProjectCount":669, "programLanguagesCount":249, "snapshotDate":"1916-00-05T24:52:10", "tagsCount":940, "teamsCount":766}, {"allContributorsCount":681, "allSizeCount":557, "allStarsCount":597, "key":{"id":873078961409106439}, "membersCount":687, "programLanguagesCount":55, "snapshotDate":"1930-06-27T13:29:08", "tagsCount":829}]}'
// 			Genes:
// 				org.evomaster.core.search.gene.ObjectGene = body:{"contributors":[{"key":{"id":581}, "loginId":"4l6FRQFRxh_iMc1Q", "name":"5Ggus", "organizationId":-3543733377151039447, "organizationName":"KaLK_gchJw3uT", "organizationalCommitsCount":457, "organizationalProjectsCount":664, "snapshotDate":"1991-05-28T25:04:08", "url":"6lJNC2xH"}, {"name":"a", "organizationalProjectsCount":1518959347, "snapshotDate":"2028-13-02T21:08:30", "url":"UTyFOQh"}, {"name":"KXk", "organizationName":"2gEghlSM5PC", "organizationalCommitsCount":956, "url":"I4nm4J46"}], "projects":[], "statistics":[{"allContributorsCount":520, "allForksCount":317, "key":{"id":368}, "membersCount":721, "organizationName":"5eAcklvBf4E_zMQ", "privateProjectCount":157, "programLanguagesCount":2041674186, "snapshotDate":"1962-05-32T20:52:02"}, {"allContributorsCount":53, "allStarsCount":258, "externalContributorsCount":75, "id":498, "organizationName":"bY", "privateProjectCount":669, "programLanguagesCount":249, "snapshotDate":"1916-00-05T24:52:10", "tagsCount":940, "teamsCount":766}, {"allContributorsCount":681, "allSizeCount":557, "allStarsCount":597, "key":{"id":873078961409106439}, "membersCount":687, "programLanguagesCount":55, "snapshotDate":"1930-06-27T13:29:08", "tagsCount":829}]}
// 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
// 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:true
// 	Evaluated Actions:
// 		org.evomaster.core.problem.rest.RestCallAction: POST:/import
test("test_9_PostOnImportReturns403", async () => {
    
    const res_0 = await superagent
            .post(baseUrlOfSut + "/import").set('Accept', "application/json;charset=utf-8")
            .set('Content-Type','application/json')
            .send(" { " + 
                " \"contributors\": [ " + 
                " { " + 
                " \"key\": { " + 
                " \"id\": 581 " + 
                " }, " + 
                " \"loginId\": \"4l6FRQFRxh_iMc1Q\", " + 
                " \"name\": \"5Ggus\", " + 
                " \"organizationId\": -3543733377151039447, " + 
                " \"organizationName\": \"KaLK_gchJw3uT\", " + 
                " \"organizationalCommitsCount\": 457, " + 
                " \"organizationalProjectsCount\": 664, " + 
                " \"snapshotDate\": \"1991-05-28T25:04:08\", " + 
                " \"url\": \"6lJNC2xH\" " + 
                " }, " + 
                " { " + 
                " \"name\": \"a\", " + 
                " \"organizationalProjectsCount\": 1518959347, " + 
                " \"snapshotDate\": \"2028-13-02T21:08:30\", " + 
                " \"url\": \"UTyFOQh\" " + 
                " }, " + 
                " { " + 
                " \"name\": \"KXk\", " + 
                " \"organizationName\": \"2gEghlSM5PC\", " + 
                " \"organizationalCommitsCount\": 956, " + 
                " \"url\": \"I4nm4J46\" " + 
                " } " + 
                " ], " + 
                " \"projects\": [], " + 
                " \"statistics\": [ " + 
                " { " + 
                " \"allContributorsCount\": 520, " + 
                " \"allForksCount\": 317, " + 
                " \"key\": { " + 
                " \"id\": 368 " + 
                " }, " + 
                " \"membersCount\": 721, " + 
                " \"organizationName\": \"5eAcklvBf4E_zMQ\", " + 
                " \"privateProjectCount\": 157, " + 
                " \"programLanguagesCount\": 2041674186, " + 
                " \"snapshotDate\": \"1962-05-32T20:52:02\" " + 
                " }, " + 
                " { " + 
                " \"allContributorsCount\": 53, " + 
                " \"allStarsCount\": 258, " + 
                " \"externalContributorsCount\": 75, " + 
                " \"id\": 498, " + 
                " \"organizationName\": \"bY\", " + 
                " \"privateProjectCount\": 669, " + 
                " \"programLanguagesCount\": 249, " + 
                " \"snapshotDate\": \"1916-00-05T24:52:10\", " + 
                " \"tagsCount\": 940, " + 
                " \"teamsCount\": 766 " + 
                " }, " + 
                " { " + 
                " \"allContributorsCount\": 681, " + 
                " \"allSizeCount\": 557, " + 
                " \"allStarsCount\": 597, " + 
                " \"key\": { " + 
                " \"id\": 873078961409106439 " + 
                " }, " + 
                " \"membersCount\": 687, " + 
                " \"programLanguagesCount\": 55, " + 
                " \"snapshotDate\": \"1930-06-27T13:29:08\", " + 
                " \"tagsCount\": 829 " + 
                " } " + 
                " ] " + 
                " } ")
            .ok(res => res.status);
    
    expect(res_0.status).toBe(403);
    expect(res_0.header["content-type"].startsWith("application/json")).toBe(true);
    expect(res_0.text).toBe("This endpoint is deactivated.");
});
