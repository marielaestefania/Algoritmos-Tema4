/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int numero = entrada.nextInt();

        long factorial = 1;

        if (numero < 0 || numero > 20) {
            System.out.println("Ingresa un numero entre 0 y 20.");
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial = factorial * i;
            }

            System.out.println("El factorial es: " + factorial);
        }
    }
}

