/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.state.basic;

import model.StackDataStructure;

/**
 *
 * @author user
 */
/**
 * Creation of the BasicOperationContext class that implements the
 * BasicOperationState interface. Defines the context class and maintains a
 * reference to a ConcreteState. Implementation of the behavioural pattern State.
 *
 */
public class BasicOperationContext implements BasicOperationState {

    private BasicOperationState basicOperation;

    /**
     * Set the current state.
     *
     * Normally only called by classes implementing the State interface.
     *
     * @param bos represents the new state of this context
     */
    public void setBasicOperationState(BasicOperationState bos) {
        this.basicOperation = bos;
    }

    /**
     * Changes the current state of memory context.
     *
     * @param s represents the string used to set the change of state
     */
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

    /**
     * This method overrides the doBasicOperation() method of
     * BasicOperationState interface.
     *
     * @param stack
     * @return the result of operations
     */
    @Override
    public int doBasicOperation(StackDataStructure stack) {
        return basicOperation.doBasicOperation(stack);
    }

    /**
     * This method overrides the getMessage() method of BasicOperationState
     * interface
     *
     * @return a string representing the message to display
     */
    @Override
    public String getMessage() {
        return basicOperation.getMessage();
    }

}
