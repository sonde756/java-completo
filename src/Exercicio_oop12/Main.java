package Exercicio_oop12;

import Exercicio_oop11.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();


        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data");
            System.out.print("Common, used or imported (c/u/i)? ");
            char p = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (p == 'i') {

                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                list.add(new ImportedProduct(name,price,fee));

            } else if (p == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY)");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name,price,date));
            }

            list.add(new Product(name,price));

        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product p:
             list) {
            System.out.println(p.PriceTag());

        }
        sc.close();
    }
}
