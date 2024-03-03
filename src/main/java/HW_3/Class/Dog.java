package HW_3.Class;

import HW_3.Abstract.Pet;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Stores dog fields and behavior
 */
public class Dog extends Pet {

    // Unique dog class field
    private boolean uniqueDogField;

    /**
     * Constructor
     *
     * @param breed dog breed
     * @param name dog name
     * @param cost dog cost
     * @param character dog character
     * @param friendIndex dog friend index ranging from 0 to 10
     * @param uniqueDogField unique dog class field
     */
    public Dog(String breed, String name, BigDecimal cost, String character, int friendIndex, boolean uniqueDogField) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.friendIndex = friendIndex;
        this.uniqueDogField = uniqueDogField;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getCost() {
        return cost.setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public String toString() {
        return "Dog {" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                ", friendIndex=" + friendIndex +
                ", uniqueDogField=" + uniqueDogField +
                '}';
    }
}
