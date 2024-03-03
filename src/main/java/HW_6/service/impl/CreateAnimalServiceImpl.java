package HW_6.service.impl;

import HW_6.dto.Animal;
import HW_6.dto.AnimalsEnum;
import HW_6.service.CreateAnimalService;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    private AnimalsEnum animalType;

    /**
     * Создает 10 уникальных животных случайного типа
     */
    @Override
    public Animal[] createAnimals() {
        Animal[] animals = new Animal[10];
        for (int i = 0; i < 10; i++) {
            animalType = AnimalsEnum.randomAnimal();
            animals[i] = createAnimal(animalType);
        }
        return animals;
    }

    @Override
    public void setAnimalType(AnimalsEnum animalsEnum) {
        this.animalType = animalsEnum;
    }
}
