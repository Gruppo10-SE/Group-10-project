/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller.state.memory;

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
public class SwapTest {
    
    public SwapTest() {
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
     * Test of doMemoryOperation method, of class Swap.
     */
    @Test
    public void testDoMemoryOperation() {
        System.out.println("doMemoryOperation - e");
        StackDataStructure stack = new StackDataStructure();
        Swap instance = new Swap();
        int expResult = -1;
        int result = instance.doMemoryOperation(stack);
        assertEquals(expResult, result);
        System.out.println("doMemoryOperation - ne");
        stack.push(new CartesianComplex(3,5));
        stack.push(new CartesianComplex(3,5));
        stack.push(new CartesianComplex(3,5));
        int expResult1 = 0;
        int result1 = instance.doMemoryOperation(stack);
        assertEquals(expResult1, result1);
    }

    /**
     * Test of getMessage method, of class Swap.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Swap instance = new Swap();
        String expResult = "Last two numbers exchanged";
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }
    
}
