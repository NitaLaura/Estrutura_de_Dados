/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo360;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Algoritmo360 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ultdia = new int[12];
        int data, i, dia, mes;
        String[] signo = new String[12];

        // Entrada de dados para signos e últimos dias
        for (i = 0; i < 12; i++) {
            System.out.print("\nDigite o signo: ");
            signo[i] = scanner.nextLine();

            System.out.print("Digite o último dia: ");
            ultdia[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
        }

        System.out.print("\nDigite a data no formato ddmm ou 9999 para terminar: ");
        data = scanner.nextInt();

        while (data != 9999) {
            dia = data / 100;
            mes = data % 100;
            mes--;

            if (dia > ultdia[mes]) {
                mes = (mes + 1) % 12;
            }

            System.out.println("\nSigno: " + signo[mes] + "\n");

            System.out.print("Digite a data no formato ddmm ou 9999 para terminar: ");
            data = scanner.nextInt();
        }

        System.out.println();
    }
}
