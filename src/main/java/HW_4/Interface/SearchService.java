package HW_4.Interface;

import java.util.ArrayList;

public interface SearchService {

    // Returns leap year animal names array
    ArrayList<String> findLeapYearNames(ArrayList<Animal> animals);

    // Returns older than "n" age animal array
    ArrayList<Animal> findOlderAnimal(ArrayList<Animal> animals, int n);

    // Shows animal duplicates
    void findDuplicate(ArrayList<Animal> animals);
}
