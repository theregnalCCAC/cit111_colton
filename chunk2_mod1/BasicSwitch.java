/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2_mod1;

/**
 *
 * @author clang
 */
public class BasicSwitch {
    public static void main(String[] args) {
        // a hard-coded value to test switch functionality
        final int SELECTOR = 1;
        
        // match the value of SELECTOR to a case's value and execute the code
        // in that case until a break; is encoutered
        if(SELECTOR== 1){
                System.out.println("First case selected");
        } else if(SELECTOR == 2){
                System.out.println("Second case selected");
        } else if(SELECTOR == 78) {
                System.out.println("Cases can match any int value");
        } else {
                System.out.println("Default case");
        } // close switching block
    } // close main
} // close class
