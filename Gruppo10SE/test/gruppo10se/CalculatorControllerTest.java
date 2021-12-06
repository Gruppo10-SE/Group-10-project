/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package gruppo10se;

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
public class CalculatorControllerTest {
    
    public CalculatorControllerTest() {
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
     * Test of doSum method, of class CalculatorController.
     */
    @Test
    public void testDoSum() {
        System.out.println("doSum");
        StackDataStructure stack =  new StackDataStructure();
        CalculatorController instance = new CalculatorController();
        int expResult = 1;
        int result = instance.doSum(stack);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of doSubtraction method, of class CalculatorController.
     */
    @Test
    public void testDoSubtraction() {
        System.out.println("doSubtraction");
        StackDataStructure stack =  new StackDataStructure();
        CalculatorController instance = new CalculatorController();
        int expResult = 1;
        int result = instance.doSubtraction(stack);
        assertEquals(expResult, result);
    }

    /**
     * Test of doMultiplication method, of class CalculatorController.
     */
    @Test
    public void testDoMultiplication() {
        System.out.println("doMultiplication");
        StackDataStructure stack =  new StackDataStructure();
        CalculatorController instance = new CalculatorController();
        int expResult = 1;
        int result = instance.doMultiplication(stack);
        assertEquals(expResult, result);
    }

    /**
     * Test of doDivision method, of class CalculatorController.
     */
    @Test
    public void testDoDivision() {
        System.out.println("doDivision");
        StackDataStructure stack =  new StackDataStructure();
        CalculatorController instance = new CalculatorController();
        int expResult = 1;
        int result = instance.doDivision(stack);
        assertEquals(expResult, result);
    }

    /**
     * Test of doInvertSign method, of class CalculatorController.
     */
    @Test
    public void testDoInvertSign() {
        System.out.println("doInvertSign");
        StackDataStructure stack =  new StackDataStructure();
        CalculatorController instance = new CalculatorController();
        int expResult = 1;
        int result = instance.doInvertSign(stack);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertNumber method, of class CalculatorController.
     */
    @Test
    public void testInsertNumber() {
        System.out.println("insertNumber");
        StackDataStructure stack =  new StackDataStructure();
        String s = "1+1j";
        CalculatorController instance = new CalculatorController();
        instance.insertNumber(stack, s);
    }

    /**
     * Test of checkIfEmpty method, of class CalculatorController.
     */
    @Test
    public void testCheckIfEmpty() {
        System.out.println("checkIfEmpty");
        StackDataStructure stack =  new StackDataStructure();
        CalculatorController instance = new CalculatorController();
        boolean expResult = true;
        boolean result = instance.checkIfEmpty(stack);
        assertEquals(expResult, result);
    }

    /**
     * Test of doSqrt method, of class CalculatorController.
     */
    @Test
    public void testDoSqrt() {
        System.out.println("doSqrt");
        StackDataStructure stack = new StackDataStructure();
        CalculatorController instance = new CalculatorController();
        int expResult = 1;
        int result = instance.doSqrt(stack);
        assertEquals(expResult, result);
    }

    /**
     * Test of doClear method, of class CalculatorController.
     */
    @Test
    public void testDoClear() {
        System.out.println("doClear");
        StackDataStructure stack =  new StackDataStructure();
        CalculatorController instance = new CalculatorController();
        int expResult = 1;
        int result = instance.doClear(stack);
        assertEquals(expResult, result);
    }

    /**
     * Test of doDrop method, of class CalculatorController.
     */
    @Test
    public void testDoDrop() {
        System.out.println("doDrop");
        StackDataStructure stack =  new StackDataStructure();
        CalculatorController instance = new CalculatorController();
        int expResult = 1;
        int result = instance.doDrop(stack);
        assertEquals(expResult, result);
    }

    /**
     * Test of doDup method, of class CalculatorController.
     */
    @Test
    public void testDoDup() {
        System.out.println("doDup");
        StackDataStructure stack = new StackDataStructure();
        CalculatorController instance = new CalculatorController();
        int expResult = 1;
        int result = instance.doDup(stack);
        assertEquals(expResult, result);
    }

    /**
     * Test of doSwap method, of class CalculatorController.
     */
    @Test
    public void testDoSwap() {
        System.out.println("doSwap");
        StackDataStructure stack =  new StackDataStructure();
        CalculatorController instance = new CalculatorController();
        int expResult = 1;
        int result = instance.doSwap(stack);
        assertEquals(expResult, result);
    }

    /**
     * Test of doOver method, of class CalculatorController.
     */
    @Test
    public void testDoOver() {
        System.out.println("doOver");
        StackDataStructure stack =  new StackDataStructure();
        CalculatorController instance = new CalculatorController();
        int expResult = 1;
        int result = instance.doOver(stack);
        assertEquals(expResult, result);
    }

    /**
     * Test of fromStackToVariable method, of class CalculatorController.
     */
    @Test
    public void testFromStackToVariable() {
        System.out.println("fromStackToVariable");
        StackDataStructure stack =  new StackDataStructure();
        Variables variables = new Variables();
        char variable = 'a';
        CalculatorController instance = new CalculatorController();
        CartesianComplex element = new CartesianComplex(1,1);
        stack.push(element);
        instance.fromStackToVariable(stack, variables, variable);
        CartesianComplex expResult = element;
        CartesianComplex result = variables.getValue(variable);
        assertEquals(expResult, result);
    }

    /**
     * Test of fromVariableToStack method, of class CalculatorController.
     */
    @Test
    public void testFromVariableToStack() {
        System.out.println("fromVariableToStack");
        StackDataStructure stack = new StackDataStructure();
        Variables variables = new Variables();
        char variable = 'b';
        CartesianComplex element = new CartesianComplex(1,2);
        variables.putValue(variable, element);
        CalculatorController instance = new CalculatorController();
        instance.fromVariableToStack(stack, variables, variable);
        assertEquals(element, stack.pop());
    }
    
}
