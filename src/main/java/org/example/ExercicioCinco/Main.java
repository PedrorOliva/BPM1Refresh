package org.example.ExercicioCinco;

/*
* Crie um algoritmo que receba uma lista de números e retorne a média
* aritmética dos valores.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);

    List<Integer> numeros = new ArrayList<>();
    int soma = 0;
    double media;

    System.out.println("Quantos números deseja adicionar? ");
    int qtdNumeros = inputUser.nextInt();

    for(int i = 0; i < qtdNumeros; i++) {
      System.out.println("Informe um número: ");
      int numero = inputUser.nextInt();
      numeros.add(numero);
    }

    for(Integer numero : numeros) {
      soma += numero;
    }

    media = (double) soma / qtdNumeros;

    System.out.println("A média dos números da lista é: " + media);
  }
}
