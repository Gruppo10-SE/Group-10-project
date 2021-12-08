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
    
    public int doSum(StackDataStructure stack) {
        if (stack.size() >= 2) {
            CartesianComplex a, b;
            a = stack.pop();
            b = stack.pop();
            stack.push(a.sum(b));
            return 0;
        } else {
            return 1;
        }
    }

    public int doSubtraction(StackDataStructure stack) {
        if (stack.size() >= 2) {
            CartesianComplex a, b;
            a = stack.pop();
            b = stack.pop();
            stack.push(b.subtract(a));
            return 0;
        } else {
            return 1;
        }
    }

    public int doMultiplication(StackDataStructure stack) {
        if (stack.size() >= 2) {
            CartesianComplex a, b;
            a = stack.pop();
            b = stack.pop();
            stack.push(a.multiply(b));
            return 0;
        } else {
            return 1;
        }
    }

    public int doDivision(StackDataStructure stack) {
        if (stack.size() >= 2) {

            CartesianComplex a, b;
            a = stack.pop();
            b = stack.pop();

            if (a.getRealPart() == 0 && a.getImagPart() == 0) {
                stack.push(b);
                stack.push(a);
                return -1;
            } 
            else {
                stack.push(b.divides(a));
                return 0;
            }
        } else {
            return 1;
        }
    }

    public int doInvertSign(StackDataStructure stack) {
        //***DA DEFINIRE IN CARTESIAN COMPLEX***
        if (stack.size() >= 1) {
            CartesianComplex a;
            a = stack.pop();
            stack.push(a.invertSign());
            return 0;
        } else {
            return 1;
        }
    }
    
    public void insertNumber(StackDataStructure stack, String s) {
        stack.push(new CartesianComplex(s));
    }
    
    public boolean checkIfEmpty(StackDataStructure stack) {
        if (stack.isEmpty())
            return true;
        return false;
    }
    
    public int doSqrt(StackDataStructure stack){
        
        if(stack.size() >= 1){
            CartesianComplex a;
            a = stack.pop();
            stack.push(a.squareRoot());
            return 0;
        } else {
            return 1;
        }
    } 
    
    // MEMORY OPERATION
    // clear , drop , dup , swap , over
    
    public int doClear(StackDataStructure stack){
        if(stack.isEmpty())
            return 1;
        else {
            stack.clear();
            return 0;
        }
    }
    
    public int doDrop(StackDataStructure stack){
        if(stack.isEmpty())
            return 1;
        else {
            stack.drop();
            return 0;
        }
    }
    
    public int doDup(StackDataStructure stack){
        if(stack.isEmpty())
            return 1;
        else{
            stack.dup();
            return 0;
        }
    }
    
    public int doSwap(StackDataStructure stack){
        if(stack.size() < 2)
            return 1;
        else{
            stack.swap();
            return 0;
        }
    }

    public int doOver(StackDataStructure stack){
        if(stack.size() < 2)
            return 1;
        else{
            stack.over();
            return 0;
        }
    }
    
    public void showVariables(Variables variabiles, JList list){
        String vettore[] = new String[variabiles.size()];
        for(int i=0; i<variabiles.size(); i++){
            vettore[i] = variabiles.toString().split("\n")[i];
        }
        list.setListData(vettore);
    }
    
    public int fromStackToVariable(StackDataStructure stack, Variables variables, char variable) {
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
    
}
