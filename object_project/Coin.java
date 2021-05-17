/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_project;

import java.util.Random;

/**
 *
 * @author clang
 */
public class Coin {
    // public member variables
    public int topFace;
    public String name;
    public String face;
    
    public int flipCoin(){
        String face;
        Random fc = new Random();
        topFace = fc.nextInt((1-0) + 1) + 0;
        
        return topFace;
    }
    
}
