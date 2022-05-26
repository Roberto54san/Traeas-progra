/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareasprog;

/**
 *
 * @author Robert
 */
public class cola {
    public class Cola {
    Nodo inicio, fin;
    int tamaño;
   
    public Cola(){
        inicio=fin=null;
        tamaño=0;
    }
   
    public boolean isEmpty(){
        return inicio == null;
    }
   
    public void push(int valor){
        Nodo nuevo = new Nodo(valor);
        if(isEmpty()){
            inicio = nuevo;
        }else{
            fin.siguiente = nuevo;
        }
        fin=nuevo;
        tamaño++;
    }
   
    public int pop(){
        int aux=inicio.dato;
        inicio=inicio.siguiente;
        tamaño--;
        return aux;
    }
   
    public int inicio(){
        return inicio.dato;
    }
   
    public int size(){
        return tamaño;
    }
}
//ejercicio 2
N=3;
p=CrearPila(sizeof(int));
for (i=1;i<=N;i++)
   if (TEST(i))
       printf("%d",i);
   else Push(&i,p);
while (!VaciaPila(p)){
   Tope(&i,p);
   Pop(p);
   printf("%d",i);
}
//ejercicio 3
while (!vacia(cola1) || !vacia(cola2)){

Persona p;

if (vacia(c1))

    p=decolar(p);

else

    if (vacia(c2))

        p=decolar(c1);

else

    {

    Persona p1=cabeza(c1);

    Persona p2=cabeza(c2);

    if (p1.edad <= p2.edad) p=decolar(c1);

    else

        p=decolar(c2);

    }

println ("Se atiende a %s de %d años\n",p.nombre,p.edad);

}

//ejercicio 4

public class SimpleTesting {
	public static void main(String[] args) {
		String str = "DelfStack";
		System.out.println(str);
		char[] ch = str.toCharArray();
	    int begin = 0;
	    int end = ch.length-1;
	    char temp;
	    while(end>begin){
	        temp = ch[begin];
	        ch[begin] = ch[end];
	        ch[end] = temp;
	        end--;
	        begin++;
	    }
	    str = new String(ch);
	    System.out.println(str);
	}
        
 
//ejercicio 5        
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        int flag = 1;
                 Cadena s = "{([])}"; // cadena de entrada
        int num = s.length();
        char[] arr = s.toCharArray();
                 System.out.println (arr); // salida de impresión
        // Stack<> stack;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < num; i++) {
            if ('{' == arr[i] || '(' == arr[i] || '[' == arr[i]) {
                stack.push(arr[i]);
            } else {
                if (stack.isEmpty()) {
                    flag = 1;
                } else {
                    if (('}' == arr[i] && stack.pop() == '{') || ')' == arr[i] && stack.pop() == '('
                            || ']' == arr[i] && stack.pop() == '[') {
                        stack.pop();
                    }
                }
            }
        }
        if (flag == 1 && stack.isEmpty())
            System.out.println("Yes");
        else {
            System.out.println("NO");
        }
    }

    


