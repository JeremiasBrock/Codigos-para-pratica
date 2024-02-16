import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero do funcionario:");
        int numero = sc.nextInt();

        System.out.println("Informe a sua quantidade de horas trabalhadas:");
        int horas = sc.nextInt();

        System.out.println("Informe o valor por hora:");
        double valorHora = sc.nextDouble();

        double salario = (valorHora * horas);

        System.out.printf("O numero do funcionario é: " + numero + " e seu salario é de: %.2f%n", salario);

        sc.close();
    }
}