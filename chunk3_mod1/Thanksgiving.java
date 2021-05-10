/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk3_mod1;

import java.util.Scanner;

/**
 *
 * @author clang
 */
public class Thanksgiving {
    public static void main(String [] args){
        final int GOBBLE = 5;
        final int GOBBLE_GOBBLE = 25;
        
        final int LITTLE_POUR = 10;
        final int BIG_POUR = 30;
        // introduce the first turkey named Recep
        Turkey firstTurkey;
        firstTurkey = new Turkey();
        firstTurkey.name = "Recep";
        
        // create scanner and ask if they like dark or light meat
        Scanner inputMachine = new Scanner(System.in);
        System.out.println("Do you like Light or Dark meat on your bird?"); 
        System.out.println("1 = light, 2 = dark, type any other number if you don't like turkey");
        int lightOrDark = inputMachine.nextInt();
        firstTurkey.typeOfMeat(lightOrDark);
        printTurkeyData(firstTurkey);
        
        if (firstTurkey.percRemaining > 0){
            System.out.println("Starting with a little gobble");
            firstTurkey.eatTurkey(GOBBLE);
            System.out.println("Big gobbles commencing");
            firstTurkey.eatTurkey(GOBBLE_GOBBLE);
            System.out.println("Gobble Gobble");
            firstTurkey.eatTurkey(GOBBLE_GOBBLE);
            System.out.println("Gobble Gobble");
        }
        System.out.println(" ");
        System.out.println("Moving on to Mashed Potatoes");
        System.out.println(" ");
        
        MashedPotatoes mp;
        mp = new MashedPotatoes();
        mp.name = "Antoine";
        printMashedPotatoesData(mp);
        
        // ask if they like butter or cheese on their potatoes
        System.out.println("Do you like cheese on your potatoes? (1 for yes, anything else for no)");
        int cheesyPotatoes = inputMachine.nextInt();
        
        if (cheesyPotatoes == 1){
            mp.containsCheese = true;
            System.out.println("Go ahead and sprinkle some cheese on there");
        } else{
            mp.containsCheese = false;
            System.out.println("It's not for everyone");
        }
        
        System.out.println("Do you like butter on your potatoes? (1 for yes, anything else for no)");
        int butteryPotatoes = inputMachine.nextInt();
        
        if (butteryPotatoes == 1){
            mp.containsButter = true;
            System.out.println("Mix in that butter!");
        } else{
            mp.containsButter = false;
            System.out.println("There is too much of a good thing");
        }
        
        mp.antiVeganPotatoes();
        
        // introduce the gravy
        
        System.out.println("Lets get some gravy on here");
        
        Gravy g;
        g = new Gravy();
        g.name = "Yung Gravy";
        printGravyData(g);
        
        System.out.println("Pouring a little on the turkey");
        g.usedGravy(LITTLE_POUR);
        System.out.println("Pouring a lot on the potatoes");
        g.usedGravy(BIG_POUR);
        g.usedGravy(BIG_POUR);
        
        System.out.println("FINAL STATS");
        System.out.println("-----------------------------------------------");
        printTurkeyData(firstTurkey);
        System.out.println("-----------------------------------------------");
        printMashedPotatoesData(mp);
        System.out.println("-----------------------------------------------");
        printGravyData(g);
        
        
    }
    
     private static void printTurkeyData(Turkey input){
        System.out.println("|--------STATS--------|");
        System.out.println("| LOADING Turkey.java...");
        System.out.println("| Name: " + input.name);
        System.out.println("| PercRemaining: " + input.getPercRemaining());
        System.out.println("|---------------------|");
    }
     private static void printMashedPotatoesData(MashedPotatoes input){
        System.out.println("|--------STATS--------|");
        System.out.println("| LOADING MashedPotates.java");
        System.out.println("| Name: " + input.name);
        System.out.println("| PercRemaining: " + input.getPercRemaining());
        System.out.println("|---------------------|");
    }
    
     private static void printGravyData(Gravy input){
        System.out.println("|--------STATS--------|");
        System.out.println("| Name: " + input.name);
        System.out.println("| PercRemaining: " + input.getPercRemaining());
        System.out.println("|---------------------|");
    }
     
}
