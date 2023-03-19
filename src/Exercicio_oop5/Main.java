package Exercicio_oop5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("What is the dollar price?");
        double dolarPrice = sc.nextDouble();
        System.out.println();

        System.out.print("How many dollars will be bought?");
        double dolarQuantity = sc.nextDouble();
        System.out.println();

       double total = CurrencyConverter.converte(dolarPrice, dolarQuantity);

        System.out.printf("Amount to be paid in reais = %.2f%n",total);









    }
}
