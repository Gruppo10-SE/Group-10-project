/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gruppo10se;
import static java.lang.Double.NaN;
import java.lang.Math.*;
import java.lang.Exception;

/**
 *
 * @author mazzy
 */
public class CartesianComplex {
    double re,im;
    
    //constructors
    public CartesianComplex(double r, double i){
        this.re = r;
        this.im = i;    
    } 
    
    public CartesianComplex(){
        this.re = 0;
        this.im = 0;    
    }
    
    //setter methods
    public void setRealPart(double r){
        this.re=r;
    }
    
       public void setImagPart(double i){
        this.im=i;
    }
       
    //getter methods
    public double getRealPart(){
        return re;
    }
    
     public double getImagPart(){
        return im;
    }
    
    // return a string representation 
    @Override
    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "j";
        if (im <  0) return re + " - " + (-im) + "j";
        return re + " + " + im + "j";
    }
    
    // return abs/modulus of cartComplex
    public double abs(CartesianComplex cartComplex) {
        
        double re = cartComplex.re;
        double im = cartComplex.im;
        
        double abs= Math.hypot(re,im);
        
        return abs;
        
    }

    // return angle/phase of cartComplex
    public double phase(CartesianComplex cartComplex) {
        
        double re = cartComplex.re;
        double im = cartComplex.im;
        
        double teta = Math.toRadians(0);
        
        if (re == 0){
            if(im > 0)
            teta = (Math.PI)/2;
            else teta = Math.toRadians(-((Math.PI)/2));
        }
        else if(re==0 && im==0){
           teta = NaN;
        }
        else if(re>0){
           teta = Math.toRadians(Math.atan(im/re));
        }
        else if(re<0){
            if (im>=0){
              teta = Math.toRadians(Math.atan(im/re) + Math.PI);  
            }
            else teta = Math.toRadians(Math.atan(im/re) - Math.PI);
        }
        
        return teta;
    }

    // return a new Complex object whose value is the conjugate of cartComplex
    public CartesianComplex conjugate(CartesianComplex cartComplex) {
        
        double re = cartComplex.re;
        double im = cartComplex.im;
                
       CartesianComplex cartConj= new CartesianComplex(re,(-im));
       return cartConj; 
    }

    
    // return a new Complex object whose value is (a + b)
    public CartesianComplex sum(CartesianComplex b) {
        return new CartesianComplex(this.re + b.re, this.im + b.im);
    }

    // return a new Complex object whose value is (a - b)
    public CartesianComplex subtract(CartesianComplex b) {
        return new CartesianComplex(this.re - b.re, this.im - b.im);
    }

    // return a new Complex object whose value is (a * b)
    public CartesianComplex multiply(CartesianComplex a, CartesianComplex b) {
        return new CartesianComplex();
    }

    // return a / b
    public CartesianComplex divides(CartesianComplex a, CartesianComplex b) {
        return new CartesianComplex();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
