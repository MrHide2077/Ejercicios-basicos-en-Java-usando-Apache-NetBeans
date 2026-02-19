/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Desarrolla un programa en Java que determine el número consecutivo (siguiente) de un valor entero proporcionado por el usuario

package com.mycompany.ejercicios_libro_logica_de_programacion;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Problemas_Diagramación_lógica_ej5 {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        System.out.println("Siguiente número");
        System.out.println("Ingrese el número");
            int sg = Integer.parseInt(dc.nextLine());
            int x = (sg+1);
                System.out.println("Siguiente número: " +x);
    }
    
}
