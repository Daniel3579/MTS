package HW_4;

import HW_4.Class.CreateAnimalServiceImpl;
import HW_4.Class.SearchServiceImpl;
import HW_4.Interface.Animal;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Creates objects
        CreateAnimalServiceImpl createService = new CreateAnimalServiceImpl();
        SearchServiceImpl searchService = new SearchServiceImpl();

        // Gets unique animal array
        ArrayList<Animal> animals = createService.getUniqueAnimals();

        // Adds duplicates
        animals.add(animals.get(0));
        animals.add(animals.get(3));
        animals.add(animals.get(7));

        // Shows all animals
        System.out.println("All animals:");
        showAnimals(animals);

        // Shows leap year animal names
        System.out.println("Leap year animal names:");
        System.out.println(searchService.findLeapYearNames(animals));

        // Shows animals older than "n" age
        int n = 27;
        System.out.printf("\nAnimals older than %s:\n", n);
        showAnimals(searchService.findOlderAnimal(animals, n));

        // Shows duplicates
        System.out.println("Duplicates:");
        searchService.findDuplicate(animals);
    }

    public static void showAnimals(ArrayList<Animal> animals) {
        for (Animal animal: animals) {
            System.out.println(animal);
        }
        System.out.println();
    }
}
