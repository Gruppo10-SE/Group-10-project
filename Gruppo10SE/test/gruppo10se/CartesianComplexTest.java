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
public class CartesianComplexTest {
    
    public CartesianComplexTest() {
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
     * Test of setRealPart method, of class CartesianComplex.
     */
    @Test
    public void testSetRealPart() {
        System.out.println("setRealPart");
        double r = 5.0;
        CartesianComplex instance = new CartesianComplex();
        instance.setRealPart(r);
    }

    /**
     * Test of setImagPart method, of class CartesianComplex.
     */
    @Test
    public void testSetImagPart() {
        System.out.println("setImagPart");
        double i = 5.0;
        CartesianComplex instance = new CartesianComplex();
        instance.setImagPart(i);
    }

    /**
     * Test of getRealPart method, of class CartesianComplex.
     */
    @Test
    public void testGetRealPart() {
        System.out.println("getRealPart");
        CartesianComplex instance = new CartesianComplex(5,5);
        double expResult = 5.0;
        double result = instance.getRealPart();
        assertEquals(expResult, result, 0.0);
     
    }

    /**
     * Test of getImagPart method, of class CartesianComplex.
     */
    @Test
    public void testGetImagPart() {
        System.out.println("getImagPart");
        CartesianComplex instance = new CartesianComplex(5,5);
        double expResult = 5.0;
        double result = instance.getImagPart();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of toString method, of class CartesianComplex.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CartesianComplex instance = new CartesianComplex(5,5);
        String expResult = "5.0+5.0j";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of abs method, of class CartesianComplex.
     */
    @Test
    public void testAbs() {
        System.out.println("abs");
        CartesianComplex instance = new CartesianComplex(5,5);
        double expResult = (5*(Math.sqrt(2)));
        double result = instance.abs();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of phase method, of class CartesianComplex.
     */
    @Test
    public void testPhase() {
        System.out.println("phase");
        CartesianComplex instance = new CartesianComplex(5,5);
        double expResult = (Math.PI)/4;
        double result = instance.phase();
        assertEquals(expResult, result, 0.0);       
    }

    /**
     * Test of conjugate method, of class CartesianComplex.
     */
    @Test
    public void testConjugate() {
        System.out.println("conjugate");
        CartesianComplex instance = new CartesianComplex(5,5);
        CartesianComplex expResult = new CartesianComplex(5,-5);
        CartesianComplex result = instance.conjugate();
        assertEquals(expResult, result);
    }

    /**
     * Test of reciprocal method, of class CartesianComplex.
     */
    @Test
    public void testReciprocal() {
        System.out.println("reciprocal");
        CartesianComplex instance = new CartesianComplex(5,5);
        CartesianComplex expResult = new CartesianComplex(0.1,-0.1);
        CartesianComplex result = instance.reciprocal();
        assertEquals(expResult, result);
    }

    /**
     * Test of sum method, of class CartesianComplex.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        CartesianComplex b = new CartesianComplex (5,5);
        CartesianComplex instance = new CartesianComplex(10,-24);     
        CartesianComplex expResult = new CartesianComplex(15,-19);
        CartesianComplex result = instance.sum(b);
        assertEquals("FAILED", expResult, result);
        System.out.println(expResult);
        System.out.println(result);
    }

    /**
     * Test of subtract method, of class CartesianComplex.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        CartesianComplex b = new CartesianComplex (5,5);
        CartesianComplex instance = new CartesianComplex(10,-24);     
        CartesianComplex expResult = new CartesianComplex(5,-29);
        CartesianComplex result = instance.subtract(b);
        assertEquals("FAILED", expResult, result);
    }

    /**
     * Test of multiply method, of class CartesianComplex.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        CartesianComplex b = new CartesianComplex (5,5);
        CartesianComplex instance = new CartesianComplex(10,-24);     
        CartesianComplex expResult = new CartesianComplex(170,-70);
        CartesianComplex result = instance.multiply(b);
        assertEquals("FAILED", expResult, result);
    }

    /**
     * Test of divides method, of class CartesianComplex.
     */
    @Test
    public void testDivides() {
        System.out.println("divides");
        CartesianComplex b = new CartesianComplex (5,5);
        CartesianComplex instance = new CartesianComplex(10,-24);     
        CartesianComplex expResult = new CartesianComplex(-1.4,-3.4);
        CartesianComplex result = instance.divides(b);
        
        double expRe = expResult.getRealPart();
        double expIm = expResult.getImagPart();
        double actRe = result.getRealPart();
        double actIm = result.getImagPart();
        
        assertEquals(expRe, actRe, 0.01);
        assertEquals(expIm, actIm, 0.01);
           
    }

    /**
     * Test of invertSign method, of class CartesianComplex.
     */
    @Test
    public void testInvertSign() {
        System.out.println("invertSign");
        CartesianComplex instance = new CartesianComplex (10,-24); 
        CartesianComplex expResult = new CartesianComplex(-10,+24);
        CartesianComplex result = instance.invertSign();
        assertEquals("FAILED", expResult, result);
    }
    
}
