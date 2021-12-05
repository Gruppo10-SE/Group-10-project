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
    
}
