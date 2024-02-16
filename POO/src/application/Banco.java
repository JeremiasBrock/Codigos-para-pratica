package application;

import java.util.Scanner;
import entities.Conta;

public class Banco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.println("Informe o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Informe o nome do titular da conta: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();

        System.out.println("Gostaria de depositar um valor incial? (S/N)");
        char verdade = sc.next().charAt(0);

        if (verdade == 'S') {
            System.out.println("Informe o valor a ser depositado inicialmente:");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numeroConta, nomeTitular, depositoInicial);
        } else {
            conta = new Conta(numeroConta, nomeTitular);
        }

        System.out.println("Atualização da conta: " + conta);

        System.out.println("Informe um valor de deposito:");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);

        System.out.println(conta);

        System.out.println("Informe um valor a ser sacado: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);

        System.out.println(conta);

        sc.close();
    }
}
