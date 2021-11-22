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
public class Fighter {
    
    private String name, nationality; 
    private int age;
    private float height, weight;
    private String category;
    private int victorys, loss, draws; 
     

    public void apresent() {
        System.out.println("--------------------------------");
        System.out.println("TIME TO FIGHT!!!");
        System.out.println("We present the fighter " + this.getName());
        System.out.println("From " + this.getNationality());
        System.out.println("With " + this.getAge() + " years old, and " + this.getHeight() + "cm");
        System.out.println("Weighing: " + this.getWeight() + " Kg");
        System.out.println(this.getVictorys() + " Victorys");
        System.out.println(this.getLoss() + " Losses");
        System.out.println(this.getDraws() + " Draws");
    }
    public void status(){
        System.out.println("\n" + this.getName() + " is a weight " + this.getCategory());
        System.out.println("He has " + this.getVictorys() + " Victorys in the carreer");
        System.out.println("He lost " + this.getLoss() + " times");
        System.out.println("and drawed " + this.getDraws() + " times");
    }
    public void winFight(){
        this.setVictorys(this.getVictorys() + 1);
    }
    public void loseFight(){
        this.setLoss(this.getLoss() + 1);
    }
    public void tieFight(){
        this.setDraws(this.getDraws() + 1);
    }

    
    
    
    //special constructor
    public Fighter(String name, String nationality, int age, float height, float weight, int victorys, int loss, int draws){
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.height = height;
        this.setWeight(weight);
        this.victorys = victorys;
        this.loss = loss;
        this.draws = draws;
        
    }
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        
        if (this.weight < 52.2){
            this.category = "INVALID!";
        }else if(this.weight <= 70.3){
            this.category = "Light";
        }else if (this.weight <= 83.9){
            this.category = "Medium";
        }else if (this.weight <= 120.2) {
            this.category = "Heavy";
        }else{
            this.category = "INVALID!";
        }
        
    
    }
    
    

    public int getVictorys() {
        return victorys;
    }

    public void setVictorys(int victorys) {
        this.victorys = victorys;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    
    
    
}
