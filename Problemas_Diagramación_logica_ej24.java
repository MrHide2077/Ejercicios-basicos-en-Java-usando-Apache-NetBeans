/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_libro_logica_de_programacion;
import java.util.Scanner;

/*: Hallar la persona de menor altura, sabiendo que se leen datos
correspondientes a las alturas de 30 personas. El ingreso es en números
enteros y en cm.*/

/**
 *
 * @author diego
 */

public class Problemas_Diagramación_logica_ej24 {

    public static void rest() {
        System.out.println("================================");
        System.out.println("        SISTEMA PRINCIPAL        ");
        System.out.println("================================");
        System.out.println("  [1] Continuar");
        System.out.println("  [0] Salir");
        System.out.println("--------------------------------");
        System.out.print("Seleccione una opción: ");

        Scanner dc = new Scanner(System.in);
        int opcion = dc.nextInt();
        dc.nextLine();

        var total = 30;
        Double matriz[] = new Double[total];

        if (opcion == 1) {
            do {
                Double menor = Double.MAX_VALUE;

                for (int i = 0; i < total; i++) {
                    boolean valido = false;

                    while (!valido) {
                        System.out.println("Porfavor ingrese la altura: " + (i + 1) + " en cm porfavor");
                        Double alttemp = dc.nextDouble();
                        dc.nextLine();

                        if (alttemp < 100) {
                            System.out.println("--------------------------------");
                            System.out.println("Altura invalida");
                            System.out.println("Ingrese una altura valida");
                            System.out.println("--------------------------------");
                        } else {
                            matriz[i] = alttemp;
                            valido = true;
                            menor = Math.min(menor, alttemp);
                        }
                    }
                }

                System.out.println("La altura menor fue: " + menor + " cm");

                System.out.println("¿Desea ingresar otro número?");
                System.out.println("================================");
                System.out.println("  [1] Continuar");
                System.out.println("  [0] Salir");
                System.out.println("--------------------------------");

                opcion = dc.nextInt();
                dc.nextLine();

            } while (opcion == 1);
        }

        System.out.println("--------------------------------");
        System.out.println("Gracias por usar este sistema");
        System.out.println("Nos vemos...");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        rest();
    }
}
