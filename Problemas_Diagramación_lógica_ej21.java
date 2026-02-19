/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* 
   Desarrolla un programa que genere una secuencia numérica desde un número 
   base ingresado por el usuario hasta llegar al número 1.
   
   El programa debe ser capaz de:
   1. Identificar si el número ingresado es mayor o menor a 1.
   2. Si el número es mayor a 1, realizar un conteo regresivo (hacia abajo).
   3. Si el número es menor a 1, realizar un conteo progresivo (hacia arriba).
   4. Validar el caso especial del número 0 con un mensaje informativo.
   5. Utilizar un ciclo que permita al usuario repetir la operación 
      con diferentes números base.
*/

package com.mycompany.ejercicios_libro_logica_de_programacion;

import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Problemas_Diagramación_lógica_ej21 {
    public static void resultado(){
        System.out.println("----------------------------------------");
        System.out.println("               Bienvenid@");
        System.out.println("        Presione 1 para continuar");
        System.out.println("          Presione 0 para salir");
        System.out.println("----------------------------------------");
        
        Scanner dc = new Scanner(System.in);
        int opcion = dc.nextInt();
        dc.nextLine();
        
        do{
            System.out.println("Porfavor ingrese el numero base");
            double num = dc.nextDouble();
            if(num!=0){
                
                if(num<1){
                
                System.out.println("Los numeros entre: "+num+ " y 1 son:");
            
                for(double i=num; i<1; i++){
                
                System.out.println(+i);
                }
                
            }else if(num>=1){
                
                System.out.println("Los numeros entre: "+num+ " y 1 son:");
            
                for(double i=num; i>1; i--){
                
                System.out.println(+i);
                }
              }
            }else if(num==0){
                System.out.println("         ¿Pusiste cero?");
                System.out.println("¿Necesitas contar de cero a cero?");
                System.out.println("     Imaginare que no vi eso");
            }
            
            
            System.out.println("----------------------------------------");
            System.out.println("  ¿Desea repetir este programa otra vez?");
            System.out.println("        Presione 1 para continuar");
            System.out.println("          Presione 0 para salir");
            System.out.println("----------------------------------------");
            opcion = dc.nextInt();
            
        }while(opcion==1);
        
        System.out.println("----------------------------------------");
        System.out.println("Gracias por usar este sistema");
        System.out.println("Nos vemos...");
        System.out.println("----------------------------------------");
    }
    public static void main(String[]args){
        resultado();
    }
}