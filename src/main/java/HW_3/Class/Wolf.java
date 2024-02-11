package HW_3.Class;

import HW_3.Abstract.Predator;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Stores wolf fields and behavior
 */
public class Wolf extends Predator {

    // Unique wolf class field
    private boolean uniqueWolfField;

    /**
     * Constructor
     *
     * @param breed wolf breed
     * @param name wolf name
     * @param cost wolf cost
     * @param character wolf character
     * @param teethAmount wolf teeth amount
     * @param uniqueWolfField unique wolf class field
     */
    public Wolf(String breed, String name, BigDecimal cost, String character, int teethAmount, boolean uniqueWolfField) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.teethAmount = teethAmount;
        this.uniqueWolfField = uniqueWolfField;
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
        return "Wolf {" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                ", teethAmount=" + teethAmount +
                ", uniqueWolfField=" + uniqueWolfField +
                '}';
    }
}
