/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareasprog;

/**
 *
 * @author Robert
 */
public class pila {
   

class Nodo {
char simbolo;
 Nodo sig;

}

private Nodo raiz;

pila (){
raiz=null;

}

public void insertar(char x) {
Nodo nuevo;
nuevo = new Nodo();
nuevo.simbolo = x;
if (raiz==null)
{
nuevo. sig = null;
raiz = nuevo;
}

else

{
nuevo.sig = raiz;
raiz = nuevo; 
}
}

public char extraer ()
{
if (raiz!=null)
{
char informacion = raiz. simbolo;
raiz = raiz.sig;
return informacion;
}
else
{
return Character. MAX_VALUE;
}
}
public boolean vacia() {
    return raiz==null;
}
}
