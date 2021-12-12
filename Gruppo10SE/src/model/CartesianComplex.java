/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static java.lang.Double.NaN;
import java.lang.Math.*;
import java.lang.Exception;

/**
 *
 * @author mazzy
 */
/**
 * Creation of the CartesianComplex class for the definition of complex numbers
 * in Cartesian form and the possible operations on them.
 */
public class CartesianComplex {

    double re, im;

    /**
     * Constructor of the CartesianComplex class for the definition of complex
     * numbers in Cartesian form Constructs a CartesianComplex instance from the
     * specified String.
     *
     * @param number rapresents a string such as x+yj to which the CartesianComplex has to be associeted
     */
    public CartesianComplex(String number) {

        boolean firstPositive = true;
        boolean secondPositive = true;

        if (number.charAt(0) == '-') // See if first expr is negative
        {
            firstPositive = false;
        }
        if (number.substring(1).contains("-")) {
            secondPositive = false;
        }

        String[] split = number.split("[+-]");
        if (split[0].equals("")) {  // Handle expr beginning with `-`
            split[0] = split[1];
            if (split.length > 2) {
                split[1] = split[2];
            }
        }

        if (split[0].contains("j")) // Assumes input is not empty
        {
            this.im = Double.parseDouble((firstPositive ? "+" : "-") + split[0].substring(0, split[0].length() - 1));
        } else {
            this.re = Double.parseDouble((firstPositive ? "+" : "-") + split[0]);
        }
        if (split.length > 1 && !split[0].equals(split[1])) {     // Parse second part of expr if it exists
            if (split[1].contains("j")) {
                this.im = Double.parseDouble((secondPositive ? "+" : "-") + split[1].substring(0, split[1].length() - 1));
            } else {
                this.re = Double.parseDouble((secondPositive ? "+" : "-") + split[1]);
            }

        }
    }

    /**
     * Constructor of the CartesianComplex class for the definition of complex
     * numbers in Cartesian form Constructs a CartesianComplex instance from the
     * specified double r representing the real part of the number and a double
     * i representing the imaginary part .
     *
     * @param r represents the value to which the real part of the CartesianComplex has to be associeted
     * @param i represents the value to which the imaginary part of the CartesianComplex has to be associeted
     */
    public CartesianComplex(double r, double i) {
        this.re = r;
        this.im = i;
    }

    /**
     * Default constructor of the CartesianComplex class for the definition of
     * complex numbers in Cartesian form.
     */
    public CartesianComplex() {
        this.re = 0;
        this.im = 0;
    }

    /**
     * Setter for the real part of a CartesianComplex
     *
     * @param r double representing the real part
     */
    public void setRealPart(double r) {
        this.re = r;
    }

    /**
     * Setter for the imaginary part of a CartesianComplex
     *
     * @param i double representing the imaginary part
     */
    public void setImagPart(double i) {
        this.im = i;
    }

    /**
     * Getter for the real part of a CartesianComplex
     *
     * @return the real part of this
     */
    public double getRealPart() {
        return this.re;
    }

    /**
     * Getter for the imaginary part of a CartesianComplex.
     *
     * @return the imaginary part of this
     */
    public double getImagPart() {
        return this.im;
    }

    /**
     * This method overrides the toString() method of Object class.
     */
    @Override
    public String toString() {

        if (im == 0 || im == Double.NaN) {
            return Double.toString(re) + "";
        }
        if (re == 0) {
            return Double.toString(im) + "j";
        }
        if (im < 0) {
            return Double.toString(re) + "-" + (Double.toString(-1 * im)) + "j";
        }
        return Double.toString(re) + "+" + Double.toString(im) + "j";
    }

    /**
     * Returns the absolute value of this.
     *
     * @return the absolute value of this.
     */
    public double abs() {

        double re = this.re;
        double im = this.im;

        double abs = Math.hypot(re, im);

        return abs;

    }

    /**
     * Returns the phase value of this.
     *
     * @return the value of the phase of this.
     */
    public double phase() {

        double re = this.re;
        double im = this.im;

        double teta = Math.toRadians(0);

        if (re == 0 && im != 0) {
            if (im > 0) {
                teta = (Math.PI) / 2;
            } else {
                teta = (-((Math.PI) / 2));
            }
        } else if (re == 0 && im == 0) {
            teta = NaN;
        } else if (re > 0) {
            teta = (Math.atan(im / re));
        } else if (re < 0 && im != 0) {
            if (im >= 0) {
                teta = ((Math.atan(im / re)) + Math.PI);
            } else {
                teta = ((Math.atan(im / re)) - Math.PI);
            }
        }

        return teta;
    }

    /**
     * Returns the conjugate of this.
     *
     * @return a new CartesianComplex object that is the conjugate of this.
     */
    public CartesianComplex conjugate() {

        double re = this.re;
        double im = this.im;

        CartesianComplex cartConj = new CartesianComplex(re, (-im));
        return cartConj;
    }

    /**
     * Returns the reciprocal of this.
     *
     * @return a new CartesianComplex object that is the reciprocal of this.
     */
    public CartesianComplex reciprocal() {

        double re = this.re;
        double im = this.im;

        double scale = re * re + im * im;
        return new CartesianComplex((re / scale), (-im / scale));
    }

    /**
     * Returns a new CartesianComplex object whose value is this plus b.
     *
     * @param b is a CartesianComplex object whose value must be added to this.
     * @return a new CartesianComplex object whose value is (this + b)
     */
    public CartesianComplex sum(CartesianComplex b) {

        return new CartesianComplex(this.re + b.re, this.im + b.im);
    }

    /**
     * Returns a new CartesianComplex object whose value is this minus b.
     *
     * @param b is a CartesianComplex whose object value must be subtracted to
     * this.
     * @return a new CartesianComplex object whose value is (this - b)
     */
    public CartesianComplex subtract(CartesianComplex b) {

        return new CartesianComplex(this.re - b.re, this.im - b.im);
    }

    /**
     * Returns a new CartesianComplex object whose value is this multiplied by
     * b.
     *
     * @param b is a CartesianComplex object whose value must be multiplied to
     * this.
     * @return a new CartesianComplex object whose value is (this * b)
     */
    public CartesianComplex multiply(CartesianComplex b) {

        double reA = this.re;
        double imA = this.im;
        double reB = b.re;
        double imB = b.im;

        double reCart = (reA * reB) - (imA * imB);
        double imCart = (imA * reB) + (imB * reA);

        CartesianComplex cartComplMult = new CartesianComplex(reCart, imCart);

        return cartComplMult;
    }

    /**
     * Returns a new CartesianComplex object whose value is this divided by b.
     *
     * @param b is a CartesianComplex object by which this must be divided
     * @return a new CartesianComplex object whose value is (this / b)
     */
    public CartesianComplex divides(CartesianComplex b) {

        CartesianComplex num = this.multiply(b.conjugate());
        CartesianComplex div = b.multiply(b.conjugate()); //num/div -> div^-1-> num*(div^-1)-> complex

        return (num.multiply(div.reciprocal()));
    }

    /**
     * Returns a new CartesianComplex object whose value is this inverted by
     * sign
     *
     * @return a new CartesianComplex object whose value is (-this)
     */
    public CartesianComplex invertSign() {

        double re = this.re;
        double im = this.im;

        if (re == 0 && im == 0) {

            return new CartesianComplex(re, im);
        } else {
            return new CartesianComplex(-(this.re), -(this.im));
        }
    }

    /**
     * Returns a new CartesianComplex object whose value is the squareroot of
     * this. even if this function has two possibles result, one positive and
     * one negative, we assumed the result to be positive as convention
     *
     * @return a new CartesianComplex object whose value is sqrt(this)
     */
    public CartesianComplex squareRoot() {

        double re = this.re;
        double im = this.im;

        if (re < 0 && im == 0) { //sqrt(-4)->sqrt(4i^2)
            double absRe = Math.abs(re);
            return new CartesianComplex(0, Math.sqrt(absRe));
        } else {
            double realPart = (Math.sqrt((abs() + re) / 2));
            if (im != 0) {
                double imagPart = (im / Math.abs(im)) * (Math.sqrt((abs() - re) / 2));
                return new CartesianComplex(realPart, imagPart);
            } else {
                return new CartesianComplex(realPart, 0);
            }
        }
    }

    /**
     * This method overrides the equals() method of Object Class
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CartesianComplex other = (CartesianComplex) obj;
        if (Double.doubleToLongBits(this.re) != Double.doubleToLongBits(other.re)) {
            return false;
        }
        if (Double.doubleToLongBits(this.im) != Double.doubleToLongBits(other.im)) {
            return false;
        }
        return true;
    }

}
