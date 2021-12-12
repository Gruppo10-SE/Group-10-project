/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.state.memory;

import model.StackDataStructure;

/**
 * Creation of MemoryOperationState interface, representing the state of a
 * memory operation with all its methods.
 * 
 * Defines the interface, implemented by the ConcreteState,which encapsulates 
 * the logic of the behavior associated with a given state.
 * Implementation of the behavioural pattern State.
 * 
 * @author user
 */
public interface MemoryOperationState {

    /**
     * Invokes methods from StackDataStructure class to perform memory 
     * operations on data according to the Concrete State class.
     *
     * @param stack on which the memory operation is to be done
     * @return a number specifying if the operation succeded or not
     */
    public int doMemoryOperation(StackDataStructure stack);

    /**
     * Returns the message to be displayed for each Concrete State
     * class after performing a memory operation.
     * 
     * @return a string representing the message to display
     */
    public String getMessage();
}
