/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.state.memory;

import model.StackDataStructure;

/**
 *
 * @author user
 */
public class Drop implements MemoryOperationState{

    @Override
    public int doMemoryOperation(StackDataStructure stack) {
        if(stack.isEmpty())
            return 1;
        else {
            stack.drop();
            return 0;
        }
    }

    @Override
    public String getMessage() {
        return "Last element of the memory deleted";
    }
    
}
