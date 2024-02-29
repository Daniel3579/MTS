package HW_3.Abstract;

import HW_3.Interface.Animal;

import java.math.BigDecimal;

/**
 * Stores AbstractAnimal breed, name, cost, character
 */
public abstract class AbstractAnimal implements Animal {

    protected String breed;
    protected String name;
    protected BigDecimal cost;
    protected String character;
}
