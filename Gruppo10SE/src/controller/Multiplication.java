/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import gruppo10se.CartesianComplex;
import gruppo10se.StackDataStructure;

/**
 *
 * @author user
 */
public class Multiplication implements OperationState{

    @Override
    public int doOperation(StackDataStructure<CartesianComplex> complexStack) {
        if (complexStack.size() >= 2) {
            CartesianComplex firstOperand, secondOperand;
            firstOperand = complexStack.pop();
            secondOperand = complexStack.pop();
            complexStack.push(firstOperand.multiply(secondOperand));
            return 0;
        } else
            return 1;
    }

    @Override
    public String getMessage() {
        return "Multiplication executed";
    }
    
}
