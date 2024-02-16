package application;

import java.util.Scanner;
import entities.Estudante;

public class Aprovacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.println("Informe o nome do estudante");
        estudante.nome = sc.nextLine();

        System.out.println("Informe as nota do primeiro, segundo e terceiro trimmestre, respectivamente:");
        estudante.primeiroTrismestre = sc.nextDouble();
        estudante.segundoTrismestre = sc.nextDouble();
        estudante.terceiroTrismestre = sc.nextDouble();

        System.out.printf("Nota final: %.2f%n", estudante.notaFinal());

        if (estudante.notaFinal() < 60) {
            System.out.println("Reprovou!");
            System.err.println("Está faltando: " + estudante.aprovacao() + " pontos.");
        } else {
            System.out.println("Aprovado!");
        }

        sc.close();
    }
}