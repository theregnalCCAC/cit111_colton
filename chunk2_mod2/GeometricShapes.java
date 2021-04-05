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
        
        // create scanner
        Scanner cubeReader = new Scanner(System.in);
        
        // ask for input and assign to cube
        System.out.println("Enter the side length of the cube to calculate its volume:");
        insertedVolume = cubeReader.nextDouble();
        
        // call calcVolumeOfCube Here
        calcVolumeOfCube(insertedVolume);
        
        // print the inputs and the outputs to the console
        System.out.println("The volume of a cube with the side length 3");
    }
    
    public static double calcVolumeOfCube(double sideLength){

        double cubeVolume = Math.pow(sideLength, 3);
        return cubeVolume;
    } // close method
} // close class
