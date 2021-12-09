/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.state.basic;

import gruppo10se.CartesianComplex;
import gruppo10se.StackDataStructure;

/**
 *
 * @author user
 */
public class SquareRoot implements BasicOperationState{

    @Override
    public int doBasicOperation(StackDataStructure<CartesianComplex> complexStack) {
        if (complexStack.size() >= 1) {
            CartesianComplex a;
            a = complexStack.pop();
            complexStack.push(a.squareRoot());
            return 0;
        } else
            return 1;
    }

    @Override
    public String getMessage() {
        return "Square root executed";
    }
    
}
