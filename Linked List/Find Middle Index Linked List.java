/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Question6 {
     
     
    public static void main(String[] args){
        MyLinkedList q61= new MyLinkedList();
        MyLinkedList q62= new MyLinkedList();
        for (int i = 1 ; i< 6; i++){
           q61.add(i);
           q62.add(i);
        }
        q62.add(6);
        //Just do ceil division of the linked list size....
        //size is an attribute in my linkedlist class
        System.out.println(q61);
        System.out.println(q62);
        //if size is odd just do ceil division 
        //if size is even division then +1
        double a = q61.size/2.0;
        a = Math.ceil(a);
        System.out.println(a);
        double b = q62.size/2.0;
        b +=1;
        System.out.println(b);
        //Now we have index+1 we just have to print next
        //hench the index-1 as you can see
        System.out.println(q61.findFromIndex((int)a-1));
        System.out.println(q62.findFromIndex((int)b-1));
        
    }
}
