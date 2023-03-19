package Exercicio_oop7;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String nameAccount = sc.nextLine();

        System.out.print("Is there na initial deposit? (y/n) ");
        char response = sc.next().charAt(0);


        AccountBank ac = new AccountBank();
        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            ac = new AccountBank(accountNumber, nameAccount, deposit);
        } else if (response == 'n') {
            ac = new AccountBank(accountNumber, nameAccount);
        }
        System.out.println();

        System.out.println("Account data: " + ac);



        System.out.print("Enter a deposit value: ");
        double depositi = sc.nextDouble();
        ac.deposit(depositi);

        System.out.println("Update account data:");
        System.out.print(ac);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        ac.withdraw(withdraw);

        System.out.println("Update account data:");
        System.out.print(ac);
        System.out.println();

    }
}
