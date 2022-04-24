/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareasprog;

/**
 *
 * @author Robert
 */
 

  
import java.util.Stack;
class Parentesis{ 
  
    static boolean isDuplicate(String s){ 
        
        Stack<Character> Stack = new Stack<>(); 
  
        char[] str = s.toCharArray(); 
        for(char ch : str) { 
            
            if (ch == ')') { 
                
                char top = Stack.peek(); 
                Stack.pop(); 
  
                int elementsInside = 0; 
                
                while (top != '(') { 
                    elementsInside++; 
                    top = Stack.peek(); 
                    Stack.pop(); 
                } 
                
                if (elementsInside < 1){ 
                    return true; 
                } 
            } 
            
            else{ 
                Stack.push(ch); 
            } 
        } 
  
        return false; 
    } 
  
    public static void main(String[] args) { 
  
        String s = "(((a+(b))+(c+d)))"; 
  
        if(isDuplicate(s)){ 
            System.out.println("Esta oración contiene Parentesis duplicados."); 
        } 
        
        else{ 
            System.out.println("Esta oración contiene Parentesis duplicados."); 
        } 
  
    } 
}