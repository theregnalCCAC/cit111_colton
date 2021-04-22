/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2_mod2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author clang
 */
public class UnitConversion {
    public static void main(String [] args){
        // create and initialize all variables
        double speed;
        double force;
        double energy;
        
        // create scanner object
        Scanner userInput = new Scanner(System.in);
        
        // ask for user input, assign to variable and print out result
        
        // speed
        System.out.println("Enter the speed of the object in miles per hour");
        speed = userInput.nextDouble();
        System.out.println("The object is moving at " + convertMilesPerHourToMetersPerSecond(speed) + "m/s");
        System.out.println("*************************************");
        
        // force
        System.out.println("Enter the amount of force being exerted on the object in newtons");
        force = userInput.nextDouble();
        System.out.println("The object has " + convertNewtonsToPoundForce(force) + " pounds of force being exerted upon it");
        System.out.println("*************************************");
        
        // energy
        System.out.println("Enter the amount of calories the object has");
        energy = userInput.nextDouble();
        System.out.println("The object has " + convertKCalToJoule(energy) + " joules of energy");
        System.out.println("*************************************");
        // Dollars to Dishes
        System.out.println("Enter how much money in dollars you would like to spend");
        double dollars = userInput.nextDouble();
        convertDollarsToDishesAndCalories(dollars);
        
        
        
        
    }
    
    public static double convertMilesPerHourToMetersPerSecond(double milesPerHour){ // first conversion method
        
        double metersPerSecond = milesPerHour / 2.237;
        return metersPerSecond;
    }
    
    public static double convertNewtonsToPoundForce(double newtons){ // second conversion method
        
        double poundForce = newtons / 4.448;
        return poundForce;
    }
    
    public static double convertKCalToJoule(double kCal){ // third conversion method
        
        double joule = kCal * 4184;
        return joule;
    }
    
    public static void convertDollarsToDishesAndCalories(double dollars){
        // this will take the amount of dollars and compare it to the average cost of my chicken fried rice
        // 7 chicken breasts cost $1.99 at target, I use 2 per dish; 1 chicken breast has 231 calories
        // 10lb of rice costs $4.99 at Sam's club, I use about 12 oz; 1 cup of rice is about 206 calories
        // 15 oz of Soy Sauce costs $2.69 at target, I use about 2 tablespoons per meal; 1 tbsp is about 9 calories
        // 60 oz of Vegetables costs $5.98 at walmart, I use about 6 oz per meal; there are about 108 calories in a cup
        double dishes;
        double calories;
        double price;
        double chickenCalories = 2*231;
        double chickenPrice = 1.99*0.286;
        double riceCalories = 206*0.75;
        double ricePrice = 4.99*0.0625;
        double soySauceCalories = 9;
        double soySaucePrice = 2.69*0.066666;
        double vegetableCalories = 108 * 0.75;
        double vegetablePrice = 5.98 * 0.1;
        // use https://java2blog.com/java-round-double-float-to-2-decimal-places/ to round
        // https://vertex-academy.com/tutorials/en/rounding-numbers-java/
        DecimalFormat df = new DecimalFormat("###.##");
        
        calories = chickenCalories + riceCalories + soySauceCalories + vegetableCalories;
        price = chickenPrice + ricePrice + soySaucePrice + vegetablePrice;
        
        dishes = Math.floor(dollars/price);
        
        
        // final part
        System.out.println("This dish costs $" + df.format(price) + " and you have $" + df.format(dollars));
        System.out.println("You can buy " + dishes + " Dishes of chicken fried rice");
        System.out.println("You're $" + dollars + " gives you " + dishes*calories + " calories of chicken fried rice");
        
        
    }
}
