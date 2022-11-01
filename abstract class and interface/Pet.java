/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

public abstract class Pet extends Animal{
    private String name;
    
    protected Pet(String name){
        this.name = name;
    }
    //no getName() because the instruction said rename to toString()
    @Override
    public String toString(){
        return name;
    }
}
