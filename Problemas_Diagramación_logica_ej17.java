/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
   Desarrolla un programa que automatice la suma de 10 números aleatorios. 
   El sistema debe realizar las siguientes funciones:
   
   1. Generar automáticamente 10 números enteros al azar en un rango 
      del 1 al 19.
   2. Mostrar cada número generado en la consola para que el usuario 
      pueda ver la secuencia.
   3. Utilizar un acumulador para obtener la suma total de los 10 números.
   4. Al finalizar la secuencia, mostrar el resultado de la sumatoria.
   5. Permitir al usuario repetir todo el proceso mediante un menú interactivo.
*/

package com.mycompany.ejercicios_libro_logica_de_programacion;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author diego
 */
public class Problemas_Diagramación_logica_ej17 {
    public static void resultado(){
        Scanner dc = new Scanner(System.in);
        int opcion;
        Random rd = new Random();
        System.out.println("Bienvenid@");
        System.out.println("Presione ENTER para continuar");
        do{
        int suma = 0;
        for(int i=0; i<10; i++){
            int n = rd.nextInt(1, 20);
            System.out.println(+(i+1)+" El Número elegido es :"+n);
            suma += n;
        } 
        System.out.println("El resultado es: "+suma);
        System.out.println("¿Desea hacer otra operación?");
        System.out.println("1 para contiuar o 0 para salir");
        opcion = dc.nextInt();
        }while(opcion==1);
    }
        public static void main(String[]args){
            resultado();
        }
}
