package DefineClassPerson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    private static  Map<String, Person> persons = new HashMap<>();
    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = null;

        while (n-- > 0) {
            input = br.readLine().split("\\s+");
            persons.put(input[0], new Person(input[0], Integer.parseInt(input[1])));
        }

        persons.entrySet().stream().filter(v -> v.getValue().getAge()>30)
                .sorted(Comparator.comparing(p -> p.getValue().getName()))
                .forEach(p -> System.out.println(p.getValue()));

    }
}
