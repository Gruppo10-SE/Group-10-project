/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
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
 * @author mazzy
 */
public class SubtractionTest {
    
    public SubtractionTest() {
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
     * Test of doBasicOperation method, of class Subtraction.
     */
    @Test
    public void testDoBasicOperation() {
        System.out.println("doBasicOperation - e");
        CartesianComplex number = new CartesianComplex (3,6);
        StackDataStructure<CartesianComplex> complexStack = new StackDataStructure<CartesianComplex>();
        Subtraction instance = new Subtraction();
        int expResult = 1;
        int result = instance.doBasicOperation(complexStack);
        assertEquals(expResult, result);
        System.out.println("doBasicOperation - ne");
        complexStack.push(number);
        complexStack.push(number);
        complexStack.push(number);
        int expResult1 = 0;
        int result1 = instance.doBasicOperation(complexStack);
        assertEquals(expResult1, result1);
    }

    /**
     * Test of getMessage method, of class Subtraction.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Subtraction instance = new Subtraction();
        String expResult = "Subtraction executed";
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }
    
}
