/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_project;

import java.util.Scanner;

/**
 *
 * @author clang
 */
public class ChanceLand {
    public static void main(String [] args){
        // Introduce the people to ChanceLand
        introduction();
        // create a scanner
        Scanner mainScanner = new Scanner(System.in);
        
        // ask how they would like their random chance to be generated
        whileLoop();
        
        
    }
    
    // The main method methods
    // TMMM1
   public static void introduction(){
       System.out.println("-----------------------------");
       System.out.println("|***************************|");
       System.out.println("|** WELCOME TO CHANCELAND **|");
       System.out.println("|***************************|");
       System.out.println(" ");
   }
   // TMMM1
   public static void whileLoop(){
       boolean choice = true;
       while (choice == true){
        System.out.println("Please select an option below:");
        System.out.println(" ");
        System.out.println("1- Roll a number of dice");
        System.out.println("2- Flip a number of coins");
        System.out.println("If you would like to exit, press any other number");
        // create scanner for whileLoop()
        Scanner whileLoopChoice = new Scanner(System.in);
        int selection = whileLoopChoice.nextInt();
        
        // use a switch
            switch(selection){
                case 1:
                    //send them to roll some dice
                    diceRolling();
                    break;
                case 2: 
                    // send them to flip some coins
                    coinFlipping();
                    break;
                default:
                    System.out.println("Thank you for visiting Chance Land");
                    choice = false;
                    break;
            }
        
       }
   }
   
    // The Dice Zone
    public static void diceRolling(){
        
        int dn;
        int sn;

        
        Dice [] diceArray;
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        // ask how many dice they would like
        System.out.println("How many dice would you like to roll");
        dn = input.nextInt();        
        // how many sides of the dice are there?
        System.out.println("How many sides of the dice are there?");
        sn = input.nextInt();
        diceArray = multipleObjectLoop(dn, sn);
        
        // lets see the results
        printDiceArray(diceArray);
        
    }
    
    public static Dice[] multipleObjectLoop(int numDice, int sn){   
        
        // used https://coderanch.com/t/628589/java/create-objects-loop#:~:text=You%20CAN%20use%20a%20loop,index%20into%20the%20array...
        // to find a neater way to code this object
        // start with dice and use an array
        Dice [] myDice = new Dice[numDice];
        
        for(int i = 0; i < numDice; i=i+1){
            // use loop to create array
            myDice[i] = new Dice();
            myDice[i].rollDice(sn);
        }
        return myDice;
       
    }
    
   public static void printDiceArray(Dice [] myDice) {
        System.out.println("****** The Dice ******");
        System.out.println(" ");
        System.out.println("********ROLLING DICE********");
        System.out.println("*    Come on big money!    *");
        System.out.println("****************************");
        for (int i = 0; i < myDice.length; i=i+1){
            
           System.out.println("Dice #" + (i+1) + " rolled a " + myDice[i].topFace);
       
        }
        System.out.println("****************************");
        int total = totalDice(myDice);
        double avg = averageDice(myDice);
        avg = Math.round(avg * 100.0) / 100.0;
        
        System.out.println("The sum of all the dice equals " + total);
        System.out.println("The average of all the dice equals " + avg);
        System.out.println("****************************");
        
    }
   
   public static int totalDice(Dice [] myDice){
       int total = 0;
       for (int i = 0; i < myDice.length; i=i+1){
           total = total + myDice[i].topFace;
       }
       return total;
   }
   
   public static double averageDice(Dice [] myDice){
       double avg = 0;
       for (int i = 0; i < myDice.length; i = i+1){
           avg = avg + myDice[i].topFace;
       }
       avg = (avg/myDice.length);
       return avg;
   }
   
   // The Coin Zone
   public static void coinFlipping(){
       // introduce variables, objects, and scanners
       int cn;
       Coin [] myCoins;
       Scanner input = new Scanner(System.in);
       
       // Ask how many coins they would like to flip
       System.out.println("How many coins would you like to flip");
       cn = input.nextInt();
       // run the coinLoop()
       myCoins = coinLoop(cn);
       
       // see the results
       coinResult(myCoins);
   }
   
   public static Coin [] coinLoop(int cn){
       Coin [] myCoins = new Coin[cn];
       
       for (int i = 0; i < cn; i = i+1){
           myCoins[i] = new Coin();
           myCoins[i].flipCoin();
       }
       return myCoins;
   }
   
   public static void coinResult(Coin [] myCoins){
       // create a scanner
       Scanner input = new Scanner(System.in);
       
       System.out.println("****** The Coins ******");
       System.out.println(" ");
       System.out.println("***********************");
       System.out.println("*****FLIPPING COINS****");
       System.out.println("***********************");
       if (myCoins.length > 10){
           System.out.println("WARNING: There are " + myCoins.length + " coins being flipped and can cause clutter");
           System.out.println("Would you like to see the indiviual results? (1 = yes, 0 = no)");
           int ui = input.nextInt();
           if (ui == 1){
               printCoinArray(myCoins);
           } else {
               System.out.println("Continuing on to final results");
           }
       } else {
           printCoinArray(myCoins);
       }
       
        coinTotals(myCoins);
   }
   
   public static void printCoinArray(Coin [] myCoins){
      for (int i = 0; i < myCoins.length; i = i+1){
          int side = myCoins[i].topFace;
          String face;
          switch (side) {
              case 0:
                  face = "Heads";
                  break;
              case 1:
                  face = "Tails";
                  break;
              default:
                  // This is an error message to be displayed if there is something wrong with the random
                  face = "ERROR";
                  break;
          }
          System.out.println("Coin #" + (i+1) + " landed on " + face);
      } 
   }
   
   public static void coinTotals(Coin [] myCoins){
       int heads = 0;
       int tails = 0;
       for (int i = 0; i < myCoins.length; i = i+1){
           int side = myCoins[i].topFace;
           switch (side) {
               case 0:
                   heads = heads + 1;
                   break;
               case 1: 
                   tails = tails + 1;
               default:
                   break;
           }
       }
       
       System.out.println("Total lands on heads: " + heads);
       System.out.println("Total lands on tails: " + tails);
       
   } // close method

}// close class
