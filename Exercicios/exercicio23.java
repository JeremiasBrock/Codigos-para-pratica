import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int x = sc.nextInt();;

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}