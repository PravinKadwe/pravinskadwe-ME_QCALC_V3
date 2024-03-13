package com.crio.qcalc;

public class StandardCalculator {
    private int result;

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

    public void add(int var1, int var2) {
        this.result = var1 + var2;
     }
  
     public void subtract(int var1, int var2) {
        this.result = var1 - var2;
     }
  
     public void multiply(int var1, int var2) {
        this.result = var1 * var2;
     }
  
     public void divide(int var1, int var2) {
        if (var2 == 0) {
           throw new IllegalArgumentException("Cannot divide by zero");
        } else {
           this.result = var1 / var2;
        }
     }
  
     private void setResult(int var1) {
        this.result = var1;
     }
  
     public int getResult() {
        return this.result;
     }
  
     public void clearResult() {
        this.result = 0;
     }
  
     public void printResult() {
        System.out.println("Standard Calculator Result:" + this.getResult());
     }


}
