package Exercicio_oop2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Media media = new Media();

        media.name = sc.nextLine();
        media.grade1 = sc.nextDouble();
        media.grade2 = sc.nextDouble();
        media.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", media.finalGrade());

        if (media.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", media.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
