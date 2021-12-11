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
public class MinusVariable implements VariableOperationState{

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

    @Override
    public String getMessage(char variable) {
        return "Last element inserted in memory subtracted from variable '" + variable + "'";
    }
    
}
