/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Dog extends Pet implements Playful, Talking {
    
    public Dog(String name){
        super(name);
        
    }
    @Override
    public void move() {

        System.out.println(toString()+" moves");
    }
    @Override
    public void talk(){
        System.out.println(toString()+" talks");
    }
    @Override
    public void play(){
        System.out.println(toString()+" plays");
    }
    
}
