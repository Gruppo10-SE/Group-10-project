/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller.state.variable;

import model.CartesianComplex;
import model.StackDataStructure;
import model.Variables;
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
public class VariableToStackTest {
    
    public VariableToStackTest() {
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
     * Test of doVariableOperation method, of class VariableToStack.
     */
    @Test
    public void testDoVariableOperation() {
        System.out.println("doVariableOperation");
        StackDataStructure<CartesianComplex> complexStack = new StackDataStructure<>();
        Variables variableMap = new Variables();
        char variable = 'a';
        VariableToStack instance = new VariableToStack();
        int expResult = 0;
        int result = instance.doVariableOperation(complexStack, variableMap, variable);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMessage method, of class VariableToStack.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        char variable = 'a';
        VariableToStack instance = new VariableToStack();
        String expResult = "Value of '" + variable + "' inserted in memory";
        String result = instance.getMessage(variable);
        assertEquals(expResult, result);
    }
    
}
