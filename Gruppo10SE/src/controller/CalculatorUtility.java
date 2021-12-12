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
/**
 * Creation of the CalculatorUtility class for the definition of utility methods
 * used by the controller
 */
public class CalculatorUtility {

    /**
     * Pushes a CartesianComplex object into the stack
     * 
     * @param stack represents a List-type data structure of CartesianComplex objects
     * @param s represents a CartesianComplex object 
     */
    public void insertNumber(StackDataStructure stack, String s) {
        stack.push(new CartesianComplex(s));
    }

    /**
     * Check if the stack has no entry
     * 
     * @param stack represents a List-type data structure of CartesianComplex objects
     * @return true if the stack is empty, false otherwise
     */
    public boolean checkIfEmpty(StackDataStructure stack) {
        return stack.isEmpty();
    }

    /**
     * Sets the Jlist from Swing Controls in the GUI
     * 
     * @param variables represents a Map-type data structure of Variable objects
     * @param varList represents a JList data structure of Variable objects
     */
    public void showVariables(Variables variables, JList varList) {
        String string[] = new String[variables.size()];
        for (int i = 0; i < variables.size(); i++) {
            string[i] = variables.toString().split("\n")[i];
        }
        varList.setListData(string);
    }

    /**
     * Retrives the value associeted to a specified variable
     *
     * @param variables represents a Map-type data structure of Variable objects
     * @param variable represents a char variable 
     * @return a string that shows the variable and its value
     */
    public String getVariable(Variables variables, char variable) {
        CartesianComplex valore;

        valore = variables.getValue(variable);

        return variable + "  =  " + valore;
    }

    /**
     * Add a key-value mapping into a map.
     * 
     * @param udo represents a Map-type data structure of UserDefinedOperations objects
     * @param key  represents the key of the mapping
     * @param value represents the value of the mapping
     */
    public void updateTable(UserDefinedOperations udo, String key, String value) {
        udo.putValue(key, value);
    }

}
