/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.state.basic;

import gruppo10se.StackDataStructure;

/**
 *
 * @author user
 */
public class BasicOperationContext implements BasicOperationState{
    
    private BasicOperationState basicOperation;
    
    /**
     * Set the current state.
     * Normally only called by classes implementing the State interface.
     * @param bos the new state of this context
     */
    public void setBasicOperationState(BasicOperationState bos) {
        this.basicOperation = bos;
    }
    
    public void changeState(String s) {
        switch (s) {
            case "+":
                setBasicOperationState(new Addition());
                break;
            case "-":
                setBasicOperationState(new Subtraction());
                break;
            case "*":
                setBasicOperationState(new Multiplication());
                break;
            case "/":
                setBasicOperationState(new Division());
                break;
            case "+-":
                setBasicOperationState(new InvertSign());
                break;
            case "sqrt":
                setBasicOperationState(new SquareRoot());
                break;
        }
    }
    
    @Override
    public int doBasicOperation(StackDataStructure stack) {
        return basicOperation.doBasicOperation(stack);
    }

    @Override
    public String getMessage() {
        return basicOperation.getMessage();
    }
    
}
