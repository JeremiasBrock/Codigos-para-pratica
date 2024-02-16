package application;

import java.util.Scanner;
import entities.Funcionario;

public class RH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Informe o nome do(a) funcionario(a)");
        funcionario.nome = sc.nextLine();

        System.out.println("Informe o salário bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.println("Informe os impostos: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println("Funcionário(a): " + funcionario);

        System.out.println("Quantos porcentos você gostaria de aumentar no salário?");
        double porcentagem = sc.nextDouble();
        funcionario.aumentoSalario(porcentagem);

        System.out.println("Atualização do Funcionário(a): " + funcionario);

        sc.close();
    }
}