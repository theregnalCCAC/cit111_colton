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
public class MashedPotatoes {
    public int percRemaining = 100;
    public String name;
    public boolean containsButter;
    public boolean containsCheese;
    
    public void eatPotatoes(int percEaten){
        percRemaining = percRemaining-percEaten;
    }
    
     public int getPercRemaining(){
        return percRemaining;
    }
    
    public void antiVeganPotatoes(){
        if (containsButter == true || containsCheese == true){
            System.out.println("You must not be vegan");
        } else {
            System.out.println("Enjoy your ethical potatoes!");
        }
    }
}
