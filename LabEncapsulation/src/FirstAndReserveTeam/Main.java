package FirstAndReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Team team = new Team();

        while (n-- > 0) {
            try {
                String[] input = br.readLine().split("\\s+");
                team.addPerson(new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
            }catch (IllegalArgumentException iea) {
                System.out.println(iea.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("First team have %d players%n", team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players%n", team.getReserveTeam().size());
    }
}
