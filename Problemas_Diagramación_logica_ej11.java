/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
   Desarrolla un programa que calcule la longitud de la hipotenusa de un 
   triángulo rectángulo a partir de sus dos catetos.
   
   El programa debe seguir estos lineamientos:
   1. Solicitar al usuario el valor decimal de ambos catetos.
   2. Utilizar la función especializada de la librería Math para calcular 
      la hipotenusa directamente (evitando errores de precisión).
   3. Mostrar el resultado final en consola.
   4. Implementar un ciclo que permita realizar múltiples cálculos 
      antes de cerrar el programa.
*/

package com.mycompany.ejercicios_libro_logica_de_programacion;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Problemas_Diagramación_logica_ej11 {
    public static void resultado(){
        Scanner dc = new Scanner(System.in);
        int opcion;
        System.out.println("Bienvenid@");
        do{
            System.out.println("Porfavor ingrese el primer cateto:");
            double cat1 = dc.nextDouble();
            System.out.println("El segundo cateto:");
            double cat2 = dc.nextDouble();
            double res = Math.hypot(cat1, cat2);
            System.out.println("La hipotenusa es: "+res);
            System.out.println("¿Desea hacer otro calculo?  1 para continuar y 0 para salir");
            opcion = dc.nextInt();
        }while(opcion==1);
    }
        public static void main(String[]args){
            resultado();
        }
}
