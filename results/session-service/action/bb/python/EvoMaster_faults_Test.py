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


#  This file was automatically generated by EvoMaster on 2024-10-06T15:49:37.758-03:00[America/Argentina/Buenos_Aires]
#  
#  The generated test suite contains 5 tests
#  
#  Covered targets: 23
#  
#  Used time: 0h 20m 38s
#  
#  Needed budget for current results: 100%
#  
#  This file contains test cases that are likely to indicate faults.
class EvoMaster_faults_Test(unittest.TestCase):

    
    baseUrlOfSut = "http://localhost:8080"
    
    
    
    
    
    
    
    
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/sessions/{source}/{type}
    # 			Action parameters:
    # 				source: 'eom0kAgxo'
    # 				type: 'group'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:eom0kAgxo
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:group
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/sessions/{source}/{type}
    @timeout_decorator.timeout(60)
    def test_0_GET_on_session_causes500_internalServerError(self):
        
        # Fault100. HTTP Status 500. GET:/api/sessions/{source}/{type}
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/api/sessions/eom0kAgxo/group",
                    headers=headers)
        
        assert res_0.status_code == 500
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["status"] == 500.0
        assert res_0.json()["error"] == "Internal Server Error"
        assert res_0.json()["path"] == "/api/sessions/eom0kAgxo/group"
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/api/sessions/{source}/{type}/{id}
    # 			Action parameters:
    # 				source: 'vJ0rOX0CGD9kET'
    # 				type: 'EVOMASTER'
    # 				id: 'Z16kBahq1Z'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:vJ0rOX0CGD9kET
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:EVOMASTER
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:Z16kBahq1Z
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/sessions/{source}/{type}/query
    # 			Action parameters:
    # 				source: 'SFY87ts7hl9ScW'
    # 				type: 'group'
    # 				field: 'Hw'
    # 				value: 'Ezv2RCc'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:SFY87ts7hl9ScW
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:group
    # 				org.evomaster.core.search.gene.string.StringGene = field:Hw
    # 				org.evomaster.core.search.gene.string.StringGene = value:Ezv2RCc
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/api/sessions/{source}/{type}/{id}
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/sessions/{source}/{type}/query
    @timeout_decorator.timeout(60)
    def test_1_GET_on_query_causes500_internalServerError(self):
        
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .delete(self.baseUrlOfSut + "/api/sessions/vJ0rOX0CGD9kET/EVOMASTER/Z16kBahq1Z",
                    headers=headers)
        
        assert res_0.status_code == 400
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["status"] == 400.0
        assert res_0.json()["error"] == "Bad Request"
        assert res_0.json()["path"] == "/api/sessions/vJ0rOX0CGD9kET/EVOMASTER/Z16kBahq1Z"
        
        # Fault100. HTTP Status 500. GET:/api/sessions/{source}/{type}/query
        headers = {}
        headers['Accept'] = "*/*"
        res_1 = requests \
                .get(self.baseUrlOfSut + "/api/sessions/SFY87ts7hl9ScW/group/query?" + 
                    "field=Hw&" + 
                    "value=Ezv2RCc",
                    headers=headers)
        
        assert res_1.status_code == 500
        assert "application/json" in res_1.headers["content-type"]
        assert res_1.json()["status"] == 500.0
        assert res_1.json()["error"] == "Internal Server Error"
        assert res_1.json()["path"] == "/api/sessions/SFY87ts7hl9ScW/group/query"
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/info
    # 			Action parameters:
    # 			Genes:
    # 		org.evomaster.core.problem.rest.RestCallAction: PUT:/api/sessions/{source}/{type}/{id}
    # 			Action parameters:
    # 				source: '4HfTmv'
    # 				type: 'virtual_study'
    # 				id: '7XyzkcKLmLxHRT5D'
    # 				body: '7XyzkcKLmLxHRT5D'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:4HfTmv
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:virtual_study
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:7XyzkcKLmLxHRT5D
    # 				org.evomaster.core.search.gene.string.StringGene = body:7XyzkcKLmLxHRT5D
    # 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:false
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/info
    # 		org.evomaster.core.problem.rest.RestCallAction: PUT:/api/sessions/{source}/{type}/{id}
    @timeout_decorator.timeout(60)
    def test_2_PUT_on_session_causes500_internalServerError(self):
        
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/info",
                    headers=headers)
        
        assert res_0.status_code == 200
        assert "text/plain" in res_0.headers["content-type"]
        assert "0.5.0-SNAPSHOT" in res_0.text
        
        # Fault100. HTTP Status 500. PUT:/api/sessions/{source}/{type}/{id}
        headers = {}
        headers["content-type"] = "application/json"
        body = {}
        body = " \"7XyzkcKLmLxHRT5D\" "
        headers['Accept'] = "*/*"
        res_1 = requests \
                .put(self.baseUrlOfSut + "/api/sessions/4HfTmv/virtual_study/7XyzkcKLmLxHRT5D",
                    headers=headers, data=body)
        
        assert res_1.status_code == 500
        assert "application/json" in res_1.headers["content-type"]
        assert res_1.json()["status"] == 500.0
        assert res_1.json()["error"] == "Internal Server Error"
        assert res_1.json()["path"] == "/api/sessions/4HfTmv/virtual_study/7XyzkcKLmLxHRT5D"
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/api/sessions/{source}/{type}
    # 			Action parameters:
    # 				source: 'UNIOa'
    # 				type: 'settings'
    # 				body: 'settings'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:UNIOa
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:settings
    # 				org.evomaster.core.search.gene.string.StringGene = body:settings
    # 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:false
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/api/sessions/{source}/{type}
    # 			Action parameters:
    # 				source: 'B6u'
    # 				type: 'group'
    # 				body: 'group'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:B6u
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:group
    # 				org.evomaster.core.search.gene.string.StringGene = body:group
    # 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:false
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/sessions/{source}/{type}/{id}
    # 			Action parameters:
    # 				source: 'U1Jkw6aDH'
    # 				type: 'virtual_study'
    # 				id: 'c'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:U1Jkw6aDH
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:virtual_study
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:c
    # 		org.evomaster.core.problem.rest.RestCallAction: PUT:/api/sessions/{source}/{type}/{id}
    # 			Action parameters:
    # 				source: 'SIDqU3SOOhvb'
    # 				type: 'group'
    # 				id: 'RpXHU9p3xy'
    # 				body: 'RpXHU9p3xy'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:SIDqU3SOOhvb
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:group
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:RpXHU9p3xy
    # 				org.evomaster.core.search.gene.string.StringGene = body:RpXHU9p3xy
    # 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:false
    # 		org.evomaster.core.problem.rest.RestCallAction: PUT:/api/sessions/{source}/{type}/{id}
    # 			Action parameters:
    # 				source: 'bgpuCe8XUox_XUg'
    # 				type: 'settings'
    # 				id: 'zaDxVlqlrXo2QB'
    # 				body: 'zaDxVlqlrXo2QB'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:bgpuCe8XUox_XUg
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:settings
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:zaDxVlqlrXo2QB
    # 				org.evomaster.core.search.gene.string.StringGene = body:zaDxVlqlrXo2QB
    # 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:false
    # 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/api/sessions/{source}/{type}/{id}
    # 			Action parameters:
    # 				source: 'E_MoNMCr'
    # 				type: 'custom_gene_list'
    # 				id: '4fPf'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:E_MoNMCr
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:custom_gene_list
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:4fPf
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/api/sessions/{source}/{type}
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/api/sessions/{source}/{type}
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/sessions/{source}/{type}/{id}
    # 		org.evomaster.core.problem.rest.RestCallAction: PUT:/api/sessions/{source}/{type}/{id}
    # 		org.evomaster.core.problem.rest.RestCallAction: PUT:/api/sessions/{source}/{type}/{id}
    # 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/api/sessions/{source}/{type}/{id}
    @timeout_decorator.timeout(60)
    def test_3_DELETE_on_session_causes500_internalServerError(self):
        
        # Fault100. HTTP Status 500. POST:/api/sessions/{source}/{type}
        headers = {}
        headers["content-type"] = "application/json"
        body = {}
        body = " \"settings\" "
        headers['Accept'] = "*/*"
        res_0 = requests \
                .post(self.baseUrlOfSut + "/api/sessions/UNIOa/settings",
                    headers=headers, data=body)
        
        assert res_0.status_code == 500
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["status"] == 500.0
        assert res_0.json()["error"] == "Internal Server Error"
        assert res_0.json()["path"] == "/api/sessions/UNIOa/settings"
        
        # Fault100. HTTP Status 500. POST:/api/sessions/{source}/{type}
        headers = {}
        headers["content-type"] = "application/json"
        body = {}
        body = " \"group\" "
        headers['Accept'] = "*/*"
        res_1 = requests \
                .post(self.baseUrlOfSut + "/api/sessions/B6u/group",
                    headers=headers, data=body)
        
        assert res_1.status_code == 500
        assert "application/json" in res_1.headers["content-type"]
        assert res_1.json()["status"] == 500.0
        assert res_1.json()["error"] == "Internal Server Error"
        assert res_1.json()["path"] == "/api/sessions/B6u/group"
        
        # Fault100. HTTP Status 500. GET:/api/sessions/{source}/{type}/{id}
        headers = {}
        headers['Accept'] = "*/*"
        res_2 = requests \
                .get(self.baseUrlOfSut + "/api/sessions/U1Jkw6aDH/virtual_study/c",
                    headers=headers)
        
        assert res_2.status_code == 500
        assert "application/json" in res_2.headers["content-type"]
        assert res_2.json()["status"] == 500.0
        assert res_2.json()["error"] == "Internal Server Error"
        assert res_2.json()["path"] == "/api/sessions/U1Jkw6aDH/virtual_study/c"
        
        # Fault100. HTTP Status 500. PUT:/api/sessions/{source}/{type}/{id}
        headers = {}
        headers["content-type"] = "application/json"
        body = {}
        body = " \"RpXHU9p3xy\" "
        headers['Accept'] = "*/*"
        res_3 = requests \
                .put(self.baseUrlOfSut + "/api/sessions/SIDqU3SOOhvb/group/RpXHU9p3xy",
                    headers=headers, data=body)
        
        assert res_3.status_code == 500
        assert "application/json" in res_3.headers["content-type"]
        assert res_3.json()["status"] == 500.0
        assert res_3.json()["error"] == "Internal Server Error"
        assert res_3.json()["path"] == "/api/sessions/SIDqU3SOOhvb/group/RpXHU9p3xy"
        
        # Fault100. HTTP Status 500. PUT:/api/sessions/{source}/{type}/{id}
        headers = {}
        headers["content-type"] = "application/json"
        body = {}
        body = " \"zaDxVlqlrXo2QB\" "
        headers['Accept'] = "*/*"
        res_4 = requests \
                .put(self.baseUrlOfSut + "/api/sessions/bgpuCe8XUox_XUg/settings/zaDxVlqlrXo2QB",
                    headers=headers, data=body)
        
        assert res_4.status_code == 500
        assert "application/json" in res_4.headers["content-type"]
        assert res_4.json()["status"] == 500.0
        assert res_4.json()["error"] == "Internal Server Error"
        assert res_4.json()["path"] == "/api/sessions/bgpuCe8XUox_XUg/settings/zaDxVlqlrXo2QB"
        
        # Fault100. HTTP Status 500. DELETE:/api/sessions/{source}/{type}/{id}
        headers = {}
        headers['Accept'] = "*/*"
        res_5 = requests \
                .delete(self.baseUrlOfSut + "/api/sessions/E_MoNMCr/custom_gene_list/4fPf",
                    headers=headers)
        
        assert res_5.status_code == 500
        assert "application/json" in res_5.headers["content-type"]
        assert res_5.json()["status"] == 500.0
        assert res_5.json()["error"] == "Internal Server Error"
        assert res_5.json()["path"] == "/api/sessions/E_MoNMCr/custom_gene_list/4fPf"
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/sessions/{source}/{type}/{id}
    # 			Action parameters:
    # 				source: '84p_tj1BMP'
    # 				type: 'genomic_chart'
    # 				id: 'iVXimk_bu'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:84p_tj1BMP
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:genomic_chart
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:iVXimk_bu
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/api/sessions/{source}/{type}
    # 			Action parameters:
    # 				source: 'RjEe'
    # 				type: 'main_session'
    # 				body: 'main_session'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:RjEe
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:main_session
    # 				org.evomaster.core.search.gene.string.StringGene = body:main_session
    # 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:true
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/api/sessions/{source}/{type}
    # 			Action parameters:
    # 				source: 'vBVNraD37jK5V'
    # 				type: 'genomic_chart'
    # 				body: 'genomic_chart'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:vBVNraD37jK5V
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:genomic_chart
    # 				org.evomaster.core.search.gene.string.StringGene = body:genomic_chart
    # 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:true
    # 		org.evomaster.core.problem.rest.RestCallAction: PUT:/api/sessions/{source}/{type}/{id}
    # 			Action parameters:
    # 				source: 'UoUrZd1WdiwHH8'
    # 				type: 'EVOMASTER'
    # 				id: 'ia55_ffiH'
    # 				body: 'ia55_ffiH'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:UoUrZd1WdiwHH8
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:EVOMASTER
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:ia55_ffiH
    # 				org.evomaster.core.search.gene.string.StringGene = body:ia55_ffiH
    # 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:false
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/info
    # 			Action parameters:
    # 			Genes:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/sessions/{source}/{type}
    # 			Action parameters:
    # 				source: 'zQGzFZ'
    # 				type: 'group'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:zQGzFZ
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:group
    # 		org.evomaster.core.problem.rest.RestCallAction: PUT:/api/sessions/{source}/{type}/{id}
    # 			Action parameters:
    # 				source: 'VmwuypP881F528'
    # 				type: 'main_session'
    # 				id: 'u_Y3_BSsYO'
    # 				body: 'u_Y3_BSsYO'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:VmwuypP881F528
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:main_session
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:u_Y3_BSsYO
    # 				org.evomaster.core.search.gene.string.StringGene = body:u_Y3_BSsYO
    # 				org.evomaster.core.search.gene.collection.EnumGene = contentType:application/json
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sendUnquoteJsonString:false
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/info
    # 			Action parameters:
    # 			Genes:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/sessions/{source}/{type}
    # 			Action parameters:
    # 				source: 'o9jmRqSdp'
    # 				type: 'genomic_chart'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:o9jmRqSdp
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:genomic_chart
    # 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/api/sessions/{source}/{type}/{id}
    # 			Action parameters:
    # 				source: 'ixWAO5g2g8k1XNuF'
    # 				type: 'main_session'
    # 				id: 'NrDlKcHDc7Q5ubj'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = source:ixWAO5g2g8k1XNuF
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = type:main_session
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = id:NrDlKcHDc7Q5ubj
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/sessions/{source}/{type}/{id}
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/api/sessions/{source}/{type}
    # 		org.evomaster.core.problem.rest.RestCallAction: POST:/api/sessions/{source}/{type}
    # 		org.evomaster.core.problem.rest.RestCallAction: PUT:/api/sessions/{source}/{type}/{id}
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/info
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/sessions/{source}/{type}
    # 		org.evomaster.core.problem.rest.RestCallAction: PUT:/api/sessions/{source}/{type}/{id}
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/info
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/sessions/{source}/{type}
    # 		org.evomaster.core.problem.rest.RestCallAction: DELETE:/api/sessions/{source}/{type}/{id}
    @timeout_decorator.timeout(60)
    def test_4_DELETE_on_session_causes500_internalServerError(self):
        
        # Fault100. HTTP Status 500. GET:/api/sessions/{source}/{type}/{id}
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/api/sessions/84p_tj1BMP/genomic_chart/iVXimk_bu",
                    headers=headers)
        
        assert res_0.status_code == 500
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["status"] == 500.0
        assert res_0.json()["error"] == "Internal Server Error"
        assert res_0.json()["path"] == "/api/sessions/84p_tj1BMP/genomic_chart/iVXimk_bu"
        
        headers = {}
        headers["content-type"] = "application/json"
        body = {}
        body = " main_session "
        headers['Accept'] = "*/*"
        res_1 = requests \
                .post(self.baseUrlOfSut + "/api/sessions/RjEe/main_session",
                    headers=headers, data=body)
        
        assert res_1.status_code == 400
        assert "application/json" in res_1.headers["content-type"]
        assert res_1.json()["status"] == 400.0
        assert res_1.json()["error"] == "Bad Request"
        assert res_1.json()["path"] == "/api/sessions/RjEe/main_session"
        
        headers = {}
        headers["content-type"] = "application/json"
        body = {}
        body = " genomic_chart "
        headers['Accept'] = "*/*"
        res_2 = requests \
                .post(self.baseUrlOfSut + "/api/sessions/vBVNraD37jK5V/genomic_chart",
                    headers=headers, data=body)
        
        assert res_2.status_code == 400
        assert "application/json" in res_2.headers["content-type"]
        assert res_2.json()["status"] == 400.0
        assert res_2.json()["error"] == "Bad Request"
        assert res_2.json()["path"] == "/api/sessions/vBVNraD37jK5V/genomic_chart"
        
        headers = {}
        headers["content-type"] = "application/json"
        body = {}
        body = " \"ia55_ffiH\" "
        headers['Accept'] = "*/*"
        res_3 = requests \
                .put(self.baseUrlOfSut + "/api/sessions/UoUrZd1WdiwHH8/EVOMASTER/ia55_ffiH",
                    headers=headers, data=body)
        
        assert res_3.status_code == 400
        assert "application/json" in res_3.headers["content-type"]
        assert res_3.json()["status"] == 400.0
        assert res_3.json()["error"] == "Bad Request"
        assert res_3.json()["path"] == "/api/sessions/UoUrZd1WdiwHH8/EVOMASTER/ia55_ffiH"
        
        headers = {}
        headers['Accept'] = "*/*"
        res_4 = requests \
                .get(self.baseUrlOfSut + "/info",
                    headers=headers)
        
        assert res_4.status_code == 200
        assert "text/plain" in res_4.headers["content-type"]
        assert "0.5.0-SNAPSHOT" in res_4.text
        
        # Fault100. HTTP Status 500. GET:/api/sessions/{source}/{type}
        headers = {}
        headers['Accept'] = "*/*"
        res_5 = requests \
                .get(self.baseUrlOfSut + "/api/sessions/zQGzFZ/group",
                    headers=headers)
        
        assert res_5.status_code == 500
        assert "application/json" in res_5.headers["content-type"]
        assert res_5.json()["status"] == 500.0
        assert res_5.json()["error"] == "Internal Server Error"
        assert res_5.json()["path"] == "/api/sessions/zQGzFZ/group"
        
        # Fault100. HTTP Status 500. PUT:/api/sessions/{source}/{type}/{id}
        headers = {}
        headers["content-type"] = "application/json"
        body = {}
        body = " \"u_Y3_BSsYO\" "
        headers['Accept'] = "*/*"
        res_6 = requests \
                .put(self.baseUrlOfSut + "/api/sessions/VmwuypP881F528/main_session/u_Y3_BSsYO",
                    headers=headers, data=body)
        
        assert res_6.status_code == 500
        assert "application/json" in res_6.headers["content-type"]
        assert res_6.json()["status"] == 500.0
        assert res_6.json()["error"] == "Internal Server Error"
        assert res_6.json()["path"] == "/api/sessions/VmwuypP881F528/main_session/u_Y3_BSsYO"
        
        headers = {}
        headers['Accept'] = "*/*"
        res_7 = requests \
                .get(self.baseUrlOfSut + "/info",
                    headers=headers)
        
        assert res_7.status_code == 200
        assert "text/plain" in res_7.headers["content-type"]
        assert "0.5.0-SNAPSHOT" in res_7.text
        
        # Fault100. HTTP Status 500. GET:/api/sessions/{source}/{type}
        headers = {}
        headers['Accept'] = "*/*"
        res_8 = requests \
                .get(self.baseUrlOfSut + "/api/sessions/o9jmRqSdp/genomic_chart",
                    headers=headers)
        
        assert res_8.status_code == 500
        assert "application/json" in res_8.headers["content-type"]
        assert res_8.json()["status"] == 500.0
        assert res_8.json()["error"] == "Internal Server Error"
        assert res_8.json()["path"] == "/api/sessions/o9jmRqSdp/genomic_chart"
        
        # Fault100. HTTP Status 500. DELETE:/api/sessions/{source}/{type}/{id}
        headers = {}
        headers['Accept'] = "*/*"
        res_9 = requests \
                .delete(self.baseUrlOfSut + "/api/sessions/ixWAO5g2g8k1XNuF/main_session/NrDlKcHDc7Q5ubj",
                    headers=headers)
        
        assert res_9.status_code == 500
        assert "application/json" in res_9.headers["content-type"]
        assert res_9.json()["status"] == 500.0
        assert res_9.json()["error"] == "Internal Server Error"
        assert res_9.json()["path"] == "/api/sessions/ixWAO5g2g8k1XNuF/main_session/NrDlKcHDc7Q5ubj"


if __name__ == '__main__':
    unittest.main()
