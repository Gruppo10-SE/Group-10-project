/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppo10se;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class StackDataStructure {
    private List<CartesianComplex> stack = new ArrayList<>();
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public int size() {
        return stack.size();
    }
    
    public CartesianComplex top() {
        if (stack.isEmpty())
            return null;
        return stack.get(size() - 1);
    }
    
    public CartesianComplex pop() {
        if (stack.isEmpty())
            return null;
        CartesianComplex top = top();
        stack.remove(top);
        return top;
    }
    
    public void push(CartesianComplex element) {
        stack.add(element);
    }
    
    public Integer search(CartesianComplex element) {
        if (stack.isEmpty())
            return null;
        return stack.indexOf(element);
    }
    
    @Override
    public String toString() {
        String stringa = "";
        for(CartesianComplex single: stack){
            stringa += single.toString() + "\n";
        }
        return stringa;
    }
    
}
