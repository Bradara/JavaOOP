package SortByNameAndAge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Person> personList = new ArrayList<>();

        while (n-- > 0) {
            String[] input = br.readLine().split("\\s+");
            personList.add(new Person(input[0], input[1], Integer.parseInt(input[2])));
        }

        Collections.sort(personList, Main::sortByNameThenAge);
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    private static int sortByNameThenAge(Person p1, Person p2) {
        int strComp = p1.getName().compareTo(p2.getName());

        if (strComp != 0) {
            return strComp;
        } else {
            return Integer.compare(p1.getAge(), p2.getAge());
        }

    }
}
