/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2_mod1;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author clang
 */
public class MysteryDoors {
    public static void main(String[] args){
        int selector;
        // create scanner
        Scanner doorOpener = new Scanner(System.in);
        
        // introduce the Monty Hill Problem
        System.out.println("WELCOME TO THE GAME OF THE CENTURY");
        System.out.println("-------GRAND PRIZE OR GOATS-------");
        System.out.println(" ");
        System.out.println("******    ******    ******");
        System.out.println("*    *    *    *    *    *");
        System.out.println("*  1 *    *  2 *    *  3 *");
        System.out.println("*    *    *    *    *    *");
        System.out.println("******    ******    ******");
        System.out.println(" ");
        System.out.println("Enter the ONE DOOR number you'd like to open - 1, 2, or 3:");
        
        // ask for input
        selector = doorOpener.nextInt();
        
        // create a switch
        switch(selector){
            case 1:
                wrongDoor();
                break;
            case 2:
                theMathDoor();
                break;
            case 3:
                rightDoor();
                break;
            default:
                System.out.println("Oh thats the emergency exit");
                System.out.println("Goodbye");
                break;
        }
        
        
        
    }
    public static void wrongDoor(){
        System.out.println("Aww... Better luck next time");
        System.out.println("Enjoy the new goat");
    } // end of wrongDoor()
    public static void rightDoor(){ // this method is going to involve a random number
        Random r = new Random();
        BigInteger randomCashAmount = new BigInteger(20, r);
        
        System.out.println("Congrats! You've won $" + randomCashAmount + "... and a goat");
        System.out.println("Congrats, thanks for playing");
    }
    public static void theMathDoor(){// this method asks the user to finish a math problem using an if else statement
        // introduce ints
        int goatCost = ((17+23+45)*25);
        int userInput;
        // create scanner and input
        Scanner mathInput = new Scanner(System.in);
        
        // explain the problem and ask for input
        System.out.println("********************************************************************************");
        System.out.println(" ");
        System.out.println("Oh no! You've opened up the math door, get ready for some pretty difficult arithmetic!");
        System.out.println("As everyone knows, goats cost about $25 a month");
        System.out.println("If I have 17 goats in this studio, 23 at home, and 45 at a farm, how much must I pay a month?");
        System.out.println("PLEASE ENTER YOUR ANSWER WITHOUT A $");
        userInput = mathInput.nextInt();
        // create if else statement
        if (goatCost == userInput){
            System.out.println("You are correct! you have now earned $" + goatCost);
            System.out.println("You should be able to support this new goat for 85 months!");
        } else {
            System.out.println("Sorry, math might not be your strong suit");
            System.out.println("I have 2-1 goats for you");
        }
    }
}
