import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Digite dois numeros:");
            double a = sc.nextInt();
            double b = sc.nextInt();

            if (b == 0) {
                System.out.println("Divisão impossivel");
            } else {
                double resultado = a / b;
                System.out.println(resultado);
            }
        }
        sc.close();
    }
}