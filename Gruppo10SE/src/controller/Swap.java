/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import gruppo10se.StackDataStructure;

/**
 *
 * @author user
 */
public class Swap implements OperationState{

    @Override
    public int doOperation(StackDataStructure stack) {
        if(stack.size() < 2)
            return -1;
        else{
            stack.swap();
            return 0;
        }
    }

    @Override
    public String getMessage() {
        return "Last two numbers exchanged";
    }
    
}
