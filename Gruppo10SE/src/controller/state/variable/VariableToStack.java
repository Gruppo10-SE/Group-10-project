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

    @Override
    public int doVariableOperation(StackDataStructure<CartesianComplex> complexStack,
            Variables variableMap, char variable) {
        complexStack.push(variableMap.getValue(variable));
        return 0;
    }

    @Override
    public String getMessage(char variable) {
        return "Value of '" + variable + "' inserted in memory";
    }
    
}
