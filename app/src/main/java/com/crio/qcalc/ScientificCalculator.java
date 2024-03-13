package com.crio.qcalc;
public class ScientificCalculator {

    public double squareOf(double num) {
        return num * num;
    }

    public double cubeOf(double num) {
        return num * num * num;
    }
     public double powerOf(double base,double exponent) {
         return Math.pow(base, exponent);
     }

     public double squareRoot(double num) {
         return Math.sqrt(num);
     }

     public int modulo(int dividend, int divisor) {
         return dividend % divisor;
     }

     public double modulo_double(double dividend, double divisor) {
         return dividend % divisor;
     }
}
