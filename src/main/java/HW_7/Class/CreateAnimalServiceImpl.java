package HW_7.Class;

import HW_6.Enum.AnimalType;
import HW_6.Interface.Animal;
import HW_7.Interface.CreateAnimalService;
import org.springframework.beans.factory.annotation.Value;

public class CreateAnimalServiceImpl implements CreateAnimalService {

    private Animal animal;
    private AnimalType animalType;

    @Value("${animal.names}")
    String[] animalNames;

    @Override
    public void setAnimalType() {
        AnimalType[] animalTypes = AnimalType.values();
        animalType = animalTypes[random.nextInt(animalTypes.length)];
    }

    @Override
    public AnimalType getAnimalType() {
        return animalType;
    }

    @Override
    public void setAnimal() {
        int animalIndex = random.nextInt();
        animal = this.getUniqueAnimal(AnimalType.values()[animalIndex]);
    }

    @Override
    public Animal getAnimal() {
        return animal;
    }
}
