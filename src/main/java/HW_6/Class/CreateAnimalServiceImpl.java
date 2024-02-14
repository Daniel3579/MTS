package HW_6.Class;

import HW_6.Enum.AnimalType;
import HW_6.Interface.CreateAnimalService;

/**
 * Stores an overloaded method
 * <pre>    showUniqueAnimals(int n)</pre>
 * and overridden method from "CreateAnimalService" interface
 * <pre>    showUniqueAnimals()</pre> with "do while" cycle
 */
public class CreateAnimalServiceImpl implements CreateAnimalService {

    AnimalType animalType;

    // Overloaded method. Shows "n" unique animals
    public void showUniqueAnimals(int n) {
        for (int i = 0; i < n; i++) {
            int animalIndex = random.nextInt(4);
            System.out.println(CreateAnimalService.super.getUniqueAnimal(AnimalType.values()[animalIndex]));
        }
    }

    // Overridden method. Shows 10 unique animals
    @Override
    public void showUniqueAnimals() {
        int i = 0;

        do {
            int animalIndex = random.nextInt(4);
            System.out.println(CreateAnimalService.super.getUniqueAnimal(AnimalType.values()[animalIndex]));
            i++;
        } while (i < 10);
    }

    // Overridden method. Sets animal type
    @Override
    public void setAnimalType() {
        AnimalType[] animalTypes = AnimalType.values();
        animalType = animalTypes[random.nextInt(animalTypes.length)];
    }

    // Returns animal type
    AnimalType getAnimalType() {
        return animalType;
    }
}
