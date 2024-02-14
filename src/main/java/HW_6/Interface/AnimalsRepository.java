package HW_6.Interface;

import java.util.ArrayList;
import java.util.Set;

public interface AnimalsRepository {

    ArrayList<Animal> animals = new ArrayList<>();

    // Returns leap year animal names array
    String[] findLeapYearNames();

    // Returns older than "n" age animal array
    Animal[] findOlderAnimal(int n);

    // Shows animal duplicates
    Set<Animal> findDuplicate();

    default void printDuplicate() {
        for (Animal animal: findDuplicate()) {
            System.out.println(animal);
        }
    }
}
