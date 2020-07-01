/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rakin.mavenproject1;

import java.util.Arrays;

/**
 *
 * @author user2
 */
public class VariableLengthArray {
    int test(int first){
        return 0;
    }
   
    
    public  void printMax(double... values){// values type array
       double max=values[0];
        if(values.length==0){
           System.out.println("No Arguments found ");
           return;
       } else{
           
           for(int i=0;i<values.length;i++){
               if(max<values[i]){
                   max=values[i];
                }    
            }
           
       }
        
    }
    
    
}
