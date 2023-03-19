package Exercicio_oop7;

public class AccountBank {
    private int numberAccount;
    private String name;
    private double valueAccount;

    private static final double tax = 5.0;

    public AccountBank() {
    }

    public AccountBank(int numberAccount, String name, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.name = name;
        deposit(initialDeposit);
    }

    public AccountBank(int numberAccount, String name) {
        this.numberAccount = numberAccount;
        this.name = name;
    }

    public double deposit(double amount) {
        return valueAccount += amount;
    }

    public double withdraw(double amount) {
        return valueAccount -= amount + tax;
    }


    public int getNumberAccount() {
        return numberAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValueAccount() {
        return valueAccount;
    }

    @Override
    public String toString() {
        return "AccountBank: " + numberAccount +
                ", holder: " + name +
                ", Balance: " +  String.format("%.2f",valueAccount);
    }
}
