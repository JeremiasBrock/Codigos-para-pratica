import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int x = sc.nextInt();;

        for (int i = 1; i <= x; i++) {
            int a = i;
            int b = i * i;
            int c = i * i * i;
            System.out.printf("%d %d %d%n", a , b , c);
        }
        sc.close();
    }
}