/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
   Desarrolla un programa que simule el lanzamiento de un dado de seis caras. 
   El sistema debe funcionar de la siguiente manera:
   
   1. Esperar a que el usuario presione la tecla "Enter" para realizar el tiro.
   2. Generar un número aleatorio entero en el rango del 1 al 6 (inclusive).
   3. Mostrar el resultado del lanzamiento en pantalla.
   4. Preguntar al usuario si desea lanzar el dado nuevamente o salir del programa.
   
   Nota: Utiliza la clase Random para gestionar la generación de números al azar.
*/

package com.mycompany.ejercicios_libro_logica_de_programacion;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author diego
 */
public class Problemas_Diagramación_logica_ej14 {
    public static void resultado(){
        Scanner dc = new Scanner(System.in);
        int opcion;
        System.out.println("Bienvenid@");
        do{
           Random x = new Random(); 
           System.out.println("Presione enter para tirar el dado");
           dc.nextLine();
           System.out.println("El número es: "+x.nextInt(1, 6));
           System.out.println("¿Desea lanzar otra ver el dado?");
           System.out.println("1 para continuar o 0 para salir");
           opcion = dc.nextInt();
        }while(opcion==1);
    }
        public static void main(String[]args){
           resultado(); 
        }
}
