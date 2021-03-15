/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author clang
 */
public class UsernameAndPassword {
    public static void main(String [] args){
        // initialize final strings; store correct codes
        final String USERNAME = "javaghost";
        final String PASSWORD = "ic0d3";
        
        // create container for user input
        String usernameInput;
        String passwordInput;
        
        // create a scanner object
        Scanner inputMachine = new Scanner(System.in);
        
        // ask for username
        System.out.println("Enter your username followed by enter: ");
        usernameInput = inputMachine.next();
       
        // create first if statement
        if (!usernameInput.equals(USERNAME)){
            System.out.println("Failure to autheticate! Invalid username");
        } else {
            System.out.println("Please enter your password followed by enter: ");
            passwordInput = inputMachine.next();
            
            // create nested if statement
            if (passwordInput.equals(PASSWORD)){
                System.out.println("Authetication Successful! You have logged into nothing!");
                
            } else {
                System.out.println("Failure to authenticate! Invalid password");
            }
        }
        
    } // close main
} // close class
