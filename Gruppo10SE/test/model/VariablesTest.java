/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import model.CartesianComplex;
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
        int expResult = 26;
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
        CartesianComplex expResult = new CartesianComplex(0, 0);
        CartesianComplex result = instance.getValue(key);
        assertEquals(expResult, result);
    }

    /**
     * Test of putValue method, of class Variables.
     */
    @Test
    public void testPutValue() {
        System.out.println("putValue");
        char variable = ' ';
        CartesianComplex cartCompl = new CartesianComplex(5,5);
        Variables instance = new Variables();
        instance.putValue(variable, cartCompl);
        CartesianComplex expResult = cartCompl;
        CartesianComplex result = instance.putValue(variable, cartCompl);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeValue method, of class Variables.
     */
    @Test
    public void testRemoveValue() {
        System.out.println("removeValue");
        char variable = 'a';
        Variables instance = new Variables();
        Integer expResult = 1;
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
        String expResult = "a  =  0.0\n"
                + "b  =  0.0\n"
                + "c  =  0.0\n"
                + "d  =  0.0\n"
                + "e  =  0.0\n"
                + "f  =  0.0\n"
                + "g  =  0.0\n"
                + "h  =  0.0\n"
                + "i  =  0.0\n"
                + "j  =  0.0\n"
                + "k  =  0.0\n"
                + "l  =  0.0\n"
                + "m  =  0.0\n"
                + "n  =  0.0\n"
                + "o  =  0.0\n"
                + "p  =  0.0\n"
                + "q  =  0.0\n"
                + "r  =  0.0\n"
                + "s  =  0.0\n"
                + "t  =  0.0\n"
                + "u  =  0.0\n"
                + "v  =  0.0\n"
                + "w  =  0.0\n"
                + "x  =  0.0\n"
                + "y  =  0.0\n"
                + "z  =  0.0\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
