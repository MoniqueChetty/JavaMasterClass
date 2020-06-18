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
public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number >= 0){
            int firstNum = number;
            int lastNum = number;
            int original = number;
            while (original >= 10) {
                firstNum = original/10;
                original /=10;
            }
            if (number>=10){
                lastNum = number%10;
            }
            return (firstNum + lastNum);
        
        }else
            return -1;
    }
}
    
 //        StringBuilder pal = new StringBuilder();
//        int original = number;
//        while (number >0){
//            pal.append(number%10);
//            number/=10;
//            System.out.println("Pal is: " + pal);
//            System.out.println("Number is: " + number);
//        }
//        int palInt = Integer.parseInt(pal.toString());
//        System.out.println("PalInt: "+ palInt);
//        int[] numarr = pal.;
//        
//        System.out.println("" + number[3]);
//        return palInt == original;
//    }


    
//        if (number > 0) {
//            StringBuilder sb = new StringBuilder();
//            StringBuilder sb2 = new StringBuilder();
//            StringBuilder sb3 = new StringBuilder();
//            sb.append(number);
//            sb2.append(sb.charAt(0));
//            sb3.append(sb.charAt(sb.length()-1));
//            
//            int firstnum = Integer.parseInt(sb2.toString());
//            int lastnum = Integer.parseInt(sb3.toString());
//            
//            System.out.println("sb: "+ sb);
//            System.out.println("b: "+ sb2);
//            System.out.println("c: "+ sb3);
//            System.out.println("1st: "+ firstnum);
//            System.out.println("last: "+ lastnum);
//            return ( firstnum + lastnum);
//            //return 1;
//        }else
//            return -1;
//    }
