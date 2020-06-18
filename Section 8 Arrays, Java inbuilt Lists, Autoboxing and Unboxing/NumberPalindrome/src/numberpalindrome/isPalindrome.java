/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberpalindrome;

/**
 *
 * @author Sales
 */
public class isPalindrome {
    //public class NumberPalindrome {
    
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int original = number;
        while (original !=0){
            reverse *=10;
            int lastnum = original%10;
            reverse += lastnum;
            original/=10;
        }
        return reverse == number;
    }
}
    

