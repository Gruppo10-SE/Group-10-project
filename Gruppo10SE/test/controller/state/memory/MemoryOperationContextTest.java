/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller.state.memory;

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
public class MemoryOperationContextTest {
    
    public MemoryOperationContextTest() {
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
     * Test of setOperationState method, of class MemoryOperationContext.
     */
    @Test
    public void testSetOperationState() {
        System.out.println("setOperationState");
        MemoryOperationState mos = null;
        MemoryOperationContext instance = new MemoryOperationContext();
        instance.setOperationState(mos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeState method, of class MemoryOperationContext.
     */
    @Test
    public void testChangeState() {
        System.out.println("changeState");
        String s = "";
        MemoryOperationContext instance = new MemoryOperationContext();
        instance.changeState(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doMemoryOperation method, of class MemoryOperationContext.
     */
    @Test
    public void testDoMemoryOperation() {
        System.out.println("doMemoryOperation");
        StackDataStructure stack = null;
        MemoryOperationContext instance = new MemoryOperationContext();
        int expResult = 0;
        int result = instance.doMemoryOperation(stack);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class MemoryOperationContext.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        MemoryOperationContext instance = new MemoryOperationContext();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
