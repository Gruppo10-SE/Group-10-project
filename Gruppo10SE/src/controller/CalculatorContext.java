/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import gruppo10se.StackDataStructure;

/**
 *
 * @author user
 */
public class CalculatorContext implements OperationState{
    
    private OperationState operation;
    
    /**
     * Set the current state.
     * Normally only called by classes implementing the State interface.
     * @param os the new state of this context
     */
    public void setOperationState(OperationState os) {
        this.operation = os;
    }
    
    public void changeState(String s) {
        switch (s) {
            case "+":
                setOperationState(new Addition());
                break;
            case "-":
                setOperationState(new Subtraction());
                break;
            case "*":
                setOperationState(new Multiplication());
                break;
            case "/":
                setOperationState(new Division());
                break;
            case "+-":
                setOperationState(new InvertSign());
                break;
            case "sqrt":
                setOperationState(new SquareRoot());
            default:
                break;
        }
    }
    
    @Override
    public int doOperation(StackDataStructure s) {
        return operation.doOperation(s);
    }

    @Override
    public String getMessage() {
        return operation.getMessage();
    }
    
}
