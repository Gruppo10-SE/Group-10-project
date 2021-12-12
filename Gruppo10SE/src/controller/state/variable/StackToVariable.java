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
 * Creation of the StackToVariable class that implements the BasicOperationState interface.
 * Implements the behavior associated with a particular state.
 * Implementation of the behavioural pattern State.
 */
public class StackToVariable implements VariableOperationState{

    /**
     * This method overrides the doBasicOperation() method of BasicOperationState interface    
     * 
     * @param complexStack represents a List-type data structure of CartesianComplex objects
     * @param variableMap represents a Map-type data structure of Variable objects
     * @param variable represents a char variable in which the top value of tha stack has to be stored
     * @return  0 if the operation succeded or
     *          1 if this stack is empty
     */
    @Override
    public int doVariableOperation(StackDataStructure<CartesianComplex> complexStack,
            Variables variableMap, char variable) {
        if (complexStack.size() >= 1) {
            CartesianComplex top = complexStack.top();
            variableMap.putValue(variable, top);
            return 0;
        }
        else
            return 1;
    }

    /**
     * This method overrides the getMessage() method of BasicOperationState interface    
     * 
     * @param variable represents the variable to display in the message
     * @return a string representing the message to display
     */
    @Override
    public String getMessage(char variable) {
        return "The variable '" + variable + "' has been changed";
    }
    
}
