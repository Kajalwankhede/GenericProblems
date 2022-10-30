package com.generics;

public class FindMaximumUsingGeneric{
    public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        T max = a;   // assume x is initially the largest

        if(b.compareTo(max) > 0) {
            max = b;   // y is the largest so far
        }

        if(c.compareTo(max) > 0) {
            max = c;   // z is the largest now
        }
        return max;   // returns the largest object
    }

    public static void main(String args[]) {
        System.out.printf("Maximum of %d, %d and %d is: %d\n\n",
                8, 4, 5, maximum( 8, 4, 5 ));

    }
}