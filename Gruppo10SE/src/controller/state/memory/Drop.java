/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.state.memory;

import model.StackDataStructure;

/**
 * Creation of the Drop class that implements the MemoryOperationState interface.
 * @author user
 */
public class Drop implements MemoryOperationState{
    
    /**
     * This method overrides the doMemoryOperation() method of MemoryOperationState interface
     * Invokes drop method from stack data structure class
     * @param stack on which to do drop operation
     * @return 0 if stack is not empty and drop is successful, 1 otherwise
     */
    @Override
    public int doMemoryOperation(StackDataStructure stack) {
        if(stack.isEmpty())
            return 1;
        else {
            stack.drop();
            return 0;
        }
    }

    /**
     * This method overrides the getMessage() method of MemoryOperationState interface
     * @return a string representing the message to display
     */
    @Override
    public String getMessage() {
        return "Last element of the memory deleted";
    }
    
}
