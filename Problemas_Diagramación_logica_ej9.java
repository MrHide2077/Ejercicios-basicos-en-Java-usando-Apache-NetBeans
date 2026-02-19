package com.mycompany.ejercicios_libro_logica_de_programacion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
   Desarrolla un sistema para el club deportivo 'Sol Naciente' que permita 
   clasificar a sus socios según su nivel de membresía. 
   
   El programa debe solicitar el nombre, la categoría (A, B o C) y los años 
   de antigüedad del socio, aplicando las siguientes reglas de negocio:
   
   1. Categoría A: 
      - Si tiene entre 10 y 20 años de antigüedad, es "Miembro VIP".
      - Si tiene entre 5 y 9 años de antigüedad, es "Socio ORO".
   2. Categoría B: Independientemente de los años, es "Miembro PLATA".
   3. Categoría C: Independientemente de los años, es "Miembro BRONCE".
   
   El sistema debe permitir consultas sucesivas hasta que el usuario decida salir.
*/


import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Problemas_Diagramación_logica_ej9 {
  public static void resultado(){
      Scanner dc = new Scanner(System.in);
      int opcion;
      System.out.println("Bienvenido al sistema de socios del club deportivo 'Sol Naciente'");
      do{
          System.out.println("Porfavor ingrese el nombre de socio");
          String nombre = dc.nextLine();
          System.out.println("Ingrese la categoría a la que pertenece  (A, B , C)");
          String categoria = dc.nextLine();
          System.out.println("Ingrese los años que lleva en el club");
          int anti = dc.nextInt();
          if(categoria.equals("A") && anti<=20 && anti>=10){
              System.out.println("El socio: "+nombre+" Miembro VIP");
          }else if(categoria.equals("A") && anti<=9 && anti>=5){
              System.out.println("El socio: "+nombre+" Es socio ORO");
          }else if(categoria.equals("B")){
              System.out.println("El socio: "+nombre+" Es miembro PLATA");
          }else if(categoria.equals("C")){
              System.out.println("El socio: "+nombre+" Es miembro BRONCE");
          }
          System.out.println("¿Desea consultar otro miembro? Presione 1 para continuar o presione 0 para salir");
          opcion = dc.nextInt();
      }while(opcion==1);
  }
    public static void main(String[]args){
        resultado();
    }
}
