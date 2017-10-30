package FootballTeamGenerator;

import java.util.Map;

public class Team {
    private String name;
    private double rating;
    private Map<String, Player> players;

    public Team(String name) {
        this.setName(name);
        this.setRating();

    }

    private void setName(String name) {
        this.name = name;
    }

    private void setRating() {
        this.rating = calcRating();
    }

    private double calcRating() {
        if (this.players.size() > 0) {
            return this.players.values().stream().mapToDouble(Player::getOverallStat).average().getAsDouble();
        } else{
            return 0.0;
        }
    }
}
