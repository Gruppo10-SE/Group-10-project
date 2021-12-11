/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package controller.state.variable;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author gerar
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({controller.state.variable.VariableToStackTest.class, controller.state.variable.MinusVariableTest.class, controller.state.variable.StackToVariableTest.class, controller.state.variable.VariableOperationStateTest.class, controller.state.variable.PlusVariableTest.class, controller.state.variable.VariableOperationContextTest.class})
public class VariableSuite {

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
