/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rakin.mavenproject1;

/**
 *
 * @author user2
 */
public class MainClass {
    public static void main(String[] args) {
//        VariableLengthArray va=new VariableLengthArray();
//        VariableLengthArray va2=new VariableLengthArray();
//        va2.printMax(2,5,6);
//        va.printMax(1,2,3);
//        double[] vars=new double[]{2,5,10};
//        va.printMax(vars);
//        va.test(1);
//        VariableLengthArray.printSomethig("Test Static");
int[] results=SelectionSort.sort(new int[]{5,8,2,0,6});
            for (int i=0;i<results.length;i++){
                System.out.println(results[i]);
            }
    }
    
}
