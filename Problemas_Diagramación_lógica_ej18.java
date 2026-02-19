/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
   Desarrolla un sistema de gestión para una veterinaria que permita registrar 
   un total de 30 pacientes, clasificándolos únicamente como "Perro" o "Gato".
   
   El programa debe cumplir con los siguientes requisitos:
   1. Validar la entrada: Solo se debe permitir el ingreso si el usuario escribe 
      "Perro" o "Gato" (sin importar mayúsculas o minúsculas).
   2. Capturar la edad de cada animal registrado.
   3. Procesar los datos para obtener:
      - La cantidad total de perros y la cantidad total de gatos.
      - El promedio de edad específico para cada especie.
   4. Mostrar los resultados finales en un formato claro y permitir 
      reiniciar el sistema si el usuario lo desea.
*/

package com.mycompany.ejercicios_libro_logica_de_programacion;
import java.util.Scanner;

/**
 *
 * @author diego
 */

public class Problemas_Diagramación_lógica_ej18 {
    
    public static void Resultado(){
        var CG = 0;
        var CP = 0;
        var EP=0;
        var EG=0;
        var ETP=0;
        var ETG=0;
        var CT=30;
        int opcion;
        String animal="";
        int edad = 0;

        do{
            
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
           
                 for(int i=0; i<CT; i++){
                   Boolean entradavalida=false;
                   
                   while(!entradavalida){
                       System.out.println("Porfavor ingrese el animal "+(i+1));
                       animal=dc.nextLine();
                     if(animal.equals("Perro") || animal.equals("perro") || animal.equals("Gato") || animal.equals("gato")){
                         entradavalida=true;
                         if(animal.equals("Perro") || animal.equals("perro")){
                             System.out.println("Ingrese la edad del animal: "+(i+1));
                             edad=dc.nextInt();
                             dc.nextLine();
                             
                             CP += 1;
                             ETP += edad;
                         }else{
                             System.out.println("Ingrese la edad del animal: "+(i+1));
                             edad=dc.nextInt();
                             dc.nextLine();
                             
                             CG += 1;
                             ETG += edad;
                         }
                     }else{
                         System.out.println("Animal no valido");
                         System.out.println("Solo se permiten Perros o Gatos");
                     }
                 }
                   
             }
                 int promEP = ETP/CP;
                 int promEG = ETG/CG;
                 
                 System.out.println("El número total de Perros fue: "+CP);
                 System.out.println("Con un promedio de: "+promEP+" años");
                 System.out.println("El número total de Gatos fue: "+CG);
                 System.out.println("Con un promedio de: "+promEG+" años");
                 System.out.println("------------------------------------");
                 System.out.println("Presione 1 para ingresar otros pacientes");
                 System.out.println("Presione 0 para salir");
                 opcion = dc.nextInt();
        }while(opcion==1);
        
        System.out.println("Gracias por usar este sistema");
        System.out.println("Nos vemos...");
    }
    public static void main(String[]args){
        Resultado();
    }
}
