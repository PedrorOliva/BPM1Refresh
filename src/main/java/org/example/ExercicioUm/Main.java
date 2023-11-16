package org.example.ExercicioUm;

/*
 * 1 - Faça um algoritmo que dados 3 números inteiros, identifique e retorne
 * o menor número entre eles.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);
    boolean sair = false;

    while (!sair) {
      try {
        System.out.println("Digite três números inteiros: ");
        int num1 = inputUser.nextInt();
        int num2 = inputUser.nextInt();
        int num3 = inputUser.nextInt();


        if (num1 < num2 && num1 < num3) {
          System.out.println("O menor número é: " + num1);
        }
        if (num2 < num1 && num2 < num3) {
          System.out.println("O menor número é: " + num2);
        }
        if (num3 < num1 && num3 < num2) {
          System.out.println("O menor número é: " + num3);
        }
        sair = true;

      } catch (InputMismatchException e) {
        System.out.println("Erro: você precisa digitar um número inteiro \n");
        inputUser.nextLine();
      }
    }
  }
}
