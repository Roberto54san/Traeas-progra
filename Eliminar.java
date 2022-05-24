/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareasprog;

/**
 *
 * @author Robert
 */
public class Eliminar {
 
protected Nodo inicio, fin;

public lista () {
             inicio = null;
             fin = null;

}

public void agregarAlInicio(int olemonto) {
inicio = new Nodo(elemento,inicio);
if (fin == null){
     fin = inicio;
        }
}



public vóid agregaralFinal (int elemento) (
if(lestavacia()) 1

public void mostrartista() {
    Nodo aux = inicio
while (aux != null) {
System.out.print("[" + aur.dato + "]->");
aux=aux. siguiente;

public boolean estavacia() {
  if(this.inicio == null){
     return true;
  }
  return false;
}
  
public void agregarAlFinal (int elemento) {
 if (!estaVacia(){
this.fin.siguiente = new Nodo (elemento) ;
this.fin = this.fin.siguiente;
 }else{
this.inicio=this.fin = now Nodo(elemento);

public int eliminarAlInicio()
int dato = this.inicio.dato; 
if(this.inicio == this.fin){
 this.inicio=this.fin=null;
} else {
  nodo aux=inicio;  
}
this.inicio = this.inicio.siguente;
}
return dato;

public int eliminarAlInicio() {
 int dato = this. inicio.dato;
if (this. inicio == this.fin)(
tHis.inicio=this.fin=aull;
else(
this. inicio = this.inicio. siguiente;
        }
        
        
public int eliminaralFinal () {
int dato = this.fin.datos
if(this.inicio == this.fin) {
this. inicio=this.fin=nul1;
        }else{
Nodo aux=inicio
while (aux.siquiente!=fin) {
aux=aux.siguiente;
        }
fin=aux;
fin.siquiente = null;
        }
 return dato;
        
public void buscarElemento (int elemento){
nodo aux = inicio;
boolean encontrado = false;
while(aux!= null){
        if(aux != null){
        System.out.println("[" + aux.dato + "]");
        encontado = true;
        break;
        }
        aux = aux.siguiente;
        }
if encontrado == false)
Systam.out.printin("elemento no encontrado”);
               
}

public boolean existeElemento(int elemento){
 Nodo aux = inicios
 whilo(aux != null 66 aux.dato != elemento) {
 aux = aux.siguiente;
 return aux!=null;
        }
}
        
      
