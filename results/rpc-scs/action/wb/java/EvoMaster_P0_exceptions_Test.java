import  org.junit.AfterClass;
import  org.junit.BeforeClass;
import  org.junit.Before;
import  org.junit.Test;
import static org.junit.Assert.*;
import  java.util.Map;
import  java.util.List;
import static org.evomaster.test.utils.EMTestUtils.*;
import  org.evomaster.client.java.controller.SutHandler;
import static org.hamcrest.Matchers.*;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;




/**
*  This file was automatically generated by EvoMaster on 2024-10-06T18:34:10.426-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 11 tests
 * <br>
*  Covered targets: 22
 * <br>
*  Used time: 0h 12m 22s
 * <br>
*  Needed budget for current results: 97%
 * <br>
*  This file contains test cases which throws exceptions.
*/
public class EvoMaster_P0_exceptions_Test {

    
    private static final SutHandler controller = new em.external.org.rpc.grpcscs.ExternalEvoMasterController("/run/datad/facultad/tesis/EMB/jdk_8_maven/cs/rpc/grpc/artificial/grpc-scs/target/rpc-grpc-scs-sut.jar");
    private static String baseUrlOfSut;
    private static org.grpc.scs.generated.ScsServiceGrpc.ScsServiceBlockingStub var_client0_ScsServiceGrpc_ScsServiceBlockingStub;
    
    
    @BeforeClass
    public static void initClass() {
        controller.setupForGeneratedTest();
        baseUrlOfSut = controller.startSut();
        controller.registerOrExecuteInitSqlCommandsIfNeeded();
        controller.extractRPCSchema();
        assertNotNull(baseUrlOfSut);
        var_client0_ScsServiceGrpc_ScsServiceBlockingStub = (org.grpc.scs.generated.ScsServiceGrpc.ScsServiceBlockingStub) controller.getRPCClient("org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub");
    }
    
    
    @AfterClass
    public static void tearDown() {
        controller.stopSut();
    }
    
    
    @Before
    public void initTest() {
        controller.resetStateOfSUT();
    }
    
    
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:title
    // 			Action parameters:
    // 				arg0: '{"title":""}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:{"title":""}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:title
    @Test(timeout = 60000)
    public void test_0_scsserviceblockingstubOnTitleThrowsUnexpected_exception_java_lang_runtimeexception() throws Exception {
        
        try{
            
            org.grpc.scs.generated.DtoResponse res_0 = null;
            {
             org.grpc.scs.generated.TitleRequest arg0 = null;
             {
              org.grpc.scs.generated.TitleRequest.Builder arg0builder = org.grpc.scs.generated.TitleRequest.newBuilder();
              arg0builder.setSex(null);
              arg0builder.setTitle("");
              arg0 = arg0builder.build();
             }
             res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.title(arg0);
            }// RPC_framework_code UNEXPECTED_EXCEPTION:java.lang.RuntimeException
            
        } catch(Exception e){
            // ERROR: fail to instance value of input parameters based on dto/schema, msg error:fail to find the builder:org.grpc.scs.generated.TitleRequest with error msg:null
        }
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:cookie
    // 			Action parameters:
    // 				arg0: '{"name":"chKtt23IbI9F8M", "val":"eV8ZipvR84hVD"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:{"name":"chKtt23IbI9F8M", "val":"eV8ZipvR84hVD"}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:cookie
    @Test(timeout = 60000)
    public void test_1_scsserviceblockingstubOnCookieThrowsUnexpected_exception_java_lang_runtimeexception() throws Exception {
        
        try{
            
            org.grpc.scs.generated.DtoResponse res_0 = null;
            {
             org.grpc.scs.generated.CookieRequest arg0 = null;
             {
              org.grpc.scs.generated.CookieRequest.Builder arg0builder = org.grpc.scs.generated.CookieRequest.newBuilder();
              arg0builder.setName("chKtt23IbI9F8M");
              arg0builder.setVal("eV8ZipvR84hVD");
              arg0builder.setSite(null);
              arg0 = arg0builder.build();
             }
             res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.cookie(arg0);
            }// RPC_framework_code UNEXPECTED_EXCEPTION:java.lang.RuntimeException
            
        } catch(Exception e){
            // ERROR: fail to instance value of input parameters based on dto/schema, msg error:fail to find the builder:org.grpc.scs.generated.CookieRequest with error msg:null
        }
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:text2txt
    // 			Action parameters:
    // 				arg0: '{"word1":"h523", "word2":"uGYI8lYnbCnk"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:{"word1":"h523", "word2":"uGYI8lYnbCnk"}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:text2txt
    @Test(timeout = 60000)
    public void test_2_scsserviceblockingstubOnText2txtThrowsUnexpected_exception_java_lang_runtimeexception() throws Exception {
        
        try{
            
            org.grpc.scs.generated.DtoResponse res_0 = null;
            {
             org.grpc.scs.generated.Text2txtRequest arg0 = null;
             {
              org.grpc.scs.generated.Text2txtRequest.Builder arg0builder = org.grpc.scs.generated.Text2txtRequest.newBuilder();
              arg0builder.setWord1("h523");
              arg0builder.setWord2("uGYI8lYnbCnk");
              arg0builder.setWord3(null);
              arg0 = arg0builder.build();
             }
             res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.text2txt(arg0);
            }// RPC_framework_code UNEXPECTED_EXCEPTION:java.lang.RuntimeException
            
        } catch(Exception e){
            // ERROR: fail to instance value of input parameters based on dto/schema, msg error:fail to find the builder:org.grpc.scs.generated.Text2txtRequest with error msg:null
        }
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:ordered4
    // 			Action parameters:
    // 				arg0: '{"x":"_EM_2_XYZ_", "y":"_EM_4_XYZ_"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:{"x":"_EM_2_XYZ_", "y":"_EM_4_XYZ_"}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:ordered4
    @Test(timeout = 60000)
    public void test_3_scsserviceblockingstubOnOrdered4ThrowsUnexpected_exception_java_lang_runtimeexception() throws Exception {
        
        try{
            
            org.grpc.scs.generated.DtoResponse res_0 = null;
            {
             org.grpc.scs.generated.Ordered4Request arg0 = null;
             {
              org.grpc.scs.generated.Ordered4Request.Builder arg0builder = org.grpc.scs.generated.Ordered4Request.newBuilder();
              arg0builder.setW(null);
              arg0builder.setX("_EM_2_XYZ_");
              arg0builder.setZ(null);
              arg0builder.setY("_EM_4_XYZ_");
              arg0 = arg0builder.build();
             }
             res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.ordered4(arg0);
            }// RPC_framework_code UNEXPECTED_EXCEPTION:java.lang.RuntimeException
            
        } catch(Exception e){
            // ERROR: fail to instance value of input parameters based on dto/schema, msg error:fail to find the builder:org.grpc.scs.generated.Ordered4Request with error msg:null
        }
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:costfuns
    // 			Action parameters:
    // 				arg0: '{"i":-1073100324}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:{"i":-1073100324}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:costfuns
    @Test(timeout = 60000)
    public void test_4_scsserviceblockingstubOnCostfunsThrowsUnexpected_exception_java_lang_runtimeexception() throws Exception {
        
        try{
            
            org.grpc.scs.generated.DtoResponse res_0 = null;
            {
             org.grpc.scs.generated.CostfunsRequest arg0 = null;
             {
              org.grpc.scs.generated.CostfunsRequest.Builder arg0builder = org.grpc.scs.generated.CostfunsRequest.newBuilder();
              arg0builder.setI(-1073100324);
              arg0builder.setS(null);
              arg0 = arg0builder.build();
             }
             res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.costfuns(arg0);
            }// RPC_framework_code UNEXPECTED_EXCEPTION:java.lang.RuntimeException
            
        } catch(Exception e){
            // ERROR: fail to instance value of input parameters based on dto/schema, msg error:fail to find the builder:org.grpc.scs.generated.CostfunsRequest with error msg:null
        }
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:regex
    // 			Action parameters:
    // 				arg0: '{}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:{}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:regex
    @Test(timeout = 60000)
    public void test_5_scsserviceblockingstubOnRegexThrowsUnexpected_exception_java_lang_runtimeexception() throws Exception {
        
        try{
            
            org.grpc.scs.generated.DtoResponse res_0 = null;
            {
             org.grpc.scs.generated.RegexRequest arg0 = null;
             {
              org.grpc.scs.generated.RegexRequest.Builder arg0builder = org.grpc.scs.generated.RegexRequest.newBuilder();
              arg0builder.setTxt(null);
              arg0 = arg0builder.build();
             }
             res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.regex(arg0);
            }// RPC_framework_code UNEXPECTED_EXCEPTION:java.lang.RuntimeException
            
        } catch(Exception e){
            // ERROR: fail to instance value of input parameters based on dto/schema, msg error:fail to find the builder:org.grpc.scs.generated.RegexRequest with error msg:null
        }
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:pat
    // 			Action parameters:
    // 				arg0: '{"pat":"b11PHzg"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:{"pat":"b11PHzg"}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:pat
    @Test(timeout = 60000)
    public void test_6_scsserviceblockingstubOnPatThrowsUnexpected_exception_java_lang_runtimeexception() throws Exception {
        
        try{
            
            org.grpc.scs.generated.DtoResponse res_0 = null;
            {
             org.grpc.scs.generated.PatRequest arg0 = null;
             {
              org.grpc.scs.generated.PatRequest.Builder arg0builder = org.grpc.scs.generated.PatRequest.newBuilder();
              arg0builder.setTxt(null);
              arg0builder.setPat("b11PHzg");
              arg0 = arg0builder.build();
             }
             res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.pat(arg0);
            }// RPC_framework_code UNEXPECTED_EXCEPTION:java.lang.RuntimeException
            
        } catch(Exception e){
            // ERROR: fail to instance value of input parameters based on dto/schema, msg error:fail to find the builder:org.grpc.scs.generated.PatRequest with error msg:null
        }
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:dateParse
    // 			Action parameters:
    // 				arg0: '{"monthname":"rs4xf5G5"}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:{"monthname":"rs4xf5G5"}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:dateParse
    @Test(timeout = 60000)
    public void test_7_scsserviceblockingstubOnDateparseThrowsUnexpected_exception_java_lang_runtimeexception() throws Exception {
        
        try{
            
            org.grpc.scs.generated.DtoResponse res_0 = null;
            {
             org.grpc.scs.generated.DateParseRequest arg0 = null;
             {
              org.grpc.scs.generated.DateParseRequest.Builder arg0builder = org.grpc.scs.generated.DateParseRequest.newBuilder();
              arg0builder.setDayname(null);
              arg0builder.setMonthname("rs4xf5G5");
              arg0 = arg0builder.build();
             }
             res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.dateParse(arg0);
            }// RPC_framework_code UNEXPECTED_EXCEPTION:java.lang.RuntimeException
            
        } catch(Exception e){
            // ERROR: fail to instance value of input parameters based on dto/schema, msg error:fail to find the builder:org.grpc.scs.generated.DateParseRequest with error msg:null
        }
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:notyPevar
    // 			Action parameters:
    // 				arg0: '{"i":942}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:{"i":942}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:notyPevar
    @Test(timeout = 60000)
    public void test_8_scsserviceblockingstubOnNotypevarThrowsUnexpected_exception_java_lang_runtimeexception() throws Exception {
        
        try{
            
            org.grpc.scs.generated.DtoResponse res_0 = null;
            {
             org.grpc.scs.generated.NotyPevarRequest arg0 = null;
             {
              org.grpc.scs.generated.NotyPevarRequest.Builder arg0builder = org.grpc.scs.generated.NotyPevarRequest.newBuilder();
              arg0builder.setI(942);
              arg0builder.setS(null);
              arg0 = arg0builder.build();
             }
             res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.notyPevar(arg0);
            }// RPC_framework_code UNEXPECTED_EXCEPTION:java.lang.RuntimeException
            
        } catch(Exception e){
            // ERROR: fail to instance value of input parameters based on dto/schema, msg error:fail to find the builder:org.grpc.scs.generated.NotyPevarRequest with error msg:null
        }
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:fileSuffix
    // 			Action parameters:
    // 				arg0: '{}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:{}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:fileSuffix
    @Test(timeout = 60000)
    public void test_9_scsserviceblockingstubOnFilesuffixThrowsUnexpected_exception_java_lang_runtimeexception() throws Exception {
        
        try{
            
            org.grpc.scs.generated.DtoResponse res_0 = null;
            {
             org.grpc.scs.generated.FileSuffixRequest arg0 = null;
             {
              org.grpc.scs.generated.FileSuffixRequest.Builder arg0builder = org.grpc.scs.generated.FileSuffixRequest.newBuilder();
              arg0builder.setDirectory(null);
              arg0builder.setFile(null);
              arg0 = arg0builder.build();
             }
             res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.fileSuffix(arg0);
            }// RPC_framework_code UNEXPECTED_EXCEPTION:java.lang.RuntimeException
            
        } catch(Exception e){
            // ERROR: fail to instance value of input parameters based on dto/schema, msg error:fail to find the builder:org.grpc.scs.generated.FileSuffixRequest with error msg:null
        }
    }
    
    
    // Individual:
    // 	Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:calc
    // 			Action parameters:
    // 				arg0: '{"arg1":0.0836402013838613, "arg2":0.1673383776043329}'
    // 			Genes:
    // 				org.evomaster.core.search.gene.optional.OptionalGene = arg0:{"arg1":0.0836402013838613, "arg2":0.1673383776043329}
    // 	Evaluated Actions:
    // 		org.evomaster.core.problem.rpc.RPCCallAction: org.grpc.scs.generated.ScsServiceGrpc$ScsServiceBlockingStub:calc
    @Test(timeout = 60000)
    public void test_10_scsserviceblockingstubOnCalcThrowsUnexpected_exception_java_lang_runtimeexception() throws Exception {
        
        try{
            
            org.grpc.scs.generated.DtoResponse res_0 = null;
            {
             org.grpc.scs.generated.CalcRequest arg0 = null;
             {
              org.grpc.scs.generated.CalcRequest.Builder arg0builder = org.grpc.scs.generated.CalcRequest.newBuilder();
              arg0builder.setOp(null);
              arg0builder.setArg1(0.0836402013838613);
              arg0builder.setArg2(0.1673383776043329);
              arg0 = arg0builder.build();
             }
             res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.calc(arg0);
            }// RPC_framework_code UNEXPECTED_EXCEPTION:java.lang.RuntimeException
            
        } catch(Exception e){
            // ERROR: fail to instance value of input parameters based on dto/schema, msg error:fail to find the builder:org.grpc.scs.generated.CalcRequest with error msg:null
        }
    }


}
