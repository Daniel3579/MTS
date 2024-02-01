package HW_5;

import HW_4.Class.CreateAnimalServiceImpl;
import HW_4.Class.Dog;
import HW_4.Class.SearchServiceImpl;
import HW_4.Enum.AnimalType;
import HW_4.Enum.Characters;
import HW_4.Enum.DogBreeds;
import HW_4.Enum.Names;
import HW_4.Interface.Animal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.testng.Assert.*;

public class Tests {

    @Test
    static public class Equals_Test {

        CreateAnimalServiceImpl createService = new CreateAnimalServiceImpl();

        @Test
        @DisplayName("Same objects equals test")
        public void testEqualsSameObjects() {
            Animal dog = createService.getUniqueAnimal(AnimalType.Dog);
            assertEquals(dog, dog);

            Animal cat = createService.getUniqueAnimal(AnimalType.Cat);
            assertEquals(cat, cat);
        }

        @Test
        @DisplayName("Not null equals test")
        public void testEqualsNullObject() {
            Animal dog = createService.getUniqueAnimal(AnimalType.Dog);
            assertNotNull(dog);

            Animal cat = createService.getUniqueAnimal(AnimalType.Cat);
            assertNotNull(cat);
        }

        @Test
        @DisplayName("Different classes not equals test")
        public void testEqualsDifferentClasses() {
            Animal dog = createService.getUniqueAnimal(AnimalType.Dog);
            Animal cat = createService.getUniqueAnimal(AnimalType.Cat);
            assertNotEquals(cat, dog);
        }

        @Test
        @DisplayName("Same classes different properties not equals test")
        public void testEqualsDifferentProperties() {
            Animal dog1 = createService.getUniqueAnimal(AnimalType.Dog);
            Animal dog2 = createService.getUniqueAnimal(AnimalType.Dog);
            assertNotEquals(dog1, dog2);

            Animal cat1 = createService.getUniqueAnimal(AnimalType.Cat);
            Animal cat2 = createService.getUniqueAnimal(AnimalType.Cat);
            assertNotEquals(cat1, cat2);
        }

        @Test
        @DisplayName("Same classes same properties equals test")
        public void testEqualsSameProperties() {
            Animal dog1 = new Dog(
                    DogBreeds.GoldenRetriever.getBreed(),
                    Names.Bruno.getName(),
                    BigDecimal.valueOf(100),
                    Characters.Agile.getCharacter(),
                    LocalDate.of(2000, 4, 14),
                    6,
                    true);

            Animal dog2 = new Dog(
                    DogBreeds.GoldenRetriever.getBreed(),
                    Names.Bruno.getName(),
                    BigDecimal.valueOf(100),
                    Characters.Agile.getCharacter(),
                    LocalDate.of(2000, 4, 14),
                    6,
                    true);

            assertEquals(dog2, dog1);
        }
    }

    static public class Find_Test {

        SearchServiceImpl searchService = new SearchServiceImpl();

        Animal dog1 = new Dog(
                DogBreeds.GoldenRetriever.getBreed(),
                Names.Bruno.getName(),
                BigDecimal.valueOf(100),
                Characters.Agile.getCharacter(),
                LocalDate.of(2000, 4, 14),
                6,
                true);

        Animal dog2 = new Dog(
                DogBreeds.GoldenRetriever.getBreed(),
                Names.Max.getName(),
                BigDecimal.valueOf(100),
                Characters.Agile.getCharacter(),
                LocalDate.of(2004, 4, 14),
                6,
                true);

        Animal dog3 = new Dog(
                DogBreeds.GoldenRetriever.getBreed(),
                Names.Emma.getName(),
                BigDecimal.valueOf(100),
                Characters.Agile.getCharacter(),
                LocalDate.of(2008, 4, 14),
                6,
                true);

        Animal dog4 = new Dog(
                DogBreeds.GoldenRetriever.getBreed(),
                Names.Jack.getName(),
                BigDecimal.valueOf(100),
                Characters.Agile.getCharacter(),
                LocalDate.of(2005, 4, 14),
                6,
                true);

        Animal dog5 = new Dog(
                DogBreeds.GoldenRetriever.getBreed(),
                Names.Jack.getName(),
                BigDecimal.valueOf(100),
                Characters.Agile.getCharacter(),
                LocalDate.of(2005, 4, 14),
                6,
                true);

        @Test
        @DisplayName("findLeapYearNames method test")
        public void testFindLeapYearNames() {
            ArrayList<String> trueAns = new ArrayList<>(Arrays.asList("Bruno", "Max", "Emma"));
            ArrayList<String> methodAns = searchService.findLeapYearNames(new ArrayList<>(Arrays.asList(dog1, dog2, dog3, dog4)));
            assertEquals(methodAns, trueAns);
        }

        @Test
        @ParameterizedTest
        @ValueSource(ints = {22, 18, 17, 14})
        @DisplayName("findOlderAnimal method test")
        public void testFindOlderAnimal(int age) {
            ArrayList<Animal> trueAns = null;

            switch (age) {
                case 22:
                    trueAns = new ArrayList<>(Arrays.asList(dog1));
                    break;
                case 18:
                    trueAns = new ArrayList<>(Arrays.asList(dog1, dog2));
                    break;
                case 17:
                    trueAns = new ArrayList<>(Arrays.asList(dog1, dog2, dog4));
                    break;
                case 14:
                    trueAns = new ArrayList<>(Arrays.asList(dog1, dog2, dog3, dog4));
                    break;
            }

            ArrayList<Animal> methodAns = searchService.findOlderAnimal(new ArrayList<>(Arrays.asList(dog1, dog2, dog3, dog4)), age);
            assertEquals(methodAns, trueAns);
        }

        @Test
        @DisplayName("findDuplicate method test")
        public void testFindDuplicate() {
            ArrayList<Animal> trueAns = new ArrayList<>(Arrays.asList(dog4));
            ArrayList<Animal> methodAns = searchService.findDuplicate(new ArrayList<>(Arrays.asList(dog1, dog2, dog3, dog4, dog5)));
            assertEquals(methodAns, trueAns);
        }
    }
}