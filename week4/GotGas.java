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
public class GotGas {
    public static void main(String [] args){
        
        // init variables
        double carGas;
        double milesForGas;
        
        // Create Scanner Obj
        Scanner userInput = new Scanner(System.in);
        
        // Ask for carGas + store
        System.out.println("Please enter the number of gallons in your tank");
        carGas = userInput.nextDouble();
        
        // Ask for milesForGas + store
        System.out.println("Please enter the number of miles to the gas station");
        milesForGas = userInput.nextDouble();
        
        // Multiply carGas by 28
        carGas = carGas * 28;
        
        // if statement
        if (carGas >= milesForGas){
            System.out.println("Whew! You'll make it to the next station!");
        } else {
            System.out.println("Red Alert! You'll be marooned.");
        }
    }
    
}
