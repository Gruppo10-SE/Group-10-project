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
public class UserDefinedOperationsTest {
    
    UserDefinedOperations instance;
    
    public UserDefinedOperationsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new UserDefinedOperations();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isEmpty method, of class UserDefinedOperations.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of size method, of class UserDefinedOperations.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getValue method, of class UserDefinedOperations.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue - empty");
        String expResult = null;
        String result = instance.getValue("");
        assertEquals(expResult, result);
        System.out.println("getValue - not empty");
        String name1 = "a";
        String func1 = "a";
        String expResult1 = "a";
        String result2 = instance.putValue(name1, func1);
        String result1 = instance.getValue("a");
        assertEquals(expResult1, result1);
    }

    /**
     * Test of putValue method, of class UserDefinedOperations.
     */
    @Test
    public void testPutValue() {
        System.out.println("putValue - not empty");
        UserDefinedOperations instance1 = new UserDefinedOperations();
        String name1 = "a";
        String func1 = "a";
        String expResult1 = "a";
        String result1 = instance1.putValue(name1, func1);
        assertEquals(expResult1, result1);
        System.out.println("putValue - not empty");
        String expResult2 = "a";
        String result2 = instance1.putValue(name1, func1);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of removeValue method, of class UserDefinedOperations.
     */
    @Test
    public void testRemoveValue() {
        System.out.println("removeValue");
        String name = "";
        UserDefinedOperations instance = new UserDefinedOperations();
        Integer expResult = 0;
        Integer result = instance.removeValue(name);
        assertEquals(expResult, result);
        System.out.println("removeValue");
        String name1 = "a";
        String func1 = "a";
        UserDefinedOperations instance1 = new UserDefinedOperations();
        instance1.putValue(name1, func1);
        Integer expResult1 = 1;
        Integer result1 = instance1.removeValue(name1);
        assertEquals(expResult1, result1);
    }

    /**
     * Test of searchValue method, of class UserDefinedOperations.
     */
    @Test
    public void testSearchValue() {
        System.out.println("searchValue - e");
        String func = "";
        UserDefinedOperations instance = new UserDefinedOperations();
        boolean expResult = false;
        boolean result = instance.searchValue(func);
        assertEquals(expResult, result);
        System.out.println("searchValue - ne");
        String name1 = "a";
        String func1 = "a";
        UserDefinedOperations instance1 = new UserDefinedOperations();
        instance1.putValue(name1, func1);
        boolean expResult1 = true;
        boolean result1 = instance1.searchValue(func1);
        assertEquals(expResult1, result1);
    }

    /**
     * Test of toString method, of class UserDefinedOperations.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        UserDefinedOperations instance = new UserDefinedOperations();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of getValueAtIndex method, of class UserDefinedOperations.
     */
    @Test
    public void testGetKeyIndex() {
        System.out.println("getValueAtIndex - e");
        String name1 = "a";
        String func1 = "a";
        String name2 = "aa";
        String func2 = "aa";
        UserDefinedOperations instance = new UserDefinedOperations();
        String expResult = null;
        Integer result = instance.getKeyIndex("");
        assertEquals(expResult, result);
        System.out.println("getValueAtIndex - ne");
        UserDefinedOperations instance1 = new UserDefinedOperations();
        instance1.putValue(name1, func1);
        instance1.putValue(name2, func2);
        int expResult1 = 0 ;
        Integer result1 = instance1.getKeyIndex(name1);
        assertEquals(expResult1, result1, 0.0);
    }
    
}
