/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
   Desarrolla un programa que permita calcular el promedio de edad de un 
   grupo de 10 personas. 
   
   El sistema debe realizar las siguientes tareas:
   1. Solicitar al usuario el ingreso de 10 edades de forma consecutiva.
   2. Utilizar un bucle para repetir la captura de datos y acumular el 
      valor total de las edades.
   3. Calcular el promedio matemático (Suma total / Cantidad de personas).
   4. Mostrar el resultado final del promedio en la consola.
*/

package com.mycompany.ejercicios_libro_logica_de_programacion;

import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Problemas_Diagramación_logica_ej16 {
    public static void resultado(){
        Scanner dc = new Scanner(System.in);
        int cant = 10;
        int suma = 0;
        for (int i=0; i<cant; i++){
            System.out.println("Ingrese la edad :"+(i+1));
            int num = dc.nextInt();
            suma += num;
        }
        int prom = suma/cant;
        System.out.println("El promedio de edades es :"+prom);
    }
        public static void main(String[]args){
            resultado();
        }
}
