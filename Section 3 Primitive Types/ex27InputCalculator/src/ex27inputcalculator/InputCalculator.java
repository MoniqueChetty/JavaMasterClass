/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex27inputcalculator;

import java.util.Scanner;

/**
 *
 * @author Monique Chetty
 */
public class InputCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        
        int number;
        int sum = 0;
        int average = 0;
        int counter = 0;
        
        Scanner scanner = new Scanner(System.in);
               

        while (true) {
            System.out.print("Enter number : ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                
                number =scanner.nextInt();
                counter ++;
                sum += number;
                average = Math.round(sum/counter);
                System.out.println("Sum = " + sum + " Average = " + average + "Number : " + number + "Counter: " +counter);
            }else{
                System.out.println("Sum = " + sum + " Average = " + average);
                break;
            }
            scanner.hasNextLine();
        }
        scanner.close();
    }

}
