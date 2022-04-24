/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareasprog;

/**
 *
 * @author Robert
 */
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Formula extends JFrame implements ActionListener{
private JTextField tf1;
private JButton boton1;

 public Formula () {
setLayout(null);
tf1=new JTextField();
tf1.setBounds(10, 10, 230, 30);
add(tf1);
boton1=new JButton ("Verificar Formula"); 
boton1.setBounds(10, 78, 180, 39);
add(boton1);
boton1.addActionListener(this);



public static void main(String[] ar) {
Formula f=new Formula();
f.setBounds(0, 0, 360, 160);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

@Override
public void actionPerformed(ActionEvent e) {
if (e.getSource()==boton1) {
if (balanceada()) {
  setTitle("Formula correcta");
} else {
 setTitle("Formula incorrecta");
 }
}

 public boolean balanceada() {
 String cadena=tf1.getText();
 pila pilal=new pila();
 for(int f=0;f<cadena.length();f++) {  
  if (cadena.charAt=="(" || cadena.charAt(f)== ["|| cadena.charAt(F)== [){
 pilal.insertar(cadena.charAt(f));
  } else {
     if (cadena.charAt(f)==")") {
     }if (cadena.charat(f)==")") {
           if (pilal.extraer()!="[") {
                   return false;
}

} else {
 if (cadena.charAt(f)=="]") {
 if (pilal.extraer()!="[") {
return false;

 

}
}else {
 if (cadena.charAt(f)=="}") {
 if (pilal.extraer()!="{") {
return false;
}
}
}

if (pilal.vacia()) {
    return true;
 }eles{
    return false;
}
}
          }
