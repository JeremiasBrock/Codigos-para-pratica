import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor:");
        int x = sc.nextInt();
        int n = 0, in = 0, out = 0;

        for (int i = 0; i < x; i++) {
            System.out.println("Informe valor N");
            n = sc.nextInt();

            if (n >= 10 && n <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}