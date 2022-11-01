/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8dsa;

/**
 *
 * @author Admin
 */
public class Lab8Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] godArray = {1,3,4,7};
        //printArray(godArray,0);
        //printReverse(godArray,3);
        printArrayAndReverse(godArray);
    }
    
    static void printArray(int a[], int i){
        if(i==a.length) return;
        System.out.print(a[i]+" ");
        printArray(a,i+1);
    }
    
    static void printReverse(int a[],int i){
        if (i>=0){
            System.out.print(a[i]+" ");
            i--;
            printReverse(a,i);
        }
    }
    
    static void printArrayAndReverse(int a[]){
        printArray(a,0);
        printReverse(a,a.length-1);
    }
    
}
