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
        VariableLengthArray va=new VariableLengthArray();
        va.printMax(1,2,3);
        double[] vars=new double[]{2,5,10};
        va.printMax(vars);
        va.test(1);
    }
    
}
