/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.state.variable;

import model.CartesianComplex;
import model.StackDataStructure;
import model.Variables;

/**
 *
 * @author user
 */

/**
 * Creation of the VariableOperationContext class that implements the
 * BasicOperationState interface. Defines the context class and maintains a
 * reference to a ConcreteState. Implementation of the behavioural pattern State.
 *
 */
public class VariableOperationContext implements VariableOperationState{
    private VariableOperationState variableOperation;
    
    /**
     * Set the current state.
     * Normally only called by classes implementing the State interface.
     * @param vos the new state of this context
     */
    public void setVariableOperationState(VariableOperationState vos) {
        this.variableOperation = vos;
    }
    
    /**
     * Changes the current state of memory context.
     *
     * @param s represents the string used to set the change of state
     */
    public void changeState(String s) {
        switch (s) {
            case ">x":
                setVariableOperationState(new StackToVariable());
                break;
            case "<x":
                setVariableOperationState(new VariableToStack());
                break;
            case "+x":
                setVariableOperationState(new PlusVariable());
                break;
            case "-x":
                setVariableOperationState(new MinusVariable());
                break;
        }
    }

    /**
     * This method overrides the doBasicOperation() method of
     * BasicOperationState interface.
     *
     * @param complexStack represents a List-type data structure of CartesianComplex objects
     * @param variableMap represents a Map-type data structure of Variable objects
     * @param variable represents the variable used to perform the operation
     * @return an integer specifing if the operation succeded or not.
     */
    @Override
    public int doVariableOperation(StackDataStructure<CartesianComplex> complexStack,
            Variables variableMap, char variable) {
        return variableOperation.doVariableOperation(complexStack, variableMap,
                variable);
    }

   /**
     * Displays a specified message for each state.
     *
     * @param variable represents the variable that needs to be displayed
     * @return a string representing the message to display for each state after
     * performing an operation.
     */
    @Override
    public String getMessage(char variable) {
        return variableOperation.getMessage(variable);
    }
    
}
