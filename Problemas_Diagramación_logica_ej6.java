/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*Crea un programa que pida al usuario dos números (pueden tener decimales). El programa debe analizar ambos valores y responder con un mensaje 
específico dependiendo de la relación entre ellos: debe decirnos cuál es el mayor o, en caso de que sean idénticos, indicarnos que existe una igualdad. */

package com.mycompany.ejercicios_libro_logica_de_programacion;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class Problemas_Diagramación_logica_ej6 {
    public static void Problemas_Diagramación_logica_ej6(){
        Scanner dc = new Scanner(System.in);
        System.out.println("Número mayor");
        System.out.println("Ingrese el primer número");
        double x = dc.nextDouble();
        System.out.println("Ingrese el segundo número");
        double y = dc.nextDouble();
        
        if(x<y){
            System.out.println("El número mayor es: "+y);
        }else if(x>y){
            System.out.println("El número mayor es: "+x);
        }else if(y==x){ 
            System.out.println("Son iguales: "+x+" = "+y);
        }
    }
    public static void main(String[]args){
        Problemas_Diagramación_logica_ej6();
    }
}
