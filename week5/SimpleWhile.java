/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author clang
 */
public class SimpleWhile {
    public static void main(String[] args) {
        int numLoops = 0;
        
        // while()- controlled blocks
        while(numLoops <= 10){
            numLoops = numLoops + 1;
            System.out.println("The value of numLoops: " + numLoops);
        } // close while
    } // close main 
} // close class
