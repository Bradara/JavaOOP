package MordorsCrueltyPlan;

import java.util.HashMap;
import java.util.Map;

class Food {
    Map<String, Integer> foodsIndex;

    Food() {
        foodsIndex = new HashMap<>();
        foodsIndex.put("cram", 2);
        foodsIndex.put("lembas", 3);
        foodsIndex.put("apple", 1);
        foodsIndex.put("melon", 1);
        foodsIndex.put("honeycake", 5);
        foodsIndex.put("mushrooms", -10);
    }
}
