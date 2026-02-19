/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
   Desarrolla un programa que permita calcular las funciones trigonométricas 
   de Seno y Coseno para cualquier ángulo ingresado por el usuario.
   
   El programa debe seguir estos pasos lógicos:
   1. Solicitar al usuario el valor de un ángulo en grados sexagesimales.
   2. Realizar la conversión del ángulo a radianes, ya que las funciones 
      matemáticas de Java trabajan bajo esa unidad de medida.
   3. Calcular y mostrar los resultados utilizando la librería Math.
   4. Permitir que el usuario repita el proceso cuantas veces lo necesite.
*/

package com.mycompany.ejercicios_libro_logica_de_programacion;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Problemas_Diagramación_logica_ej10 {
  public static void resultados(){
      Scanner dc = new Scanner(System.in);
      int opcion;
      System.out.println("Bienveni@");
      do{
         System.out.println("Porfavor ingrese el angulo");
         double grado = dc.nextDouble();
         double radianes = Math.toRadians(grado);
         double cos = Math.cos(radianes);
         double sen = Math.sin(radianes);
         System.out.println("El seno de :"+grado+" es: "+sen);
         System.out.println("El coseno de: "+grado+" es: "+cos);
         System.out.println("¿Desea ingresar otro angulo? 1 para continuar o 0 para salir");
         opcion = dc.nextInt();
      }while(opcion==1);
  }
    public static void main(String[]args){
       resultados(); 
    }
}
