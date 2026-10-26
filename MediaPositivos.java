/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediapositivos;

import java.util.Scanner;

public class MediaPositivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero;
        double suma = 0;
        int contador = 0;

        System.out.print("Ingresa un numero positivo: ");
        numero = entrada.nextDouble();

        while (numero >= 0) {
            if (numero > 0) {
                suma = suma + numero;
                contador++;
            }

            System.out.print("Ingresa otro numero: ");
            numero = entrada.nextDouble();
        }

        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se ingresaron numeros positivos");
        }
    }
}