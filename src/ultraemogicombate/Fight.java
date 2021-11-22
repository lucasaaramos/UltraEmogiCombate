/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemogicombate;

import java.util.Random;

/**
 *
 * @author lucas
 */
public class Fight {
    
    //attributes
    private Fighter challenged;
    private Fighter challenger;
    private int rounds;
    private boolean approved;
    
    //Public methods
    public void scheduleFight(Fighter l1, Fighter l2){
        if (l1.getCategory().equals(l2.getCategory()) && l1 != l2){
            this.approved = true;
            this.challenged = l1;
            this.challenger = l2;
        }else{
            this.approved = false;
            challenged = null;
            challenger = null;
        }        
    }
    public void fight(){
        if (this.approved){
            System.out.println("### CHALLENGED ###");
            this.challenged.apresent();
            System.out.println("\n### CHALLENGER ###");
            this.challenger.apresent();
            
            Random random = new Random();
            int winner = random.nextInt(3); //0 1 2
            System.out.println("\n ===== THE RESULT OF THE FIGHT IS: ===== ");
            switch(winner) {
                case 0:      //draw
                    System.out.println("\nTHE FIGHT HAS TIED!");
                    this.challenged.tieFight();
                    this.challenger.tieFight();
                    break;
                case 1:    //challenged win
                    System.out.println("\nTHE WINNER IS: " + this.challenged.getName());
                    this.challenged.winFight();
                    this.challenger.loseFight();
                    break;
                case 2:     //challenger win
                    System.out.println("\nTHE WINNER IS: " + this.challenger.getName());
                    this.challenger.winFight();
                    this.challenged.loseFight();
                    break;
            }
        }else{
            System.out.println("Fight can not happen!");
        }
    }
    
    //Special methods -> Getters and Setters
    public Fighter getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public Fighter getChallenger() {
        return challenger;
    }

    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
   
    
    
}








