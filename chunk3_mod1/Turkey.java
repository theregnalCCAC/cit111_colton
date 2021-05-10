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
public class Turkey {
    public int percRemaining = 100;
    public String name;
    
    public void eatTurkey(int biteSize){
        percRemaining = percRemaining - biteSize;
    }
    
    public int getPercRemaining(){
        return percRemaining;
    }
    
    public void typeOfMeat(int meatPreference){
        if (meatPreference == 1){
            System.out.println("NOW ONLY EATING LIGHT MEAT");
        } else if (meatPreference == 2){
            System.out.println("NOW ONLY EATING DARK MEAT");
        } else {
            System.out.println("TURKEY MUST BE DESTROYED");
            percRemaining = 0;
            System.out.println("THERE IS NOW " + percRemaining + " TURKEY REMAINING");
        }
    }
    
}
