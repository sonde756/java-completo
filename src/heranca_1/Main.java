package heranca_1;

public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account(1001,"Edson",1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002,"Hudson",1000.0,0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new AccountBussines(1003,"Jose",1000.0,500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());


















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
