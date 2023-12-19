package HW_3.Class;

import HW_3.Abstract.Pet;
import java.math.BigDecimal;

/**
 * <p>
 * Dog class extends Pet class
 * </p>
 * Stores dog fields and behavior
 */
public class Dog extends Pet {
    //Unique dog class field
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
