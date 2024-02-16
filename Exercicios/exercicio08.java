import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número e o programa irá dizer se é negativo ou não:");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Negativo!");
        } else {
            System.out.println("Positivo.");
        }
        sc.close();
    }
}
