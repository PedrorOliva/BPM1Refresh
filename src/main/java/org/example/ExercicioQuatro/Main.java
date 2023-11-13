package org.example.ExercicioQuatro;

/*
*Elabore um algoritmo que receba a idade de uma pessoa e classifique-a
* em uma das seguintes categorias:
* A. Criança - até 12 anos
* B. Adolescente - de 13 a 17 anos
* C. Adulto - de 18 a 59 anos
* D. Idoso - 60 anos ou mais
* E. Categoria inválida - se a idade fornecida não se enquadrar em
* nenhuma das categorias acima.
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);

    System.out.println("Informe a idade: ");
    int idade = inputUser.nextInt();

    if(idade >= 60) {
      System.out.println("Idoso");
    }
    if(idade >= 18 && idade <= 59) {
      System.out.println("Adulto");
    }
    if(idade >= 13 && idade <= 17) {
      System.out.println("Adolescente");
    }
    if(idade >= 0 && idade <= 12) {
      System.out.println("Criança");
    }
    if(idade < 0) {
      System.out.println("Categoria inválida");
    }
  }
}
