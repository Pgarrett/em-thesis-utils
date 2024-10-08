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


#  This file was automatically generated by EvoMaster on 2024-10-06T17:11:59.343-03:00[America/Argentina/Buenos_Aires]
#  
#  The generated test suite contains 6 tests
#  
#  Covered targets: 18
#  
#  Used time: 0h 10m 21s
#  
#  Needed budget for current results: 95%
#  
#  This file contains test cases that represent successful calls.
class EvoMaster_successes_Test(unittest.TestCase):

    
    baseUrlOfSut = "http://localhost:8080/graphql"
    
    
    
    
    
    
    
    
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.graphql.GraphQLAction: bessj
    # 			Action parameters:
    # 				n: '941'
    # 				x: '0.26656905'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.OptionalGene = n:941
    # 				org.evomaster.core.search.gene.optional.OptionalGene = x:0.26656905
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.graphql.GraphQLAction: bessj
    @timeout_decorator.timeout(60)
    def test_0_QUERY_on_bessj_returns_data(self):
        
        headers = {}
        headers["content-type"] = "application/json"
        body = " { " + \
            " \"query\": \"  { bessj  (n : 941,x : 0.26656905)         } \" " + \
            " } "
        headers['Accept'] = "application/json"
        res_0 = requests \
                .post(self.baseUrlOfSut,
                    headers=headers, data=body)
        
        assert res_0.status_code == 200
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["data"]["bessj"] == 0.0
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.graphql.GraphQLAction: remainder
    # 			Action parameters:
    # 				a: 'null'
    # 				b: ''
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.OptionalGene = a:null
    # 				org.evomaster.core.search.gene.optional.OptionalGene = b:
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.graphql.GraphQLAction: remainder
    @timeout_decorator.timeout(60)
    def test_1_QUERY_on_remainder_returns_data(self):
        
        headers = {}
        headers["content-type"] = "application/json"
        body = " { " + \
            " \"query\": \"  { remainder  (a : null)         } \" " + \
            " } "
        headers['Accept'] = "application/json"
        res_0 = requests \
                .post(self.baseUrlOfSut,
                    headers=headers, data=body)
        
        assert res_0.status_code == 200
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["data"]["remainder"] == -1.0
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.graphql.GraphQLAction: gammq
    # 			Action parameters:
    # 				a: '0.5658746'
    # 				x: 'null'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.OptionalGene = a:0.5658746
    # 				org.evomaster.core.search.gene.optional.OptionalGene = x:null
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.graphql.GraphQLAction: gammq
    @timeout_decorator.timeout(60)
    def test_2_QUERY_on_gammq_returns_data(self):
        
        headers = {}
        headers["content-type"] = "application/json"
        body = " { " + \
            " \"query\": \"  { gammq  (a : 0.5658746,x : null)         } \" " + \
            " } "
        headers['Accept'] = "application/json"
        res_0 = requests \
                .post(self.baseUrlOfSut,
                    headers=headers, data=body)
        
        assert res_0.status_code == 200
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["data"]["gammq"] == 1.0
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.graphql.GraphQLAction: expint
    # 			Action parameters:
    # 				n: '284'
    # 				x: ''
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.OptionalGene = n:284
    # 				org.evomaster.core.search.gene.optional.OptionalGene = x:
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.graphql.GraphQLAction: expint
    @timeout_decorator.timeout(60)
    def test_3_QUERY_on_expint_returns_data(self):
        
        headers = {}
        headers["content-type"] = "application/json"
        body = " { " + \
            " \"query\": \"  { expint  (n : 284)         } \" " + \
            " } "
        headers['Accept'] = "application/json"
        res_0 = requests \
                .post(self.baseUrlOfSut,
                    headers=headers, data=body)
        
        assert res_0.status_code == 200
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["data"]["expint"] == 0.0035335689045936395
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.graphql.GraphQLAction: triangleClassification
    # 			Action parameters:
    # 				a: ''
    # 				b: ''
    # 				c: 'null'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.OptionalGene = a:
    # 				org.evomaster.core.search.gene.optional.OptionalGene = b:
    # 				org.evomaster.core.search.gene.optional.OptionalGene = c:null
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.graphql.GraphQLAction: triangleClassification
    @timeout_decorator.timeout(60)
    def test_4_QUERY_on_triangleClassification_returns_data(self):
        
        headers = {}
        headers["content-type"] = "application/json"
        body = " { " + \
            " \"query\": \"  { triangleClassification  (c : null)         } \" " + \
            " } "
        headers['Accept'] = "application/json"
        res_0 = requests \
                .post(self.baseUrlOfSut,
                    headers=headers, data=body)
        
        assert res_0.status_code == 200
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["data"]["triangleClassification"] == 0.0
    
    
    # Individual:
    # 	Actions:
    # 		org.evomaster.core.problem.graphql.GraphQLAction: fisher
    # 			Action parameters:
    # 				m: '187'
    # 				n: '54'
    # 				x: '0.7497942'
    # 			Genes:
    # 				org.evomaster.core.search.gene.optional.OptionalGene = m:187
    # 				org.evomaster.core.search.gene.optional.OptionalGene = n:54
    # 				org.evomaster.core.search.gene.optional.OptionalGene = x:0.7497942
    # 	Evaluated Actions:
    # 		org.evomaster.core.problem.graphql.GraphQLAction: fisher
    @timeout_decorator.timeout(60)
    def test_5_QUERY_on_fisher_returns_data(self):
        
        headers = {}
        headers["content-type"] = "application/json"
        body = " { " + \
            " \"query\": \"  { fisher  (m : 187,n : 54,x : 0.7497942)         } \" " + \
            " } "
        headers['Accept'] = "application/json"
        res_0 = requests \
                .post(self.baseUrlOfSut,
                    headers=headers, data=body)
        
        assert res_0.status_code == 200
        assert "application/json" in res_0.headers["content-type"]
        assert res_0.json()["data"]["fisher"] == 0.0824153907011494


if __name__ == '__main__':
    unittest.main()
