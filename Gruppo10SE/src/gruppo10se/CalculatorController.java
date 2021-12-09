/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppo10se;
import javax.swing.*;

/**
 *
 * @author user
 */
public class CalculatorController {
    
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
    
    public int fromStackToVariable(StackDataStructure<CartesianComplex> stack, Variables variables, char variable) {
        if (stack.size() >= 1) {
            CartesianComplex top = stack.top();
            variables.putValue(variable, top);
            return 0;
        }
        else
            return 1;
    }
    
    public int fromVariableToStack(StackDataStructure stack, Variables variables, char variable) {
        stack.push(variables.getValue(variable));
        return 0;
    }
    
    public int plusVariable (StackDataStructure stack, Variables variables, char variable){
        if(!stack.isEmpty()){
           variables.putValue(variable, variables.getValue(variable).sum(stack.top()));
           return 0;
        }
        else
           return 1;
    }
    
    public int minusVariable (StackDataStructure stack, Variables variables, char variable){
        if(!stack.isEmpty()){
           variables.putValue(variable, variables.getValue(variable).subtract(stack.top()));
           return 0;
        }
        else
           return 1;
    }
    
}
