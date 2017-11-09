package NeedForSpeed.Races;

import NeedForSpeed.Cars.Car;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

public class DragRace extends Race {
    private Map<Integer, Car> winners;
    public DragRace(int length, String route, int prize) {
        super(length, route, prize);
        this.winners = new LinkedHashMap();
    }


    private Function<Car, Integer> calcOP = c -> c.getHorsepower() / c.getAcceleration();

    void calcWinners() {
        this.getParticipants().stream().sorted(this::compareCasualRace).limit(3).forEach(c -> this.winners.put(calcOP.apply(c), c));
    }

    private int compareCasualRace(Car c1, Car c2) {
        int op1 = calcOP.apply(c1);
        int op2 = calcOP.apply(c2);

        if (op1 > op2) {
            return -1;
        } else if (op1 > op2) {
            return 1;
        }

        return 0;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        if (this.getParticipants().size() == 0) {
            return "Cannot start the race with zero participants.";
        } else {
            this.calcWinners();
            int count = 1;
            for (Integer op : winners.keySet()) {
                Car winner = this.winners.get(op);
                int prize = count == 1? this.getPrize()/2:count==2?this.getPrize()/10*3:this.getPrize()/5;
                sb.append(String.format("%d. %s %s %dPP - $%d%n",count++ , winner.getBrand(), winner.getModel(), op, prize));
            }
        }

        return sb.toString();
    }
}
