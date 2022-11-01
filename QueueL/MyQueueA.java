/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueL;

/**
 *
 * @author Admin
 */
public class MyQueueA {
    String[] queue;
    int rear; 
    int front; 
    int size;
    
    public static void main(String[] args){
        MyQueueA queue = new MyQueueA(2);
        System.out.println(queue.enqueue("1"));
        System.out.println(queue.isFull());
        System.out.println(queue.enqueue("1"));
        System.out.println(queue.isFull());
        
    }
    public MyQueueA(int sizeOfArray){
        queue = new String[sizeOfArray];
        rear = -1;
        front = -1;
        size = 0;
    }
    public boolean isEmpty(){
        boolean response = false;
        if (size ==0){
            response = true;
        }
        return response;
    }
    public boolean isFull(){
        boolean response = true;
        if (rear != queue.length - 1){
            response = false;
        }
        return response;
    }
    public boolean enqueue(String element){
        boolean response = false;
        if (rear != queue.length - 1){
            rear++;
            queue[rear] = element;
            size ++;
            response = true;
        }
        return response;
    }
    public String dequeue(){
        String response = "0";
        if (size !=0) {
            front++;
            response = queue[front];
            size--;
        }
        return response;
    }
    public String front(){
        String response = "0";
        if (!isEmpty()){
           response = queue[front+1];
           
        }
        return response;
    }
    
}

