package org.example;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculator() {
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int subtraction(int a, int b) {
        return a - b;
    }
    public static void  multiplication (int a, int b) {
        System.out.println(a * b);
    }
     public static void  devide (int a, int b) {
        System.out.println(a/b);
    }
    @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}



