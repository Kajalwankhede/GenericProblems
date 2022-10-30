package com.generics;
public class FindMaximumUsingGeneric{
    public static <T extends Comparable<T>> T maximum(T a, T b, T c) // shows the largest of 3 comaptible objects
    {
        T max = a;

        if(b.compareTo(max) > 0) {
            max = b;
        }

        if(c.compareTo(max) > 0) {
            max = c;
        }
        return max;   // returns the largest object
    }

    public static void main(String args[]) {
        System.out.println("\nGenerics To test MAximum of 3 Variables.");
        System.out.printf("Maximum of %d, %d and %d \nNumber is: %d\n\n",
                8, 9, 5, maximum( 8, 9, 5 ));

    }
}