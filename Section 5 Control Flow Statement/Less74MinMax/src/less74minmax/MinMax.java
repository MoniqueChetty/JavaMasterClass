/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package less74minmax;

import java.util.Scanner;

/**
 *
 * @author Monique Chetty
 */
public class MinMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int number;
        int min = 0;
        int max = 0;
        boolean firstNum = true;

        while (true) {

            System.out.println("Enter number : ");
            
            boolean hasNextInt = scanner.hasNextInt();
            

            if (hasNextInt) {
                int number = scanner.nextInt();
                if (firstNum) {
                    min = number;
                    max = number;
                    firstNum = false;
                    
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                scanner.nextLine();// handle enter
                System.out.println("Number =  " + number + " Max = " + max + " Min = " + min);
            } else {
                break;
            }
        }
        System.out.println("Max = " + max + " Min = " + min);
        scanner.close();
    }

}
