package CompanyRoster;

import javafx.collections.transformation.SortedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static Map<String, List<Employee>> departments = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String[] input = br.readLine().split("\\s+");
            switch (input.length) {
                case 4:
                    departments.putIfAbsent(input[3], new ArrayList<>());
                    departments.get(input[3])
                            .add(new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3]));
                    break;
                case 5:
                    departments.putIfAbsent(input[3], new ArrayList<>());
                    departments.get(input[3]).add(new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3], input[4]));
                    break;
                case 6:
                    departments.putIfAbsent(input[3], new ArrayList<>());
                    departments.get(input[3]).add(new Employee(input[0], Double.parseDouble(input[1]), input[2], input[3], input[4], Integer.parseInt(input[5])));
                    break;
            }
        }

        departments.entrySet().stream().
                sorted(Main::compare)
                .limit(1)
                .forEach(d -> {
                    System.out.println("Highest Average Salary: " + d.getKey());
                    d.getValue().stream().sorted(Main::compareSalary).forEach(System.out::println);
                });
    }

    private static int compareSalary(Employee d1, Employee d2) {
        double s1 = d1.getSalary();
        double s2 = d2.getSalary();
        return s1<s2? 1: -1;
    }

    private static int compare(Map.Entry<String, List<Employee>> d1, Map.Entry<String, List<Employee>> d2) {
        double salary1 = d1.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        double salary2 = d2.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble();

        if (salary1 > salary2) {
            return -1;
        } else {
            return 1;
        }
    }
}
//
//4
//        Pesho 120.00 Dev Development pesho@abv.bg 28
//        Toncho 333.33 Manager Marketing 33
//        Ivan 840.20 ProjectLeader Development ivan@ivan.com
//Gosho 0.20 Freeloader Nowhere 18
