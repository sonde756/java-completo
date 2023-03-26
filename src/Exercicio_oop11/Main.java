package Exercicio_oop11;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char out = sc.next().charAt(0);


            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePh = sc.nextDouble();

            if (out == 'y') {
                System.out.print("Additional charge: ");
                double addt = sc.nextDouble();

                //  Employee employee = new OutsourcedEmployee(name, hours, valuePh, addt);
                //   list.add(employee);

                list.add(new OutsourcedEmployee(name, hours, valuePh, addt));
            } else {
                list.add(new Employee(name, hours, valuePh));
            }

        }


        System.out.println();
        System.out.println("PAYMENTS: ");

        for (Employee emp: list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

    }
}
