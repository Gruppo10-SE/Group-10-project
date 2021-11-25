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
    public CartesianComplex sum(CartesianComplex a) {
        return new CartesianComplex();
    }

    // return a new Complex object whose value is (this - b)
    public CartesianComplex subtract(CartesianComplex b) {
        return new CartesianComplex();
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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
