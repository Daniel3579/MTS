package HW_7.schedule;

import ru.mts.animal.Animal;
import HW_7.repository.impl.AnimalsRepositoryImpl;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class ScheduleTimer {
    private final AnimalsRepositoryImpl animalsRepository;

    public ScheduleTimer(AnimalsRepositoryImpl animalsRepository) {
        this.animalsRepository = animalsRepository;
    }

    @Scheduled(fixedRate = 1000)
    public void printEverySecond() {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("***   Demonstration for findOlderAnimal method");
        Animal[] agedOlderAnimals = animalsRepository.findOlderAnimal(3);
        for (Animal animal : agedOlderAnimals) {
            System.out.println(animal);
        }
        System.out.println("***   Demonstration for findLeapYearNames method");
        String[] leapYearAnimalNames = animalsRepository.findLeapYearNames();
        if (leapYearAnimalNames.length == 0) {
            System.out.println("There is no leap year animal");
        }
        for (String animalName : leapYearAnimalNames) {
            System.out.println(animalName);
        }
        System.out.println("***   Demonstration for findDuplicate method");
        animalsRepository.printDuplicate();
        System.out.println("***   Map<Animal,Integer> for duplicates used in findDuplicate method");
    }
}
