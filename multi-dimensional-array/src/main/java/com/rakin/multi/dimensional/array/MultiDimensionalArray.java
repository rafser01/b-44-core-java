/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rakin.multi.dimensional.array;

/**
 *
 * @author user2
 */
public class MultiDimensionalArray {
    public static int[][] createArray(){
        int[][] test=new int[5][3]; //Defined & created
        test[0]=new int[]{1,2,3};
        test[1][0]=7;
        test[1][1]=8;
        test[1][2]=9;
        return test;
    }
    public static void threeDimensional(int cycle, int row, int col){
        double[][][]results= new double[2][3][2];
        //Cycle 1
        results[0][0][0]=1.1;
        results[0][0][1]=1.2;
        
        results[0][1][0]=1.3;
        results[0][1][1]=1.4;
        
        results[0][2][0]=1.5;
        results[0][2][1]=1.6;
        
        // Cycle 2
        
        results[1][0][0]=2.1;
        results[1][0][1]=2.2;
        
        results[1][1][0]=2.3;
        results[1][1][1]=2.4;
        
        results[1][2][0]=2.5;
        results[1][2][1]=2.6;
        System.out.println(results[cycle][row][col]);
    }
    
}
