/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoramenu;

import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion;
        int continuar;
        double num1, num2;

        do {
            System.out.println("CALCULADORA BASICA");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");

            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer numero: ");
                num1 = entrada.nextDouble();

                System.out.print("Ingresa el segundo numero: ");
                num2 = entrada.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("No se puede dividir entre cero");
                        }
                        break;
                }
            } else {
                System.out.println("Opcion no valida");
            }

            System.out.println("Deseas realizar otra operacion?");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.print("Elige una opcion: ");
            continuar = entrada.nextInt();

        } while (continuar == 1);

        System.out.println("Programa terminado");
    }
}