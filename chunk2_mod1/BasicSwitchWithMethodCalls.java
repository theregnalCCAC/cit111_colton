/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2_mod1;

import static chunk2_mod1.SimpleMethod.generateBigNumber;
import static chunk2_mod1.SimpleMethod.printStatement;
import java.util.Scanner;

/**
 *
 * @author clang
 */
public class BasicSwitchWithMethodCalls {
    public static void main(String [] args){
        int selector;
        // create scanner
        Scanner inputMachine = new Scanner(System.in);
        
        // Ask for Input
        System.out.println("****** switches and methods ******");
        System.out.println("Options: ");
        System.out.println("1 - Print a special statement");
        System.out.println("2 - Generate a really big random number");
        System.out.println("3 - Get me out of here!");
        System.out.println("Enter an int and press enter: ");
        
        // Assign Input to selector
        selector = inputMachine.nextInt();
        
        // Implement Switch
        switch(selector){
            case 1:
                printStatement();
                break;
            case 2:
                generateBigNumber();
                break;
            case 3:
                System.out.println("Welcome back to main");
                break;
            default:
                System.out.println("No offense but can you read?");
        }
    }
}
