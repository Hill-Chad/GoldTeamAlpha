/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*; // it uses items from here so i just included them all


/**
 *
 * @author Chad
 */
public class CollectionsTest {
    
    public CollectionsTest() {
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
     * Test of main method, of class Collections.
     */
    @Test
    public void testMain() { // this checks to make sure there isnt any list that have been created
        javaapplication5.LinkedList list = new javaapplication5.LinkedList();
    assertTrue(list.isEmpty()); // linked list should be empty
    assertEquals(0, list.length());   // length of linked list should be zero 
    }

    /**
     * Test of displayAll method, of class Collections.
     */
    
    
}
