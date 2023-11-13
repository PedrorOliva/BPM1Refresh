package org.example.ExercicioDois;

import java.util.Scanner;

/*
 * Escreva um algoritmo que receba um número real e verifique se ele é
 * um número inteiro ou decimal.
 */
public class Main {
  public static void main(String[] args) {
    Scanner inputUSer = new Scanner(System.in);

    System.out.println("Digite um número: ");
    String numero = inputUSer.next();

    if(numero.contains(",")){
      System.out.println("Decimal");
    } else {
      System.out.println("Inteiro");
    }

  }
}
