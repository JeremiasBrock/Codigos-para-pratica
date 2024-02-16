package application;

import java.util.Scanner;
import entities.Rectangle;

public class Geometria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Informe o valor da largura:");
        rectangle.width = sc.nextDouble();

        System.out.println("informe o valor da altura: ");
        rectangle.height = sc.nextDouble();

        System.out.println("A area do retangulo é: " + rectangle.area());
        System.out.println("Seu perimetro é de: " + rectangle.perimetere());
        System.out.println("E sua diagonal é: " + rectangle.diagonal());
        sc.close();
    }
}