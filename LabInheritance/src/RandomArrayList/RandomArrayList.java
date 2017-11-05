package RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

class RandomArrayList<Object> extends ArrayList {
    Random rnd = new Random();

    Object getRandomElement(){
        int index = rnd.nextInt(super.size()-1);
        Object elem = (Object) super.get(index);
        super.set(index, super.remove(super.size()-1));
        return elem;
    }
}