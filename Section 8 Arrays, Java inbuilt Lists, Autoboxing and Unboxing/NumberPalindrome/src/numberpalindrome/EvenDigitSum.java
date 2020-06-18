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
public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number<0){
            return -1;
        }else{
            int sum = 0;
            int original = number;
            while (original >0){
            int lastNum = original%10;
                if (lastNum % 2==0){
                    sum += lastNum;
                }
                original/=10;
            }
        return sum;
        }
    }
    
    
}
