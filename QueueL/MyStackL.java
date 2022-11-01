/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueL;

/**
 *
 * @author Admin
 */
public class MyStackL {
  public class Node {
    int data;
    Node next;

    public Node(int d) {
      data = d;
    }
  }

  Node top = null;

  public void push(int d) {
    Node p = new Node(d);
    p.next = top;
    top = p;
  }

  public int pop() {
    int d = top.data;
    top = top.next;
    return d;
  }

  public int top() {
    return top.data;
  }

  public boolean isFull() {
    return false;
  }

  public boolean isEmpty() {
    return top == null;
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer("head");
    Node p = top;
    while (p != null) {
      sb.append("-->[");
      sb.append(p.data);
      sb.append("]");
      p = p.next;
    }
    sb.append("->null");
    return new String(sb);
  }
  

}
