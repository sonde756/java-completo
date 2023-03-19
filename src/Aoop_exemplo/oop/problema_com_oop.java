package Aoop_exemplo.oop;

import java.util.Locale;
import java.util.Scanner;

public class problema_com_oop {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Triangulo X");
        x.a = leitor.nextDouble();
        x.b = leitor.nextDouble();
        x.c = leitor.nextDouble();

        System.out.println("Triangulo Y");
        y.a = leitor.nextDouble();
        y.b = leitor.nextDouble();
        y.c = leitor.nextDouble();


        double xArea = x.Area();
        double yArea = y.Area();

        System.out.printf("Area Y: %.4f%n",xArea);



        System.out.printf("Area Y: %.4f%n", yArea);


        if (yArea > xArea) {
            System.out.println("Maior é Y");
        } else {
            System.out.println("Maior é x");
        }

    }

}
