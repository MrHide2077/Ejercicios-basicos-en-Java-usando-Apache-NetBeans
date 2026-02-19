/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
   Desarrolla un programa que solicite al usuario un número natural para 
   determinar si este es PAR o IMPAR.
   
   El sistema debe cumplir con los siguientes requisitos:
   1. Utilizar el operador aritmético de residuo (%) para evaluar el número.
   2. Mostrar un mensaje personalizado indicando la naturaleza del número.
   3. Implementar un menú interactivo que permita al usuario realizar 
      múltiples consultas antes de finalizar la ejecución.
*/

package com.mycompany.ejercicios_libro_logica_de_programacion;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Problemas_Diagramación_logica_ej12 {
    public static void resultados(){
        Scanner dc = new Scanner(System.in);
        int opcion;
        System.out.println("Bienvenid@");
        do{
          System.out.println("Porfavor ingrese un número NATURAL");
          int N = dc.nextInt();
          if(N%2==0){
            System.out.println(+N+" Es par");
          }else{
            System.out.println(+N+" Es impar");
          }
          System.out.println("¿Desea analizar otro número? 1 para continuar o 0 para salir");
          opcion = dc.nextInt();
        }while(opcion==1);
    }
        public static void main(String[]args){
            resultados();
        }
}
