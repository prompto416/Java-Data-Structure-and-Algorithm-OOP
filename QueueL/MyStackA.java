/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueL;

/**
 *
 * @author Admin
 */
public class MyStackA {
  int MAX_SIZE = 100;
  String stack[] = new String[MAX_SIZE];
  int top = 0;

  public void push(String d) {
    stack[top++] = d;
  }

  public String pop() {
    return stack[--top];
  }

  public String top() {
    return stack[top - 1];
  }

  public boolean isFull() {
    return top == MAX_SIZE;
  }

  public boolean isEmpty() {
    return top == 0;
  }

  @Override
  public String toString() {
    String myString = "Bottom [ ";
    for (int x = 0; x < top; x++)
      myString += String.valueOf(stack[x]) + " ";
    myString += "] Top";
    return myString;
  }
  
}