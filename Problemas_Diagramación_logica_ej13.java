/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
   Desarrolla un programa que solicite un número natural al usuario y realice 
   un análisis basado en dos criterios simultáneos:
   
   1. Verificar si el número es múltiplo de 7 (utilizando el operador residuo %).
   2. Determinar su relación de magnitud con respecto al número 40 (mayor, 
      menor o igual).
   
   El sistema debe mostrar un mensaje específico que combine ambos resultados 
   (por ejemplo: "Es múltiplo de 7 y mayor a 40"). Además, debe permitir 
   repetir el análisis hasta que el usuario decida finalizar.
*/

package com.mycompany.ejercicios_libro_logica_de_programacion;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Problemas_Diagramación_logica_ej13 {
    public static void resultado(){
        Scanner dc = new Scanner(System.in);
        int opcion;
        System.out.println("Bienvenid@");
        do{
            System.out.println("Ingrese un número NATURAL");
            int x = dc.nextInt();
            if(x%7==0 && x>40){
                System.out.println(+x+" Es múltiplo de 7 y mayor a 40 ");
            }else if(x%7==0 && x==40){
                System.out.println(+x+" Es múltiplo de 7 pero igual a 40");
            }else if(x%7==0 && x<40){
                System.out.println(+x+" Multiplo de 7 pero menor a 40");
            }else if(x>40){
                System.out.println(+x+" No es multiplo de 7 pero es mayor a 40");
            }else if(x==40){
                System.out.println(+x+" No es multiplo de 7 pero es ya jajaja");
            }else if(x<40){
                System.out.println(+x+" No es multiplo de 7 pero  es menor a 40");
            }
            System.out.println("¿Desea analizar otro número? 1 para continuar o 0 para salir");
            opcion = dc.nextInt();
        }while(opcion==1);
    }
        public static void main(String[]args){
            resultado();
        }
}
