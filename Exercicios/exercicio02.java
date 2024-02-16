import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro numero:");
        int a = sc.nextInt();

        System.out.println("Informe o valor do segundo numero:");
        int b = sc.nextInt();

        int resultado = a + b;

        System.out.println("O resultado é: " + resultado);

        sc.close();
    }
}