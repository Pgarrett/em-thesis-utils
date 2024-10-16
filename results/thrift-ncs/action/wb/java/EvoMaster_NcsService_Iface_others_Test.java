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
*  This file was automatically generated by EvoMaster on 2024-10-17T12:37:49.403-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 29 tests
 * <br>
*  Covered targets: 437
 * <br>
*  Used time: 0h 13m 44s
 * <br>
*  Needed budget for current results: 94%
 * <br>
*  This file contains test cases that represent failed calls, but not indicative of faults.
*/
public class EvoMaster_NcsService_Iface_others_Test {

    
    private static final SutHandler controller = new em.external.org.rpc.thriftncs.ExternalEvoMasterController("/run/datad/facultad/tesis/EMB/jdk_8_maven/cs/rpc/thrift/artificial/thrift-ncs/target/rpc-thrift-ncs-sut.jar");
    private static String baseUrlOfSut;
    private static org.thrift.ncs.client.NcsService.Client var_client0_NcsService_Iface;
    
    
    @BeforeClass
    public static void initClass() {
        controller.setupForGeneratedTest();
        baseUrlOfSut = controller.startSut();
        controller.registerOrExecuteInitSqlCommandsIfNeeded();
        controller.extractRPCSchema();
        assertNotNull(baseUrlOfSut);
        var_client0_NcsService_Iface = (org.thrift.ncs.client.NcsService.Client) controller.getRPCClient("org.thrift.ncs.client.NcsService$Iface");
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
    public void test_0_ifaceOnCheckTriangleReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 0;
         int arg1 = 737;
         int arg2 = 952;
         res_0 = var_client0_NcsService_Iface.checkTriangle(arg0,arg1,arg2);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_1_ifaceOnCheckTriangleReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 703;
         int arg1 = -1047859;
         int arg2 = -3160;
         res_0 = var_client0_NcsService_Iface.checkTriangle(arg0,arg1,arg2);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_2_ifaceOnCheckTriangleReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 525218;
         int arg1 = 1166;
         int arg2 = -393;
         res_0 = var_client0_NcsService_Iface.checkTriangle(arg0,arg1,arg2);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_3_ifaceOnRemainderReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 0;
         int arg1 = 68;
         res_0 = var_client0_NcsService_Iface.remainder(arg0,arg1);
        }
        assertEquals(-1, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_4_ifaceOnCheckTriangleReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 979;
         int arg1 = 378;
         int arg2 = 518;
         res_0 = var_client0_NcsService_Iface.checkTriangle(arg0,arg1,arg2);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_5_ifaceOnCheckTriangleReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 378;
         int arg1 = 468;
         int arg2 = 54;
         res_0 = var_client0_NcsService_Iface.checkTriangle(arg0,arg1,arg2);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_6_ifaceOnRemainderReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 329;
         int arg1 = 0;
         res_0 = var_client0_NcsService_Iface.remainder(arg0,arg1);
        }
        assertEquals(-1, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_7_ifaceOnExpintReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 0;
         double arg1 = 0.04210813724895135;
         res_0 = var_client0_NcsService_Iface.expint(arg0,arg1);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(22.769140581309767, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_8_ifaceOnCheckTriangleReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 191;
         int arg1 = 717;
         int arg2 = 936;
         res_0 = var_client0_NcsService_Iface.checkTriangle(arg0,arg1,arg2);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_9_ifaceOnCheckTriangleReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 408;
         int arg1 = 887;
         int arg2 = 584;
         res_0 = var_client0_NcsService_Iface.checkTriangle(arg0,arg1,arg2);
        }
        assertEquals(1, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_10_ifaceOnCheckTriangleReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 619;
         int arg1 = 243;
         int arg2 = 800;
         res_0 = var_client0_NcsService_Iface.checkTriangle(arg0,arg1,arg2);
        }
        assertEquals(1, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_11_ifaceOnBessjReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 587;
         double arg1 = 0.0;
         res_0 = var_client0_NcsService_Iface.bessj(arg0,arg1);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_12_ifaceOnExpintReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 558;
         double arg1 = 0.0;
         res_0 = var_client0_NcsService_Iface.expint(arg0,arg1);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0017953321364452424, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_13_ifaceOnCheckTriangleReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 697;
         int arg1 = 441;
         int arg2 = 629;
         res_0 = var_client0_NcsService_Iface.checkTriangle(arg0,arg1,arg2);
        }
        assertEquals(1, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_14_ifaceOnRemainderReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 805;
         int arg1 = -8124;
         res_0 = var_client0_NcsService_Iface.remainder(arg0,arg1);
        }
        assertEquals(-1, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_15_ifaceOnRemainderReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 954;
         int arg1 = 86;
         res_0 = var_client0_NcsService_Iface.remainder(arg0,arg1);
        }
        assertEquals(8, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_16_ifaceOnRemainderReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = -1868;
         int arg1 = 411;
         res_0 = var_client0_NcsService_Iface.remainder(arg0,arg1);
        }
        assertEquals(-224, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_17_ifaceOnFisherReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = -32263;
         int arg1 = 260;
         double arg2 = 0.2671929656207769;
         res_0 = var_client0_NcsService_Iface.fisher(arg0,arg1,arg2);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(1.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_18_ifaceOnFisherReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 998;
         int arg1 = 135;
         double arg2 = 0.07294291504008676;
         res_0 = var_client0_NcsService_Iface.fisher(arg0,arg1,arg2);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_19_ifaceOnFisherReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 474;
         int arg1 = 522;
         double arg2 = 0.8858144000807818;
         res_0 = var_client0_NcsService_Iface.fisher(arg0,arg1,arg2);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(0.08891591249555751, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_20_ifaceOnExpintReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 994;
         double arg1 = 0.9884249022553091;
         res_0 = var_client0_NcsService_Iface.expint(arg0,arg1);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(3.7441285841632285E-4, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_21_ifaceOnFisherReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 957;
         int arg1 = 516;
         double arg2 = 0.361270065;
         res_0 = var_client0_NcsService_Iface.fisher(arg0,arg1,arg2);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(4.524479599543001E-16, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_22_ifaceOnFisherReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 350;
         int arg1 = 545;
         double arg2 = 0.2759423318389497;
         res_0 = var_client0_NcsService_Iface.fisher(arg0,arg1,arg2);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(3.487494461814306E-14, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_23_ifaceOnGammqReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         double arg0 = 0.8701237233197407;
         double arg1 = 0.0;
         res_0 = var_client0_NcsService_Iface.gammq(arg0,arg1);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(1.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_24_ifaceOnExpintReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 209;
         double arg1 = 2.32877561945;
         res_0 = var_client0_NcsService_Iface.expint(arg0,arg1);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(4.631310907810924E-4, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_25_ifaceOnFisherReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 521;
         int arg1 = 375;
         double arg2 = 0.368528420574753;
         res_0 = var_client0_NcsService_Iface.fisher(arg0,arg1,arg2);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(1.6649144335268595E-15, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_26_ifaceOnGammqReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         double arg0 = 0.8701237233197407;
         double arg1 = 0.0568992116016126;
         res_0 = var_client0_NcsService_Iface.gammq(arg0,arg1);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(0.9155169057119874, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_27_ifaceOnBessjReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         int arg0 = 899;
         double arg1 = 0.7116153002428963;
         res_0 = var_client0_NcsService_Iface.bessj(arg0,arg1);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(0.0, res_0.resultAsDouble));
        
    }
    
    
    @Test(timeout = 60000)
    public void test_28_ifaceOnGammqReturnsSuccess() throws Exception {
        
        
        org.thrift.ncs.client.Dto res_0 = null;
        {
         double arg0 = 0.34251415859042667;
         double arg1 = 3.415094183661527;
         res_0 = var_client0_NcsService_Iface.gammq(arg0,arg1);
        }
        assertEquals(0, res_0.resultAsInt);
        assertTrue(numbersMatch(0.004860706450720819, res_0.resultAsDouble));
        
    }


}
