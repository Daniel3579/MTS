package ru.mts.service.impl;

import ru.mts.animal.Animal;
import ru.mts.factory.AnimalFactory;
import ru.mts.factory.AnimalTypes;
import ru.mts.service.CreateAnimalService;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class CreateAnimalServiceImpl implements CreateAnimalService {
    AnimalFactory animalFactory;

    private Animal animal;
    public CreateAnimalServiceImpl(AnimalFactory animalFactory){
        this.animalFactory = animalFactory;
    }

    /**
     * Получить животное из поля Animal
     *
     * @return Animal
     */
    @Override
    public Animal getAnimal() {
        return animal;
    }

    /**
     * Проинициализировать поле
     */
    @Override
    public void initAnimal() {
        animal = createRandomAnimal();
    }
    @Override
    public AnimalFactory injectForInterface(){
        return animalFactory;
    }


    /**
     * Создает N уникальных животных
     *
     * @param n Сколько животных создать
     * @return Массив животных
     */
    public Animal[] createUniqueAnimals(int n) {
        Animal[] animals = new Animal[n];

        for (int i = 0; i < n; i++) {
            animals[i] = createRandomAnimal();
        }
        return animals;
    }

    /**
     * Создает 10 различных животных циклом do while
     *
     * @return Массив животных
     */
    @Override
    public Animal[] createUniqueAnimals() {
        Animal[] animals = new Animal[10];
        int i = 0;

        System.out.println("Impl method with do while");
        do {
            animals[i] = createRandomAnimal();
            i++;
        } while (i < 10);
        return animals;
    }

    private Animal createRandomAnimal() {
        switch (ThreadLocalRandom.current().nextInt(1, 4)) {
            case 1:
                return animalFactory.getAnimal(AnimalTypes.WOLF);
            case 2:
                return animalFactory.getAnimal(AnimalTypes.SHARK);
            case 3:
                return animalFactory.getAnimal(AnimalTypes.DOG);
            case 4:
                return animalFactory.getAnimal(AnimalTypes.CAT);
            default:
                throw new IllegalStateException("Wrong ENUM type");
        }
    }
}
