/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author user
 */
public class StackDataStructureTest {
    StackDataStructure instance;
    
    public StackDataStructureTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         instance = new StackDataStructure();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isEmpty method, of class StackDataStructure.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("test isEmpty with empty stack");
        assertEquals(true, instance.isEmpty());
        System.out.println("test isEmpty with not empty stack");
        instance.push(new CartesianComplex(0,0));
        assertEquals(false, instance.isEmpty());
    }

    /**
     * Test of size method, of class StackDataStructure.
     */
    @Test
    public void testSize() {
        System.out.println("test size with empty stack");
        assertEquals(0, instance.size());
        System.out.println("test size with not empty stack");
        instance.push(new CartesianComplex(0,0));
        assertEquals(1, instance.size());
    }

    /**
     * Test of top method, of class StackDataStructure.
     */
    @Test
    public void testTop() {
        System.out.println("test top with empty stack");
        assertEquals(null, instance.top());
        System.out.println("test top with not empty stack");
        CartesianComplex element = new CartesianComplex(1,1);
        instance.push(element);
        assertEquals(element, instance.top());
    }

    /**
     * Test of pop method, of class StackDataStructure.
     */
    @Test
    public void testPop() {
        System.out.println("test pop with empty stack");
        assertEquals(null, instance.pop());
        System.out.println("test pop with not empty stack");
        CartesianComplex element = new CartesianComplex(1,1);
        instance.push(element);
        assertEquals(element, instance.pop());
    }

    /**
     * Test of push method, of class StackDataStructure.
     */
    @Test
    public void testPush() {
        System.out.println("test push");
        CartesianComplex element = new CartesianComplex(1,1);
        instance.push(element);
    }

    /**
     * Test of search method, of class StackDataStructure.
     */
    @Test
    public void testSearch() {
        System.out.println("test search with empty stack");
        CartesianComplex inStack = new CartesianComplex(1,1);
        assertEquals(null, instance.search(inStack));
        System.out.println("test search with not empty stack and element in the stack");
        instance.push(inStack);
        assertEquals(0, (int)instance.search(inStack));
        System.out.println("test search with not empty stack and element not in the stack");
        CartesianComplex notInStack = new CartesianComplex(2,2);
        assertEquals(-1, (int)instance.search(notInStack) );
    }

    /**
     * Test of toString method, of class StackDataStructure.
     */
    @Test
    public void testToString() {
        System.out.println("test toString with empty stack");
        assertEquals("", instance.toString());
        System.out.println("test toString with not empty stack");
        CartesianComplex element = new CartesianComplex(1,1);
        instance.push(element);
        assertEquals(element+"\n", instance.toString());
    }

    /**
     * Test of clear method, of class StackDataStructure.
     */
    @Test
    public void testClear() {
        System.out.println("test initial clear");
        instance.clear();
        assertEquals(true, instance.isEmpty());
        System.out.println("test clear with element");
        CartesianComplex element = new CartesianComplex(1,1);
        instance.push(element);
        instance.clear();
        assertEquals(true, instance.isEmpty());
    }

    /**
     * Test of drop method, of class StackDataStructure.
     */
    @Test
    public void testDrop() {
        System.out.println("test drop with element");
        CartesianComplex element = new CartesianComplex(1,1);
        instance.push(element);
        instance.drop();
        assertEquals(true, instance.isEmpty());
    }

    /**
     * Test of swap method, of class StackDataStructure.
     */
    @Test
    public void testSwap() {
        System.out.println("swap");
        instance.swap();
    }

    /**
     * Test of over method, of class StackDataStructure.
     */
    @Test
    public void testOver() {
        System.out.println("over");
        instance.over();
    }

    /**
     * Test of dup method, of class StackDataStructure.
     */
    @Test
    public void testDup() {
        System.out.println("dup");
        instance.dup();
    }
    
}
