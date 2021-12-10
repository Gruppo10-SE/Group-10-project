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
public interface VariableOperationState {
    public int doVariableOperation(StackDataStructure<CartesianComplex> complexStack,
            Variables variableMap, char variable);
    public String getMessage();
}