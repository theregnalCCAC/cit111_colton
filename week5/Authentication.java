/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author clang
 */
public class Authentication {
    public static void main(String [] args) {
        // initialized and store variables
        final int MAX_FAILED_ATTEMPTS = 5;
        int failedAttempts = 0;
        final String USERNAME = "javaghost";
        final String PASSWORD = "ic0d3";
        String usernameInput;
        String passwordInput;
        
        // create scanner
        Scanner userInput = new Scanner(System.in);
        
        // while loop
        while(failedAttempts < MAX_FAILED_ATTEMPTS) {
            // ask for user input
            System.out.println("Please input username below: ");
            
            // store to usernameInput
            usernameInput = userInput.nextLine();
            
            // create if statement
            if (USERNAME.equals(usernameInput)){
                // continue on to password
                System.out.println("Please input password below: ");
                passwordInput = userInput.nextLine();
                
                if (PASSWORD.equals(passwordInput)){
                    System.out.println("Access Granted");
                    System.out.println("The atomic number of Zinc is 30");
                    break;
                } else {
                    // incorrect password
                    failedAttempts = failedAttempts + 1;
                     System.out.println("Sorry, incorrect password please try again");
                     System.out.println("You have " + (MAX_FAILED_ATTEMPTS - failedAttempts) + " attempts left");  
                }
            } else {
                // incorrect username
                failedAttempts = failedAttempts + 1;
                System.out.println("Sorry, incorrect username please try again");
                System.out.println("You have " + (MAX_FAILED_ATTEMPTS - failedAttempts) + " attempts left");
            } // close else
        } // close while() loop
        
        
    }// close main  
}// close class
