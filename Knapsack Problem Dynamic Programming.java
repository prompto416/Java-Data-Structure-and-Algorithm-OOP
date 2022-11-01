/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Arrays;

public class Lab8Knapsack {
    public static void main(String args[]){ 
        int[] weights = {1 ,2 ,3 ,8 ,7, 4};
        int[] values = {20, 5, 10, 50, 40, 24};
        int[] indexes ={0, 1, 2, 3, 4, 5};
        int W = 10;
        System.out.println(knapsack(W,values,weights,values.length));
         
    }
    
    public static int knapsack(int W, int[] v, int[] w, int n){
        int[][] table = new int[w.length][W];
        int[][][] solution = new int[w.length][W][4];
        
        
        
        System.out.println(table[5][9]);
        return -1;
    }
    
    
}
