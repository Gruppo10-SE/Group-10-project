/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.state.basic;

import model.CartesianComplex;
import model.StackDataStructure;

/**
 *
 * @author user
 */
/**
 * Creation of the BasicOperationState interface representing a state basic operation with all its methods
 * Defines the interface, implemented by the ConcreteState,which encapsulates the logic of the behavior 
 * associated with a given state.
 * Implementation of th behavioural pattern State. 
 * 
 */
public interface BasicOperationState {
    
/**
 * Invokes methods from StackDataStructure class and CartesianComplex class to perform basic operations on data.
 * 
 * @param complexStack represents a stack of CartesianComplex on which the operations are made.
 * @return an integer specifing if the operation succeded or not.
 */
    public int doBasicOperation(StackDataStructure<CartesianComplex> complexStack);
    
/**
 * Displays a success message specified for each state.
 * 
 * @return a string representing the message to display for each state after performing an operation.
 */
    public String getMessage();
}
