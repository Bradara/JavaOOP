package FootballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<String, Team> teams = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        while (true) {
            if ("end".equalsIgnoreCase(line)) {
                break;
            }

            String[] input = line.split(";");

            try {
                switch (input[0]) {
                    case "Team":
                        addTeam(input[1]);
                        break;
                    case "Add":
                        addPlayer(input);
                        break;
                    case "Remove":
                        removePlayer(input);
                        break;
                    case "Rating":
                        showRating(input[1]);
                        break;
                }
            } catch (IllegalArgumentException iea) {
                System.out.println(iea.getMessage());
            }

            line = br.readLine();
        }
    }

    private static void showRating(String teamName) {
        if (teams.containsKey(teamName)) {
            teams.get(teamName).setRating();
            System.out.println(teams.get(teamName));
        }else{
            System.out.printf("Team %s does not exist.", teamName);
        }
    }

    private static void removePlayer(String[] input) {
        String teamName = input[1];
        String playerName = input[2];
        teams.get(teamName).removePlayer(playerName);
    }

    private static void addPlayer(String[] input) {
        String teamName = input[1];
        String playerName = input[2];
        //endurance, sprint, dribble, passing and shooting.
        int endurance = Integer.parseInt(input[3]);
        int sprint = Integer.parseInt(input[4]);
        int dribble = Integer.parseInt(input[5]);
        int passing = Integer.parseInt(input[6]);
        int shooting = Integer.parseInt(input[7]);
        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
        if (teams.containsKey(teamName)) {
            teams.get(teamName).addPlayer(player);
        } else{
            System.out.printf("Team %s does not exist.", teamName);
        }
    }

    private static void addTeam(String teamName) {
        teams.putIfAbsent(teamName, new Team(teamName));
    }
}
