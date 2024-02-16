import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o código da peça 1:");
        int peca = sc.nextInt();

        System.out.println("Informe a quantidade de peças:");
        int numerosPeca = sc.nextInt();

        System.out.println("Informe o valor unitário:");
        double valorUnitarioPeca = sc.nextDouble();

        System.out.println("Informe o código da peça 2:");
        int peca2 = sc.nextInt();

        System.out.println("Informe a quantidade de peças:");
        int numerosPeca2 = sc.nextInt();

        System.out.println("Informe o valor unitário:");
        double valorUnitarioPeca2 = sc.nextDouble();

        double valor1 = numerosPeca * valorUnitarioPeca;
        double valor2 = numerosPeca2 * valorUnitarioPeca2;
        double valorTotal = valor1 + valor2;

        System.out.println("Peça: " + peca + " e " + peca2 + " vão sair no total de: " + valorTotal);

        sc.close();
    }
}