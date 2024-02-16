package exemplo01.application;

import java.util.Scanner;
import exemplo01.entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Informe um produto:");
        product.name = sc.nextLine();
        System.out.println("Informe o preço:");
        product.price = sc.nextDouble();
        System.out.println("Quantidade em estoque: ");
        product.quantity = sc.nextInt();

        System.out.println("Produto: " + product);
        int quantity = 0;

        while (true) {
        System.out.println("Gostaria de adicionar mais em estoque ou de remover do estoque? 1 - para adicionar, 2 - para remover");
        int x = sc.nextInt();

            if (x == 1) {
                System.out.println("Informe a quantidade a ser adicionada: ");
                quantity = sc.nextInt();
                product.addProducts(quantity);
            } else {
                System.out.println("Informe a quantidade a ser removida: ");
                quantity = sc.nextInt();
                product.removeProducts(quantity);
            }
            System.out.println("Atualização: " + product);
            System.out.println("Gostaria de repetir o processo? 1 para sim, 2 para não.");
            int verdade = sc.nextInt();

            if (verdade == 2) {
                break;
            }
        }
        sc.close();
    }
}