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
    
    //10+5j
    public CartesianComplex(String number){
        
        boolean firstPositive = true;
        boolean secondPositive = true;
        
        if (number.charAt(0) == '-')     // See if first expr is negative
            firstPositive = false;
        if (number.substring(1).contains("-"))
            secondPositive = false;
        
        String[] split = number.split("[+-]");
        if (split[0].equals("")) {  // Handle expr beginning with `-`
            split[0] = split[1];
            split[1] = split[2];
        }
        
        if (split[0].contains("j")) // Assumes input is not empty
            this.im = Double.parseDouble((firstPositive ? "+" : "-") + split[0].substring(0,split[0].length() - 1));
        else
            
            this.re = Double.parseDouble((firstPositive ? "+" : "-") + split[0]);
        if (split.length > 1) {     // Parse second part of expr if it exists
            if (split[1].contains("j"))
                this.im = Double.parseDouble((secondPositive ? "+" : "-") + split[1].substring(0,split[1].length() - 1));
            else
                this.re = Double.parseDouble((secondPositive ? "+" : "-") + split[1]);

    }
    }
    
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
        return this.re;
    }
    
     public double getImagPart(){
        return this.im;
    }
    
    // return a string representation 
         @Override
    public String toString() {
        if (im == 0) return Double.toString(re) + "";
        if (re == 0) return Double.toString(im) + "j";
        if (im <  0) return Double.toString(re) + " - " + (Double.toString(-1*im)) + "j";
        return Double.toString(re) + " + " + Double.toString(im) + "j";
    }

    
    // return abs/modulus of cartComplex
    public double abs() {
        
        double re = this.re;
        double im = this.im;
        
        double abs= Math.hypot(re,im);
        
        return abs;
        
    }

    // return angle/phase of cartComplex
    public double phase() {
        
        double re = this.re;
        double im = this.im;
        
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
    public CartesianComplex conjugate() {
        
        double re = this.re;
        double im = this.im;
                
       CartesianComplex cartConj= new CartesianComplex(re,(-im));
       return cartConj; 
    }
    
    // return a new Complex object whose value is the reciprocal of cartComplex
    public CartesianComplex reciprocal() {
        
        double re = this.re;
        double im = this.im;
        
        double scale = re*re + im*im;
        return new CartesianComplex((re / scale),(-im / scale));
    }

    
    // return a new Complex object whose value is (this + b)
    public CartesianComplex sum(CartesianComplex b) {
        return new CartesianComplex(this.re + b.re, this.im + b.im);
    }

    // return a new Complex object whose value is (this - b)
    public CartesianComplex subtract(CartesianComplex b) {
        return new CartesianComplex(this.re - b.re, this.im - b.im);
    }

    // return a new Complex object whose value is (this * b)
    public CartesianComplex multiply(CartesianComplex b) {
        
        double reA = this.re;
        double imA = this.im;
        double reB = b.re;
        double imB = b.im;
        
        double reCart = (reA * reB) - (imA * imB);
        double imCart = (imA * reB) + (imB * reA);
        
        CartesianComplex cartComplMult = new CartesianComplex( reCart,imCart);
       
        return cartComplMult;       
    }

    // return a new Complex object whose value is this / b
    public CartesianComplex divides(CartesianComplex b) {
        
        CartesianComplex num = this.multiply(b.conjugate());
        CartesianComplex div = b.multiply(b.conjugate()); //num/div -> div^-1-> num*(div^-1)-> complex
        
        return num.multiply(div.reciprocal());
    }
    
    /*
    @Override
    public String toString(){
        return (Double.toString((this.re)) + Double.toString(this.im)+ "j");
    }
*/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
