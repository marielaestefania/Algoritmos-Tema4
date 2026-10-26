/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contarletras;

import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe una palabra: ");
        String palabra = entrada.nextLine();

        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' ||
                palabra.charAt(i) == 'A') {
                contador++;
            }
        }

        System.out.println("La letra a aparece " + contador + " veces.");
    }
}
