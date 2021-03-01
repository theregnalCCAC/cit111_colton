/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk1Project;

import java.util.Scanner;

/**
 *
 * @author clang
 */
public class MightWeBeFriends {
    public static void main(String [] args){
        
        // init variables
        final int COMPAT_THRESHOLD;
        int compatScore = 0;
        int userResponse = 0;
        boolean passedFThreshold = false;
        
        // introduce the test
        System.out.println("**********************");
        System.out.println("Welcome to the Friend Tester Mk. 1");
        System.out.println("You're current compatibility score is: " + compatScore);
        
        // Create Scanner
        Scanner userInput = new Scanner(System.in);
        
        // Do they play golf
        System.out.println("Q1: Do you play golf? (0 = no, 1 = yes)");
        userResponse = userInput.nextInt();
        
        // If Statement
        if (userResponse == 0){
            System.out.println("Oh. I'm sure you save some money that way");
            compatScore = compatScore - 15;
            System.out.println("You're current compatibility score is: " + compatScore);
            
        } else {
            System.out.println("Great, we should play sometime");
             compatScore = compatScore + 20;
            System.out.println("You're current compatibility score is: " + compatScore);
             
        }
        System.out.println(" ");
        
        // Do you play Video Games
        System.out.println("Q2: Do you play video games with the boys?");
        userResponse = userInput.nextInt();
        
        // If Statement 2
        if (userResponse == 0){
            compatScore = compatScore - 5;
            System.out.println("That's ok, it's not for everyone");
            System.out.println("You're current compatibility score is: " + compatScore);
            
        } else {
            compatScore = compatScore + 10;
            System.out.println("That's cool bro, hop on discord sometime");
            System.out.println("You're current compatibility score is: " + compatScore);
            
        }
        System.out.println(" ");
        
        // Which Music Genre is you're favorite
        System.out.println("Q3: Which Music Genre is you're favorite?");
        
        System.out.println("Rock = 1"); // + 40
        System.out.println("Country = 2"); // + 10
        System.out.println("Rap = 3"); // + 25
        System.out.println("Pop = 4"); // - 5
        System.out.println("Metal = 5"); // -5
        System.out.println("Jazz = 6"); // -15
        System.out.println("Other = 7"); // + 0
        
        userResponse = userInput.nextInt();
        
        // if statements
         if (userResponse == 1){
                // Rock
                compatScore = (compatScore + 40);
            } else if (userResponse == 2){
                // Country
                compatScore = (compatScore + 10);
            } else if (userResponse == 3){
                // Rap
                compatScore = (compatScore + 25);
            } else if (userResponse == 4){
                // Pop
                compatScore = (compatScore - 5);
            } else if (userResponse == 5){
                // Metal
                compatScore = (compatScore - 5);
            } else if (userResponse == 6) {
                // Jazz
                compatScore = (compatScore - 15);   
            } else {
                compatScore = (compatScore + 0);
            }
         
         // Print out current Score
         System.out.println("You're current compatibility score is: " + compatScore);
         System.out.println(" ");
         System.out.println("Checking final Compatibility...");
         System.out.println(" ");
         System.out.println("******************************");
         
         // Check Score
         if (compatScore >= 30){
             System.out.println("OUTCOME SUCCESSFUL");
             System.out.println("******************************");
             System.out.println(" ");
             System.out.println("Hey we seem pretty compatible");
             System.out.println("Maybe we should hangout sometime");
         } else {
             System.out.println("OUTCOME UNSUCCESSFUL");
             System.out.println("******************************");
             System.out.println(" ");
             System.out.println("Sorry, it's you not me");
             System.out.println("Maybe find someone else to hangout with");
         }
        
    } // close main
    
} // close class
