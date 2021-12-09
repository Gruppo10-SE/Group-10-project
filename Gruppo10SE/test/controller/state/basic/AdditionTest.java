/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.state.basic;

import gruppo10se.CartesianComplex;
import gruppo10se.StackDataStructure;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class AdditionTest {
    
    public AdditionTest() {
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
     * Test of doBasicOperation method, of class Addition.
     */
    @Test
    public void testDoBasicOperation() {
        System.out.println("doBasicOperation");
        StackDataStructure<CartesianComplex> complexStack = new StackDataStructure<CartesianComplex>();
        Addition instance = new Addition();
        int expResult = 1;
        int result = instance.doBasicOperation(complexStack);
        assertEquals(expResult, result);
        System.out.println("doBasicOperation - ne");
        complexStack.push(new CartesianComplex(0,0));
        complexStack.push(new CartesianComplex(1,1));
        int expResult1 = 0;
        int result1 = instance.doBasicOperation(complexStack);
        assertEquals(expResult1, result1);
    }

    /**
     * Test of getMessage method, of class Addition.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Addition instance = new Addition();
        String expResult = "Sum executed";
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }
    
}
