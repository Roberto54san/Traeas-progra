/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareasprog;

/**
 *
 * @author Robert
 */
public class pilas {
    public class Pila {
    private Nodo cima;
    int tamaño;
   
    public Pila(){
        cima = null;
        tamaño = 0;
    }
   
    public boolean isEmpty(){
        return cima == null;
    }
   
    public void push(int dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamaño++;
    }
   
    public int pop(){
        int aux = cima.dato;
        cima=cima.siguiente;
        tamaño--;
        return aux;
    }
   
    public int cima(){
        return cima.dato;
    }
   
    public int size(){
        return tamaño;
    }
   
    public void limpiar(){
        while(!isEmpty()){
            pop();
        }
    }
}
    Nodo para Pila 


public class Nodo {
    int dato;
    Nodo siguiente;
   
    public Nodo(int dato){
        this.dato = dato;
        siguiente = null;
    }
}
}
