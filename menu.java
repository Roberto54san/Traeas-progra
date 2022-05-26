/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareasprog;

/**
 *
 * @author Robert
 */
public class menu {
    public class PilaEjemplo {

    Scanner in = new Scanner(System.in);
    Pila pila = new Pila();
    Cola cola = new Cola();
   
    public static void main(String[] args) {
        PilaEjemplo pilaEjemplo = new PilaEjemplo();
        pilaEjemplo.menu();
    }
   
    public void menu(){
        boolean exit = false;
        int option;
       
        while(!exit){
            System.out.println("\n1. push");
            System.out.println("2. pop");
            System.out.println("3. is empty?");
            System.out.println("4. who is at the start?");
            System.out.println("5. Size stack");
            System.out.println("6. clean stack");
            System.out.println("7. exit");
            System.out.println("select option");
            option = in.nextInt();
            switch(option){
                case 1:
                    System.out.println("Ingrese el dato:");
                    cola.push(in.nextInt());
                    //pila.push(in.nextInt());
                    break;
                case 2:
                    if(!cola.isEmpty()){
                        System.out.println(cola.pop());
                    }
                    break;
                case 3:
                    System.out.println(" is empty? " + cola.isEmpty());
                    break;
                case 4:
                    if(!cola.isEmpty()){
                        System.out.println(cola.inicio());
                    }else{
                        System.out.println("is empty");
                    }
                   
                    break;
                case 5:
                    System.out.println("Size " + cola.size());
                    break;
                case 6:
                    if(!pila.isEmpty()){
                        pila.limpiar();
                        System.out.println("Limpiando stack");
                    }else{
                        System.out.println("is Empty");
                    }
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("no se encontro");
            }
        }
       
    }
   
}
}
