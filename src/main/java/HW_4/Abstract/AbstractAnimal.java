package HW_4.Abstract;

import HW_4.Interface.Animal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Stores AbstractAnimal breed, name, cost, character
 */
public abstract class AbstractAnimal implements Animal {

    protected String breed;
    protected String name;
    protected BigDecimal cost;
    protected String character;
    protected LocalDate birthDate;

    /**
     * Constructor
     *
     * @param breed abstract animal breed
     * @param name abstract animal name
     * @param cost abstract animal cost
     * @param character abstract animal character
     * @param birthDate abstract animal birthday date
     */
    public AbstractAnimal(String breed, String name, BigDecimal cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractAnimal animal = (AbstractAnimal) o;
        return breed.equals(animal.breed)
                && name.equals(animal.name)
                && cost.equals(animal.cost)
                && character.equals(animal.character)
                && birthDate.equals(animal.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, name, cost, character, birthDate);
    }
}
