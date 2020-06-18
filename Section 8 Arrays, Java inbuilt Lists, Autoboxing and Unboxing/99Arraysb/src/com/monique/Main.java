package com.monique;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] myArray = getInteger(5);
        System.out.println("Before Sort");
        printArray(myArray);
        //System.out.println(" After sort: Descending ");
        printArray(sortDescending(myArray));
        //Ascending
        printArray(sortAscending(myArray));
        scanner.close();
    }

    public static Integer[] getInteger(Integer array) {
        System.out.println("Enter " + array + " Numbers.\r");
        Integer[] newArray = new Integer[array];
        for (int i = 0; i < array; i++) {
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    public static void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Item " + i + " Value " + array[i]);
        }
    }

//    public static int[] sortAscending(int[] array){
//        int[] sortedArray= Arrays.copyOf(array,array.length);
//        //Ascending
//        Arrays.sort(sortedArray);
//        System.out.println(" After sort: Ascending ");
//        return sortedArray;
//    }

//Note Ascending can be done with both primitive "int" and "Integer"
// Descending can only be done with "Integer
    public static Integer[] sortAscending(Integer[] array) {
        Integer[] sortedArray = Arrays.copyOf(array, array.length);
        //Ascending
        Arrays.sort(sortedArray);
        System.out.println(" After sort: Ascending ");

        return sortedArray;
    }

    public static Integer[] sortDescending(Integer[] array) {
        Integer[] sortedArray = Arrays.copyOf(array, array.length);
        // Descending need to change array to Integer type
        Arrays.sort(sortedArray, Collections.reverseOrder());
        System.out.println(" After sort: Descending ");
        return sortedArray;
    }

}
