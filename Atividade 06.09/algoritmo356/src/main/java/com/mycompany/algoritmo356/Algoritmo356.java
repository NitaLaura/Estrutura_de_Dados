/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo356;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Algoritmo356 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L, c, t;
        int[] media = new int[15];
        String[] nomes = new String[15];
        String[] sit = new String[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];

        // Entrada de dados
        for (L = 0; L <= 14; L++) {
            System.out.print("\nDigite o nome do aluno " + (L + 1) + ": ");
            nomes[L] = scanner.nextLine();

            while (nomes[L].length() > 30) {
                System.out.println("\nNomes com até 30 caracteres.");
                System.out.print("\nDigite o nome do aluno " + (L + 1) + ": ");
                nomes[L] = scanner.nextLine();
            }

            // Preencha os nomes com espaços em branco até 30 caracteres para tabulação
            t = 30 - nomes[L].length();
            for (c = 1; c <= t; c++) {
                nomes[L] += " ";
            }

            System.out.print("Digite a nota 1: ");
            pr1[L] = scanner.nextDouble();

            System.out.print("Digite a nota 2: ");
            pr2[L] = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            // Calcula a média arredondada
            media[L] = (int) Math.round((pr1[L] + pr2[L]) / 2);

            // Determina a situação do aluno
            if (media[L] >= 5) {
                sit[L] = "AP";
            } else {
                sit[L] = "RP";
            }
        }

        // Saída de dados
        System.out.println("\n\n\t\t\t\tRELACAO FINAL\n");
        for (L = 0; L < 15; L++) {
            System.out.println((L + 1) + " - " + nomes[L] + "\t" + pr1[L] + "\t" + pr2[L] + "\t" + media[L] + "\t" + sit[L]);
        }
    }
}
