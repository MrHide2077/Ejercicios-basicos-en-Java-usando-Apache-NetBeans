/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
   Desarrolla un programa que simule un sensor de temperatura ambiental. 
   El sistema debe funcionar siguiendo estos pasos:
   
   1. Esperar a que el usuario presione la tecla "ENTER" para activar el sensor.
   2. Generar un valor de temperatura aleatorio en un rango que incluya valores 
      negativos y positivos (desde -20°C hasta 40°C).
   3. Mostrar el resultado en pantalla indicando que se trata de grados Celsius (°C).
   4. Ofrecer al usuario la opción de realizar una nueva lectura o finalizar 
      la ejecución del programa.
*/

package com.mycompany.ejercicios_libro_logica_de_programacion;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author diego
 */
public class Problemas_Diagramación_logica_ej15 {
    public static void resultado(){
        Scanner dc = new Scanner(System.in);
        int opcion;
        System.out.println("Bienvenid@");
        do{
           System.out.println("Presione ENTER para generar la temperatura");
           dc.nextLine();
           Random x = new Random();
           System.out.println("La temperatura es: "+x.nextInt(-20, 40)+"°C");
           System.out.println("¿Desea otra temperatura?");
           System.out.println("1 para continuar y 0 para salir");
           opcion = dc.nextInt();
        }while(opcion==1);
    }
        public static void main(String[]args){
            resultado();
        }
}
