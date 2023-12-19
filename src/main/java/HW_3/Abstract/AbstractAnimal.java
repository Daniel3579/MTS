package HW_3.Abstract;

import HW_3.Interface.Animal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <p>
 * Abstract class AbstractAnimal
 * </p>
 * Stores AbstractAnimal breed, name, cost, character
 */
public abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;
    protected BigDecimal cost;
    protected String character;

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
}
