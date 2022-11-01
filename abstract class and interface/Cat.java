/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Cat extends Pet implements Predator, Playful, Talking {
    public static void main(String[] args){
        Cat cat1 = new Cat("Cat1");
        Dog dog1 = new Dog("Dog1");
        
        dog1.move();
        
    }
    public Cat(String name){
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

    @Override
    public void eat(Prey p) {
        System.out.println(toString()+" eats "+p.toString());
    }
   

    
}
