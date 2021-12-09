/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.state.variable;

import gruppo10se.CartesianComplex;
import gruppo10se.StackDataStructure;
import gruppo10se.Variables;

/**
 *
 * @author user
 */
public class StackToVariable implements VariableOperationState{

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

    @Override
    public String getMessage() {
        return "The variable has been changed";
    }
    
}
