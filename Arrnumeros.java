/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareasprog;

/**
 *
 * @author Robert
 */
public class Arrnumeros {
      
class Main  {
	public static void main(String[] args) {
        optimizedBubbleSort(new int[]{1,2,4,5,6});  
        optimizedBubbleSort(new int[]{11,2,44,5,16});  
        optimizedBubbleSort(new int[]{0,8,74,5,1});  
}

    private static void optimizedBubbleSort(int [] list){
        for(int i =0; i< list.length; i++){
            boolean sorted = true; 
          
            for(int j =0; j< list.length - i - 1; j++){ 
                if(list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    sorted = false; 
                }
            }
            if(sorted){ 
                System.out.println(String.format("Iteración %s, array ordenado", i));
                return;
              }
          }
      }
}

    