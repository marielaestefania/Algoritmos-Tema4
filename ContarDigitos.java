/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contardigitos;

import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        long numero = entrada.nextLong();

        int digitos = 0;

        do {
            digitos++;
            numero = numero / 10;
        } while (numero != 0);

        System.out.println("El numero tiene " + digitos + " digitos.");
    }
}
