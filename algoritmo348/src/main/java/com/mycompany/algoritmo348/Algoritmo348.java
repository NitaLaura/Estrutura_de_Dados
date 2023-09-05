/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo348;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Algoritmo348 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaração dos arrays para armazenar os dados dos alunos
        String[] nomes = new String[5];
        double[] pr1 = new double[5];
        double[] pr2 = new double[5];
        double[] media = new double[5];
        
        // Entrada de dados
        for (int L = 0; L <= 4; L++) {
            System.out.print("Digite o nome do aluno " + (L + 1) + ": ");
            nomes[L] = scanner.nextLine();
            
            System.out.print("Digite a primeira nota: ");
            pr1[L] = scanner.nextDouble();
            
            System.out.print("Digite a segunda nota: ");
            pr2[L] = scanner.nextDouble();
            
            // Calcula a média
            media[L] = (pr1[L] + pr2[L]) / 2;
            
            // Limpa o buffer do scanner
            scanner.nextLine();
        }
        
        // Saída de dados
        System.out.println("\n\n\t\t\t\tRELACAO FINAL");
        for (int L = 0; L <= 4; L++) {
            System.out.println("\nAluno " + (L + 1) + " - Nome: " + nomes[L]);
            System.out.println("Nota 1: " + pr1[L] + "\tNota 2: " + pr2[L] + "\tMédia: " + media[L]);
        }
    }
}
