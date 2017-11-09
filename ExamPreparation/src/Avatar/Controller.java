package Avatar;

import Avatar.Benders.*;
import Avatar.Monuments.*;
import Avatar.Nations.*;

import java.util.ArrayList;
import java.util.List;

class Controller {

    private static List<Nation> nations = new ArrayList<>();

     static void addBender(String... input) {
        switch (input[1]) {
            case "Air":
                addAirBender(input[2], input[3], input[4]);
                break;
            case "Water":
                addWaterBender(input[2], input[3], input[4]);
                break;
            case "Fire":
                addFireBender(input[2], input[3], input[4]);
                break;
            case "Earth":
                addEarthBender(input[2], input[3], input[4]);
                break;
        }
    }

    static void addAirBender(String... input) {
        AirNation.getInstance().addBender(new AirBender(input[0], Integer.valueOf(input[1]), Double.valueOf(input[2])));
    }

    static void addWaterBender(String... input) {
        WaterNation.getInstance().addBender(new WaterBender(input[0], Integer.valueOf(input[1]), Double.valueOf(input[2])));
    }

    static void addFireBender(String... input) {
        FireNation.getInstance().addBender(new FireBender(input[0], Integer.valueOf(input[1]), Double.valueOf(input[2])));
    }

    static void addEarthBender(String... input) {
        EarthNation.getInstance().addBender(new EarthBender(input[0], Integer.valueOf(input[1]), Double.valueOf(input[2])));
    }

    static void addMonument(String... input) {
        switch (input[1]) {
            case "Air": addAirMonument(new AirMonument(input[2], Integer.valueOf(input[3])));break;
            case "Water": addWaterMonument(new WaterMonument(input[2], Integer.valueOf(input[3])));break;
            case "Fire": addFireMonument(new FireMonument(input[2], Integer.valueOf(input[3])));break;
            case "Earth": addEarthMonument(new EarthMonument(input[2], Integer.valueOf(input[3])));break;
        }
    }

    static void addAirMonument(Monument monument){
        AirNation.getInstance().addMonument(monument);
    }
    static void addWaterMonument(Monument monument){
        WaterNation.getInstance().addMonument(monument);
    }
    static void addFireMonument(Monument monument){
        FireNation.getInstance().addMonument(monument);
    }
    static void addEarthMonument(Monument monument){
        EarthNation.getInstance().addMonument(monument);
    }

    static String getStatus(String type){
        switch (type){
            case "Air":return AirNation.getStatus();
            case "Fire":return FireNation.getStatus();
            case "Water":return WaterNation.getStatus();
            case "Earth":return EarthNation.getStatus();
        }
        return null;
    }

    static void makeWar(){
        nations.add(AirNation.getInstance());
        nations.add(FireNation.getInstance());
        nations.add(WaterNation.getInstance());
        nations.add(EarthNation.getInstance());

        nations.stream().forEach(Nation::calcTotalPower);
        double maxPower = nations.stream().mapToDouble(Nation::getTotalPower).max().getAsDouble();
        nations.stream().filter(n -> n.getTotalPower() != maxPower).forEach(Nation::clearNation);
    }
}
