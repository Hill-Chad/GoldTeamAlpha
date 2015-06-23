/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chad
 */
public class ClientSocketTest {
    
    /**
     * Test of connect method, of class ClientSocket.
     */
    @Test
    public void testConnect() throws Exception {
        System.out.println("connect this tests the connection");
        ClientSocket instance = null;
        instance.connect();
        // TODO review the generated test code and remove the default call to fail.
        fail("the test failed on the connection");
    }

    /**
     * Test of readResponse method, of class ClientSocket.
     */
    @Test
    public void testReadResponse() throws Exception {
        System.out.println("readResponse test");
        ClientSocket instance = null;
        instance.readResponse();
        // this tests to see if there is a server connected
        fail("The test has failed on the read response.");
    }

    /**
     * Test of main method, of class ClientSocket.
     */
    @Test
    public void testMain() {
        System.out.println("main test");
        String[] arg = null;
        ClientSocket.main(arg);
        // this tests to see if there
        fail("The test has a failed on the main part.");
    }
    
}
