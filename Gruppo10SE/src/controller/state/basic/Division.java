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
public class Division implements BasicOperationState{
    
    @Override
    public int doBasicOperation(StackDataStructure<CartesianComplex> complexStack) {
        if (complexStack.size() >= 2) {

            CartesianComplex a, b;
            a = complexStack.pop();
            b = complexStack.pop();

            if (a.getRealPart() == 0 && a.getImagPart() == 0) {
                complexStack.push(b);
                complexStack.push(a);
                return -1;
            } 
            else {
                complexStack.push(b.divides(a));
                return 0;
            }
            
        } else {
            return 1;
        }
    }

    @Override
    public String getMessage() {
        return "Division executed";
    }
    
}
