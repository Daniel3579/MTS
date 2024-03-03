package HW_3.Interface;

import HW_3.Class.Cat;
import HW_3.Class.Dog;
import HW_3.Class.Shark;
import HW_3.Class.Wolf;
import HW_3.Enum.*;

import java.math.BigDecimal;
import java.util.Random;

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

    // Returns one unique animal
    default Animal getUniqueAnimal(AnimalType type) {
        Animal animal = null;

        int breedIndex = random.nextInt(3); // Breed index
        int nameIndex = random.nextInt(10); // Name index
        int characterIndex = random.nextInt(10); // Character index

        switch (type) {
            case Cat:
                BigDecimal cost = BigDecimal.valueOf(random.nextInt(1200 - 100 + 1) + 100); // Generate cost
                int friendIndex = random.nextInt(10 + 1); // Generate friendIndex from 0 to 10
                boolean uniqueCatField = random.nextBoolean(); // Generate uniqueCatField
                animal = new Cat(
                        CatBreeds.values()[breedIndex].getBreed(),
                        Names.values()[nameIndex].getName(),
                        cost,
                        Characters.values()[characterIndex].getCharacter(),
                        friendIndex,
                        uniqueCatField);
                break;

            case Dog:
                cost = BigDecimal.valueOf(random.nextInt(1500 - 100 + 1) + 100); // Generate cost
                friendIndex = random.nextInt(10 + 1); // Generate friendIndex from 0 to 10
                boolean uniqueDogField = random.nextBoolean(); // Generate uniqueDogField
                animal = new Dog(
                        DogBreeds.values()[breedIndex].getBreed(),
                        Names.values()[nameIndex].getName(),
                        cost,
                        Characters.values()[characterIndex].getCharacter(),
                        friendIndex,
                        uniqueDogField);
                break;

            case Shark:
                cost = BigDecimal.valueOf(random.nextInt(10000 - 2000 + 1) + 2000); // Generate cost
                int teethAmount = random.nextInt(3000 + 1); // Generate teethAmount from 0 to 3000
                boolean uniqueSharkField = random.nextBoolean(); // Generate uniqueSharkField
                animal = new Shark(
                        SharkBreeds.values()[breedIndex].getBreed(),
                        Names.values()[nameIndex].getName(),
                        cost,
                        Characters.values()[characterIndex].getCharacter(),
                        teethAmount,
                        uniqueSharkField);
                break;

            case Wolf:
                cost = BigDecimal.valueOf(random.nextInt(700 - 500 + 1) + 500); // Generate cost
                teethAmount = random.nextInt(42 + 1); // Generate teethAmount from 0 to 42
                boolean uniqueWolfField = random.nextBoolean(); // Generate uniqueWolfField
                animal = new Wolf(
                        WolfBreeds.values()[breedIndex].getBreed(),
                        Names.values()[nameIndex].getName(),
                        cost,
                        Characters.values()[characterIndex].getCharacter(),
                        teethAmount,
                        uniqueWolfField);
                break;
        }

        return animal;
    }
}
