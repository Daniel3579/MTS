package HW_3.Interface;

import HW_3.Class.Cat;
import HW_3.Class.Dog;
import HW_3.Class.Shark;
import HW_3.Class.Wolf;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Interface CreateAnimalService
 */
public interface CreateAnimalService {
    String[] catBreeds = {"Siamese", "Maine Coon", "Persian"};
    String[] dogBreeds = {"Golden Retriever", "German Shepherd", "Labrador Retriever"};
    String[] sharkBreeds = {"Great White", "Tiger Shark", "Hammerhead"};
    String[] wolfBreeds = {"Gray", "Arctic", "Red"};

    String[] names = {"Bella", "Max", "Luna", "Rocky", "Stella", "Bruno", "Emma", "Jack", "Sofia", "Teddy"};
    String[] characters = {"Loyal", "Curious", "Playful", "Protective", "Independent", "Affectionate", "Energetic", "Docile", "Agile", "Intelligent"};

    //Shows 10 unique animals
    default void showUniqueAnimals() {
        int i = 0;
        while (i < 10) {
            System.out.println(getUniqueAnimal());
            i++;
        }
    }

    //Returns unique animal
    default Animal getUniqueAnimal() {
        Random random = new Random();
        /*
         * Animal index
         * 0 – Cat
         * 1 – Dog
         * 2 – Shark
         * 3 – Wolf
         */
        int animalIndex = random.nextInt(4);

        int breedIndex = random.nextInt(3); //Breed index
        int nameIndex = random.nextInt(10); //Name index
        BigDecimal cost = BigDecimal.valueOf(random.nextInt(1000 - 100 + 1) + 100); //Generate cost
        int characterIndex = random.nextInt(10); //Character index

        switch (animalIndex) {
            case (0):
                int friendIndex = random.nextInt(11); //Generate friendIndex
                boolean uniqueCatField = random.nextBoolean(); //Generate uniqueCatField
                return new Cat(catBreeds[breedIndex], names[nameIndex], cost, characters[characterIndex], friendIndex, uniqueCatField);

            case (1):
                friendIndex = random.nextInt(11); //Generate friendIndex
                boolean uniqueDogField = random.nextBoolean(); //Generate uniqueDogField
                return new Dog(dogBreeds[breedIndex], names[nameIndex], cost, characters[characterIndex], friendIndex, uniqueDogField);

            case (2):
                int teethAmount = random.nextInt(31); //Generate teethAmount
                boolean uniqueSharkField = random.nextBoolean(); //Generate uniqueSharkField
                return new Shark(sharkBreeds[breedIndex], names[nameIndex], cost, characters[characterIndex], teethAmount, uniqueSharkField);

            case (3):
                teethAmount = random.nextInt(31); //Generate teethAmount
                boolean uniqueWolfField = random.nextBoolean(); //Generate uniqueWolfField
                return new Wolf(wolfBreeds[breedIndex], names[nameIndex], cost, characters[characterIndex], teethAmount, uniqueWolfField);
        }
        return null;
    }
}
