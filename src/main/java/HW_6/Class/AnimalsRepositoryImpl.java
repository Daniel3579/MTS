package HW_6.Class;

import HW_6.Interface.Animal;
import HW_6.Interface.AnimalsRepository;
import HW_6.Interface.CreateAnimalService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class AnimalsRepositoryImpl implements AnimalsRepository {

    @Autowired
    private CreateAnimalService createAnimalService;

    public AnimalsRepositoryImpl() {
    }

    @PostConstruct
    public void initialize() {
        // CreateAnimalService filling animals
        this.animals.addAll(createAnimalService.getUniqueAnimals());
    }

    // Overridden method. Returns leap year animal names array
    @Override
    public String[] findLeapYearNames() {
        ArrayList<String> names = new ArrayList<>();

        for (Animal animal: this.animals) {
            if (isLeapYear(animal.getBirthday().getYear())) {
                names.add(animal.getName());
            }
        }

        return names.toArray(String[]::new);
    }

    // Overridden method. Returns older than "n" age animal array
    @Override
    public Animal[] findOlderAnimal(int n) {
        ArrayList<Animal> result = new ArrayList<>();

        for (Animal animal: this.animals) {
            if (Period.between(animal.getBirthday(), LocalDate.now()).getYears() > n) {
                result.add(animal);
            }
        }

        return result.toArray(Animal[]::new);
    }

    // Overridden method. Shows animal duplicates
    @Override
    public Set<Animal> findDuplicate() {
        Set<Animal> set = new HashSet<>();
        ArrayList<Animal> duplicates = new ArrayList<>();

        for (Animal animal: this.animals) {
            if (!set.add(animal)) {
                duplicates.add(animal);
            }
        }

        return new HashSet<>(duplicates);
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
