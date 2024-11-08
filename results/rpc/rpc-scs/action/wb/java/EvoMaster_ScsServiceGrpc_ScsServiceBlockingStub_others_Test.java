import  org.junit.AfterClass;
import  org.junit.BeforeClass;
import  org.junit.Before;
import  org.junit.Test;
import static org.junit.Assert.*;
import  java.util.Map;
import  java.util.Arrays;
import  java.util.List;
import static org.evomaster.test.utils.EMTestUtils.*;
import  org.evomaster.client.java.controller.SutHandler;
import static org.hamcrest.Matchers.*;
import static org.evomaster.client.java.controller.contentMatchers.NumberMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.StringMatcher.*;
import static org.evomaster.client.java.controller.contentMatchers.SubStringMatcher.*;




/**
*  This file was automatically generated by EvoMaster on 2024-11-06T22:46:12.404-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 11 tests
 * <br>
*  Covered targets: 22
 * <br>
*  Used time: 0h 11m 46s
 * <br>
*  Needed budget for current results: 100%
 * <br>
*  This file contains test cases that represent failed calls, but not indicative of faults.
*/
public class EvoMaster_ScsServiceGrpc_ScsServiceBlockingStub_others_Test {

    
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
    
    
    
    
    @Test(timeout = 60000)
    public void test_0_scsServiceBlockingStubOnTitleReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.TitleRequest arg0 = null;
         {
          org.grpc.scs.generated.TitleRequest.Builder arg0builder = org.grpc.scs.generated.TitleRequest.newBuilder();
          arg0builder.setSex("male");
          arg0builder.setTitle("ta8HG]0");
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.title(arg0);
        }
        assertEquals("-1", res_0.getValue());
        
    }
    
    
    @Test(timeout = 60000)
    public void test_1_scsServiceBlockingStubOnCookieReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.CookieRequest arg0 = null;
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.cookie(arg0);
        }
        assertEquals("0", res_0.getValue());
        
    }
    
    
    @Test(timeout = 60000)
    public void test_2_scsServiceBlockingStubOnRegexReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.RegexRequest arg0 = null;
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.regex(arg0);
        }
        assertEquals("none", res_0.getValue());
        
    }
    
    
    @Test(timeout = 60000)
    public void test_3_scsServiceBlockingStubOnText2txtReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.Text2txtRequest arg0 = null;
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.text2txt(arg0);
        }
        assertEquals("", res_0.getValue());
        
    }
    
    
    @Test(timeout = 60000)
    public void test_4_scsServiceBlockingStubOnFileSuffixReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.FileSuffixRequest arg0 = null;
         {
          org.grpc.scs.generated.FileSuffixRequest.Builder arg0builder = org.grpc.scs.generated.FileSuffixRequest.newBuilder();
          arg0builder.setDirectory("_EM_47_XYZ_");
          arg0builder.setFile("QGYKP92FE");
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.fileSuffix(arg0);
        }
        assertEquals("0", res_0.getValue());
        
    }
    
    
    @Test(timeout = 60000)
    public void test_5_scsServiceBlockingStubOnPatReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.PatRequest arg0 = null;
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.pat(arg0);
        }
        assertEquals("0", res_0.getValue());
        
    }
    
    
    @Test(timeout = 60000)
    public void test_6_scsServiceBlockingStubOnCalcReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.CalcRequest arg0 = null;
         {
          org.grpc.scs.generated.CalcRequest.Builder arg0builder = org.grpc.scs.generated.CalcRequest.newBuilder();
          arg0builder.setOp("xeeByr5Zpeg");
          arg0builder.setArg1(0.9027590661764865);
          arg0builder.setArg2(0.6542668916101827);
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.calc(arg0);
        }
        assertEquals("0.0", res_0.getValue());
        
    }
    
    
    @Test(timeout = 60000)
    public void test_7_scsServiceBlockingStubOnNotyPevarReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.NotyPevarRequest arg0 = null;
         {
          org.grpc.scs.generated.NotyPevarRequest.Builder arg0builder = org.grpc.scs.generated.NotyPevarRequest.newBuilder();
          arg0builder.setI(61);
          arg0builder.setS("_EM_4_XYZ_");
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.notyPevar(arg0);
        }
        assertEquals("3", res_0.getValue());
        
    }
    
    
    @Test(timeout = 60000)
    public void test_8_scsServiceBlockingStubOnOrdered4ReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.Ordered4Request arg0 = null;
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.ordered4(arg0);
        }
        //assertEquals("unordered", res_0.getValue());
        
    }
    
    
    @Test(timeout = 60000)
    public void test_9_scsServiceBlockingStubOnCostfunsReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.CostfunsRequest arg0 = null;
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.costfuns(arg0);
        }
        assertEquals("10", res_0.getValue());
        
    }
    
    
    @Test(timeout = 60000)
    public void test_10_scsServiceBlockingStubOnDateParseReturnsSuccess() throws Exception {
        
        
        org.grpc.scs.generated.DtoResponse res_0 = null;
        {
         org.grpc.scs.generated.DateParseRequest arg0 = null;
         res_0 = var_client0_ScsServiceGrpc_ScsServiceBlockingStub.dateParse(arg0);
        }
        assertEquals("0", res_0.getValue());
        
    }


}