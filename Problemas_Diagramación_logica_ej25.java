/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_libro_logica_de_programacion;

import java.util.Scanner;

/*Mostrar la mínima altura registrada de un grupo de 30 personas y
además en qué ubicación se encuentra.*/

/**
 *
 * @author diego
 */
public class Problemas_Diagramación_logica_ej25 {
    
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
        
        int total = 5;
        Double matriz[][] = new Double[total][2];
        
        do{
            if(opcion==1){
            Double menor = Double.MAX_VALUE;
            int posicionMenor = 0;
            
            System.out.println("Ingrese las alturas en centimetros porfavor");
            for(int i=0; i<total; i++){
                    
                    boolean valido = false;
                    
                    while(!valido){
                        
                        System.out.println("Porfavor ingrese la altura: "+(i+1));
                        Double alttemp = dc.nextDouble();
                        dc.nextLine();
                        
                        if(alttemp<100){
                            
                            System.out.println("--------------------------------");
                            System.out.println("Altura invalida");
                            System.out.println("Ingrese una altura valida");
                            System.out.println("--------------------------------");
                            
                        }else{
                            
                            matriz[i][0] = (double) i + 1; 
                            matriz[i][1] = alttemp;
                            valido = true;
                            
                            if(alttemp<menor){
                                menor = alttemp;
                                posicionMenor = i+1;
                            }
                        }
                    }
            }
            
                        System.out.println("La altura menor fue: "+menor+" cm en la posición: "+posicionMenor);
                
                        System.out.println("¿Desea ingresar otro número?");
                        System.out.println("================================");
                        System.out.println("  [1] Continuar");
                        System.out.println("  [0] Salir");
                        System.out.println("--------------------------------");
                
                        opcion = dc.nextInt();
                        dc.nextLine();    
            }
            
        }while(opcion==1);
        
                    System.out.println("--------------------------------");
                    System.out.println("Gracias por usar este sistema");
                    System.out.println("Nos vemos...");
                    System.out.println("--------------------------------");
      }
    
        public static void main(String[]args){
        resultado();
    }
}
