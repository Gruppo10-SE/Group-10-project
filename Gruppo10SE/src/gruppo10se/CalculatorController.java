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
    
    public void insertNumber(StackDataStructure stack, String s) {
        stack.push(new CartesianComplex(s));
    }
    
    public boolean checkIfEmpty(StackDataStructure stack) {
        return stack.isEmpty();
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
