/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Question1 {
    //The Flow of the algorithm are
    
    //1) The "next" attribute of last node becomes the First's address instead of null
    //2) The First Node "next" attribute becomes null instead of the Second's address
    //3) The Second Node becomes the head (node of index 1)
   public static void main(String[] args){
       rotate(4);
        
        
   }
   public static void rotate(int k){
       //Assigning the value before rotating
        MyLinkedList q1= new MyLinkedList();
        int tbaVal = 0;
        for (int i =0; i <6;i++){
            tbaVal += 10;
            q1.add(tbaVal);
        }
        System.out.println(q1);
        //Now Let's rotate kub Ajarn.
        for (int i = 0; i < k; i++){
            //Assign Node to varaibles.
            Node FirstNode = q1.find(q1.findFromIndex(0));
            Node SecondNode = q1.find(q1.findFromIndex(1));
            Node LastNode = q1.find(q1.findFromIndex(q1.size-1));
            //Step 1 
            LastNode.setNext(FirstNode);
            //Step 2
            FirstNode.setNext(null);
            //Step3
            q1.head = SecondNode;

            
        }
        System.out.println(q1);
 
 
        
   }
    
    
}
