/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo358;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Algoritmo358 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] precocompra = new double[100];
        double[] precovenda = new double[100];
        double lucro;
        int totlucromenor10 = 0;
        int totlucromenor20 = 0;
        int totlucromaior20 = 0;
        int A;

        // Entrada de dados
        for (A = 0; A < 100; A++) {
            System.out.print("\nPreço de compra: ");
            precocompra[A] = scanner.nextDouble();

            System.out.print("Preço de venda: ");
            precovenda[A] = scanner.nextDouble();
        }

        // Cálculo do lucro e contagem das mercadorias
        for (A = 0; A < 100; A++) {
            lucro = precovenda[A] - precocompra[A];

            if (lucro < 10.0) {
                totlucromenor10++;
            } else if (lucro <= 20.0) {
                totlucromenor20++;
            } else {
                totlucromaior20++;
            }
        }

        // Saída de dados
        System.out.println("\nTotal de mercadorias com lucro < 10%: " + totlucromenor10);
        System.out.println("Total de mercadorias com 10% <= lucro <= 20%: " + totlucromenor20);
        System.out.println("Total de mercadorias com lucro > 20%: " + totlucromaior20);
    }
}
