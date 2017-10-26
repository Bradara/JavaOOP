package DefiningClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Integer, BankAccount> bankAccountSet = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split("\\s+");

        while (!"End".equals(line[0])) {
            switch (line[0]){
                case "Create": createAccount(Integer.valueOf(line[1])); break;
                case "Deposit": deposit(Integer.valueOf(line[1]), Double.valueOf(line[2])); break;
                case "Withdraw": withdraw(Integer.valueOf(line[1]), Double.valueOf(line[2])); break;
                case "Print": print(Integer.valueOf(line[1])); break;
            }

            line = br.readLine().split("\\s+");
        }
    }

    private static void print(Integer id) {
        if (bankAccountSet.containsKey(id)) {
            System.out.printf("Account %s, balance %.2f%n", bankAccountSet.get(id), bankAccountSet.get(id).getBalance());
        } else{
            System.out.println("Account does not exist");
        }
    }

    private static void withdraw(Integer id, Double sum) {
        if (bankAccountSet.containsKey(id)) {
            if ((bankAccountSet.get(id).getBalance() - sum)>=0) {
                bankAccountSet.get(id).withdraw(sum);
            } else{
                System.out.println("Insufficient balance");
            }
        } else{
            System.out.println("Account does not exist");
        }
    }

    private static void deposit(Integer id, Double sum) {
        if (bankAccountSet.containsKey(id)) {
            bankAccountSet.get(id).deposit(sum);
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void createAccount(Integer id) {
        if (bankAccountSet.containsKey(id)) {
            System.out.printf("Account already exists%n");
        } else{
            BankAccount bankAccount = new BankAccount(id);
            bankAccountSet.put(id, bankAccount);
        }
    }
}
