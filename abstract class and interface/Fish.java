/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Fish extends Pet implements Prey {
    
    public Fish(String name){
        super(name);
        
    }
    @Override
    public void move() {

        System.out.println(toString()+" moves");
    }
    
    @Override
    public void isEaten(Predator p){
        System.out.println(toString()+"is eaten by "+p);
    }
    
}
