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
public class VariablesTest {
    
    public VariablesTest() {
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
     * Test of isEmpty method, of class Variables.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Variables instance = new Variables();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of size method, of class Variables.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Variables instance = new Variables();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getValue method, of class Variables.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        char key = 'a';
        Variables instance = new Variables();
        CartesianComplex expResult = new CartesianComplex(0,0) ;
        CartesianComplex result = instance.getValue(key);
        assertEquals(expResult, result);
        System.out.println(result);
    }

    /**
     * Test of putValue method, of class Variables.
     */
    @Test
    public void testPutValue() {
        System.out.println("putValue");
        char variable = ' ';
        CartesianComplex cartCompl = null;
        Variables instance = new Variables();
        CartesianComplex expResult = null;
        CartesianComplex result = instance.putValue(variable, cartCompl);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeValue method, of class Variables.
     */
    @Test
    public void testRemoveValue() {
        System.out.println("removeValue");
        char variable = ' ';
        Variables instance = new Variables();
        Integer expResult = null;
        Integer result = instance.removeValue(variable);
        assertEquals(expResult, result);
    }

    /**
     * Test of searchValue method, of class Variables.
     */
    @Test
    public void testSearchValue() {
        System.out.println("searchValue");
        CartesianComplex cartCompl = null;
        Variables instance = new Variables();
        boolean expResult = false;
        boolean result = instance.searchValue(cartCompl);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Variables.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Variables instance = new Variables();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println(result);
    }
    
}
