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
*  This file was automatically generated by EvoMaster on 2024-11-06T22:34:06.762-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 6 tests
 * <br>
*  Covered targets: 12
 * <br>
*  Used time: 0h 11m 22s
 * <br>
*  Needed budget for current results: 96%
 * <br>
*  This file contains test cases that represent failed calls, but not indicative of faults.
*/
public class EvoMaster_NcsServiceGrpc_NcsServiceBlockingStub_others_Test {

    
    private static final SutHandler controller = new em.external.org.rpc.grpcncs.ExternalEvoMasterController("/run/datad/facultad/tesis/EMB/jdk_8_maven/cs/rpc/grpc/artificial/grpc-ncs/target/rpc-grpc-ncs-sut.jar");
    private static String baseUrlOfSut;
    private static org.grpc.ncs.generated.NcsServiceGrpc.NcsServiceBlockingStub var_client0_NcsServiceGrpc_NcsServiceBlockingStub;
    
    
    @BeforeClass
    public static void initClass() {
        controller.setupForGeneratedTest();
        baseUrlOfSut = controller.startSut();
        controller.registerOrExecuteInitSqlCommandsIfNeeded();
        controller.extractRPCSchema();
        assertNotNull(baseUrlOfSut);
        var_client0_NcsServiceGrpc_NcsServiceBlockingStub = (org.grpc.ncs.generated.NcsServiceGrpc.NcsServiceBlockingStub) controller.getRPCClient("org.grpc.ncs.generated.NcsServiceGrpc$NcsServiceBlockingStub");
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
    public void test_0_ncsServiceBlockingStubOnRemainderReturnsSuccess() throws Exception {
        
        
        org.grpc.ncs.generated.DtoResponse res_0 = null;
        {
         org.grpc.ncs.generated.RemainderRequest arg0 = null;
         res_0 = var_client0_NcsServiceGrpc_NcsServiceBlockingStub.remainder(arg0);
        }
        assertEquals(-1, res_0.getResultAsInt());
        assertTrue(numbersMatch(0.0, res_0.getResultAsDouble()));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_1_ncsServiceBlockingStubOnBessjReturnsSuccess() throws Exception {
        
        
        org.grpc.ncs.generated.DtoResponse res_0 = null;
        {
         org.grpc.ncs.generated.BessjRequest arg0 = null;
         {
          org.grpc.ncs.generated.BessjRequest.Builder arg0builder = org.grpc.ncs.generated.BessjRequest.newBuilder();
          arg0builder.setN(254);
          arg0builder.setX(0.4580165254042833);
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_NcsServiceGrpc_NcsServiceBlockingStub.bessj(arg0);
        }
        assertEquals(0, res_0.getResultAsInt());
        assertTrue(numbersMatch(0.0, res_0.getResultAsDouble()));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_2_ncsServiceBlockingStubOnCheckTriangleReturnsSuccess() throws Exception {
        
        
        org.grpc.ncs.generated.DtoResponse res_0 = null;
        {
         org.grpc.ncs.generated.TriangleRequest arg0 = null;
         res_0 = var_client0_NcsServiceGrpc_NcsServiceBlockingStub.checkTriangle(arg0);
        }
        assertEquals(0, res_0.getResultAsInt());
        assertTrue(numbersMatch(0.0, res_0.getResultAsDouble()));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_3_ncsServiceBlockingStubOnGammqReturnsSuccess() throws Exception {
        
        
        org.grpc.ncs.generated.DtoResponse res_0 = null;
        {
         org.grpc.ncs.generated.GammqRequest arg0 = null;
         {
          org.grpc.ncs.generated.GammqRequest.Builder arg0builder = org.grpc.ncs.generated.GammqRequest.newBuilder();
          arg0builder.setA(596);
          arg0builder.setX(0.3023145741878531);
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_NcsServiceGrpc_NcsServiceBlockingStub.gammq(arg0);
        }
        assertEquals(0, res_0.getResultAsInt());
        assertTrue(numbersMatch(1.0, res_0.getResultAsDouble()));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_4_ncsServiceBlockingStubOnFisherReturnsSuccess() throws Exception {
        
        
        org.grpc.ncs.generated.DtoResponse res_0 = null;
        {
         org.grpc.ncs.generated.FisherRequest arg0 = null;
         {
          org.grpc.ncs.generated.FisherRequest.Builder arg0builder = org.grpc.ncs.generated.FisherRequest.newBuilder();
          arg0builder.setM(794);
          arg0builder.setN(10);
          arg0builder.setX(0.693448647996837);
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_NcsServiceGrpc_NcsServiceBlockingStub.fisher(arg0);
        }
        assertEquals(0, res_0.getResultAsInt());
        assertTrue(numbersMatch(0.15706491689514349, res_0.getResultAsDouble()));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_5_ncsServiceBlockingStubOnExpintReturnsSuccess() throws Exception {
        
        
        org.grpc.ncs.generated.DtoResponse res_0 = null;
        {
         org.grpc.ncs.generated.ExpintRequest arg0 = null;
         {
          org.grpc.ncs.generated.ExpintRequest.Builder arg0builder = org.grpc.ncs.generated.ExpintRequest.newBuilder();
          arg0builder.setN(565);
          arg0builder.setX(1.5298966594971606);
          arg0 = arg0builder.build();
         }
         res_0 = var_client0_NcsServiceGrpc_NcsServiceBlockingStub.expint(arg0);
        }
        assertEquals(0, res_0.getResultAsInt());
        assertTrue(numbersMatch(3.8292760271203255E-4, res_0.getResultAsDouble()));
        
    }


}
