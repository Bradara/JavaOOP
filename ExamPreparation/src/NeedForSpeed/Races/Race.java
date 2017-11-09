package NeedForSpeed.Races;

import NeedForSpeed.Cars.Car;

import java.util.LinkedList;
import java.util.List;

public abstract class Race {
    private int length;
    private String route;
    private int prize;
    private List<Car> participants;
    private boolean isOpen;

    protected Race(int length, String route, int prize) {
        this.setLength(length);
        this.setRoute(route);
        this.setPrize(prize);
        this.participants = new LinkedList<>();
        this.isOpen = true;
    }

    public int getLength() {
        return length;
    }

    void setLength(int length) {
        this.length = length;
    }

    public String getRoute() {
        return route;
    }

    void setRoute(String route) {
        this.route = route;
    }

    public int getPrize() {
        return prize;
    }

    void setPrize(int prize) {
        this.prize = prize;
    }

    public List<Car> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Car> participants) {
        this.participants = participants;
    }

    public void addParticipant(Car car) {

        if (this.isOpen && !this.participants.contains(car)) {
            this.participants.add(car);
        }
    }

    @Override
    public String toString() {
        return String.format("%s - %d%n", this.route, this.length);
    }
}
