import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero:");
        double x = sc.nextDouble();

        if (x >= 0 && x <= 25) {
            System.out.println("Está entre 0 e 25.");
        } else if (x > 25 && x <= 50) {
            System.out.println("Está entre 25 e 50.");
        } else if (x > 50 && x <= 75) {
            System.out.println("Está entre 50 e 75.");
        } else if (x > 75 && x <= 100) {
            System.out.println("Está entre 75 e 100.");
        } else {
            System.out.println("Numero fora de intervalo.");
        }
        sc.close();
    }
}
