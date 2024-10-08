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


#  This file was automatically generated by EvoMaster on 2024-10-06T13:23:26.654-03:00[America/Argentina/Buenos_Aires]
#  
#  The generated test suite contains 9 tests
#  
#  Covered targets: 27
#  
#  Used time: 0h 15m 23s
#  
#  Needed budget for current results: 97%
#  
#  This file contains test cases that are likely to indicate faults.
class EvoMaster_faults_Test(unittest.TestCase):

    
    baseUrlOfSut = "http://localhost:8080"
    
    
    
    
    
    
    
    
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/error
    # 			Action parameters:
    # 			Genes:
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/error
    @timeout_decorator.timeout(60)
    def test_0_DELETE_on_error_causes500_internalServerError(self):
        
        # Fault100. HTTP Status 500. DELETE:/error
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .delete(self.baseUrlOfSut + "/error",
                    headers=headers)
        
        assert res_0.status_code == 500
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["status"] == 999.0
        assert res_0.json()["error"] == "None"
        assert res_0.json()["message"] == "No message available"
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: PATCH:/error
    # 			Action parameters:
    # 			Genes:
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: PATCH:/error
    @timeout_decorator.timeout(60)
    def test_1_PATCH_on_error_causes500_internalServerError(self):
        
        # Fault100. HTTP Status 500. PATCH:/error
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .patch(self.baseUrlOfSut + "/error",
                    headers=headers)
        
        assert res_0.status_code == 500
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["status"] == 999.0
        assert res_0.json()["error"] == "None"
        assert res_0.json()["message"] == "No message available"
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/error
    # 			Action parameters:
    # 			Genes:
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/error
    @timeout_decorator.timeout(60)
    def test_2_GET_on_error_causes500_internalServerError(self):
        
        # Fault100. HTTP Status 500. GET:/error
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/error",
                    headers=headers)
        
        assert res_0.status_code == 500
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["status"] == 999.0
        assert res_0.json()["error"] == "None"
        assert res_0.json()["message"] == "No message available"
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/error
    # 			Action parameters:
    # 			Genes:
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/error
    @timeout_decorator.timeout(60)
    def test_3_POST_on_error_causes500_internalServerError(self):
        
        # Fault100. HTTP Status 500. POST:/error
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .post(self.baseUrlOfSut + "/error",
                    headers=headers)
        
        assert res_0.status_code == 500
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["status"] == 999.0
        assert res_0.json()["error"] == "None"
        assert res_0.json()["message"] == "No message available"
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/statistics/projects
    # 			Action parameters:
    # 				organizations: ''
    # 				start_date: ''
    # 				end_date: ''
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.OptionalGene = organizations:
    # 				org.evomaster.core.search.gene.optional.OptionalGene = start_date:
    # 				org.evomaster.core.search.gene.optional.OptionalGene = end_date:
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/statistics/projects
    @timeout_decorator.timeout(60)
    def test_4_GET_on_projects_causes500_internalServerError(self):
        
        # Fault100. HTTP Status 500. GET:/statistics/projects
        headers = {}
        headers['Accept'] = "application/json"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/statistics/projects",
                    headers=headers)
        
        assert res_0.status_code == 500
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["status"] == 500.0
        assert res_0.json()["error"] == "Internal Server Error"
        assert res_0.json()["exception"] == "java.lang.IndexOutOfBoundsException"
        assert res_0.json()["message"] == "toIndex = 10"
        assert res_0.json()["path"] == "/statistics/projects"
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/statistics/contributors
    # 			Action parameters:
    # 				organizations: 'hmacP'
    # 				start_date: ''
    # 				end_date: ''
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.OptionalGene = organizations:hmacP
    # 				org.evomaster.core.search.gene.optional.OptionalGene = start_date:
    # 				org.evomaster.core.search.gene.optional.OptionalGene = end_date:
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/statistics/contributors
    @timeout_decorator.timeout(60)
    def test_5_GET_on_contributors_causes500_internalServerError(self):
        
        # Fault100. HTTP Status 500. GET:/statistics/contributors
        headers = {}
        headers['Accept'] = "application/json"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/statistics/contributors?organizations=hmacP",
                    headers=headers)
        
        assert res_0.status_code == 500
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["status"] == 500.0
        assert res_0.json()["error"] == "Internal Server Error"
        assert res_0.json()["exception"] == "java.lang.IndexOutOfBoundsException"
        assert res_0.json()["message"] == "toIndex = 10"
        assert res_0.json()["path"] == "/statistics/contributors"
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: HEAD:/error
    # 			Action parameters:
    # 			Genes:
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: HEAD:/error
    @timeout_decorator.timeout(60)
    def test_6_HEAD_on_error_causes500_internalServerError(self):
        
        # Fault100. HTTP Status 500. HEAD:/error
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .head(self.baseUrlOfSut + "/error",
                    headers=headers)
        
        assert res_0.status_code == 500
        assert res_0.text == ''
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: PUT:/error
    # 			Action parameters:
    # 			Genes:
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: PUT:/error
    @timeout_decorator.timeout(60)
    def test_7_PUT_on_error_causes500_internalServerError(self):
        
        # Fault100. HTTP Status 500. PUT:/error
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .put(self.baseUrlOfSut + "/error",
                    headers=headers)
        
        assert res_0.status_code == 500
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["status"] == 999.0
        assert res_0.json()["error"] == "None"
        assert res_0.json()["message"] == "No message available"
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/contributors
    # 			Action parameters:
    # 				organizations: '72sn8_FNYJh8'
    # 				limit: '382'
    # 				offset: '22'
    # 				start_date: ''
    # 				end_date: ''
    # 				sortBy: '_pDl9u8'
    # 				q: '1O'
    # 			Genes:
    # 				org.evomaster.core.search.gene.string.StringGene = organizations:72sn8_FNYJh8
    # 				org.evomaster.core.search.gene.optional.OptionalGene = limit:382
    # 				org.evomaster.core.search.gene.optional.OptionalGene = offset:22
    # 				org.evomaster.core.search.gene.optional.OptionalGene = start_date:
    # 				org.evomaster.core.search.gene.optional.OptionalGene = end_date:
    # 				org.evomaster.core.search.gene.optional.OptionalGene = sortBy:_pDl9u8
    # 				org.evomaster.core.search.gene.optional.OptionalGene = q:1O
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/contributors
    @timeout_decorator.timeout(60)
    def test_8_GET_on_contributors_causes500_internalServerError(self):
        
        # Fault100. HTTP Status 500. GET:/contributors
        headers = {}
        headers['Accept'] = "application/json"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/contributors?" + 
                    "organizations=72sn8_FNYJh8&" + 
                    "limit=382&" + 
                    "offset=22&" + 
                    "start_date=&" + 
                    "sortBy=_pDl9u8&" + 
                    "q=1O",
                    headers=headers)
        
        assert res_0.status_code == 500
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["status"] == 500.0
        assert res_0.json()["error"] == "Internal Server Error"
        assert res_0.json()["exception"] == "java.lang.IllegalArgumentException"
        assert res_0.json()["message"] == "sortBy must be empty or have a valid value but was _pDl9u8. Valid values are organizationalCommitsCount,organizationalProjectsCount,personalCommitsCount,personalProjectsCount,organizationName,name"
        assert res_0.json()["path"] == "/contributors"


if __name__ == '__main__':
    unittest.main()
