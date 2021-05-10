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
public class Gravy {
    
    public int percRemaining;
    public String name;
    
    public void usedGravy(int percPoured){
        percRemaining = percRemaining - percPoured;
    }
    
    public int getPercRemaining(){
        return percRemaining;
    }
}
