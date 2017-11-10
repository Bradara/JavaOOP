package PawInc.Factories;

import PawInc.Centers.AdoptionCenter;
import PawInc.Centers.Center;
import PawInc.Centers.CleansingCenter;

public final class CenterFactory {

    private CenterFactory(){}

    public static Center createAdoptionCenter(String name){
        return new AdoptionCenter(name);
    }

    public static Center createCleansingCenter(String name){
        return new CleansingCenter(name);
    }

}
