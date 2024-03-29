package HW_6.dto;

import java.util.List;
import java.util.Random;

public enum AnimalsEnum {
    PARROT,
    HAMSTER,
    BEAR,
    TIGER;

    private static final List<AnimalsEnum> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static AnimalsEnum randomAnimal() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
