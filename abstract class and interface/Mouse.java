/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Mouse extends Animal implements Prey {
    
    
    @Override
    public void move() {

        System.out.println(toString()+" moves");
    }

    @Override
    public void isEaten(Predator p) {
        System.out.println(toString()+" is eaten by "+p);
    }
    
    @Override 
    public String toString(){
        return "The Mouse";
    }
    
}
