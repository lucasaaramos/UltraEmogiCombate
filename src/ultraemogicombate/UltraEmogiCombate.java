/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemogicombate;

/**
 *
 * @author lucas
 */
public class UltraEmogiCombate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        Fighter l [] =  new Fighter[6];
                
        l[0] = new Fighter("Pretty Boy", "France", 31, 1.75f, 68.9f, 11, 2, 1);
        
        l[1] = new Fighter("Putscript", "Brazil", 29, 1.68f, 57.8f, 14, 2, 3);
        
        l[2] = new Fighter("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
        l[3] = new Fighter("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        
        l[4] = new Fighter("Ufocobol", "Brazil", 37, 1.70f, 119.3f, 5, 4, 3);
        
        l[5] = new Fighter("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        Fight UEC01 = new Fight();
        UEC01.scheduleFight(l[0], l[1]);
        UEC01.fight();
        l[0].status();
        l[1].status();  
      


    }
    
}
