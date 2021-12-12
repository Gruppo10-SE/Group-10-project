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
 * Creation of the Addition class that implements the BasicOperationState interface.
 * 
 */
public class Addition implements BasicOperationState{

/**  
 * This method overrides the doBasicOperation() method of BasicOperationState interface    
 * 
 * @param complexStack represents a generic implementation of a stack 
 * @return 0 if  
 */
    @Override
    public int doBasicOperation(StackDataStructure<CartesianComplex> complexStack) {
        if (complexStack.size() >= 2) {
            CartesianComplex firstOperand, secondOperand;
            firstOperand = complexStack.pop();
            secondOperand = complexStack.pop();
            complexStack.push(firstOperand.sum(secondOperand));
            return 0;
        } else
            return 1;
    }

/**  
 * This method overrides the doBasicOperation() method of BasicOperationState interface    
 * 
 * @return 0 if  
 */
    @Override
    public String getMessage() {
        return "Sum executed";
    }
    
}
