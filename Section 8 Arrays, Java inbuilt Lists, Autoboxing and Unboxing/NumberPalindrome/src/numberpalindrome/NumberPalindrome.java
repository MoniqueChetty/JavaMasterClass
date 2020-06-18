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
public class NumberPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("reverse number: " + reverse(1230));
         numberToWords(11);
    }

    public static void isPalindrome(int number) {
        System.out.println("123");
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int rev = reverse(number);
        int digit = getDigitCount(number);
        for (int i = 0; i < digit; i++) {
            int lastDigit = rev % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            rev /= 10;
        }
    }

    public static int reverse(int number) {
        int rev = 0;
        while (number != 0) {
            rev  *= 10;
            rev+= number % 10; 
            number /= 10;
        }
        return rev;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int digit = 1;
        while (number > 9) {
            number /= 10;
            digit++;
        }
        System.out.println(" digits: " + digit);
        return digit;
    }
}
        //public static void numberToWords(int number){
//        if (number<0){
//            System.out.println("Invalid Value");
//        }else{
//            int rev = reverse (number);
//            int digits = getDigitCount(number);
//            int lastDigit = 0;
//            for(int i = 0; i< digits; i++)
//            lastDigit = rev%10;
//            switch (lastDigit){
//                case 0:
//                    System.out.println("Zero");
//                    break;
//                case 1:
//                    System.out.println("One");
//                    break;
//                case 2:
//                    System.out.println("Two");
//                    break;
//                case 3:
//                    System.out.println("Three");
//                    break;
//                case 4:
//                    System.out.println("Four");
//                    break;
//                case 5:
//                    System.out.println("Five");
//                    break;
//                case 6:
//                    System.out.println("Six");
//                    break;
//                case 7:
//                    System.out.println("Seven");
//                    break;
//                case 8:
//                    System.out.println("Eight");
//                    break;
//                case 9:
//                    System.out.println("Nine");
//                    break;
//            }
//            rev/=10;
//            }
//        }
//    }
//    public static int reverse(int rev){
//        int lastDigit = 0;
//        while(rev!=0){
//            lastDigit *= 10;
//            lastDigit += rev%10;
//            rev /=10;
//        }return lastDigit;
//    }
//    public static int getDigitCount(int number){
//        if(number <0){
//            return -1;
//        }else{
//            int a=0;
//            while (number>=10){
//                number /= 10;
//                a++;
//            }return ++a;
//            
//        }
//    }

