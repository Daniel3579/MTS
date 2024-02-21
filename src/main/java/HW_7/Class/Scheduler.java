package HW_7.Class;

import HW_6.Class.AnimalsRepositoryImpl;
import HW_6.Interface.Animal;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@EnableScheduling
public class Scheduler {
    private final AnimalsRepositoryImpl animalsRepository;

    public Scheduler(AnimalsRepositoryImpl animalsRepository) {
        this.animalsRepository = animalsRepository;
    }

    @Scheduled(fixedRate = 60000)
    public void printEverySecond() {

        // Shows leap year animal names
        System.out.println("Leap year animal names:");
        System.out.println(Arrays.toString(animalsRepository.findLeapYearNames()));

        // Shows animals older than "n" age
        int n = 27;
        System.out.printf("\nAnimals older than %s:\n", n);
        showAnimals(animalsRepository.findOlderAnimal(n));

        // Shows duplicates
        System.out.println("Duplicates:");
        animalsRepository.printDuplicate();
    }

    public static void showAnimals(Animal[] animals) {
        for (Animal animal: animals) {
            System.out.println(animal);
        }
        System.out.println();
    }
}
