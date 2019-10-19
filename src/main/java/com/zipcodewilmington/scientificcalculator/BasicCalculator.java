package com.zipcodewilmington.scientificcalculator;

public class BasicCalculator {

    private double number;

    public double add(double x, double y){
        return number = x + y;
    }

    public double subtract(double x, double y){
        return number = x - y;
    }

    public double multiply(double x, double y){
        return number = x * y;
    }

    public double divide(double x, double y){

        if(y == 0) {
            return number;
        }
        else{
            return x / y;
        }
    }


    public double squareRoot(double x) {

        if (x < 0) {
            return number = 0;
        }
        else {
            return Math.sqrt(x);
        }
    }
    public double square(double x){
        return number = x * x;
    }
}
