package Exercicio_oop3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee func = new Employee();

        System.out.print("Name: ");
        func.name = sc.nextLine();

        System.out.print("Gross salary: ");
        func.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        func.tax = sc.nextDouble();


        System.out.println("Employee: "+func);

        System.out.print("Which percentage to increase salary?");
        double porct = sc.nextDouble();
        func.increaseSalary(porct);

        System.out.println("Updated data: "+func);




    }
}
