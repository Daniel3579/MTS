package HW_4.Abstract;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Stores "teethAmount" field, and method that returns it
 */
public abstract class Predator extends AbstractAnimal {

    // Predator teeth amount
    protected int teethAmount;

    /**
     * Constructor
     *
     * @param breed predator breed
     * @param name predator name
     * @param cost predator cost
     * @param character predator character
     * @param birthDate predator birthday date
     * @param teethAmount predator teeth amount
     */
    public Predator(String breed, String name, BigDecimal cost, String character, LocalDate birthDate, int teethAmount) {
        super(breed, name, cost, character, birthDate);
        this.teethAmount = teethAmount;
    }

    // Returns predator teeth amount
    public int getTeethAmount() {
        return teethAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return super.equals(o) && teethAmount == predator.teethAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teethAmount);
    }
}
