package HW_3.Class;

import HW_3.Abstract.Predator;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Stores shark fields and behavior
 */
public class Shark extends Predator {

    // Unique shark class field
    private boolean uniqueSharkField;

    /**
     * Constructor
     *
     * @param breed shark breed
     * @param name shark name
     * @param cost shark cost
     * @param character shark character
     * @param teethAmount shark teeth amount
     * @param uniqueSharkField unique shark class field
     */
    public Shark(String breed, String name, BigDecimal cost, String character, int teethAmount, boolean uniqueSharkField) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.teethAmount = teethAmount;
        this.uniqueSharkField = uniqueSharkField;
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
        return "Shark {" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                ", teethAmount=" + teethAmount +
                ", uniqueSharkField=" + uniqueSharkField +
                '}';
    }
}
