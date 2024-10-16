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
*  This file was automatically generated by EvoMaster on 2024-10-17T12:50:58.498-03:00[America/Argentina/Buenos_Aires]
 * <br>
*  The generated test suite contains 2 tests
 * <br>
*  Covered targets: 11
 * <br>
*  Used time: 0h 12m 45s
 * <br>
*  Needed budget for current results: 97%
 * <br>
*  This file contains test cases which throws exceptions.
*/
public class EvoMaster_P0_exceptions_Test {

    
    private static final SutHandler controller = new em.external.org.rpc.thriftscs.ExternalEvoMasterController("/run/datad/facultad/tesis/EMB/jdk_8_maven/cs/rpc/thrift/artificial/thrift-scs/target/rpc-thrift-scs-sut.jar");
    private static String baseUrlOfSut;
    private static org.thrift.scs.client.ScsService.Client var_client0_ScsService_Iface;
    
    
    @BeforeClass
    public static void initClass() {
        controller.setupForGeneratedTest();
        baseUrlOfSut = controller.startSut();
        controller.registerOrExecuteInitSqlCommandsIfNeeded();
        controller.extractRPCSchema();
        assertNotNull(baseUrlOfSut);
        var_client0_ScsService_Iface = (org.thrift.scs.client.ScsService.Client) controller.getRPCClient("org.thrift.scs.client.ScsService$Iface");
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
    public void test_0_ifaceOnCookieThrowsTApplicationException() throws Exception {
        
        try{
            
            String res_0 = null;
            {
             String arg0 = "vSicpR2GR6HsZ";
             String arg1 = null;
             String arg2 = "Bgi4h";
             res_0 = var_client0_ScsService_Iface.cookie(arg0,arg1,arg2);
            }// org/thrift/scs/service/imp/Cookie_20_subject INTERNAL_ERROR:org.apache.thrift.TApplicationException
            
        } catch(Exception e){
            // Internal error processing cookie
        }
    }
    
    
    @Test(timeout = 60000)
    public void test_1_ifaceOnCookieThrowsTApplicationException() throws Exception {
        
        try{
            
            String res_0 = null;
            {
             String arg0 = "SZll1OA";
             String arg1 = "";
             String arg2 = null;
             res_0 = var_client0_ScsService_Iface.cookie(arg0,arg1,arg2);
            }// org/thrift/scs/service/imp/Cookie_21_subject INTERNAL_ERROR:org.apache.thrift.TApplicationException
            
        } catch(Exception e){
            // Internal error processing cookie
        }
    }


}
