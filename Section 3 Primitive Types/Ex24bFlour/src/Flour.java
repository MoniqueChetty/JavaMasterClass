/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import FlourPacker.canPack;
/**
 *
 * @author Monique Chetty
 */
public class Flour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        canPack(1, 0, 4); //should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
        System.out.println("canPack (1, 0, 4); //should return false = " + canPack(1, 0, 4));
        canPack(1, 0, 5); //should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
        System.out.println("canPack (1, 0, 5); //should return true = " + canPack(1, 0, 5));
        canPack(0, 5, 4); //should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
        System.out.println("canPack (0, 5, 4); //should return true = " + canPack(0, 5, 4));
        canPack(2, 2, 11); //should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos. 
        System.out.println("canPack (2, 2, 11); //should return true = " + canPack(2, 2, 11));
        canPack(-3, 2, 12); //should return false since bigCount is negative.
        System.out.println("canPack (-3, 2, 12); //should return false = " + canPack(-3, 2, 12));
        System.out.println("canPack (0, 5, 5); //should return true = " + canPack(0, 5, 5));
        System.out.println("canPack (2, 1, 5); //should return true = " + canPack(2, 1, 5));
        System.out.println("canPack (2, 2, 12); //should return true = " + canPack(2, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigCountK = bigCount * 5;
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) //negitive values
        {
            return false;
        }
        if (smallCount >= goal) {
            return true;
        }
        if ((bigCountK + smallCount) >= goal) {
            if ((smallCount == 0) && (goal % 5 == 0) && (bigCountK >= goal)) {
                return true;
            }else if (smallCount >= goal % 5 ){
                return true;
            }
        }
        return false;
    }

}
