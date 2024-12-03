package org.example;

public class Main_ {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(77,7);
        int result_sum = calculator.sum(77,7);
        System.out.println(result_sum);
        int result_sub = calculator.subtraction(77,7);
        System.out.println(result_sub);
        calculator.multiplication(77,7);
        calculator.devide(77,7);
    }
}
