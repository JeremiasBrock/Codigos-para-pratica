package application;

import java.util.Scanner;

import util.Conversor;

public class Cotacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a cotação do dolar: ");
        double precoDolar = sc.nextDouble();

        System.out.println("Informe a quantia de dolares a serem comprados:");
        double dolaresComprados = sc.nextDouble();

        System.out.println(Conversor.conversao(precoDolar, dolaresComprados));

        sc.close();
    }
}
