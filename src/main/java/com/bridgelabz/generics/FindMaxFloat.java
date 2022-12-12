package com.bridgelabz.generics;

public class FindMaxFloat {
    public static Float compareTo(Float a, Float b, Float c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }
public static void main(String[] args) {
    System.out.println("program to find maximum no. from three float");
    System.out.println("Max Integer Nmber is: "+FindMaxFloat.compareTo(20.2F, 30.2F, 40.2F));
    }
}
