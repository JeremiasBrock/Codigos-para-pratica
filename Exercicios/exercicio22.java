import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int x = sc.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= x; i++) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);
        sc.close();
    }
}