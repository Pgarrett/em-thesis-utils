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
*  This file was automatically generated by EvoMaster on 2024-11-06T22:58:20.925-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 5 tests
 * <br>
*  Covered targets: 10
 * <br>
*  Used time: 0h 11m 44s
 * <br>
*  Needed budget for current results: 88%
 * <br>
*  This file contains test cases which throws exceptions.
*/
public class EvoMaster_P0_exceptions_Test {

    
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
    public void test_0_ifaceOnRemainderThrowsTApplicationException() throws Exception {
        
        try{
            
            org.thrift.ncs.client.Dto res_0 = null;
            {
             int arg0 = -64943;
             int arg1 = -16776432;
             res_0 = var_client0_NcsService_Iface.remainder(arg0,arg1);
            }// org/thrift/ncs/service/NcsServiceImpl_77_remainder OTHERWISE_EXCEPTION:org.apache.thrift.TApplicationException
            
        } catch(Exception e){
            // remainder failed: unknown result
        }
    }
    
    
    @Test(timeout = 60000)
    public void test_1_ifaceOnGammqThrowsTApplicationException() throws Exception {
        
        try{
            
            org.thrift.ncs.client.Dto res_0 = null;
            {
             double arg0 = 0.3211705961920317;
             double arg1 = -136.66108812220025;
             res_0 = var_client0_NcsService_Iface.gammq(arg0,arg1);
            }// org/thrift/ncs/service/imp/Gammq_80_exe OTHERWISE_EXCEPTION:org.apache.thrift.TApplicationException
            
        } catch(Exception e){
            // gammq failed: unknown result
        }
    }
    
    
    @Test(timeout = 60000)
    public void test_2_ifaceOnBessjThrowsTApplicationException() throws Exception {
        
        try{
            
            org.thrift.ncs.client.Dto res_0 = null;
            {
             int arg0 = -32540;
             double arg1 = 0.0;
             res_0 = var_client0_NcsService_Iface.bessj(arg0,arg1);
            }// org/thrift/ncs/service/NcsServiceImpl_24_bessj OTHERWISE_EXCEPTION:org.apache.thrift.TApplicationException
            
        } catch(Exception e){
            // bessj failed: unknown result
        }
    }
    
    
    @Test(timeout = 60000)
    public void test_3_ifaceOnFisherThrowsTApplicationException() throws Exception {
        
        try{
            
            org.thrift.ncs.client.Dto res_0 = null;
            {
             int arg0 = 675502452;
             int arg1 = 522;
             double arg2 = 0.37477230241619175;
             res_0 = var_client0_NcsService_Iface.fisher(arg0,arg1,arg2);
            }// org/thrift/ncs/service/NcsServiceImpl_49_fisher OTHERWISE_EXCEPTION:org.apache.thrift.TApplicationException
            
        } catch(Exception e){
            // fisher failed: unknown result
        }
    }
    
    
    @Test(timeout = 60000)
    public void test_4_ifaceOnExpintThrowsTApplicationException() throws Exception {
        
        try{
            
            org.thrift.ncs.client.Dto res_0 = null;
            {
             int arg0 = 555;
             double arg1 = -1.128618370251945;
             res_0 = var_client0_NcsService_Iface.expint(arg0,arg1);
            }// org/thrift/ncs/service/imp/Expint_16_exe OTHERWISE_EXCEPTION:org.apache.thrift.TApplicationException
            
        } catch(Exception e){
            // expint failed: unknown result
        }
    }


}
