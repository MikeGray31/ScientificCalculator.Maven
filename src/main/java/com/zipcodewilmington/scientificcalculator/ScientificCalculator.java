package com.zipcodewilmington.scientificcalculator;

public class ScientificCalculator {

    private double number;

    public double factorial(double x){

        if(x <= 0){
            Console.println("Cannot find result of 0!");
        }
        else {
            for (double i = 0; i <= x; i++) {
                number *= x;
            }
        }
        return number;

    }

    public double inverse(double x){
        double number = 0;

        if(x == 0){
            Console.println("Cannot find result of 1/0");
            number = 0;
        }
        else{
            number = 1/x;
        }
        return number;
    }

    public double switchSign(double x){
        return number = x * -1;
    }

    public double sine(double x){
        return number = Math.sin(x);
    }

    public double cosine(double x){
        return number = Math.cos(x);
    }

    public double tangent(double x){
        return number = Math.tan(x);
    }

    public double inverseSine(double x){
        return number = Math.asin(x);
    }

    public double inverseCosine(double x){
        return number = Math.acos(x);
    }

    public double inverseTangent(double x){
        return number = Math.atan(x);
    }


}
