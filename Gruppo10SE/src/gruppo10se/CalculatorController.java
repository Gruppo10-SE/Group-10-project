/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppo10se;

/**
 *
 * @author user
 */
public class CalculatorController {
    
    public int doSum(StackDataStructure<CartesianComplex> stack) {
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

    public int doSubtraction(StackDataStructure<CartesianComplex> stack) {
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

    public int doMultiplication(StackDataStructure<CartesianComplex> stack) {
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

    public int doDivision(StackDataStructure<CartesianComplex> stack) {
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

    public int doInvertSign(StackDataStructure<CartesianComplex> stack) {
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
    
    public int doSqrt(StackDataStructure<CartesianComplex> stack){
        
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
    
}
