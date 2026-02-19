/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* 
   Desarrolla un programa que actúe como una pequeña base de datos geográfica. 
   El sistema debe realizar las siguientes tareas:
   
   1. Solicitar al usuario el nombre de un País.
   2. Solicitar al usuario el nombre de la Capital de dicho país.
   3. Almacenar ambos datos en variables de tipo texto (String).
   4. Mostrar un mensaje final que combine ambas respuestas en una sola frase 
      concreta (por ejemplo: "La capital de Colombia es Bogotá").
*/

package com.mycompany.ejercicios_libro_logica_de_programacion;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Problemas_Diagramación_lógica_ej2 {
    public static void main(String[] args) {
        System.out.println("País y capital");
        Scanner myObj = new Scanner(System.in);
            System.out.println("País porfavor");
            String pa = myObj.nextLine();
            System.out.println("Capital porfavor");
            String rd = myObj.nextLine();
            
                System.out.println("La capital de: " + pa + " es: " + rd);
    }
}
