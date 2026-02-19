/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//Desarrolla un programa en Java que realice la suma de dos números enteros proporcionados por el usuario

package com.mycompany.ejercicios_libro_logica_de_programacion;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Problemas_Diagramación_lógica_ej1 {

    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        System.out.println("Sumatoria de dos números");
        
            System.out.println("El primer número porfavor");
            int cd = Integer.parseInt(dc.nextLine());
            
            System.out.println("El segundo número porfavor");
            int sc = Integer.parseInt(dc.nextLine());
            
            int sm = cd + sc;
                System.out.println("La suma es:" +sm);
    }
}
