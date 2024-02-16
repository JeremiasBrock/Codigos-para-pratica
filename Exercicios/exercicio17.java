import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o combustível:");
        int x = sc.nextInt();

        int alcool = 0, gasolina = 0, diesel = 0;

        while (x != 4) {
            if (x == 1) {
                alcool += 1;
            } else if (x == 2) {
                gasolina += 1;
            } else if (x == 3) {
                diesel += 1;
            }

            x = sc.nextInt();
        }

        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        System.out.println("Muito obrigado!");

        sc.close();
    }
}