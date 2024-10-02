/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio8;

/**
 *
 * @author Jhonatan
 * Escreva um programa em JAVA que solicite ao usuário 2 números inteiros
(um de cada vez), armazene os valores em variáveis e depois mostre a soma
dos dois em uma mensagem
 */
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro numero inteiro: ");
            int numero1 = scanner.nextInt();
            System.out.print("Digite o segundo numero inteiro: ");
            int numero2 = scanner.nextInt();
            int soma = numero1 + numero2;
            System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + soma);
        }
    }
}