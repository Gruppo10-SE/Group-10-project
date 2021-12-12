/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.state.memory;

import model.StackDataStructure;

/**
 * Creation of the Swap class that implements the MemoryOperationState interface.
 * @author user
 */
public class Swap implements MemoryOperationState{

    /**
     * This method overrides the doMemoryOperation() method of MemoryOperationState interface
     * Invokes swap method from stack data structure class
     * @param stack on which to do swap operation
     * @return 0 if stack is not empty and swap is successful, -1 otherwise
     */
    @Override
    public int doMemoryOperation(StackDataStructure stack) {
        if(stack.size() < 2)
            return -1;
        else{
            stack.swap();
            return 0;
        }
    }

    /**
     * This method overrides the getMessage() method of MemoryOperationState interface
     * @return a string representing the message to display
     */
    @Override
    public String getMessage() {
        return "Last two numbers exchanged";
    }
    
}
