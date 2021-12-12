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
public class VariableToStack implements VariableOperationState{

    /**
     * This method overrides the doBasicOperation() method of BasicOperationState interface    
     * 
     * @param complexStack represents a List-type data structure of CartesianComplex objects
     * @param variableMap represents a Map-type data structure of Variable objects
     * @param variable represents a char variable to push into the stack
     * @return  0 if the operation succeded or
     *          1 if this stack is empty
     */
    @Override
    public int doVariableOperation(StackDataStructure<CartesianComplex> complexStack,
            Variables variableMap, char variable) {
        complexStack.push(variableMap.getValue(variable));
        return 0;
    }

    /**
     * This method overrides the getMessage() method of BasicOperationState interface    
     * 
     * @param variable represents the variable to display in the message
     * @return a string representing the message to display
     */
    @Override
    public String getMessage(char variable) {
        return "Value of '" + variable + "' inserted in memory";
    }
    
}
