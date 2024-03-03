package HW_6.service;


import HW_6.service.factory.AnimalFactory;
import HW_6.dto.Animal;
import HW_6.dto.AnimalsEnum;

public interface CreateAnimalService {
    /**
     * Создает одно уникальное животное случайного типа
     */
    default Animal createAnimal(AnimalsEnum animal) {
        switch (animal) {
            case BEAR:
                return AnimalFactory.createBear();
            case TIGER:
                return AnimalFactory.createTiger();
            case PARROT:
                return AnimalFactory.createParrot();
            case HAMSTER:
                return AnimalFactory.createHamster();
            default:
                System.out.println("Error");
                return null;
        }
    }

    Animal[] createAnimals();

    void setAnimalType(AnimalsEnum animalsEnum);
}
