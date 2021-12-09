/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package controller.state.memory;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author mazzy
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({controller.state.memory.DupTest.class, controller.state.memory.ClearTest.class, controller.state.memory.MemoryOperationStateTest.class, controller.state.memory.MemoryOperationContextTest.class, controller.state.memory.OverTest.class, controller.state.memory.SwapTest.class, controller.state.memory.DropTest.class})
public class MemorySuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
