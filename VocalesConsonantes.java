/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vocalesconsonantes;

import java.util.Scanner;

public class VocalesConsonantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String letra;

        do {
            System.out.print("Escribe una letra: ");
            letra = entrada.nextLine();

            if (letra.equals(" ")) {
                System.out.println("Programa terminado");
            } else if (letra.length() == 1) {
                char caracter = Character.toLowerCase(letra.charAt(0));

                if (caracter == 'a' || caracter == 'e' ||
                    caracter == 'i' || caracter == 'o' ||
                    caracter == 'u') {
                    System.out.println("Es una vocal");
                } else if (caracter >= 'a' && caracter <= 'z'
                           || caracter == 'ñ') {
                    System.out.println("Es una consonante");
                } else {
                    System.out.println("No es una letra");
                }
            } else {
                System.out.println("Escribe solo una letra");
            }

        } while (!letra.equals(" "));
    }
}



