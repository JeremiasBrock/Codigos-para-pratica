import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro numero:");
        int a = sc.nextInt();

        System.out.println("Informe o valor do segundo numero:");
        int b = sc.nextInt();

        System.out.println("Informe o valor do terceiro numero:");
        int c = sc.nextInt();

        System.out.println("Informe o valor do quarto numero:");
        int d = sc.nextInt();

        int diferenca = (a * b - c * d);

        System.out.println("A diferença é de: " + diferenca);

        sc.close();
    }
}