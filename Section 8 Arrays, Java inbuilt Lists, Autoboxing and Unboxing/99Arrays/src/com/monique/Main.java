package com.monique;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArray = getInteger(5);
        System.out.println("Before Sort");
        printArray(myArray);
        System.out.println(" After Sort Descending ");
        printArray(sort(myArray));
//        System.out.println(" After sort Ascending ");
//        printArray(sortB(myArray));
        scanner.close();

    }

    public static int[] getInteger(int array){
        System.out.println("Enter " + array + " Numbers.\r");
        int[] newArray = new int[array];
        for (int i=0;i<array;i++){
            newArray[i]=scanner.nextInt();
        }
        return newArray;
    }
    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println("Item "+ i + " Value "+ array[i]);
        }
    }
    public static int[] sort(int[] array){
        int[] sortedArray = new int[array.length];
        for (int i =0;i<array.length;i++){
            sortedArray[i]= array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag=false;
            for (int i =0;i<sortedArray.length-1;i++){
                if(sortedArray[i]< sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag=true;
                }
            }
        }return sortedArray;
    }
    public static int[] sortB(int[] array){
        int[] sortedArray= Arrays.copyOf(array,array.length);
        //Ascending
        Arrays.sort(sortedArray);
        // Descending need to change array to Integer type
        //Integer[] sortedArray=Arrays.copyOf(array,array.length);
        //Arrays.sort(sortedArray, Collections.reverseOrder());
//
        return sortedArray;
    }

}
