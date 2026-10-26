/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adivinarnumero;

import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroSecreto = (int)(Math.random() * 100) + 1;
        int numero;

        System.out.println("Adivina un numero del 1 al 100");

        do {
            System.out.print("Escribe un numero: ");
            numero = entrada.nextInt();

            if (numero > numeroSecreto) {
                System.out.println("El numero es demasiado alto");
            } else if (numero < numeroSecreto) {
                System.out.println("El numero es demasiado bajo");
            } else {
                System.out.println("Felicidades, adivinaste el numero");
            }

        } while (numero != numeroSecreto);
    }
}
