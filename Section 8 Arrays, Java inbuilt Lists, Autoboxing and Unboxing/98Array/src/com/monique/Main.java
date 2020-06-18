package com.monique;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInteger = getIntegers(5);

        for (int i = 0; i < myInteger.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myInteger[i]);
        }
        System.out.println("Average = " +  getAverage(myInteger));

        scanner.close();
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer value.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
            //System.out.println("Element "+i+", typed value was " + values[i] );
        }
        return values;
    }
    public static double getAverage(int[]array){
        double sum =0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/(double)array.length;
    }

}
