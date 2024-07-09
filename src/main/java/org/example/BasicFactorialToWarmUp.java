package org.example;

import java.util.InputMismatchException;

public class BasicFactorialToWarmUp {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(factorial(50));
        System.out.println(factorial(20));
        System.out.println(factorial(10));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
    }

    public static long factorial(int n) {
        if (n<=0){
            throw new InputMismatchException(" N cant be les then or equal to 0 ");
        }
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

}
