/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.state.memory;

import model.StackDataStructure;

/**
 * Creation of the MemoryOperationContext class that implements the
 * MemoryOperationState interface. 
 * 
 * Defines the context class and maintains a reference to a ConcreteState.
 * Implementation of the behavioural pattern State.
 * 
 * @author user
 */
public class MemoryOperationContext implements MemoryOperationState{
    private MemoryOperationState memoryOperation;
    
    /**
     * Set the current state.
     * Normally only called by classes implementing the State interface.
     * @param mos the new state of this context
     */
    public void setOperationState(MemoryOperationState mos) {
        this.memoryOperation = mos;
    }
    
    /**
     * Changes the state of memory context
     * @param s represents the string which decides the state of memoryOperation
     */
    public void changeState(String s) {
        switch (s) {
            case "clear":
                setOperationState(new Clear());
                break;
            case "drop":
                setOperationState(new Drop());
                break;
            case "dup":
                setOperationState(new Dup());
                break;
            case "swap":
                setOperationState(new Swap());
                break;
            case "over":
                setOperationState(new Over());
                break;
        }
    }
    
    /**
     * This method overrides the doMemoryOperation() method of MemoryOperationState interface
     * @param stack on which to do the memory operation
     * @return the result of the operation
     */
    @Override
    public int doMemoryOperation(StackDataStructure stack) {
        return memoryOperation.doMemoryOperation(stack);
    }

    /**
     * This method overrides the getMessage() method of MemoryOperationState interface
     * @return a string representing the message to display
     */
    @Override
    public String getMessage() {
        return memoryOperation.getMessage();
    }

}
