package Exercicio_oop10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY)");
        Date dateBirth = sdf.parse(sc.next());
        System.out.println();

        Client c1 = new Client(name,email,dateBirth);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        String status = sc.next();
        System.out.print("How many items to this order?");
        Order order = new Order(new Date(), OrderStatus.valueOf(status), c1);
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Enter #"+(i+1)+" item data");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            new Date();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);

        }
        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);


    }
}
