package com.financialforecasting;

public class ForecastCalculator {

    
    public static double calculateFutureValue(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return (1 + rate) * calculateFutureValue(principal, rate, years - 1);
    }


    public static double calculateFutureValueIterative(double principal, double rate, int years) {
        double futureValue = principal;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + rate);
        }
        return futureValue;
    }

    public static void main(String[] args) {
        double principal = 10000; 
        double rate = 0.05;       
        int years = 5;            

        
        double futureValueRecursive = calculateFutureValue(principal, rate, years);
        System.out.printf("Future Value (Recursive) after %d years = %.2f%n", years, futureValueRecursive);

       
        double futureValueIterative = calculateFutureValueIterative(principal, rate, years);
        System.out.printf("Future Value (Iterative) after %d years = %.2f%n", years, futureValueIterative);
    }
}
