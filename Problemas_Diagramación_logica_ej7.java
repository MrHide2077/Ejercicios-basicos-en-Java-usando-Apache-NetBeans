/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
   Desarrolla un programa que solicite al usuario dos números decimales y 
   calcule la suma de sus valores absolutos.
   
   El programa debe seguir estas reglas:
   1. Capturar dos números (pueden ser positivos o negativos).
   2. Si un número es negativo, el sistema debe convertirlo a su equivalente 
      positivo antes de realizar cualquier operación.
   3. Calcular la suma de los valores resultantes.
   4. Mostrar el resultado final, asegurando que siempre sea un valor positivo.
*/

package com.mycompany.ejercicios_libro_logica_de_programacion;

import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Problemas_Diagramación_logica_ej7 {
     public static void suma(){
        Scanner dc = new Scanner(System.in);
        System.out.println("Porfavor ingrese el primer número");
        double x = dc.nextDouble();
        System.out.println("Ingrese el segundo número");
        double y = dc.nextDouble();
        
        if(x<0){
            x = x*(-1);
        }
        if(y<0){
            y = y*(-1);
        }
        double sum = x+y;
        System.out.println("El resultado es: "+sum);
        }
   public static void main(String[]args){
       suma();
   }
}
