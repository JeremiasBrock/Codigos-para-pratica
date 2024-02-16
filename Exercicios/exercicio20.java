import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de repetições:");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Digite três valores:");
            double n1 = sc.nextDouble(), n2 = sc.nextDouble(), n3 = sc.nextDouble();
            double media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;
            System.out.println("A média é de: " + media);
        }
        sc.close();
    }
}