/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Question8 {
    public static void main(String[] args){
        MyLinkedList ll = new MyLinkedList();
      
       
        
        ll.add(9);
        ll.add(9);
        ll.add(9);
        ll.insert(0, 1);
        System.out.println(ll);

        //ADDING EACH MEMBERS AS A SINGLE STRING
        //THEN CONVERTS ALL OF THEM INTO AN INT EZ.
        String output = "";
        Node current = ll.head;
        while (current != null) {
                output += current.getData();
                current = current.getNext();
        }
        int answer = Integer.parseInt(output);
        System.out.println(output);
        //ADDING 1 RESULT
        System.out.println(answer+1);
    }
}
