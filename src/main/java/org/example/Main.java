package org.example;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int numeroDoFuncionario, numeroDeHorasTrabalhadasFuncionario;

        double valorRecebidoPorHora, salarioLiquido;

        numeroDoFuncionario = sc.nextInt();

        numeroDeHorasTrabalhadasFuncionario = sc.nextInt();

        valorRecebidoPorHora = sc.nextDouble();

        salarioLiquido = numeroDeHorasTrabalhadasFuncionario * valorRecebidoPorHora;

        System.out.println("NUMBER = " + numeroDoFuncionario);

        System.out.printf("SALARY = U$ %.2f%n", salarioLiquido);

        sc.close();
    }
}