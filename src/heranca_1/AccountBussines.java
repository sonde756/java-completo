package heranca_1;

public class AccountBussines extends Account {

    private Double loanLimite;


    public AccountBussines() {
        super();
    }

    public AccountBussines(Integer number, String holder, Double balance, Double loanLimite) {
        super(number, holder, balance);
        this.loanLimite = loanLimite;
    }

    public void loan(double amount) {
        if (amount <= loanLimite)
            deposit(amount);
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
