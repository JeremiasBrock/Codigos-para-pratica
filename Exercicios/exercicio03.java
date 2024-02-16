import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do raio:");
        int a = sc.nextInt();

        double area = 3.14159 * Math.pow(a, 2);

        System.out.printf("A área é de: %.4f%n", area);

        sc.close();
    }
}