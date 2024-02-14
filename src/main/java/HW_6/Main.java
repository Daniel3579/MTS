package HW_6;

import HW_6.Class.Config;
import HW_6.Interface.Animal;
import HW_6.Interface.AnimalsRepository;
import HW_6.Interface.CreateAnimalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Objects initialize
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AnimalsRepository animalsRepository = context.getBean(AnimalsRepository.class);
        CreateAnimalService createAnimalService = context.getBean(CreateAnimalService.class);

        // Adds duplicates
        animalsRepository.animals.add(animalsRepository.animals.get(0));
        animalsRepository.animals.add(animalsRepository.animals.get(3));
        animalsRepository.animals.add(animalsRepository.animals.get(7));

        // Shows all animals
        System.out.println("All animals:");
        showAnimals(animalsRepository.animals.toArray(Animal[]::new));

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