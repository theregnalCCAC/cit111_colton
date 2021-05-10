/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk3_mod1;

/**
 *
 * @author clang
 */
public class DonutLand_Refactored {
    public static void main(String [] args){
        final int FIRST_BITE_SIZE = 12;
        final int NIBBLE = 5;
        final int MEGABITE = 45;
        // "Chloe"
        Donut_Refactored firstDonut;
        firstDonut = new Donut_Refactored();
        firstDonut.name = "Chloe";
        printObjectData(firstDonut);
        
        // "Crusoe"
        Donut_Refactored secondDonut;
        secondDonut = new Donut_Refactored();
        secondDonut.name = "Crusoe";
        printObjectData(secondDonut);
        
        
        // Eating Chloe
        System.out.println("Eating Chloe");
        System.out.println("Nibble...");
        firstDonut.simulateEating(NIBBLE);
        System.out.println("Nibble...");
        firstDonut.simulateEating(NIBBLE);
        System.out.println("Taking a megaBite...");
        firstDonut.simulateEating(MEGABITE);
        printObjectData(firstDonut);
        
        // Eating Crusoe
        System.out.println("Eating Crusoe");
        System.out.println("Taking lots of megaBites");
        
        int numCalls = 10;
        for(int i = 0; i < numCalls; i++){
            System.out.println("gnam gnam");
            secondDonut.simulateEating(MEGABITE);
        }
        
        printObjectData(secondDonut);
        
    }
    
    private static void printObjectData(Donut_Refactored input){
        System.out.println("|--------STATS--------|");
        System.out.println("| Name: " + input.name);
        System.out.println("| PercRemaining: " + input.getPercRemaining());
        System.out.println("|---------------------|");
        
    }
    
}
