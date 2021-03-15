/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 * Program asks user a series of questions about their interests
 * and computes an overall friend compatibility score
 * their responses
 * @author clang
 */
public class DinoFriends {
    public static void main(String [] notUsed){
        
        // init variables
        final int COMPAT_THRESHOLD = 45;
        int compatScore = 0;
        int userResponse = 0;
        boolean passedFThreshold = false; // not used in v.1
        
        // Fixed point allotments by question
        final int Q1_YES_POINTS = 30;
        final int Q1_NO_POINTS = -50;
        
        // Create Scanner
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Hello, I'm Owen Grady: Let's see if we might be friends.");
        System.out.println("Please answer the following questions truthfully");
        
        // **********************************************************************
        // QUESTION 1: Chasing Dinos
        // **********************************************************************
        
        System.out.println("Do you enjoy ridding motorcycles through the jungle"
                + "" 
                + "with a pack of Raptors? Enter for 1 for yes, 0 for no.");
        
        // use scanner to read input into userResponse
        userResponse = inputScanner.nextInt();
        
        if(userResponse == 1){
            // This block will contain nested logic 
            // only run if user is a motorcycle rider
            
            // add 30 to compatScore
            compatScore = (compatScore + Q1_YES_POINTS);
            System.out.println("Great, lets go find those raptors");
            
            // **********************************************************************
            // QUESTION 2: bike type
            // **********************************************************************
            
            System.out.println("Q2: Choose you're bike type:");
            System.out.println("1. Honda");
            System.out.println("2. Yamaha");
            System.out.println("3. Kawasaki");
            System.out.println("4. Ducati");
            System.out.println("5. Harley");
            System.out.println("6. Other");
            userResponse = inputScanner.nextInt();
            if (userResponse == 1){
                // Honda
                compatScore = (compatScore + 70);
            } else if (userResponse == 2){
                // Yamaha
                compatScore = (compatScore + 60);
            } else if (userResponse == 3){
                // Kawasaki
                compatScore = (compatScore + 50);
            } else if (userResponse == 4){
                // Ducati
                compatScore = (compatScore + 40);
            } else if (userResponse == 5){
                // Harley
                compatScore = (compatScore + 80);
            } else {
                // Other
                compatScore = (compatScore + 20);   
            }
            
        } else { // use this block runs if user entered not 1
            compatScore = compatScore +Q1_NO_POINTS;
            System.out.println("Oh, shame, you're too risk adverse for me");
        } // close q1 if/else
        
        // this logic will run regardless of previous question's answers
        System.out.println("Checking friend compatibility...");
        if(compatScore >= COMPAT_THRESHOLD){
           System.out.println("Hey new friend lets ride sometime :)");
        } else {
            System.out.println("I'm sure you're a nice person "
                    + " "
                    + "It's not you, it's me");
        }
        
        
    }
}// close class DinoFriends
