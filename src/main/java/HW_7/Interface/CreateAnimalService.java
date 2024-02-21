package HW_7.Interface;

import HW_6.Class.Entity.Cat;
import HW_6.Class.Entity.Dog;
import HW_6.Class.Entity.Shark;
import HW_6.Class.Entity.Wolf;
import HW_6.Enum.*;
import HW_6.Interface.Animal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Service
public interface CreateAnimalService {

    Random random = new Random();

    // Shows 10 unique animals
    default void showUniqueAnimals() {
        int i = 0;
        while (i < 10) {
            int animalIndex = random.nextInt(4);
            System.out.println(getUniqueAnimal(AnimalType.values()[animalIndex]));
            i++;
        }
    }

    // Returns 10 unique animals
    default ArrayList<Animal> getUniqueAnimals() {
        ArrayList<Animal> animals = new ArrayList<>();

        int i = 0;
        while (i < 10) {
            int animalIndex = random.nextInt(4);
            animals.add(getUniqueAnimal(AnimalType.values()[animalIndex]));
            i++;
        }

        return animals;
    }

    // Returns 1 unique animal
    default Animal getUniqueAnimal(AnimalType type) {
        Animal animal = null;

        int breedIndex = random.nextInt(3); // Breed index
        int nameIndex = random.nextInt(10); // Name index
        int characterIndex = random.nextInt(10); // Character index
        LocalDate birthDate = getRandDate(); // Generates birthday date

        switch (type) {
            case Cat:
                BigDecimal cost = BigDecimal.valueOf(random.nextInt(1200 - 100 + 1) + 100); // Generates cost
                int friendIndex = random.nextInt(10 + 1); // Generates friendIndex
                boolean uniqueCatField = random.nextBoolean(); // Generates uniqueCatField
                animal = new Cat(
                        CatBreeds.values()[breedIndex].getBreed(),
                        Names.values()[nameIndex].getName(),
                        cost,
                        Characters.values()[characterIndex].getCharacter(),
                        birthDate,
                        friendIndex,
                        uniqueCatField);
                break;

            case Dog:
                cost = BigDecimal.valueOf(random.nextInt(1500 - 100 + 1) + 100); // Generates cost
                friendIndex = random.nextInt(10 + 1); // Generates friendIndex
                boolean uniqueDogField = random.nextBoolean(); // Generates uniqueDogField
                animal = new Dog(
                        DogBreeds.values()[breedIndex].getBreed(),
                        Names.values()[nameIndex].getName(),
                        cost,
                        Characters.values()[characterIndex].getCharacter(),
                        birthDate,
                        friendIndex,
                        uniqueDogField);
                break;

            case Shark:
                cost = BigDecimal.valueOf(random.nextInt(10000 - 2000 + 1) + 2000); // Generates cost
                int teethAmount = random.nextInt(3000 + 1); // Generates teethAmount
                boolean uniqueSharkField = random.nextBoolean(); // Generates uniqueSharkField
                animal = new Shark(
                        SharkBreeds.values()[breedIndex].getBreed(),
                        Names.values()[nameIndex].getName(),
                        cost,
                        Characters.values()[characterIndex].getCharacter(),
                        birthDate,
                        teethAmount,
                        uniqueSharkField);
                break;

            case Wolf:
                cost = BigDecimal.valueOf(random.nextInt(700 - 500 + 1) + 500); // Generates cost
                teethAmount = random.nextInt(42 + 1); // Generates teethAmount
                boolean uniqueWolfField = random.nextBoolean(); // Generates uniqueWolfField
                animal = new Wolf(
                        WolfBreeds.values()[breedIndex].getBreed(),
                        Names.values()[nameIndex].getName(),
                        cost,
                        Characters.values()[characterIndex].getCharacter(),
                        birthDate,
                        teethAmount,
                        uniqueWolfField);
                break;
        }

        return animal;
    }

    // Sets animal type
    void setAnimalType();

    // Returns animal typr
    AnimalType getAnimalType();

    // Sets animal
    void setAnimal();

    // Returns animal
    Animal getAnimal();

    // Returns random date from 1970.01.01 to present
    default LocalDate getRandDate() {
        long randomDay = ThreadLocalRandom.current().nextLong(LocalDate.of(1970, 1, 1).toEpochDay(), LocalDate.now().toEpochDay());
        return LocalDate.ofEpochDay(randomDay);
    }
}
