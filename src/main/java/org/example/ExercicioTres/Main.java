package org.example.ExercicioTres;
/*
 * Faça um algoritmo que receba um caractere e determine se é uma letra
 * maiúscula, minúscula ou um caractere especial.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);
    List<String> letras = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
        "n", "o", "p", "q", "r", "s", "t", "u", "w", "y", "x", "z");

    System.out.println("Digite uma letra, minúscula ou maiúscula, ou digite um caractere especial: ");
    String letra = inputUser.next();


    if (letra.contains(letra.toUpperCase()) && letras.contains(letra.toLowerCase())) {
      System.out.println(letra + " é maiúscula");
    } else if (letra.contains(letra.toLowerCase()) && letras.contains(letra.toLowerCase())) {
      System.out.println(letra + " é minúscula");
    } else  if (letra.equalsIgnoreCase(letra) != letras.contains(letra)) {
      System.out.println(letra + " é um caractere especial");
    }
  }
}
