/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueL;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class ComputeInfix {

    public static void main(String[] args) {
        
        MyStackA stack = new MyStackA();
        MyQueueA queue= new MyQueueA(100);
        Scanner in = new Scanner(System.in);
        String rpn = in.nextLine();
        StringTokenizer st = new StringTokenizer(rpn);

        while (st.hasMoreTokens()){
            String t = st.nextToken();
            if(t.matches("[0-9]+")){
                queue.enqueue(t);
            }
            else if(t.matches("[()+/*-]")){
                if(stack.isEmpty()){
                    stack.push(t);
                }
                else if(t.equals("(")){
                    stack.push(t);
                }
                else if(t.equals(")")){
                    while(!stack.top().equals("(")){
                        queue.enqueue(stack.pop());
                    }
                    stack.pop();
                }
                else if(t.equals("+") || t.equals("-")){
                    while(!stack.isEmpty() && !stack.top().equals("(")){
                        queue.enqueue(stack.pop());
                    }
                    stack.push(t);
                }
                else if(t.equals("*") || t.equals("/")){
                    while(!stack.isEmpty() && (stack.top().equals("*") || stack.top().equals("/"))){
                        queue.enqueue(stack.pop());
                    }
                    stack.push(t);
                }
            }
        }
        while(!stack.isEmpty()){
            queue.enqueue(stack.pop());
        }

        MyStackL stack2 = new MyStackL();
        StringTokenizer st2 = new StringTokenizer(queue.toString());
        while (st2.hasMoreTokens()){
            String t2 = st2.nextToken();
            if(t2.matches(".*[0-9].*")){
               
                
                stack2.push(Integer.parseInt(t2));
            }
            else{
                if(t2.equals("-")){
                    int b = stack2.pop();
                    int a = stack2.pop();
                    stack2.push(a-b);
                }
                else if(t2.equals("+")){
                    int b = stack2.pop();
                    int a = stack2.pop();
                    stack2.push(a+b);
                }
                else if(t2.equals("*")){
                    int b = stack2.pop();
                    int a = stack2.pop();
                    stack2.push(a*b);
                }
                else if(t2.equals("/")){
                    int b = stack2.pop();
                    int a = stack2.pop();
                    stack2.push(a/b);
                }
            }
        }

        System.out.println("Result: "+ stack2);
        System.out.println("test");
        in.close();
        
     
    }
}