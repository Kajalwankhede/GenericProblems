package com.generics;
public class FindMaximumUsingGeneric{
    public static <T extends Comparable<T>>
    T maximum(T a, T b, T c) // shows the largest of 3 comaptible objects
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
      //  System.out.printf("Maximum Integers of %d, %d and %d \nNumber is: %d\n\n",
            //    8, 4, 10, maximum( 8, 4, 10 ));

     //  System.out.printf("Maximum Float Number of %.1f,%.1f and %.1f \nFloat Number At First Position: %.1f\n\n",
                //8.8, 1.1, 2.2, maximum(   8.8,1.1, 2.2));
       // System.out.printf("Maximum Float Number of %.1f,%.1f and %.1f \nFloat Number At Second Position %.1f\n\n",
             //   8.8, 9.9, 2.2, maximum(   8.8,9.9, 2.2));

        //System.out.printf("Maximum Float Number of %.1f,%.1f and %.1f \nFloat Number At Third Position: %.1f\n\n",
              //  7.7, 6.6, 9.9, maximum(    7.7, 6.6, 9.9));

        System.out.printf("Maximum String of %s, %s and %s\nString At First Position: %s\n","Peach",
                "Apple", "Banana", maximum("Peach", "Apple", "Banana"));

    }
}