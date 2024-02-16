import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o código do produto:");
        int x = sc.nextInt();
        
        System.out.println("Informe a quantidade:");
        int y = sc.nextInt();
        
        double valor = 0.0;

        if (x == 1) {
            valor = y * 4;
        } else if (x == 2) {
            valor = y * 4.50;
        } else if (x == 3) {
            valor = y * 5;
        } else if (x == 4) {
            valor = y * 2;
        } else if (x == 5) {
            valor = y * 1.50;
        } else {
            System.out.println("Produto inválido");
        }

        System.out.println("Total a ser pago: " + valor);

        sc.close();
    }
}
