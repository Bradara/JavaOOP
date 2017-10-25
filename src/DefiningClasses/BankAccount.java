package DefiningClasses;

class BankAccount {
    private int id;
    private double balance;

    public BankAccount(int id) {
        this.id = id;
        this.balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
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
