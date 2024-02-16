import java.util.Scanner;

public class aritmetica {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta;

        System.out.println("Digite o valor do coeficiente querático (a):");
        a = sc.nextDouble();

        System.out.println("Digite o valor do coeficiente linear (b):");
        b = sc.nextDouble();

        System.out.println("Digite o valor do coeficiente querático (c):");
         c = sc.nextDouble();
        
        delta = (Math.pow(b, 2.0) - 4 * a * c);
        double x1 = ((-b + Math.sqrt(delta)) / (2.0 * a));
        double x2 = ((-b - Math.sqrt(delta)) / (2.0 * a));

        System.out.println("O valor de x¹ é de: " + x1);
        System.out.println("O valor de x² é de: " + x2);

        sc.close();
    }
}