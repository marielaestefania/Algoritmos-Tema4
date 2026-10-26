/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conteonumeros;

import java.util.Scanner;

public class ConteoNumeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.print("Cuantos numeros vas a ingresar: ");
        int cantidad = entrada.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el numero " + i + ": ");
            int numero = entrada.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Mayores de 0: " + positivos);
        System.out.println("Menores de 0: " + negativos);
        System.out.println("Iguales a 0: " + ceros);
    }
}
