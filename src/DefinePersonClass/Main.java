package DefinePersonClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Integer, BankAccount> accounts = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        while (!"End".equals(line)) {
            String[] input = line.split("\\s+");

            switch (input[0]){
                case "Create": createAccount();break;
                case "Deposit": deposit(Integer.valueOf(input[1]), Double.valueOf(input[2]));break;
                case "GetInterest": getInterest(Integer.valueOf(input[1]), Integer.valueOf(input[2]));break;
                case "SetInterest": setInterest(Double.valueOf(input[1])); break;
            }

            line = br.readLine();
        }
    }

    private static void setInterest(Double interest) {
        BankAccount.setInterestRate(interest);
    }

    private static void getInterest(Integer id, Integer year) {
        if (accounts.containsKey(id)) {
            System.out.printf("%.2f%n", accounts.get(id).getInterest(year));
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void deposit(int id, Double amount) {
        if (accounts.containsKey(id)) {
            accounts.get(id).deposit(amount);
            System.out.printf("Deposited %.0f to %s%n", amount, accounts.get(id));
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void createAccount() {
        BankAccount account = new BankAccount();
        accounts.put(account.getAccountId(), account);
        System.out.printf("Account %s created%n", accounts.get(account.getAccountId()));
    }
}

