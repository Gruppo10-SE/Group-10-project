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

    @Override
    public int doVariableOperation(StackDataStructure<CartesianComplex> complexStack,
            Variables variableMap, char variable) {
        return variableOperation.doVariableOperation(complexStack, variableMap,
                variable);
    }

    @Override
    public String getMessage() {
        return variableOperation.getMessage();
    }
    
}
