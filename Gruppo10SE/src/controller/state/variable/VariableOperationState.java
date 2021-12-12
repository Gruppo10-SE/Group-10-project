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
 * Creation of the VariableOperationState interface representing a state
 * variable operation with all its methods Defines the interface, implemented by
 * the ConcreteState,which encapsulates the logic of the behavior associated
 * with a given state. Implementation of th behavioural pattern State.
 */
public interface VariableOperationState {

    /**
     * Invokes methods from StackDataStructure class, Variable Class and CartesianComplex class
     * to perform basic operations on data.
     *
     * @param complexStack represents a List-type data structure of CartesianComplex objects
     * @param variableMap represents a Map-type data structure of Variable objects
     * @param variable represents the variable used to perform the operation
     * @return an integer specifing if the operation succeded or not.
     */
    public int doVariableOperation(StackDataStructure<CartesianComplex> complexStack,
            Variables variableMap, char variable);

    /**
     * Displays a specified message for each state.
     *
     * @param variable represents the variable that needs to be displayed
     * @return a string representing the message to display for each state after
     * performing an operation.
     */
    public String getMessage(char variable);
}
