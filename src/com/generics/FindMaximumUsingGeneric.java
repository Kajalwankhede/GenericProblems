package com.generics;
public class FindMaximumUsingGeneric <T extends Comparable<T>>{
    T a,b,c;
    public FindMaximumUsingGeneric(T a, T b, T c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public T maximum(){
        return  FindMaximumUsingGeneric.maximum(a,b,c);
    }
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
        printMax(a,b,c,max);
        return max;
    }
    public static String testMaximum(String a, String b,String c) {
        String max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }
        printMax(a,b,c,max);
        return max;
    }

    public static <T> void printMax(T a, T b, T c, T max){

        System.out.printf("Maximum Of the  %s, %s and %s is:  %s\n",a,b,c,max);
    }

    public static void main(String args[]) {
        System.out.println("\nGenerics To test Maximum of 3 Variables.");
        Integer aInt = 8, bInt = 4, cInt = 5;
        Float aF1 = 6.6f, bF1 = 8.8f, cF1 = 7.7f;
        String aStr = "peach", bStr = "apple", cStr = "banana";

        FindMaximumUsingGeneric.testMaximum(aStr, bStr, cStr);
        new FindMaximumUsingGeneric(aInt, bInt, cInt).maximum();
        new FindMaximumUsingGeneric(aF1, bF1, cF1).maximum();
        new FindMaximumUsingGeneric(aStr, bStr, cStr).maximum();

    }
    }
