/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.CartesianComplex;
import model.StackDataStructure;
import model.UserDefinedOperations;
import model.Variables;

import javax.swing.*;

/**
 *
 * @author user
 */
public class CalculatorUtility {
    
    public void insertNumber(StackDataStructure stack, String s) {
        stack.push(new CartesianComplex(s));
    }
    
    public boolean checkIfEmpty(StackDataStructure stack) {
        return stack.isEmpty();
    }
    
    public void showVariables(Variables variables, JList varList){
        String string[] = new String[variables.size()];
        for(int i=0; i<variables.size(); i++){
            string[i] = variables.toString().split("\n")[i];
        }
        varList.setListData(string);
    }
    
    public String getVariable(Variables variables, char variable){
        CartesianComplex valore;
        
        valore = variables.getValue(variable);
        
        return variable + "  =  " + valore;
    }
    
    public void updateTable(UserDefinedOperations udo, String key, String value) {
        udo.putValue(key, value);
    }
     
}
