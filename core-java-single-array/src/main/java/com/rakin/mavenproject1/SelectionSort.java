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
public class SelectionSort {
    public static int[] sort(int[] list){
        int[] result=list;
        
        for(int first=0; first<result.length;first++){// to get an item to compare with next
            // find the smallest one
            int minValue=result[first];
            int minIndex=first;
            
            for(int second=first+1; second<result.length;second++){ 
                if(minValue>result[second]){
                    minValue=result[second];
                    minIndex=second;
                }
            }
            // swapping if position needs to update
            if(minIndex!=first){// first =0
                result[minIndex]=result[first];
                result[first]=minValue;
            }
        }
        return result;
    }
}
// Step 1: Supose first item & index as minimum value and assign to variables; 18-19
// Step 2: Compare with next corresponding values; line 22-25
// Step 3: If the assumed value is not minimum value, swap the correct minimum value ; 28-31