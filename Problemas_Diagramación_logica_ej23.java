/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_libro_logica_de_programacion;

import java.util.Scanner;

/*
 Desarrollar un programa en Java que permita capturar un conjunto de 30 edades 
 utilizando un arreglo (array) de enteros. El sistema debe recorrer el arreglo 
 mediante un bucle para identificar cuál es la edad mayor de todas las ingresadas 
 apoyándose en el método Math.max(). Finalmente, el programa debe permitir 
 realizar nuevos análisis o finalizar la ejecución mediante un menú interactivo.
 */


/**
 *
 * @author diego
 */
public class Problemas_Diagramación_logica_ej23 {
        public static void resultado(){
                System.out.println("================================");
                System.out.println("       SISTEMA PRINCIPAL        ");
                System.out.println("================================");
                System.out.println("  [1] Continuar");
                System.out.println("  [0] Salir");
                System.out.println("--------------------------------");
                System.out.print("Seleccione una opción: ");
    
                Scanner dc = new Scanner(System.in);
                int opcion = dc.nextInt();
                dc.nextLine();
                
                if(opcion!=0){
                    do{
                        System.out.println("Ingrese las edades porfavor: ");
                        int[] may = new int[30];
                        int Elmayor = 0;
                    
                            for (int i=0; i<5;i++){
                            System.out.println("La edad actual es : "+(i+1));
                            may[i] = dc.nextInt();
                        
                            Elmayor = Math.max(Elmayor, may[i]);
                           }
                        System.out.println("La edad mayor es: "+Elmayor);
                    
                        System.out.println("¿Desea ingresar otro número?");
                        System.out.println("================================");
                        System.out.println("  [1] Continuar");
                        System.out.println("  [0] Salir");
                        System.out.println("--------------------------------");
                
                        opcion = dc.nextInt();
                        dc.nextLine();
                    }while(opcion==1);
                    System.out.println("--------------------------------");
                    System.out.println("Gracias por usar este sistema");
                    System.out.println("Nos vemos...");
                    System.out.println("--------------------------------");
                    
                }else{
                    System.out.println("--------------------------------");
                    System.out.println("Gracias por usar este sistema");
                    System.out.println("Nos vemos...");
                    System.out.println("--------------------------------");
                }
        }
    public static void main(String[]args){
        resultado();
    }
}
