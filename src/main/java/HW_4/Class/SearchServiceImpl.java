package HW_4.Class;

import HW_4.Interface.Animal;
import HW_4.Interface.SearchService;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SearchServiceImpl implements SearchService {

    // Overridden method. Returns leap year animal names array
    @Override
    public ArrayList<String> findLeapYearNames(ArrayList<Animal> animals) {
        ArrayList<String> names = new ArrayList<>();

        for (Animal animal: animals) {
            if (isLeapYear(animal.getBirthday().getYear())) {
                names.add(animal.getName());
            }
        }
        return names;
    }

    // Overridden method. Returns older than "n" age animal array
    @Override
    public ArrayList<Animal> findOlderAnimal(ArrayList<Animal> animals, int n) {
        ArrayList<Animal> result = new ArrayList<>();

        for (Animal animal: animals) {
            if (Period.between(animal.getBirthday(), LocalDate.now()).getYears() > n) {
                result.add(animal);
            }
        }

        return result;
    }

    // Overridden method. Shows animal duplicates
    @Override
    public ArrayList<Animal> findDuplicate(ArrayList<Animal> animals) {
        Set<Animal> set = new HashSet<>();
        ArrayList<Animal> duplicates = new ArrayList<>();

        for (Animal animal: animals) {
            if (!set.add(animal)) {
                duplicates.add(animal);
            }
        }

        return duplicates;
    }

    public void printDuplicate(ArrayList<Animal> animals) {
        for (Animal animal: findDuplicate(animals)) {
            System.out.println(animal);
        }
    }

    // Checks leap year
    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }

        return false;
    }
}
