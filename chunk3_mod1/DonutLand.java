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
public class DonutLand {
    public static void main(String [] args){
        final int FIRST_BITE_SIZE = 12;
        
        Donut firstDonut;
        
        firstDonut = new Donut();
        
        firstDonut.name = "Chloe";
        
        System.out.println("When first created, " + firstDonut.name + "'s\n"
                + "percent remaining is" + firstDonut.getPercRemaining());
        
        printDivider();
        
        // call a method simulateEating on our firstDonut object and pass
        // in the int variable firstBiteSize as a parameter
        firstDonut.simulateEating(FIRST_BITE_SIZE);
        
        System.out.println("After being eaten, " + firstDonut.name + "'s\n"
                + "percent remaining is " + firstDonut.getPercRemaining());
    }
    
    private static void printDivider(){
        System.out.println("..........................................");
        
    }
    
}
