import java.util.Scanner;

public class CaixaEletronico {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = {100, 50, 20, 10, 5};
        int[] quantidadeNotas = {5, 8, 6, 9, 5};

        System.out.println("Bem-vindo ao Caixa Eletrônico!");

        while (true) {
            System.out.println("Informe o valor a ser sacado:");
            int valorSaque = scanner.nextInt();

            if (valorSaque % 5 >= 1) {
                System.out.println("Não é possível realizar o saque deste valor R$" + valorSaque + " pois ele não é divisível de cinco.");
                valorSaque = 0;

            } else {
            
            System.out.println("Realizando saque de R$" + valorSaque);

                for (int i = 0; i < notas.length; i++) {
                    int quantidadeNotasUsadas = valorSaque / notas[i];
                    quantidadeNotasUsadas = Math.min(quantidadeNotasUsadas, quantidadeNotas[i]);
                    
                    if (quantidadeNotasUsadas > 0) {
                        System.out.println(quantidadeNotasUsadas + " notas de R$" + notas[i]);
                        valorSaque -= quantidadeNotasUsadas * notas[i];
                        quantidadeNotas[i] -= quantidadeNotasUsadas;
                    }
                }

                int saldoTotal = 0;

                for (int i = 0; i < notas.length; i++) {
                    saldoTotal += notas[i] * quantidadeNotas[i];
                }

                System.out.println("Saldo total no caixa: R$" + saldoTotal);

                if (saldoTotal > 0) {
                System.out.println("Deseja fazer outro saque? 1 para sim e 0 para não.");
                int verdade = scanner.nextInt();

                    if (verdade == 0){
                    break;
                    }

                } else {
                    System.out.println("Sem saldo no caixa.");
                    break;
                }
            }
        }
            scanner.close();
        };
    };