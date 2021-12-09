/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.state.basic;

import gruppo10se.CartesianComplex;
import gruppo10se.StackDataStructure;

/**
 *
 * @author user
 */
public interface BasicOperationState {
    public int doBasicOperation(StackDataStructure<CartesianComplex> complexStack);
    public String getMessage();
}
