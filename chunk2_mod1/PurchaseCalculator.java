/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2_mod1;

import java.util.Scanner;

/**
 *
 * @author clang
 */
public class PurchaseCalculator {
   
    public static void main(String[] args){
        // we would ordinarily declare this constat in class scope
        // stay-tuned for next week's module
        double itemPrice = 100.00;
        double discount = 0.15;
        double limit;
        // create scanner
        Scanner inputMachine = new Scanner(System.in);
        
        // introduce price, ask for limit
        System.out.println("Hard-coded price value: $" + itemPrice);
        System.out.println("Enter your purchase limit and press enter (no $):");
        
        limit = inputMachine.nextDouble();
        
        // call method and pass in a double value as the declaration requires
        displayPriceWithTax(itemPrice);
        computePriceAfterDiscount(itemPrice, discount);
        displayPurchaseableNumber(itemPrice, limit);
    } // close method main
    
    public static void displayPriceWithTax(double price){
        // this would normally be in class scope (not inside any method)
        final double TAX_RATE = 0.075;
        // compute price + tax
        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice);
    } // close method displayPriceWithTax
    
    public static void computePriceAfterDiscount(double price, double discount){
        double finalPrice = price - (price * discount);
        System.out.println("Price after discount: $" + finalPrice);
    } // close method
    
    public static void displayPurchaseableNumber(double price, double limit){
        int numPurchaseable = (int) Math.floor(limit/price);
        System.out.println("The limit of $" + limit + " allows a purchase of " + numPurchaseable + " items");
    }
}
