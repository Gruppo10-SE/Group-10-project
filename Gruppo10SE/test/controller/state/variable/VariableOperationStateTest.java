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
 * @author gerar
 */
public class VariableOperationStateTest {
    
    public VariableOperationStateTest() {
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
     * Test of doVariableOperation method, of class VariableOperationState.
     */
    @Test
    public void testDoVariableOperation() {
        System.out.println("doVariableOperation");
        StackDataStructure<CartesianComplex> complexStack = null;
        Variables variableMap = null;
        char variable = ' ';
        VariableOperationState instance = new VariableOperationStateImpl();
        int expResult = 0;
        int result = instance.doVariableOperation(complexStack, variableMap, variable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class VariableOperationState.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        char variable = ' ';
        VariableOperationState instance = new VariableOperationStateImpl();
        String expResult = "";
        String result = instance.getMessage(variable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class VariableOperationStateImpl implements VariableOperationState {

        public int doVariableOperation(StackDataStructure<CartesianComplex> complexStack, Variables variableMap, char variable) {
            return 0;
        }

        public String getMessage(char variable) {
            return "";
        }
    }
    
}
