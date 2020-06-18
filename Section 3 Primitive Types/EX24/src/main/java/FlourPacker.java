/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Monique Chetty
 */
public class FlourPacker {
    public static canPack (int bigCount; int smallCount; int goal){
        if (bigCount<0 ||smallCount<0||int goal<0){
            return false;
        }
        if (((bigCount*5)+smallCount)>= goal){
            if ((((bigCount*5)+smallCount)==goal) &&(bigCount * 5<=goal){
                return true;
            }else {return false;}
            }
        else{
         return false;
        }
    }
  
}
