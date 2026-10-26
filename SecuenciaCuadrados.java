/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.secuenciacuadrados;

import java.util.Scanner;

public class SecuenciaCuadrados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un numero entero positivo: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            int i = 1;

            System.out.println("Cuadrados del 1 al " + numero + ":");

            do {
                int cuadrado = i * i;
                System.out.println(i + " = " + cuadrado);
                i++;
            } while (i <= numero);

        } else {
            System.out.println("Debes ingresar un numero positivo");
        }
    }
}