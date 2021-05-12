/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_project;

import java.util.Random;

/**
 *
 * @author clang
 */
public class Dice {
    
    // public member variables
    public String name;
    
    // private member variables
    private int topFace;
    private int sides;
    
    public int rollDice(int max){
        // create a random object that can be used for rolling the dice
        Random rn = new Random();
        // set the top face of the die equal to a range of the number of sides with this equation
        topFace = rn.nextInt(max-1) + 1;
        // send the int back to the main() method
        return topFace;
    }
    
    
}
