/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;

import java.util.Random;

/**
 *
 * @author clang
 */
public class KennywoodRideTracker {
    
    private static int totalRiders = 0;
    private static int totalFailedRiders = 0;
    private static int totalSickRiders = 0;
    
    final static int THRILL_RIDE_HEIGHT = 52;
    final static int THEME_RIDE_HEIGHT = 36;
    
    
    public static void main(String [] args) {
        System.out.println("Begin ride simulation");
        rideBlackWidow(10, 60);
        printRiderStats();
        
        rideBlackWidow(6, 45);
        printRiderStats();
        
        rideMerryGoRound(13, 30);
        printRiderStats();
        
        rideMerryGoRound(18, 78);
        printRiderStats();
        
        rideBlackWidow(31, 82);
        printRiderStats();
    }
    
    public static void rideBlackWidow(int riders, int avgHeight){
        
        
        // create if statement
        if (avgHeight >= THRILL_RIDE_HEIGHT){
            System.out.println("Riding Black Widow!!!");
            // add riders
            totalRiders = totalRiders + riders;
            
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
        } else {
            System.out.println("Sorry but you are too short to ride");
            totalFailedRiders = totalFailedRiders + riders;
        }
    }
    
    public static void rideMerryGoRound(int riders, int avgHeight){
         if (avgHeight >= THRILL_RIDE_HEIGHT){
            System.out.println("Riding the Merry-Go-Round");
            // add riders
            totalRiders = totalRiders + riders;
            
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
        } else {
            System.out.println("Sorry but you are too short to ride");
            totalFailedRiders = totalFailedRiders + riders;
        }
    }
    
    public static void printRiderStats(){
        
        System.out.println("*******RIDER STATS*******");
        System.out.println("Total Riders: " + totalRiders);
        System.out.println("Total Failed Ride Attempts: " + totalFailedRiders);
        System.out.println("Total Sick Riders: " + totalSickRiders);
        System.out.println("*************************");
        
    }
}

