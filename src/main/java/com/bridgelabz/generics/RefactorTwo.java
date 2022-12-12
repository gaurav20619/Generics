package com.bridgelabz.generics;

public class RefactorTwo <T extends Comparable<T>>{ //generic class 
    T x;
    T y;
    T z;

    RefactorTwo(T x, T y, T z) {//parameterized constructor
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T testMaximum () {// testMaximum method 3 parameter calling internally

        if (x.compareTo(y) > 0) {
            return x;
        } else if (y.compareTo(z) > 0) {
            return y;
        } else {
            return z;
        }
    }
public static void main(String[] args) {
    RefactorTwo<Integer> compareInteger = new RefactorTwo<Integer>(10, 35, 40);
        System.out.println("Maximum number out of three integers is: " + compareInteger.testMaximum());
        RefactorTwo<Float> comapareFloat = new RefactorTwo<Float>(25.2F, 35.2F, 45.2F);
        System.out.println("Maximum number out of three float is: " + comapareFloat.testMaximum());
        RefactorTwo<String> compareString = new RefactorTwo<String>("Adobe", "Microsoft", "IBM");
        System.out.println("Maximum among three string is: " + compareString.testMaximum());
    }

}
