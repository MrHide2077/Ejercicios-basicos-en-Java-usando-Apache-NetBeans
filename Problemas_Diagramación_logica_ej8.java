/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
   Desarrolla un programa que solicite al usuario un número natural. 
   El sistema debe evaluar este número y determinar si pertenece 
   a la "primera docena" (es decir, que el valor esté en el rango del 1 al 12).
   
   El programa debe cumplir con:
   1. Validar que el número sea positivo (mayor a 0).
   2. Usar lógica condicional para verificar el rango (1 a 12).
   3. Permitir al usuario repetir el proceso hasta que decida salir.
*/

package com.mycompany.ejercicios_libro_logica_de_programacion;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Problemas_Diagramación_logica_ej8 {
  public static void resultado(){
      Scanner dc = new Scanner(System.in);
      int opcion;
      do{
          System.out.println("Bienvenid@");
          System.out.println("Porfavor ingrese un número NATURAL");
          int x = dc.nextInt();
          if(x<=12 && x>0){
              System.out.println(+x+ " Esta dentro de la primera docena");
          } else if(x<0){
              System.out.println("Número invalido, intente otra vez...");
          }else{
              System.out.println(+x+" Fuera de la primera docena");
          }
          System.out.println("¿Desea introducir otro número? Presione 0 para salir y 1 para continuar");
          opcion = dc.nextInt();
      }while(opcion==1);
      System.out.println("Gracias por usal el programa");
      System.out.println("Nos vemos...");
  }
    public static void main(String[]args){
        resultado();
    }
}
