/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chunk3_mod4;

/**
 *
 * @author clang
 */
public class Car {
    // public member variables: we don't need to implement logic
    // to change these values
    
    public int year;
    public String makeModel;
    public int topSpeed;
    public int fluxCapacity = 2021;
    public int ttYear;
    // private member variables because we want to control
    // their values: outside classes acess these through methods
    private boolean isEngineRunning;
    private double speed;
    private int gear;
    private int gearChange1;
    private int gearChange2;
    
    public void startEngine(){
        isEngineRunning = true;
        System.out.println("...crank...crank...vroom!");
        
    }
    
    
    public void stopEngine(){
        isEngineRunning = false;
        System.out.println("...grblllll...shldunk");
        
    }
    
    public boolean checkEngineStatus(){
        return isEngineRunning;
    }
    
    public double getCurrentSpeed(){
        return speed;
    }
    
    public void accelerate(int mphIncrease){
        gearChange1 = transmission();
        speed = speed + mphIncrease;
        gearChange2 = transmission();
        while (gearChange2 > gearChange1){
            gearChange1 = gearChange1 + 1;
            System.out.println("Shifting up into gear #" + gearChange1);
        }
        System.out.println("**********************");
        
        if (makeModel == "DeLorean DMC-12" && speed >= 88){
            fluxCapacitor(ttYear);
        }
    }
    
    public void decelerate(int mphDecrease){
        gearChange1 = transmission();
        if (mphDecrease <= speed){
            speed = speed - mphDecrease;
        } else {
            speed = 0;
        }
        gearChange2=transmission();
        while (gearChange1 > gearChange2){
            gearChange1 = gearChange1 - 1;
            System.out.println("Downshifting to gear #" + gearChange1);
        }
        System.out.println("**********************");
    }
    
    public int transmission(){
        if (speed == 0){
            gear = 0;
        } else if (speed < 10){
            gear = 1;
        } else if (speed < 25){
            gear = 2;
        } else if (speed < 45){
            gear = 3;
        } else if (speed < 70){
            gear = 4;
        } else if (speed < 100){
            gear = 5;
        } else {
            gear = 6;
        }
        return gear;
    }
    
    public void fluxCapacitor(int ttYear){
        fluxCapacity = ttYear;
    }
}
