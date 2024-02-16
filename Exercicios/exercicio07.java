import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro numero:");
        double A = sc.nextDouble();

        System.out.println("Informe o valor do segundo numero:");
        double B = sc.nextDouble();

        System.out.println("Informe o valor do terceiro numero:");
        double C = sc.nextDouble();

        double triangulo = A * C / 2.0;
		double circulo = 3.14159 * C * C;
		double trapezio = (A + B) / 2.0 * C;
		double quadrado = B * B;
		double retangulo = A * B;

        System.out.println("TRIANGULO: " + triangulo);
        System.out.println("CIRCULO: " + circulo);
        System.out.println("TRAPEZIO: " + trapezio);
        System.out.println("QUADRADO: " + quadrado);
        System.out.println("RETANGULO: " + retangulo);

        sc.close();
    }
}