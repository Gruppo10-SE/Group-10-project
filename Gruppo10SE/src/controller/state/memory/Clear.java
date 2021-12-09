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
public class Clear implements MemoryOperationState{

    @Override
    public int doMemoryOperation(StackDataStructure stack) {
        if(stack.isEmpty())
            return 1;
        else {
            stack.clear();
            return 0;
        }
    }

    @Override
    public String getMessage() {
        return "The memory has been cleared";
    }
    
}
