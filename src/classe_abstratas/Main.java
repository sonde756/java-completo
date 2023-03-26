package classe_abstratas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();


        list.add(new SavingsAccount(1, "Edson", 500.0, 0.01));
        list.add(new AccountBussines(2, "Hudson", 500.0, 1000.00));
        list.add(new SavingsAccount(3, "Bob", 300.0, 0.01));
        list.add(new AccountBussines(4, "Ana", 500.0, 500.00));

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.printf("Total balance %.2f%n", sum);

        for (Account acc : list) {
            acc.deposit(10.0);
        }

        for (Account acc : list) {
            System.out.println(acc.getBalance()  );
        }


















//        Account acc = new Account(1001,"Edson",0.0);
//        AccountBussines bacc = new AccountBussines(1002,"Hudson",0.0,500.0);
//
//
//        // UPCASTING
//        Account acc1 = bacc;
//        Account acc2 = new AccountBussines(1003,"Jose", 0.0, 200.00);
//        Account acc3 = new SavingsAccount(1004,"Ana", 0.0,0.01);
//
//
//        // DOWNCASTING
//        AccountBussines acc4 = (AccountBussines ) acc2;
//        acc4.loan(100.0);
//
//
//      //  AccountBussines acc5 = (AccountBussines) acc3;
//        if (acc3 instanceof AccountBussines){
//            AccountBussines acc5 = (AccountBussines) acc3;
//            acc5.loan(200.0);
//            System.out.println("Loan!");
//        }
//
//        if (acc3 instanceof SavingsAccount){
//            SavingsAccount acc5 = (SavingsAccount) acc3;
//            acc5.updateBalance();
//            System.out.println("Update!");
//        }


    }
}
