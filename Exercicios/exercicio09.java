import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número e o programa irá dizer se é ímpar ou par:");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Par!");
        } else {
            System.out.println("Ímpar.");
        }
        sc.close();
    }
}
