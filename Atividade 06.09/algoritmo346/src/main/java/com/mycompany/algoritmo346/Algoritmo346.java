/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo346;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Algoritmo346 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        int op, x, tam;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois ultimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("OPCAO: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite uma frase: ");
                    scanner.nextLine(); // Limpa o buffer
                    frase = scanner.nextLine();
                    System.out.println("Número de caracteres da frase: " + frase.length());
                    break;
                case 2:
                    System.out.print("Digite uma frase: ");
                    scanner.nextLine(); // Limpa o buffer
                    frase = scanner.nextLine();
                    System.out.println("Os dois primeiros caracteres: " + frase.substring(0, 2));
                    tam = frase.length() - 2;
                    System.out.println("Os dois ultimos caracteres: " + frase.substring(tam));
                    break;
                case 3:
                    System.out.print("Digite uma frase: ");
                    scanner.nextLine(); // Limpa o buffer
                    frase = scanner.nextLine();
                    StringBuilder reversed = new StringBuilder();
                    for (x = frase.length() - 1; x >= 0; x--) {
                        reversed.append(frase.charAt(x));
                    }
                    System.out.println("Frase espelhada: " + reversed.toString());
                    break;
                case 4:
                    System.out.println("Fim do algoritmo");
                    break;
                default:
                    System.out.println("Opção não disponível");
            }
        } while (op != 4);
    }
}
