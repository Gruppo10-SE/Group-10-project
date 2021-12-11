/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.state.basic;

import model.CartesianComplex;
import model.StackDataStructure;

/**
 *
 * @author user
 */
public class Subtraction implements BasicOperationState{

    @Override
    public int doBasicOperation(StackDataStructure<CartesianComplex> complexStack) {
        if (complexStack.size() >= 2) {
            CartesianComplex firstOperand, secondOperand;
            firstOperand = complexStack.pop();
            secondOperand = complexStack.pop();
            complexStack.push(secondOperand.subtract(firstOperand));
            return 0;
        } else
            return 1;
    }

    @Override
    public String getMessage() {
        return "Subtraction executed";
    }
    
}
