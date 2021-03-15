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
public class WhileWithScanner {
    public static void main(String[] args) {
        
        int numLoops = 0;
        int loopControl;
        String loopPhrase;
        // build a scanner object
        Scanner inputMachine = new Scanner(System.in);
        // pront user and get an int from them
        System.out.println("How many loops shall I print?");
        loopControl = inputMachine.nextInt();
        System.out.println("What should I say in the loop");
        
        loopPhrase = inputMachine.nextLine();
        
        System.out.println("I shall repeat " + loopPhrase + " " + loopControl + " times");
        // loop as long as numLoops is less than or equal to our loopControl
        while(numLoops <= loopControl){
            System.out.println(loopPhrase);
            numLoops = numLoops + 1;
        } // close while
        
        System.out.println("... After the while loop");
        
    } // close main 
    
} // close class
