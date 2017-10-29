package SalaryIncrease;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Person> personList = new ArrayList<>();

            while (n-- > 0) {
        try {
                String[] input = br.readLine().split("\\s+");
                personList.add(new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
            }catch (IllegalArgumentException iea) {
            System.out.println(iea.getMessage());
        }
        }

        double bonus = Double.parseDouble(br.readLine());

        for (Person person : personList) {
            person.increaseSalary(bonus);
            System.out.println(person);
        }
    }
}
