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
public class PlusVariableTest {
    
    public PlusVariableTest() {
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
     * Test of doVariableOperation method, of class PlusVariable.
     */
    @Test
    public void testDoVariableOperation() {
        System.out.println("doVariableOperation");
        StackDataStructure<CartesianComplex> complexStack = new StackDataStructure<CartesianComplex>();
        Variables variableMap = new Variables();
        char variable = 'a';
        PlusVariable instance = new PlusVariable();
        int expResult = 1;
        int result = instance.doVariableOperation(complexStack, variableMap, variable);
        assertEquals(expResult, result);
        System.out.println("doVariableOperation");
        complexStack.push(new CartesianComplex(0,0));
        complexStack.push(new CartesianComplex(0,0));
        int expResult1 = 0;
        int result1 = instance.doVariableOperation(complexStack, variableMap, variable);
        assertEquals(expResult1, result1);
    }

    /**
     * Test of getMessage method, of class PlusVariable.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        char variable = ' ';
        PlusVariable instance = new PlusVariable();
        String expResult = "Last element inserted in memory added to variable ' '";
        String result = instance.getMessage(variable);
        assertEquals(expResult, result);
    }
    
}
