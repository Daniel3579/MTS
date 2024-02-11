package HW_3.Class;

import HW_3.Enum.AnimalType;
import HW_3.Interface.CreateAnimalService;

import java.util.Random;

/**
 * Stores an overloaded method
 * <pre>    showUniqueAnimals(int n)</pre>
 * and overridden method from "CreateAnimalService" interface
 * <pre>    showUniqueAnimals()</pre> with "do while" cycle
 */
public class CreateAnimalServiceImpl implements CreateAnimalService {

    private Random random = new Random();

    // Overloaded method. Show "n" unique animals
    public void showUniqueAnimals(int n) {
        for (int i = 0; i < n; i++) {
            int animalIndex = random.nextInt(4);
            System.out.println(CreateAnimalService.super.getUniqueAnimal(AnimalType.values()[animalIndex]));
        }
    }

    // Overridden method. Show 10 unique animals
    @Override
    public void showUniqueAnimals() {
        int i = 0;

        do {
            int animalIndex = random.nextInt(4);
            System.out.println(CreateAnimalService.super.getUniqueAnimal(AnimalType.values()[animalIndex]));
            i++;
        } while (i < 10);
    }
}
