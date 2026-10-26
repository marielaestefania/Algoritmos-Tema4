/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosimpares;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un numero entero positivo: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            int i = 1;

            System.out.println("Numeros impares del 1 al " + numero + ":");

            do {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                i++;
            } while (i <= numero);

        } else {
            System.out.println("Debes ingresar un numero positivo");
        }
    }
}