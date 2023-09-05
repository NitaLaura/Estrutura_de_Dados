/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo351;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Algoritmo351 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L, num;
        String[] nomes = new String[5];

        for (L = 0; L <= 4; L++) {
            System.out.print("Digite o nome " + (L + 1) + ": ");
            nomes[L] = scanner.nextLine();
        }

        System.out.print("Digite o número da pessoa: ");
        num = scanner.nextInt();

        while (num < 1 || num > 5) {
            System.out.println("Número fora do intervalo");
            System.out.print("Digite o número da pessoa: ");
            num = scanner.nextInt();
        }

        System.out.println(nomes[num - 1]);
    }
}
