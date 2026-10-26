/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.secuenciaaritmetica;

import java.util.Scanner;
public class SecuenciaAritmetica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int primero = entrada.nextInt();

        System.out.print("Ingresa la diferencia: ");
        int diferencia = entrada.nextInt();

        System.out.print("Ingresa el numero maximo: ");
        int maximo = entrada.nextInt();

        int numero = primero;

        if (diferencia > 0 && primero <= maximo) {
            System.out.println("Secuencia aritmetica:");

            do {
                System.out.println(numero);
                numero = numero + diferencia;
            } while (numero <= maximo);

        } else {
            System.out.println("Revisa los numeros ingresados");
        }
    }
}
