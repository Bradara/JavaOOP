package PawInc;

import PawInc.Animals.Animal;
import PawInc.Animals.Cat;
import PawInc.Animals.Dog;
import PawInc.Centers.Center;
import PawInc.Factories.AnimalFactory;
import PawInc.Factories.CenterFactory;

import java.util.*;
import java.util.stream.Collectors;

class AnimalCenterManager {

    private static List<Animal> cleansedAnimals = new ArrayList<>();
    private static List<Animal> adoptedAnimals = new ArrayList<>();
    private static Map<String, Center> adoptionCenters = new HashMap<>();
    private static Map<String, Center> cleansingCenters = new HashMap<>();

    static void registerCleansingCenter(String name) {
        cleansingCenters.putIfAbsent(name, CenterFactory.createCleansingCenter(name));
    }

    static void registerAdoptionCenter(String name) {
        adoptionCenters.putIfAbsent(name, CenterFactory.createAdoptionCenter(name));
    }

    static void registerDog(String name, int age, int learnedCommands, String adoptionCenterName) {
        Dog d = AnimalFactory.createDog(name, age, learnedCommands, adoptionCenterName);
        adoptionCenters.get(adoptionCenterName).addAnimal(d);
    }

    static void registerCat(String name, int age, int intelligenceCoefficient, String adoptionCenterName) {
        Cat c = AnimalFactory.createCat(name, age, intelligenceCoefficient, adoptionCenterName);
        adoptionCenters.get(adoptionCenterName).addAnimal(c);
    }

    static void sendForCleansing(String adoptionCenterName, String cleansingCenterName) {
        List<Animal> dirtyAnimal = adoptionCenters.get(adoptionCenterName).getStoredAnimals().stream().filter(animal -> !animal.isCleansed()).collect(Collectors.toList());

        for (Animal animal : dirtyAnimal) {
            cleansingCenters.get(cleansingCenterName).addAnimal(animal);
        }

        for (Animal animal : dirtyAnimal) {
            adoptionCenters.get(adoptionCenterName).removeAnimal(animal);
        }
    }

    static void cleanse(String cleansingCenterName) {
        List<Animal> animalForCleaning = cleansingCenters.get(cleansingCenterName).getStoredAnimals();
        animalForCleaning.forEach(Animal::setCleaned);

        for (Animal animal : animalForCleaning) {
            adoptionCenters.get(animal.getAdoptionCenterName()).addAnimal(animal);
            cleansedAnimals.add(animal);
        }
        cleansingCenters.get(cleansingCenterName).clean();
    }

    static void adopt(String adoptionCenterName) {
        adoptionCenters.get(adoptionCenterName).getStoredAnimals().stream().filter(Animal::isCleansed).forEach(animal -> adoptedAnimals.add(animal));
        adoptionCenters.get(adoptionCenterName).adopt();
    }

    static void printStatistics() {
        Collections.sort(adoptedAnimals, Comparator.comparing(Animal::getName));
        Collections.sort(cleansedAnimals, Comparator.comparing(Animal::getName));
        long adoptionCenterCount = adoptionCenters.size();
        long cleansingCenterCount = cleansingCenters.size();
        StringBuilder sb = new StringBuilder();
        sb.append("Paw Incorporative Regular Statistics").append(System.lineSeparator());
        sb.append("Adoption Centers: ").append(adoptionCenterCount).append(System.lineSeparator());
        sb.append("Cleansing Centers: ").append(cleansingCenterCount).append(System.lineSeparator());
        sb.append("Adopted Animals: ").
                append(adoptedAnimals.size() > 0? String.join(", ", adoptedAnimals.stream().map(Animal::toString).collect(Collectors.toList())): "None").append(System.lineSeparator());
        sb.append("Cleansed Animals: ")
                .append(cleansedAnimals.size()>0?String.join(", ", cleansedAnimals.stream().map(Animal::toString).collect(Collectors.toList())): "None").append(System.lineSeparator());
        int awaitingAdoption = adoptionCenters.values().stream().mapToInt(c -> c.getStoredAnimals().size()).sum();
        int awaitingCleansing = cleansingCenters.values().stream().mapToInt(c -> c.getStoredAnimals().size()).sum();
        sb.append(String.format("Animals Awaiting Adoption: %s%n", awaitingAdoption));
        sb.append(String.format("Animals Awaiting Cleansing: %s%n", awaitingCleansing));

        System.out.println(sb);
    }
}
