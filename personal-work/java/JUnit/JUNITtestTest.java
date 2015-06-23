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
public class JUNITtestTest {
    
    public JUNITtestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of multiply method, of class JUNITtest.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double a = 5.0;
        double b = 4.0;
        double expResult = 20.0;
        double result = JUNITtest.multiply(a, b);
        assertEquals(expResult, result, 0.00001);
        // TODO review the generated test code and remove the default call to fail.
   
}
