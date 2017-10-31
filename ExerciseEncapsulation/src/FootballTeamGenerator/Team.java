package FootballTeamGenerator;

import java.util.HashMap;
import java.util.Map;

class Team {
    private String name;
    private double rating;
    private Map<String, Player> players;

    Team(String name) {
        this.setName(name);
        this.players = new HashMap<>();
        this.setRating();
    }

    void addPlayer(Player player) {
        this.players.putIfAbsent(player.getName(), player);
    }

    void removePlayer(String player) {
        if (this.players.containsKey(player)) {
            this.players.remove(player);
        } else{
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.", player, this.name));
        }
    }

    private void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public void setRating() {
        if (this.players.isEmpty()) {
            this.rating = 0.0;
        } else {
            this.rating = calcRating();
        }
    }

    private double calcRating() {
        return this.players.values().stream().mapToDouble(Player::getOverallStat).average().getAsDouble();
    }

    @Override
    public String toString() {
        return String.format("%s - %.0f", this.name, this.rating);
    }
}
