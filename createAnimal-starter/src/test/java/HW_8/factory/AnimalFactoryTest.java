package HW_8.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnimalFactoryTest {
    @Autowired
    private AnimalFactory animalFactory;

    @Test
    @DisplayName("Проверка animalFactory")
    void undefinedGetAnimalTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> animalFactory.getAnimal(AnimalTypes.UNDEFINED_ANIMAL));
    }

    @Test
    @DisplayName("Проверка на создание животных")
    void getAnimalTest(){
        Assertions.assertNotNull(animalFactory.getAnimal(AnimalTypes.WOLF));
    }
}
