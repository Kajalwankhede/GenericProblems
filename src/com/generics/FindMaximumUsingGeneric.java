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
        return max;
    }

    public static void main(String args[]) {
        System.out.println("\nGenerics To test Maximum of 3 Variables.");
        System.out.printf("Maximum Integers of %d, %d and %d \nNumber is: %d\n\n",
                8, 4, 10, maximum( 8, 4, 10 ));

        System.out.printf("Maximum Float Number of %.1f,%.1f and %.1f \nFloat Number is: %.1f\n\n",
                8.8, 1.1, 2.2, maximum(   8.8,1.1, 2.2));

    }
}