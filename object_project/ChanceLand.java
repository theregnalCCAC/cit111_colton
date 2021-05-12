/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_project;

import java.util.Scanner;

/**
 *
 * @author clang
 */
public class ChanceLand {
    public static void main(String [] args){
        
        int dn;
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // ask how many dice they would like
        System.out.println("How many dice would you like to roll");
        dn = input.nextInt();
        multipleObjectLoop(dn);
        
    }
    
    public static void displayStats(){
        
    }
    
    public static void multipleObjectLoop(int objects){   
        
        // used https://coderanch.com/t/628589/java/create-objects-loop#:~:text=You%20CAN%20use%20a%20loop,index%20into%20the%20array...
        // to find a neater way to code this object
        // start with dice and use an array
        Dice [] myDice = new Dice[objects];
        
        for(int i = 0; i <= objects; i=i+1){
            // use loop to create array
            myDice[i] = new Dice();
        }
        printDiceArray(myDice);
    }
    
    public static void printDiceArray(Dice [] myDice){
        System.out.println("****** The Dice ******");
        for (int i = 0; i < myDice.length; i=i+1){
            System.out.println("Dice #" + i + " rolled a " + myDice[i]);
        }
    }
}
