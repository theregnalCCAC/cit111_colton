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
public class SpeedEnforcement {
    public static void main(String [] args){
        // introduce final doubles for maximum and minimum speeds
        final double MAX_SPEED = 40.0;
        final double MIN_SPEED = 55.0;
        
        // create variable for user's speed
       double userSpeed;
       
        // create scanner object for userSpeed
        Scanner speedTrap = new Scanner(System.in);
        
        // ask for user's speed
        System.out.println("Enter the vehicles speed below and press enter");
        
        // use speedTrap to store in userSpeed
        userSpeed = speedTrap.nextDouble();
        
        // Create nested if statement structure
        if(userSpeed < MIN_SPEED){
            System.out.println("You are going too slow, enjoy the ticket");   
        } else if(userSpeed > MAX_SPEED){
            System.out.println("You are going too fast, enjoy the ticket");
            } else {
                System.out.println("You are going " + userSpeed + "mph, please continue safely");
        }
        
    }
}
