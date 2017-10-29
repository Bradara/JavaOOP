package FamilyTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Person> persons = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        while (!"end".equalsIgnoreCase(line)) {
            if (line.contains("-")) {
                String[] input = line.split("-");
                Person parent = new Person();
                Person child = new Person();
                if (input[0].matches("\\d{2}/\\d{2}/\\d{4}")){
                    if (input[1].matches("\\d{2}/\\d{2}/\\d{4}")) {

                    }
                }
            }


            line = br.readLine();
        }
    }
}
