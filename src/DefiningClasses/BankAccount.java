package DefiningClasses;

class BankAccount {
    private int id;
    private double balance;

    BankAccount(int id) {
        this.id = id;
        this.balance = 0.0;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double sum){
        this.balance += sum;
    }

    void withdraw(double sum){
        this.balance -= sum;
    }

    public String toString(){
        return String.format("ID%d", this.id);
    }
}
