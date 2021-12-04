/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import gruppo10se.CartesianComplex;
import gruppo10se.StackDataStructure;

/**
 *
 * @author user
 */
public interface OperationState {
    public int doOperation(StackDataStructure<CartesianComplex> complexStack);
    public String getMessage();
}
