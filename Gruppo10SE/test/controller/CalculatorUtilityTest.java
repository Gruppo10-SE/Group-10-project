/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller;

import model.Variables;
import model.StackDataStructure;
import model.CartesianComplex;
import javax.swing.JList;
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
public class CalculatorUtilityTest {
    
    public CalculatorUtilityTest() {
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
     * Test of insertNumber method, of class CalculatorUtility.
     */
    @Test
    public void testInsertNumber() {
        System.out.println("insertNumber");
        StackDataStructure stack =  new StackDataStructure();
        String s = "1+1j";
        CalculatorUtility instance = new CalculatorUtility();
        instance.insertNumber(stack, s);
    }

    /**
     * Test of checkIfEmpty method, of class CalculatorUtility.
     */
    @Test
    public void testCheckIfEmpty() {
        System.out.println("checkIfEmpty");
        StackDataStructure stack =  new StackDataStructure();
        CalculatorUtility instance = new CalculatorUtility();
        boolean expResult = true;
        boolean result = instance.checkIfEmpty(stack);
        assertEquals(expResult, result);
    }

    /**
     * Test of showVariables method, of class CalculatorUtility.
     */
    @Test
    public void testShowVariables() {
        System.out.println("showVariables");
        Variables variables = new Variables();
        JList varList = new JList();
        CalculatorUtility instance = new CalculatorUtility();
        instance.showVariables(variables, varList);
    }
    
}
