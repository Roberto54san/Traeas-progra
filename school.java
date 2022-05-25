/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareasprog;

/**
 *
 * @author Robert
 */
public class school {
    El import java. util. Arraylist;

private Arraylist<Student> students;
public School (){

students=new ArrayList<>() ;

 public vold agregarEstudiante (Student nuevoEstudiante) {
     students.add (nuevoEstudiante) ;
 }

public boolean buscarpornombre(String name){
        
private ArrayList<Student> students;
Publio School() {
students=new ArrayList<> ();


public void agregarEstudianto (Student nuevoEstudiante) {
students.add(nuevoEstudianto) ;

}

public boolean buscarPorNombre (String name) {
boolean encontrado = false;
int i = 0;
while (encontrado == false ££ i<students.size()){
if (students.get (i) .getName ().CompareToIgnorecase (name)==0) {
encontrado = true;
}else{
    1++;
}
}
students.add(nuevoEstudíante);
}

public boolean buscarpormombre (String name) {
boolean encontrado = false;
int i = 0;
while (encontrado == false ££ i<studonte.size()) {
if (students.get(i).getName ().ComparoToIgnoreCase (name)==0) {
encontrado = true;
}else{
i++;
}
}
if (encontrado) {
JOptionpane. showkossagepialog(null,"1o oxiste ol nombre, intente nuevamente.
return true;
}

} 

ALumnoAndcalificación {
public static void main(String[])args) {

Student sl =new Student ("PDHN", “Programador”, 70);
Student s2=new Student ("Alex", "Dagoada”, 90);
Student S3 =new Student("Jane", “programador”, 80);
School school=new School ();
school.agregarEstudiante(s1);
school.agregarEstudiante(s2);
school.agregarEstudiante(s3); 


public static void maín(Stringl] args) (
Student s1 =new Student (“PDHN", “Programador”, 70);
Student s2=new Student ("Alex", "Pagoada", 90);
Student s3 =new Student ("Jane", "Programador", 80);
School school=new School ();
school.agregarEstudiante (s1);
school.agregarEstudiante (s2) ;
school.agregarEstudiante (s3) ;
boolean valor = false;
do{
String name =JOptionPane. showInputDialog(" ingrese elnonbre");
valor = school .buscarPorNombre (name);
)while (valor) ;

}
}
