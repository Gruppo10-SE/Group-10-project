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
public interface MemoryOperationState {
    public int doMemoryOperation(StackDataStructure stack);
    public String getMessage();
}
