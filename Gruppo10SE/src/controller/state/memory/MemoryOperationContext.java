/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.state.memory;

import gruppo10se.StackDataStructure;

/**
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
    
    @Override
    public int doMemoryOperation(StackDataStructure stack) {
        return memoryOperation.doMemoryOperation(stack);
    }

    @Override
    public String getMessage() {
        return memoryOperation.getMessage();
    }

}
