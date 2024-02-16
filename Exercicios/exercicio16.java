import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a coordenada X:");
        int x = sc.nextInt();

        System.out.println("Informe a coordenada Y:");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Q1.");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2.");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3.");
            } else {
                System.out.println("Q4");
            }

            System.out.println("Informe a coordenada X:");
            x = sc.nextInt();

            System.out.println("Informe a coordenada Y:");
            y = sc.nextInt();
        }

        System.out.println("Invalido");
        sc.close();
    }
}