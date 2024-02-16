import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);
     
            System.out.println("Informe em qual medida de temperatura você quer utilizar:\n" +
            "1 - Celsius\n" +
            "2 - Fahrenheit\n" +
            "3 - Kelvin");
            
            byte Resposta = leia.nextByte();
            
            System.out.println("Agora informe a temperatura em números:");
            
            byte Temperatura = leia.nextByte();
            
            switch (Resposta) {
                
                case 1:
                double F = (Temperatura * 9 / 5) + 32;
                double K = Temperatura + 273.15;
                
                System.out.println("A temperatura em Fahrenheit é: " + F + " °F");
                System.out.println("A temperatura em Kelvin é: " + K + " K");
                break;
                
                case 2:
                double C = (Temperatura - 32) * 5 / 9;
                double K1 = (Temperatura - 32) * 5 / 9 + 273.15;
                
                System.out.println("A temperatura em Celsius é: " + C + " °C");
                System.out.println("A temperatura em Kelvin é: " + K1 + " K");
                break;
                
                case 3:
                double C2 = Temperatura - 273.15;
                double F2 = (Temperatura - 273.15) * 9 / 5 + 32;
                
                System.out.println("A temperatura em Celsius é: " + C2 + " °C");
                System.out.println("A temperatura em Fahrenheit é: " + F2 + " °F");
                break;
            }
    }
}
