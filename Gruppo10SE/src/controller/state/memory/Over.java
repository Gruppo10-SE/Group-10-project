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
public class Over implements MemoryOperationState{

    @Override
    public int doMemoryOperation(StackDataStructure stack) {
        if(stack.size() < 2)
            return -1;
        else{
            stack.over();
            return 0;
        }
    }

    @Override
    public String getMessage() {
        return "Inserted a copy of the second last number";
    }
    
}
