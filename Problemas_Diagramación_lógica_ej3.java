/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Crea un programa en Java que solicite al usuario un número entero y calcule su doble y su triple

package com.mycompany.ejercicios_libro_logica_de_programacion;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Problemas_Diagramación_lógica_ej3 {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        System.out.println("Doble y el triple");
        System.out.println("Ingrese el número");
            int sd = Integer.parseInt(dc.nextLine());
                int df = (sd+sd);
                int tp = (sd+sd+sd);
            System.out.println("Doble: " + df + " Triple: " +tp);
    }
}
