/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* 
   Desarrolla un programa que genere una cantidad personalizada de números 
   aleatorios y realice un análisis estadístico simple.
   
   El programa debe cumplir con lo siguiente:
   1. Solicitar al usuario cuántos números desea generar (N).
   2. Generar automáticamente N números enteros en un rango del 1 al 100.
   3. Determinar y contabilizar cuántos de los números generados son 
      PARES y cuántos son IMPARES.
   4. Mostrar los resultados finales de ambos contadores.
   5. Permitir al usuario repetir el proceso con una nueva cantidad de 
      números o salir del sistema.
*/

package com.mycompany.ejercicios_libro_logica_de_programacion;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author diego
 */
public class Problemas_Diagramación_lógica_ej20 {
    public static void resultados(){
           Scanner dc = new Scanner(System.in);
           var rd = new Random();
           int contadorP=0;
           int contadorI=0;
           
           System.out.println("--------------------------");
           System.out.println("         Bienvenid@");
           System.out.println("------------------------------");
           System.out.println(" Sistema de numeros aleatorios");
           System.out.println("------------------------------");
           System.out.println("    Presione 0 para salir");
           System.out.println("  Presione 1 para continuar");
           System.out.println("------------------------------");
           
           int opcion = dc.nextInt();
           dc.nextLine();
           do{
               System.out.println("Ingrese la cantidad de numeros que desea");
               int Nu = dc.nextInt();
               dc.nextLine();
               
               for(int i=0; i<Nu; i++){
                   int aleatorio = rd.nextInt(100)+1;
                   System.out.println("Numero generado: "+aleatorio);
                   if(aleatorio %2 == 0){
                       contadorP++;
                   }else{
                       contadorI++;
                   }
               }
             System.out.println("Impares: "+contadorI);
             System.out.println("Pares: "+contadorP);
             System.out.println("----------------------------------");
             System.out.println("¿Desea generar mas numeros?");
             System.out.println("Pulse 1 para continuar");
             System.out.println("Pulse 0 para Salir");
             System.out.println("----------------------------------");
             
            opcion = dc.nextInt();
            dc.nextLine();
           }while(opcion==1);
           System.out.println("Gracias por usar este sistema");
           System.out.println("Nos vemos.....");
    }
    public static void main(String[]args){
        resultados();
    }
}
