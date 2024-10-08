#!/usr/bin/env python

import json
import unittest
import requests
import os
if os.name == 'nt':
    class timeout_decorator:
        @staticmethod
        def timeout(*args, **kwargs):
            return lambda f: f # return a no-op decorator
else:
    import timeout_decorator
from em_test_utils import *


#  This file was automatically generated by EvoMaster on 2024-10-06T15:49:37.779-03:00[America/Argentina/Buenos_Aires]
#  
#  The generated test suite contains 2 tests
#  
#  Covered targets: 6
#  
#  Used time: 0h 20m 38s
#  
#  Needed budget for current results: 100%
#  
#  This file contains test cases that represent failed calls, but not indicative of faults.
class EvoMaster_others_Test(unittest.TestCase):

    
    baseUrlOfSut = "http://localhost:8080"
    
    
    
    
    
    
    
    
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/info
    # 			Action parameters:
    # 			Genes:
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/api/sessions/{source}/{type}/query/fetch
    # 			Action parameters:
    # 				source: 'FExzYMR7dAmlM6'
    # 				type: 'genomic_chart'
    # 				body: 'genomic_chart'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:FExzYMR7dAmlM6
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:genomic_chart
    # 				org.evomaster.core.search.gene.string.StringGene = body:genomic_chart
    # 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:true
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/sessions/{source}/{type}/{id}
    # 			Action parameters:
    # 				source: 'FFwF'
    # 				type: 'EVOMASTER'
    # 				id: 'LnB1GHWPT'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:FFwF
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:EVOMASTER
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:LnB1GHWPT
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/api/sessions/{source}/{type}
    # 			Action parameters:
    # 				source: 'JqezKQqE6qs'
    # 				type: 'custom_data'
    # 				body: 'custom_data'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:JqezKQqE6qs
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:custom_data
    # 				org.evomaster.core.search.gene.string.StringGene = body:custom_data
    # 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:true
    # 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/api/sessions/{source}/{type}/{id}
    # 			Action parameters:
    # 				source: 'h6BHmAX'
    # 				type: 'EVOMASTER'
    # 				id: 'aqq8vf818'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:h6BHmAX
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:EVOMASTER
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:aqq8vf818
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/info
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/api/sessions/{source}/{type}/query/fetch
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/sessions/{source}/{type}/{id}
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/api/sessions/{source}/{type}
    # 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/api/sessions/{source}/{type}/{id}
    @timeout_decorator.timeout(60)
    def test_0_DELETE_on_session_returns_400(self):
        
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/info",
                    headers=headers)
        
        assert res_0.status_code == 200
        assert "text/plain" in res_0.headers["content-type"]
        assert "0.5.0-SNAPSHOT" in res_0.text
        
        headers = {}
        headers["content-type"] = "application/json"
        body = {}
        body = " genomic_chart "
        headers['Accept'] = "*/*"
        res_1 = requests \
                .post(self.baseUrlOfSut + "/api/sessions/FExzYMR7dAmlM6/genomic_chart/query/fetch",
                    headers=headers, data=body)
        
        assert res_1.status_code == 400
        assert "application/json" in res_1.headers["content-type"]
        assert res_1.json()["status"] == 400.0
        assert res_1.json()["error"] == "Bad Request"
        assert res_1.json()["path"] == "/api/sessions/FExzYMR7dAmlM6/genomic_chart/query/fetch"
        
        headers = {}
        headers['Accept'] = "*/*"
        res_2 = requests \
                .get(self.baseUrlOfSut + "/api/sessions/FFwF/EVOMASTER/LnB1GHWPT",
                    headers=headers)
        
        assert res_2.status_code == 400
        assert "application/json" in res_2.headers["content-type"]
        assert res_2.json()["status"] == 400.0
        assert res_2.json()["error"] == "Bad Request"
        assert res_2.json()["path"] == "/api/sessions/FFwF/EVOMASTER/LnB1GHWPT"
        
        headers = {}
        headers["content-type"] = "application/json"
        body = {}
        body = " custom_data "
        headers['Accept'] = "*/*"
        res_3 = requests \
                .post(self.baseUrlOfSut + "/api/sessions/JqezKQqE6qs/custom_data",
                    headers=headers, data=body)
        
        assert res_3.status_code == 400
        assert "application/json" in res_3.headers["content-type"]
        assert res_3.json()["status"] == 400.0
        assert res_3.json()["error"] == "Bad Request"
        assert res_3.json()["path"] == "/api/sessions/JqezKQqE6qs/custom_data"
        
        headers = {}
        headers['Accept'] = "*/*"
        res_4 = requests \
                .delete(self.baseUrlOfSut + "/api/sessions/h6BHmAX/EVOMASTER/aqq8vf818",
                    headers=headers)
        
        assert res_4.status_code == 400
        assert "application/json" in res_4.headers["content-type"]
        assert res_4.json()["status"] == 400.0
        assert res_4.json()["error"] == "Bad Request"
        assert res_4.json()["path"] == "/api/sessions/h6BHmAX/EVOMASTER/aqq8vf818"
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/api/sessions/{source}/{type}
    # 			Action parameters:
    # 				source: 'zozOG6H'
    # 				type: 'virtual_study'
    # 				body: 'virtual_study'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:zozOG6H
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:virtual_study
    # 				org.evomaster.core.search.gene.string.StringGene = body:virtual_study
    # 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:true
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/api/sessions/{source}/{type}/query/fetch
    # 			Action parameters:
    # 				source: 'dS4UAswFRjI7WljD'
    # 				type: 'group'
    # 				body: 'group'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:dS4UAswFRjI7WljD
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:group
    # 				org.evomaster.core.search.gene.string.StringGene = body:group
    # 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:false
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/api/sessions/{source}/{type}
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/api/sessions/{source}/{type}/query/fetch
    @timeout_decorator.timeout(60)
    def test_1_POST_on_fetch_returns_400(self):
        
        headers = {}
        headers["content-type"] = "application/json"
        body = {}
        body = " virtual_study "
        headers['Accept'] = "*/*"
        res_0 = requests \
                .post(self.baseUrlOfSut + "/api/sessions/zozOG6H/virtual_study",
                    headers=headers, data=body)
        
        assert res_0.status_code == 400
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["status"] == 400.0
        assert res_0.json()["error"] == "Bad Request"
        assert res_0.json()["path"] == "/api/sessions/zozOG6H/virtual_study"
        
        headers = {}
        headers["content-type"] = "application/json"
        body = {}
        body = " \"group\" "
        headers['Accept'] = "*/*"
        res_1 = requests \
                .post(self.baseUrlOfSut + "/api/sessions/dS4UAswFRjI7WljD/group/query/fetch",
                    headers=headers, data=body)
        
        assert res_1.status_code == 400
        assert "application/json" in res_1.headers["content-type"]
        assert res_1.json()["status"] == 400.0
        assert res_1.json()["error"] == "Bad Request"
        assert res_1.json()["path"] == "/api/sessions/dS4UAswFRjI7WljD/group/query/fetch"


if __name__ == '__main__':
    unittest.main()
