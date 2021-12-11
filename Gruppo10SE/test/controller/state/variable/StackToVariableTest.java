/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller.state.variable;

import gruppo10se.CartesianComplex;
import gruppo10se.StackDataStructure;
import gruppo10se.Variables;
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
public class StackToVariableTest {
    
    public StackToVariableTest() {
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
     * Test of doVariableOperation method, of class StackToVariable.
     */
    @Test
    public void testDoVariableOperation() {
        System.out.println("doVariableOperation");
        StackDataStructure<CartesianComplex> complexStack = null;
        Variables variableMap = null;
        char variable = ' ';
        StackToVariable instance = new StackToVariable();
        int expResult = 0;
        int result = instance.doVariableOperation(complexStack, variableMap, variable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class StackToVariable.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        char variable = ' ';
        StackToVariable instance = new StackToVariable();
        String expResult = "";
        String result = instance.getMessage(variable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
