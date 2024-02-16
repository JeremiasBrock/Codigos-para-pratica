import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número A:");
        int x = sc.nextInt();

        System.out.println("Informe um número B:");
        int y = sc.nextInt();

        if (x % y == 0 || y % x == 0) {
            System.out.println("Multiplo");
        } else {
            System.out.println("Não é multiplo");
        }
        sc.close();
    }
}
