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
public class OverTest {
    
    public OverTest() {
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
     * Test of doMemoryOperation method, of class Over.
     */
    @Test
    public void testDoMemoryOperation() {
        System.out.println("doMemoryOperation - e");
        StackDataStructure stack = new StackDataStructure();
        Over instance = new Over();
        int expResult = -1;
        int result = instance.doMemoryOperation(stack);
        assertEquals(expResult, result);
        System.out.println("doMemoryOperation - ne");
        CartesianComplex number = new CartesianComplex(3,2);
        stack.push(number);
        stack.push(number);
        stack.push(number);
        int expResult1 = 0;
        int result1 = instance.doMemoryOperation(stack);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMessage method, of class Over.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Over instance = new Over();
        String expResult = "Inserted a copy of the second last number";
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }
    
}
