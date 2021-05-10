/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk3_mod1;

/**
 *
 * @author clang
 */
public class Donut_Refactored {
    
    // member variables
    int percentage = 100;
    public String name;
    
    public void simulateEating(int biteSize){
        //System.out.println("Inside simulateEating method!");
        percentage = percentage - biteSize;
    }
    
    public int getPercRemaining(){
        //System.out.println("Inside getPercRemaining method!");
        return percentage;
    }
}
