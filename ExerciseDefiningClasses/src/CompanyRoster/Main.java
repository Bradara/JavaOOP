package CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<String, Employee> departments = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line = "";

        while (n-- > 0){
            String[] input = line.split("\\s+");
//            switch (input.length){
//                case 4: departments.put(input[3], new Employee(input[0],  ))
//            }
        }
    }
}
