/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex26diagonalstar;

/**
 *
 * @author Monique Chetty
 */
public class DiagonalStar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("print 5");
        printSquareStar(5);
        System.out.println("");
        System.out.println("print 8");
        printSquareStar(8);
        
    }
    public static void printSquareStar(int number){
        if (number<5){
            System.out.println("Invalid Value");
        }else{
        
            int row =1;
            int column = 1;
            for(row = 1; row<=number; row++){
                for(column = 1; column<=number;column++){
                    if(((row==1)||(row==number)||(column==1)||(column==number)||(column==row))||(column==(number-row+1))){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }                       
                }
                System.out.println("");
            } 
        }
    }  
    
}
