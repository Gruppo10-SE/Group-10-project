/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package gruppo10se;

import model.CartesianComplex;
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
        System.out.println("phase re<0 e im>=0");
        CartesianComplex instance = new CartesianComplex(-1,1);
        double expResult = 3*(Math.PI)/4;
        double result = instance.phase();
        assertEquals(expResult, result, 0.0);   
        System.out.println("phase re<0 e im<0");
        CartesianComplex instance3 = new CartesianComplex(-1,-1);
        double expResult3 = (-3*(Math.PI))/4;
        double result3 = instance3.phase();
        assertEquals(expResult3, result3, 0.0);  
        System.out.println("phase re>0");
        CartesianComplex instance1 = new CartesianComplex(1,1);
        double expResult1 = (Math.PI)/4;
        double result1 = instance1.phase();
        assertEquals(expResult1, result1, 0.0);
        System.out.println("phase re=0 e im=0");
        CartesianComplex instance2 = new CartesianComplex(0,0);
        double expResult2 = Double.NaN;
        double result2 = instance2.phase();
        assertEquals(expResult2, result2, 0.0);
        System.out.println("phase re=0 e im>0");
        CartesianComplex instance4 = new CartesianComplex(0,1);
        double expResult4 = (Math.PI)/2;
        double result4 = instance4.phase();
        assertEquals(expResult4, result4, 0.0);
        System.out.println("phase re=0 e im<0");
        CartesianComplex instance5 = new CartesianComplex(0,-1);
        double expResult5 = -(Math.PI)/2;
        double result5 = instance5.phase();
        assertEquals(expResult5, result5, 0.0);
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

    /**
     * Test of squareRoot method, of class CartesianComplex.
     */
    @Test
    public void testSquareRoot() {
        System.out.println("squareRoot, 0+0j");
        CartesianComplex instance = new CartesianComplex(0,0);
        CartesianComplex expResult = new CartesianComplex(0,0);
        CartesianComplex result = instance.squareRoot();
        assertEquals(expResult, result);
        System.out.println("squareRoot, 3+4j");
        CartesianComplex instance1 = new CartesianComplex(3,4);
        CartesianComplex expResult1 = new CartesianComplex(2,1);
        CartesianComplex result1 = instance1.squareRoot();
        assertEquals(expResult1, result1);
        System.out.println("squareRoot, -3+4j");
        CartesianComplex instance2 = new CartesianComplex(-3,4);
        CartesianComplex expResult2 = new CartesianComplex(1,2);
        CartesianComplex result2 = instance2.squareRoot();
        assertEquals(expResult2, result2);
        System.out.println("squareRoot, -3-4j");
        CartesianComplex instance3 = new CartesianComplex(-3,-4);
        CartesianComplex expResult3 = new CartesianComplex(1,-2);
        CartesianComplex result3 = instance3.squareRoot();
        assertEquals(expResult3, result3);
         System.out.println("squareRoot, 3-4j");
        CartesianComplex instance4 = new CartesianComplex(3,-4);
        CartesianComplex expResult4= new CartesianComplex(2,-1);
        CartesianComplex result4 = instance4.squareRoot();
        assertEquals(expResult4, result4);
        System.out.println("squareRoot, 3+0j");
        CartesianComplex instance5 = new CartesianComplex(3,0);
        CartesianComplex expResult5 = new CartesianComplex(Math.sqrt(3),0);
        CartesianComplex result5 = instance5.squareRoot();
        assertEquals(expResult5, result5);
        System.out.println("squareRoot, -3+0j");
        CartesianComplex instance6 = new CartesianComplex(-3,0);
        CartesianComplex expResult6 = new CartesianComplex(0,Math.sqrt(3));
        CartesianComplex result6 = instance6.squareRoot();
        assertEquals(expResult6, result6);
        System.out.println("squareRoot, 0+3j");
        CartesianComplex instance7 = new CartesianComplex(0,3);
        CartesianComplex expResult7 = new CartesianComplex(0,1.2247);
        CartesianComplex result7 = instance7.squareRoot();
        assertEquals(expResult7.getImagPart(), result7.getImagPart(), 0.0001);
        System.out.println("squareRoot, 0-3j");
        CartesianComplex instance8 = new CartesianComplex(0,-3);
        CartesianComplex expResult8 = new CartesianComplex(0,-1.2247);
        CartesianComplex result8 = instance8.squareRoot();
        assertEquals(expResult8.getImagPart(), result8.getImagPart(), 0.0001);
    }

    /**
     * Test of equals method, of class CartesianComplex.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        CartesianComplex instance = new CartesianComplex();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
      
    }
    
}
