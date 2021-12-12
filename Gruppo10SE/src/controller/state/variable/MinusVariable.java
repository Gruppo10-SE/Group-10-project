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
 * Creation of the MinusVariable class that implements the BasicOperationState interface.
 * Implements the behavior associated with a particular state.
 * Implementation of the behavioural pattern State.
 */
public class MinusVariable implements VariableOperationState{

    /**
     * This method overrides the doBasicOperation() method of BasicOperationState interface    
     * 
     * @param complexStack represents a List-type data structure of CartesianComplex objects
     * @param variableMap represents a Map-type data structure of Variable objects
     * @param variable represents a char variable from which the top value of the stack needs to be subtracted
     * @return  0 if the operation succeded or
     *          1 if this stack is empty
     */
    @Override
    public int doVariableOperation(StackDataStructure<CartesianComplex> complexStack,
            Variables variableMap, char variable) {
        if(!complexStack.isEmpty()){
           variableMap.putValue(variable, 
                   variableMap.getValue(variable).subtract(complexStack.top()));
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
        return "Last element inserted in memory subtracted from variable '" + variable + "'";
    }
    
}
