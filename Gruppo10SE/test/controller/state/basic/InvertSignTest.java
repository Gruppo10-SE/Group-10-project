/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller.state.basic;

import model.CartesianComplex;
import model.StackDataStructure;
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
public class InvertSignTest {
    
    public InvertSignTest() {
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
     * Test of doBasicOperation method, of class InvertSign.
     */
    @Test
    public void testDoBasicOperation() {
        System.out.println("doBasicOperation");
        StackDataStructure<CartesianComplex> complexStack = new StackDataStructure<>();
        InvertSign instance = new InvertSign();
        int expResult = 1;
        int result = instance.doBasicOperation(complexStack);
        assertEquals(expResult, result);
        System.out.println("doBasicOperation");
        complexStack.push(new CartesianComplex(0,0));
        complexStack.push(new CartesianComplex(1,1));
        int expResult1 = 0;
        int result1 = instance.doBasicOperation(complexStack);
        assertEquals(expResult1, result1);
    }

    /**
     * Test of getMessage method, of class InvertSign.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        InvertSign instance = new InvertSign();
        String expResult = "Invert Sign executed";
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }
    
}
