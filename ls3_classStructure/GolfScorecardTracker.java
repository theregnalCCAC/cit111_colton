/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;

import java.util.Scanner;

/**
 *
 * @author clang
 */
public class GolfScorecardTracker {
    
    // member variables
    private static int totalCourses;
    private static int totalHoles;
    private static int totalStrokes;
    private static int totalAces;
    private static int totalEagles;
    private static int totalBirdies;
    private static int totalPars;
    
    //open mainMethod
    public static void main(String [] args){
        // open latestGolfScorecard()
        latestGolfScorecard();
        System.out.println(" ");
        // open golf feedback
        golfFeedback();
        System.out.println(" ");
        // add another Scorecard
        latestGolfScorecard();
        System.out.println(" ");
        // ask if they want to give feedback on their latest game
        feedbackYOrN();
        System.out.println(" ");
        //print lifetime stats
        String lifetimeStats = "LIFETIME";
        System.out.println("total courses played lifetime: " + totalCourses);
        printStats(lifetimeStats, totalHoles, totalStrokes, totalAces, totalEagles, totalBirdies, totalPars);
        
    } // close main
    
    public static void latestGolfScorecard(){
       // create scanner
       Scanner inputMachine = new Scanner(System.in);
       
       // introduce method
       System.out.println("************ GOLF SCORECARD INPUT ***********");
       
       // name of the course
       System.out.println("What was the name of this course?");
       String courseName = inputMachine.nextLine();
       totalCourses = totalCourses + 1;
       
       // How many holes?
       System.out.println("Enter the number of holes played (1-18)");
       int holes = inputMachine.nextInt();
       totalHoles = totalHoles + holes;
       
       // intoduce switch to criticize the user
       switch(holes){
           case 9 -> System.out.println("Nothing like a quick nine!");
           case 12 -> System.out.println("Where'd you play, Scotland?");
           case 18 -> System.out.println("Nice to get a full game");
            default -> System.out.println("... how?");
        } // close switch
       // Users Score
       System.out.println("Please enter your score for the course");
       int strokes = inputMachine.nextInt();
       totalStrokes = totalStrokes + strokes;
           
       
       // Notable hole scores
       
       // Ask for Aces
       System.out.println("How many hole-in-ones did you get (1-" + holes + ")");
       int aces = inputMachine.nextInt();
       totalAces = totalAces + aces;
       holes = holes - aces;
       // Ask for Eagles
       System.out.println("How many Eagles did you get (1-" + holes + ")");
       int eagles = inputMachine.nextInt();
       totalEagles = totalEagles + eagles;
       holes = holes - eagles;
       
       // Ask for Birdies
       System.out.println("How many Birdies did you get (1-" + holes + ")");
       int birdies = inputMachine.nextInt();
       totalBirdies = totalBirdies + birdies;
       holes = holes - birdies;
       
       // Ask for Pars
       System.out.println("How many Pars did you get (1-" + holes + ")");
       int pars = inputMachine.nextInt();
       totalPars = totalPars + pars;
       holes = holes + aces + eagles + birdies;
       // print course stats to printStats()
       System.out.println("**************************************");
       
       System.out.println(" ");
       printStats(courseName, holes, strokes, aces, eagles, birdies, pars);
    } // close latestGolfScorecard()
    
    public static void golfFeedback(){
        // create scanner
        Scanner inputMachine = new Scanner(System.in);
       // introduce method
       System.out.println("************* GAME FEEDBACK **************");
        // ask how they felt off the tee box
        System.out.println("How did you feel when hitting off the teebox? (1-10)");
        int offTheTee = inputMachine.nextInt();
        if (offTheTee >= 7){
            System.out.println("A " + offTheTee + " Huh? I'm sure your driver is pretty solid!");
            System.out.println(" ");
        } else {
            System.out.println("Yikes a " + offTheTee + " your driver might need some work");
            System.out.println("Hit the driving range and get a big bucket of balls");
            System.out.println(" ");
        }
        
         // ask about woods, irons, and wedges
        System.out.println("How was your midgame with your woods, irons, and wedges? (1-10)");
        int midgame = inputMachine.nextInt();
        if (midgame >= 7){
            System.out.println("A " + midgame + " must mean you hit some stingers down the fairway. Keep it up Tiger!");
            System.out.println(" ");
        } else {
            System.out.println("A " + midgame + " can always be fixed, just hit the driving range and the par 3");
            System.out.println(" ");
        }
        
          // ask about woods, irons, and wedges
        System.out.println("How was your putting today? (1-10)");
        int putting = inputMachine.nextInt();
        if (putting >= 7){
            System.out.println("A " + putting + "! Drive for show, but putt for the dough right?");
            System.out.println(" ");
        } else {
            System.out.println("A " + putting + "  in the putting department must mean you had a few three-putts");
            System.out.println("I would warm-up more on the putting green before you tee off");
            System.out.println(" ");
        }
        System.out.println("*******************************************");
    } // close golfFeedback()   
        public static void feedbackYOrN(){
            // create scanner
            Scanner inputMachine = new Scanner(System.in);
            
            // ask if they would like additional feedback
            
            int response = 1;  
            while(response == 1){
            System.out.println("Would you like to get some feedback on your latest game? (Yes or No)");
            String feedbackResponse;
            feedbackResponse = inputMachine.nextLine();
                  
            if (feedbackResponse.equalsIgnoreCase("yes")){
                System.out.println("Glad to hear, input your answers below:");
                golfFeedback();
                break;
            } else if (feedbackResponse.equalsIgnoreCase("no")){
                System.out.println("That's alright");  
                break;
            } else {
                System.out.println("That's not how this works");
            }
        }
        
        
    } // close feedbackYOrN()
    
    public static void printStats(String title, int holes, int strokes, int aces, int eagles, int birdies, int pars){
        // start by declaring if it is for a course or lifetime
        System.out.println("********** " + title + " STATS **********");
        System.out.println("Number of holes played: " + holes);
        System.out.println("Number of stokes played: " + strokes);
        System.out.println("Number of hole-in-ones: " + aces);
        System.out.println("Number of eagles: " + eagles);
        System.out.println("Number of birdies: " + birdies);
        System.out.println("Number of pars: " + pars);
        System.out.println("****************************************");
        
        
        
    } // close printStats()
}
