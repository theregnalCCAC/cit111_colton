/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk2_mod2;

import java.util.Scanner;

/**
 *
 * @author clang
 */
public class GeometricShapes {
    public static void main(String[] args){
        double insertedVolume;
        double sideLength = 0;
        double cylinderRadius;
        double cylinderHeight;
        // create scanner
        Scanner cubeReader = new Scanner(System.in);
        
        // ask for input and assign to cube
        System.out.println("Enter the side length (in cm) of the cube to calculate its volume:");
        insertedVolume = cubeReader.nextDouble();
        
        
        // print the inputs and the outputs to the console
        System.out.println("The volume of a cube with a side length of " + insertedVolume + "cm is equal to " + calcVolumeOfCube(insertedVolume) + "cm^3");
        
        // ask for input and assing to cube
        System.out.println("Enter the cylinder's radius (in cm) and press enter");
        cylinderRadius = cubeReader.nextDouble();
        System.out.println("Enter the cylinder's height (in cm) and press enter");
        cylinderHeight = cubeReader.nextDouble();
        
        // print the inputs and the outputs to the console
        System.out.println("The volume of a cube with a radius of " + cylinderRadius + "cm and a height of " + cylinderHeight + "cm is equal to " + calcVolumeOfCylinder(cylinderRadius, cylinderHeight) + "cm^3");
        
        /* call to manyParams with literal values
        *int result = manyParams(12, "Loretta", 18.4, true);
        *System.out.println("many params outputted: " + result);
        */
    }
    
    public static double calcVolumeOfCube(double sideLength){

        double cubeVolume = Math.pow(sideLength, 3);
        return cubeVolume;
    } // close method
    
    public static int manyParams(int age, String name, double height, boolean friendly){
        // method guts: do something with all that input data
        return 1; // place holder return value
        
    }
    
    public static double calcVolumeOfCylinder(double radius, double height){
        
        double cylinderVolume = Math.PI * Math.pow(radius, 2) * height;
        return cylinderVolume;
    }
} // close class
