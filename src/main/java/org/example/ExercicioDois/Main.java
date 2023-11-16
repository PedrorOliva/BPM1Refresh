package org.example.ExercicioDois;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Escreva um algoritmo que receba um número real e verifique se ele é
 * um número inteiro ou decimal.
 */
public class Main {
  public static void main(String[] args) {
    Scanner inputUSer = new Scanner(System.in);
    boolean sair = false;

//    System.out.println("Digite um número: ");
//    String numero = inputUSer.next();
//
//    if(numero.contains(",")){
//      System.out.println("Decimal");
//    } else {
//      System.out.println("Inteiro");
//    }

    while (!sair) {
      try {
        System.out.println("Digite um número: ");
        Double numero = inputUSer.nextDouble();

        if (numero % 1 == 0) {
          System.out.println("Inteiro");
        } else {
          System.out.println("Decimal");
        }
        sair = true;
      } catch (InputMismatchException e) {
        System.out.println("ERRO: você precisa digitar um número!");
        inputUSer.nextLine();
      }
    }
  }
}
