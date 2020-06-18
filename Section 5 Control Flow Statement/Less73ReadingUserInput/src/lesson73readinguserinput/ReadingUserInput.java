 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson73readinguserinput;

import java.util.Scanner;

/**
 *
 * @author Monique Chetty
 */
public class ReadingUserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 1;
        while (counter < 11) {
            System.out.print("Enter Number # " + counter+" : ");
            boolean hasNextInt = scanner.hasNextInt();
            
            if (hasNextInt) {
                counter++;
                int number = scanner.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();// handle end enter
            System.out.println(" Sum 1 to " + (counter -1)+ " = "+ sum);
        }
        
        scanner.close();

    }

    private static void Scanner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
