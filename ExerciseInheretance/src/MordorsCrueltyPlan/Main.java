package MordorsCrueltyPlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> foods = Arrays.asList(br.readLine().split("\\s+"));
        Gandalf gandalf =new Gandalf(foods);
        System.out.println(gandalf);
    }
}
