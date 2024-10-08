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


#  This file was automatically generated by EvoMaster on 2024-10-06T14:35:10.911-03:00[America/Argentina/Buenos_Aires]
#  
#  The generated test suite contains 12 tests
#  
#  Covered targets: 24
#  
#  Used time: 0h 10m 30s
#  
#  Needed budget for current results: 94%
#  
#  This file contains test cases that represent successful calls.
class EvoMaster_successes_Test(unittest.TestCase):

    
    baseUrlOfSut = "http://localhost:8080"
    
    
    
    
    
    
    
    
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/filesuffix/{directory}/{file}
    # 			Action parameters:
    # 				directory: 'h5cDNkh'
    # 				file: 'PkeW6aeXW7WqMezn'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = directory:h5cDNkh
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = file:PkeW6aeXW7WqMezn
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/filesuffix/{directory}/{file}
    @timeout_decorator.timeout(60)
    def test_0_GET_on_filesuffix_returns_200(self):
        
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/api/filesuffix/h5cDNkh/PkeW6aeXW7WqMezn",
                    headers=headers)
        
        assert res_0.status_code == 200
        assert "text/plain" in res_0.headers["content-type"]
        assert "0" in res_0.text
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/cookie/{name}/{val}/{site}
    # 			Action parameters:
    # 				name: 'I'
    # 				site: 'MvKLCREj'
    # 				val: 'o1MpQx'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = name:I
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = site:MvKLCREj
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = val:o1MpQx
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/cookie/{name}/{val}/{site}
    @timeout_decorator.timeout(60)
    def test_1_GET_on_cooki_returns_200(self):
        
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/api/cookie/I/o1MpQx/MvKLCREj",
                    headers=headers)
        
        assert res_0.status_code == 200
        assert "text/plain" in res_0.headers["content-type"]
        assert "0" in res_0.text
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/title/{sex}/{title}
    # 			Action parameters:
    # 				sex: '5qvIXJWcZAz'
    # 				title: 'fSDGl'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = sex:5qvIXJWcZAz
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = title:fSDGl
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/title/{sex}/{title}
    @timeout_decorator.timeout(60)
    def test_2_GET_on_titl_returns_200(self):
        
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/api/title/5qvIXJWcZAz/fSDGl",
                    headers=headers)
        
        assert res_0.status_code == 200
        assert "text/plain" in res_0.headers["content-type"]
        assert "-1" in res_0.text
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/text2txt/{word1}/{word2}/{word3}
    # 			Action parameters:
    # 				word1: 'S'
    # 				word2: 'FQbo_'
    # 				word3: '2'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = word1:S
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = word2:FQbo_
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = word3:2
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/text2txt/{word1}/{word2}/{word3}
    @timeout_decorator.timeout(60)
    def test_3_GET_on_text2txt_returns_200(self):
        
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/api/text2txt/S/FQbo_/2",
                    headers=headers)
        
        assert res_0.status_code == 200
        assert res_0.text == ''
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/calc/{op}/{arg1}/{arg2}
    # 			Action parameters:
    # 				arg1: '0.18145195091207122'
    # 				arg2: '0.7560117568718411'
    # 				op: 'MVFh_gs3cySphM'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = arg1:0.18145195091207122
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = arg2:0.7560117568718411
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = op:MVFh_gs3cySphM
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/calc/{op}/{arg1}/{arg2}
    @timeout_decorator.timeout(60)
    def test_4_GET_on_calc_returns_200(self):
        
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/api/calc/MVFh_gs3cySphM/0.18145195091207122/0.7560117568718411",
                    headers=headers)
        
        assert res_0.status_code == 200
        assert "text/plain" in res_0.headers["content-type"]
        assert "0.0" in res_0.text
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/ordered4/{w}/{x}/{z}/{y}
    # 			Action parameters:
    # 				w: 'ePkjmnWt2SqrNd'
    # 				x: 'nmk7ZNqlD1R3wvJ'
    # 				y: '6'
    # 				z: 'Vq'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = w:ePkjmnWt2SqrNd
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = x:nmk7ZNqlD1R3wvJ
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = y:6
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = z:Vq
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/ordered4/{w}/{x}/{z}/{y}
    @timeout_decorator.timeout(60)
    def test_5_GET_on_ordered4_returns_200(self):
        
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/api/ordered4/ePkjmnWt2SqrNd/nmk7ZNqlD1R3wvJ/Vq/6",
                    headers=headers)
        
        assert res_0.status_code == 200
        assert "text/plain" in res_0.headers["content-type"]
        assert "unordered" in res_0.text
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/pat/{txt}/{pat}
    # 			Action parameters:
    # 				pat: 'TE6SkPa_X'
    # 				txt: 'Q52gLO'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = pat:TE6SkPa_X
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = txt:Q52gLO
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/pat/{txt}/{pat}
    @timeout_decorator.timeout(60)
    def test_6_GET_on_pat_returns_200(self):
        
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/api/pat/Q52gLO/TE6SkPa_X",
                    headers=headers)
        
        assert res_0.status_code == 200
        assert "text/plain" in res_0.headers["content-type"]
        assert "0" in res_0.text
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/pat/{txt}
    # 			Action parameters:
    # 				txt: '3VmeXpe'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = txt:3VmeXpe
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/pat/{txt}
    @timeout_decorator.timeout(60)
    def test_7_GET_on_pat_returns_200(self):
        
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/api/pat/3VmeXpe",
                    headers=headers)
        
        assert res_0.status_code == 200
        assert "text/plain" in res_0.headers["content-type"]
        assert "none" in res_0.text
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/notypevar/{i}/{s}
    # 			Action parameters:
    # 				i: '127'
    # 				s: '384IDII26w'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = i:127
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = s:384IDII26w
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/notypevar/{i}/{s}
    @timeout_decorator.timeout(60)
    def test_8_GET_on_notypevar_returns_200(self):
        
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/api/notypevar/127/384IDII26w",
                    headers=headers)
        
        assert res_0.status_code == 200
        assert "text/plain" in res_0.headers["content-type"]
        assert "3" in res_0.text
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/costfuns/{i}/{s}
    # 			Action parameters:
    # 				i: '161'
    # 				s: '9'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = i:161
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = s:9
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/costfuns/{i}/{s}
    @timeout_decorator.timeout(60)
    def test_9_GET_on_costfun_returns_200(self):
        
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/api/costfuns/161/9",
                    headers=headers)
        
        assert res_0.status_code == 200
        assert "text/plain" in res_0.headers["content-type"]
        assert "10" in res_0.text
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/dateparse/{dayname}/{monthname}
    # 			Action parameters:
    # 				dayname: 'sj308vEcW'
    # 				monthname: 'Nh'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = dayname:sj308vEcW
    # 				org.evomaster.core.search.gene.optional.CustomMutationRateGene = monthname:Nh
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/api/dateparse/{dayname}/{monthname}
    @timeout_decorator.timeout(60)
    def test_10_GET_on_datepars_returns_200(self):
        
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/api/dateparse/sj308vEcW/Nh",
                    headers=headers)
        
        assert res_0.status_code == 200
        assert "text/plain" in res_0.headers["content-type"]
        assert "0" in res_0.text
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/v2/api-docs
    # 			Action parameters:
    # 			Genes:
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.rest.RestCallAction: GET:/v2/api-docs
    @timeout_decorator.timeout(60)
    def test_11_GET_on_api_docs_returns_200(self):
        
        headers = {}
        headers['Accept'] = "*/*"
        res_0 = requests \
                .get(self.baseUrlOfSut + "/v2/api-docs",
                    headers=headers)
        
        assert res_0.status_code == 200


if __name__ == '__main__':
    unittest.main()
