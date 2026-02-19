/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
   Desarrolla un sistema avanzado para una veterinaria que permita registrar 
   un lote de 5 pacientes utilizando arreglos (arrays). 
   
   El programa debe realizar las siguientes acciones:
   1. Almacenar los nombres de las especies y sus edades en arreglos separados.
   2. Una vez completado el registro, el sistema debe analizar los datos para 
      agrupar a los animales por especie (sin importar el orden de ingreso).
   3. Para cada especie detectada, se debe mostrar:
      - El nombre de la especie.
      - Cuántos animales de ese tipo se registraron.
      - El promedio de edad de esa especie en particular.
   4. Utilizar un mecanismo de control (arreglo de booleanos) para asegurar 
      que cada especie se contabilice una sola vez en el reporte final.
*/

package com.mycompany.ejercicios_libro_logica_de_programacion;

import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Problemas_Diagramación_lógica_ej19 {
    
        public static void vet2(){
            int opcion;
            String animal;
            int CT=5;
            String[] listaanimal = new String[CT];
            int[] listaedad = new int[CT];
            
            Scanner dc = new Scanner(System.in);
                 System.out.println("--------------------------");
                 System.out.println("       Bienvenid@");
                 System.out.println("--------------------------");
                 System.out.println("    Sistema Veterinaria");
                 System.out.println("--------------------------");
                 System.out.println("   Presione 0 para salir");
                 System.out.println(" Pulsione 1 para continuar");
                 System.out.println("---------------------------");

                 opcion = dc.nextInt();
                 dc.nextLine();
                 
            do{
                 if(opcion==1){
                     for(int i=0; i<CT; i++){
                      System.out.println("Porfavor ingrese el animal "+(i+1));
                      listaanimal[i] = dc.nextLine();
                      System.out.println("Ingrese la edad de: "+listaanimal[i]);
                      listaedad[i] = dc.nextInt(); 
                      dc.nextLine();
                 }
                 boolean[] revisado = new boolean[CT];
                 
                 for(int i=0; i<CT; i++){
                     if(revisado[i]==false){
                        var especieact =  listaanimal[i];
                        var contadoresp = 0;
                        var sumaedad = 0;
                        
                        for(int j=0; j<CT; j++){
                            if(especieact.equalsIgnoreCase(listaanimal[j])){
                                sumaedad += listaedad[j];
                                contadoresp++;
                                revisado[j]=true;
                            } 
                        }
                        
                        int prom = sumaedad/contadoresp;
                        System.out.println("Especie : "+listaanimal[i]+ " |  Cantidad: "+contadoresp);
                        System.out.println("Promedio de edad de la especie: "+listaanimal[i]+ " | "+prom);
                        
                     }
                 } 
                 
                    System.out.println("¿Desea continuar? 1:Sí 0:No");
                    opcion = dc.nextInt();
                 }     
            }while(opcion==1);
            
            System.out.println("Gracias por usar este sistema");
            System.out.println("Nos vemos ...");
        }
    public static void main(String[]args){
        vet2();
    }
}
