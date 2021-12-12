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
/**
 * Creation of the InvertSign class that implements the BasicOperationState interface.
 * Implements the behavior associated with a particular state.
 * Implementation of th behavioural pattern State.
 */
public class InvertSign implements BasicOperationState{

    /**
     * This method overrides the doBasicOperation() method of BasicOperationState interface    
     * 
     * @param complexStack represents a generic implementation of a stack
     * @return 0 if the value has been successfully calculated or
     *         1 if this stack has less than one operand
     */
    @Override
    public int doBasicOperation(StackDataStructure<CartesianComplex> complexStack) {
        if (complexStack.size() >= 1) {
            CartesianComplex a;
            a = complexStack.pop();
            complexStack.push(a.invertSign());
            return 0;
        } else
            return 1;
    }

/**  
 * This method overrides the getMessage() method of BasicOperationState interface       
 * 
 * @return a string representing the message to display
 */
    @Override
    public String getMessage() {
        return "Invert Sign executed";
    }
    
}
