import java.util.Locale;

public class exercicio01 {
    public static void main(String[] args) throws Exception {
        String produto1 = "Computador"; 
        String produto2 = "Mesa";

        int age = 30;
        int code = 5090;
        char gender = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;

         System.out.println("Produtos:");
         System.out.println(produto1 + " no qual o preço é: " + preco1);
         System.out.println(produto2 + " no qual o preço é: " + preco2);
         System.out.println("Informações: " + age + " anos de idade, código: " + code + " e sexo: " + gender);
         System.out.println("Medida com oito casas decimais: " + medida);
         System.out.printf("Arredondando: " + "%.3f%n", medida);
         Locale.setDefault(Locale.US);
         System.out.printf("US decimal point: %.3f%n", medida);
    }
}
