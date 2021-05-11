/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk3_mod4;

import java.util.Scanner;

/**
 *
 * @author clang
 */
public class CarLand {
    public static void main(String [] args){
        // create scanner
        Scanner input = new Scanner(System.in);
        
        Car deLorean = new Car();
        deLorean.year = 1983;
        deLorean.makeModel = "DeLorean DMC-12";
        
        displayCarStats(deLorean);
        
        deLorean.startEngine();
        System.out.println("What year would you like to travel to?");
        deLorean.ttYear = input.nextInt();
        deLorean.accelerate(88);
        System.out.println("You are now in the year " + deLorean.fluxCapacity);
        deLorean.decelerate(12);
        
        displayCarStats(deLorean);
        deLorean.stopEngine();
        displayCarStats(deLorean);
        
        
        // George McFly's beamer
        
        Car beamer = new Car();
        beamer.year = 1985;
        beamer.makeModel = "BMW 733i";
        
        displayCarStats(beamer);
        
        beamer.startEngine();
        beamer.accelerate(100);
        beamer.decelerate(40);
        
        displayCarStats(beamer);
        beamer.decelerate(60);
        beamer.stopEngine();
        displayCarStats(beamer);
        
        
        // Marty's toyota
        
        Car toyota = new Car();
        toyota.year = 1985;
        toyota.makeModel = "Toyota Hi-Lux Pickup";
        
        displayCarStats(toyota);
        
        toyota.startEngine();
        toyota.accelerate(45);
        displayCarStats(toyota);
        
        toyota.accelerate(40);
        toyota.decelerate(100);
        displayCarStats(toyota);
        
        toyota.stopEngine();
        displayCarStats(toyota);
    }
    
    public static void displayCarStats(Car input){
        System.out.println("***** STATS *****");
        System.out.println(input.year + " " + input.makeModel);
        System.out.println("Engine running: " + input.checkEngineStatus());
        System.out.println("CurrentSpeed: " + input.getCurrentSpeed());
        System.out.println("Gear: " + input.transmission());
        System.out.println("*****************");
    } // close displayCarStats
}
