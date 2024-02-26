package ru.mts.fintech.service;


import ru.mts.fintech.dto.Animal;
import ru.mts.fintech.dto.AnimalsEnum;
import ru.mts.fintech.service.factory.AnimalFactory;

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
