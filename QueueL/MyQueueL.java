/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueL;

/**
 *
 * @author Admin
 */
public class MyQueueL {
    private Node rear;
    private Node front; 
    private int size; 
    
    public static void main(String[] args){
        MyQueueL queue = new MyQueueL();
        queue.enqueue(1000);
        System.out.println(queue.getSize());
        System.out.println(queue.peek().getData());
        System.out.println(queue.front().getData());
        System.out.println(queue);
        
    }
    
    public boolean isEmpty(){
        boolean response = false;
        if(size == 0){
            response = true;
        }
        return response;
    }
    public void enqueue(int element){
        Node node = new Node(element);
        if(front == null){
            rear = node;
            front = node;
            size++;
        }
        else {
            rear.setNext(node);
            rear = node;
            size++;
        }
    }
    public MyQueueL(){
        front = null;
        rear = null;
        size = 0;
    }
    public Node dequeue(){
        Node response = null;
        if (front != null){
            if(front.getNext()!= null){
                response = new Node(front.getData());
                front = front.getNext();
                size--;
            }
            else {
                response = new Node(front.getData());
                front = null;
                rear = null;
                size--;
            }
        }
        return response;
    }
    
    public Node front(){
        return front;
    }
    public Node peek(){
        // this one is the same as front() but better actually
        // according to indian tech support 555
        Node response = null;
        if(!isEmpty()){
            response = new Node(front.getData());
        }
        return response;
    }
    public int getSize(){
        return size;
    }
    
    public String toString() {
		String output = "";
		Node current = front;
		while (current != null) {
			output += current.getData();
			current = current.getNext();
		}
		
		return output;
	}
    
    
    
    
}
