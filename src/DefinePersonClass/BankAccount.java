package DefinePersonClass;

class BankAccount {
    private static final double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int id = 0;
    private int accountId;
    private double balance;

    BankAccount() {
        this.accountId = ++id;
        this.balance = 0.0;
    }

    int getAccountId() {
        return this.accountId;
    }

    double getInterest(int years) {
        return interestRate * years * this.getBalance();
    }

    static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    private double getBalance() {
        return this.balance;
    }

    void deposit(double sum) {
        this.balance += sum;
    }

    public String toString() {
        return String.format("ID%d", this.accountId);
    }
}
