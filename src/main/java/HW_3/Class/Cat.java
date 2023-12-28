package HW_3.Class;

import HW_3.Abstract.Pet;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Stores cat fields and behavior
 */
public class Cat extends Pet {

    // Unique cat class field
    private boolean uniqueCatField;

    /**
     * Constructor
     *
     * @param breed cat breed
     * @param name cat name
     * @param cost cat cost
     * @param character cat character
     * @param friendIndex cat friend index ranging from 0 to 10
     * @param uniqueCatField unique cat class field
     */
    public Cat(String breed, String name, BigDecimal cost, String character, int friendIndex, boolean uniqueCatField) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.friendIndex = friendIndex;
        this.uniqueCatField = uniqueCatField;
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
        return "Cat {" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                ", friendIndex=" + friendIndex +
                ", uniqueCatField=" + uniqueCatField +
                '}';
    }
}
