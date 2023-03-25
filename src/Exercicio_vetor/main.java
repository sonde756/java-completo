package Exercicio_vetor;

import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("How many rooms will be rented?");
        int x = sc.nextInt();

        int i = 1;
        String[] name = new String[10];
        String[] email = new String[10];
        int[] room = new int[10];

        do {

            System.out.println("Rent #"+i+":");
            System.out.print("Name: ");
            String names = sc.nextLine();
            System.out.print("Email: ");
            sc.next();
            String emails = sc.next();
            System.out.print("Room: ");
            int rooms = sc.nextInt();

            name[rooms] = names;
            email[rooms] = emails;
            room[rooms] = rooms;

            i++;
            if ((i-1) == x) {
                break;
            }
        } while (true);


        System.out.println("Busy room");


        for (int j = 0; j < 10 ; j++) {
            if(email[j] != null){
                System.out.println(room[j]+": "+name[j]+", "+email[j]);
            }
        }





    }
}
