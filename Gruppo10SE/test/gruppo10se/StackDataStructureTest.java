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
        StackDataStructure instance = new StackDataStructure();
        assertEquals(true, instance.isEmpty());
        System.out.println("test isEmpty with not empty stack");
        instance.push(new CartesianComplex(0,0));
        assertEquals(false, instance.isEmpty());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class StackDataStructure.
     */
    @Test
    public void testSize() {
        System.out.println("test size with empty stack");
        StackDataStructure instance = new StackDataStructure();
        assertEquals(0, instance.size());
        System.out.println("test size with not empty stack");
        instance.push(new CartesianComplex(0,0));
        assertEquals(1, instance.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of top method, of class StackDataStructure.
     */
    @Test
    public void testTop() {
        System.out.println("test top with empty stack");
        StackDataStructure instance = new StackDataStructure();
        assertEquals(null, instance.top());
        System.out.println("test top with not empty stack");
        CartesianComplex element = new CartesianComplex(1,1);
        instance.push(element);
        assertEquals(element, instance.top());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackDataStructure.
     */
    @Test
    public void testPop() {
        System.out.println("test pop with empty stack");
        StackDataStructure instance = new StackDataStructure();
        assertEquals(null, instance.pop());
        System.out.println("test pop with not empty stack");
        CartesianComplex element = new CartesianComplex(1,1);
        instance.push(element);
        assertEquals(element, instance.pop());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class StackDataStructure.
     */
    @Test
    public void testPush() {
        System.out.println("test push");
        StackDataStructure instance = new StackDataStructure();
        CartesianComplex element = new CartesianComplex(1,1);
        instance.push(element);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class StackDataStructure.
     */
    @Test
    public void testSearch() {
        System.out.println("test search with empty stack");
        StackDataStructure instance = new StackDataStructure();
        CartesianComplex inStack = new CartesianComplex(1,1);
        assertEquals(null, instance.search(inStack));
        System.out.println("test search with not empty stack and element in the stack");
        instance.push(inStack);
        assertEquals(0, (int)instance.search(inStack));
        System.out.println("test search with not empty stack and element not in the stack");
        CartesianComplex notInStack = new CartesianComplex(2,2);
        assertEquals(-1, (int)instance.search(notInStack) );
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class StackDataStructure.
     */
    @Test
    public void testToString() {
        System.out.println("test toString with empty stack");
        StackDataStructure instance = new StackDataStructure();
        assertEquals("", instance.toString());
        System.out.println("test toString with not empty stack");
        CartesianComplex element = new CartesianComplex(1,1);
        instance.push(element);
        assertEquals(element+"\n", instance.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
