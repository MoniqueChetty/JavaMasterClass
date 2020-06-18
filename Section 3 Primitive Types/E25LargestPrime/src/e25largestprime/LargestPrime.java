/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e25largestprime;

/**
 *
 * @author Monique Chetty
 */
public class LargestPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Largest prime 21:7 =  " + getLargestPrime(21));
        System.out.println("Largest prime 217:31 =  " + getLargestPrime(217));
        System.out.println("Largest prime 0:-1 = " + getLargestPrime(0));
        System.out.println("Largest prime 45:5 = " + getLargestPrime(45));
        System.out.println("Largest prime -1:-1 = " + getLargestPrime(-1));
        System.out.println("Largest prime 15:5 = " + getLargestPrime(15));
        System.out.println("Largest prime 7:7 = " + getLargestPrime(7));
        System.out.println("Largest prime 16:2 = " + getLargestPrime(16));
    }

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }
        int prime = 2;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                prime = i;
            }
        }
        for (int j = prime; j > 1; j--) {
            if (prime % j == 0) {
                prime = j;
            }
        }
        return prime;
    }

}
