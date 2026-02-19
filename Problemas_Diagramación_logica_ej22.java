/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_libro_logica_de_programacion;
import java.util.Scanner;

/*
 Desarrollar un sistema interactivo en Java que calcule el factorial de un número. 
 El programa debe incluir un menú inicial, realizar el cálculo mediante un bucle 
 acumulativo utilizando el tipo de dato 'long' para evitar desbordamientos, 
 y permitir al usuario repetir el proceso o salir del sistema mediante un ciclo do-while.
 */

/**
 *
 * @author diego
 */
public class Problemas_Diagramación_logica_ej22 {
    public static void presentacion(){
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
                System.out.println("Porfavor digite el numero para saber su factorial: ");
                int numb = dc.nextInt();
                dc.nextLine();
                
                if(numb<=1){
                    System.out.println("El factorial de: "+numb+" es: 1");
                    
                }else if(numb>1){
                    long fact=1;
                    for(int i=1; i<=numb; i++){
                        fact *=  i;

                    }
                    System.out.println("El factorial de: "+numb+" es: "+fact);
                }
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
            
        }else if(opcion==1){
            System.out.println("--------------------------------");
            System.out.println("Gracias por usar este sistema");
            System.out.println("Nos vemos...");
            System.out.println("--------------------------------");
        }
    }
    public static void main(String[]args){
        presentacion();
        
    }
}
