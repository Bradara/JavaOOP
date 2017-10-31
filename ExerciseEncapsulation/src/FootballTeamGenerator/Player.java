package FootballTeamGenerator;

public class Player {
    private String name;
    private double overallStat;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
        this.setOverallStat();
    }

    private void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setOverallStat() {
        this.overallStat = (this.dribble + this.endurance + this.passing + this.shooting + this.sprint) / 5.0;
    }

    private void setEndurance(int endurance) {
        validateStat(endurance, "Endurance");
        this.endurance = endurance;
    }


    private void setSprint(int sprint) {
        validateStat(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        validateStat(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        validateStat(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        validateStat(shooting, "Shooting");
        this.shooting = shooting;
    }

    private void validateStat(int stat, String statName) {
        if (stat > 100 || stat < 0) {
            throw new IllegalArgumentException(String.format("%s should be between 0 and 100.", statName));
        }
    }


    double getOverallStat() {
        return overallStat;
    }
}
