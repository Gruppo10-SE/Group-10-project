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
public class MinusVariableTest {
    
    public MinusVariableTest() {
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
     * Test of doVariableOperation method, of class MinusVariable.
     */
    @Test
    public void testDoVariableOperation() {
        System.out.println("doVariableOperation - e");
        StackDataStructure<CartesianComplex> complexStack = new StackDataStructure<CartesianComplex>();
        Variables variableMap = new Variables();
        char variable = 'a';
        MinusVariable instance = new MinusVariable();
        int expResult = 1;
        int result = instance.doVariableOperation(complexStack, variableMap, variable);
        assertEquals(expResult, result);
        System.out.println("doVariableOperation - ne");
        complexStack.push(new CartesianComplex(0,0));
        complexStack.push(new CartesianComplex(0,0));
        int expResult1 = 0;
        int result1 = instance.doVariableOperation(complexStack, variableMap, variable);
        assertEquals(expResult1, result1);
    }

    /**
     * Test of getMessage method, of class MinusVariable.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        char variable = ' ';
        MinusVariable instance = new MinusVariable();
        String expResult = "Last element inserted in memory subtracted from variable ' '";
        String result = instance.getMessage(variable);
        assertEquals(expResult, result);
    }
    
}
