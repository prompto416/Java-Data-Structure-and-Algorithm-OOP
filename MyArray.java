/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Arrays;
import java.util.ArrayList;

public class MyArray {
    int MAX_SIZE = 5;
    int data[] = new int[MAX_SIZE];
    int size = 0;
    
    public boolean isFull(){
        return size==MAX_SIZE;
    }
    public int add(int d){
        if(isFull()) return -1;
        data[size++] = d;
        return size;
       
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("hello ");
        ArrayList<Long> r1 = new ArrayList<Long>();
        ArrayList<Long> r2 = new ArrayList<Long>();
        ArrayList<Long> r3 = new ArrayList<Long>();
        ArrayList<Long> r4 = new ArrayList<Long>();
        ArrayList<Long> r5 = new ArrayList<Long>();
        for (int it = 0; it < 5; it++){
            for(int N=10000000; N<=100000000; N+=10000000) {
            long start = System.currentTimeMillis();
            MyArray mArray = new MyArray();
            for(int n=1; n<N; n++) {
                mArray.add((int)(Math.random()*1000));
            }
            long time = (System.currentTimeMillis()-start);
            System.out.println(N+" \t"+time);
            if (it == 0){
                r1.add(time);
            }
            else if (it == 1){
                r2.add(time);
            }
            else if (it == 2){
                r3.add(time);
            }
            else if (it == 3){
                r4.add(time);
            }
            else if (it == 4){
                r5.add(time);
            }
            
        }
            System.out.println('\n');
        }
        
        for (int i = 0; i < 10;i++){
            double avg1 = (r1.get(i)+r2.get(i)+r3.get(i)+r4.get(i)+r5.get(i))/5;
            double avg2 = avg1/(i+1);
            System.out.println(avg1+" "+avg2);
        }

        
    }
}