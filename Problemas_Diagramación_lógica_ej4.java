/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Escribe un programa en Java que calcule y muestre el cuadrado y el cubo de un número entero ingresado por el usuario

package com.mycompany.ejercicios_libro_logica_de_programacion;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Problemas_Diagramación_lógica_ej4 {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        System.out.println("Cuadrado y cubo");
        System.out.println("Ingrese el número:");
            int fd = Integer.parseInt(dc.nextLine());
            int lm = (int) Math.pow(fd, 2);
            int pt = (int) Math.pow(fd, 3);
            System.out.println("Doble: " + lm + " Triple: " +pt);   
    }
}
