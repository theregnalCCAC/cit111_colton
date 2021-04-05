/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2_mod1;

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author clang
 */
public class SimpleMethod {
    public static void main(String[] args) {
        System.out.println("This code is inside method: main");
        // call the method printStatement, transferring execution to that block
        printStatement();

        System.out.println("...back in main");
        
        // call the same method again!
        generateBigNumber();
        System.out.println("...back in main");
        printStatement();

        
    } // close method main
    
    // illustration method that takes no parameters and returns nothing to the caller
    public static void printStatement(){
        System.out.println("*************INSIDE printStatement*************");
        System.out.println("Statement: Where There's a Will, There's a Way");
        System.out.println("**********************************************");
    } // close method printSpecialStatement
    
    public static void generateBigNumber(){
        // create a friendly random number generator
        Random r = new Random();
        // create an object to do math with huge numbers
        BigInteger bigInt = new BigInteger(100, r);
        // Display the randomly generated huge number
        System.out.println("***********INSIDE generateBigNumber***********");
        System.out.println(bigInt);
        System.out.println("**********************************************");
    } // close method generateBigNumber
    
} // close class
