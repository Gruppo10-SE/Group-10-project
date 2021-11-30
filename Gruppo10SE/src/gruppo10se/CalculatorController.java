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
    StackDataStructure stack;
    
    public CalculatorController() {
        stack = new StackDataStructure();
    }
    
    public int doSum() {
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

    public int doSubtraction() {
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

    public int doMultiplication() {
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

    public int doDivision() {
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

    public int doInvertSign() {
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
    
}
