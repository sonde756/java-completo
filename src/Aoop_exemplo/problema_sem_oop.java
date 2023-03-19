package Aoop_exemplo;

import java.util.Locale;
import java.util.Scanner;


public class problema_sem_oop {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Trinagulo X");
        double xA = sc.nextDouble();
        double xB = sc.nextDouble();
        double xC = sc.nextDouble();

        System.out.println("Trinagulo Y");
        double yA = sc.nextDouble();
        double yB = sc.nextDouble();
        double yC = sc.nextDouble();


        double p = (xA+xB+xC)/2.0;
        double xArea = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));

        System.out.printf("Area Y: %.4f%n",xArea);

        p = (yA+yB+yC)/2.0;
        double yArea = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));

        System.out.printf("Area Y: %.4f%n",yArea);

        if (yArea > xArea){
            System.out.println("Maior é Y");
        }
        else {
            System.out.println("Maior é x");
        }



    }
}
