package HW_4.Class;

import HW_4.Abstract.Predator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

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
     * @param birthDate wolf birthday date
     * @param teethAmount wolf teeth amount
     * @param uniqueWolfField unique wolf class field
     */
    public Wolf(String breed, String name, BigDecimal cost, String character, LocalDate birthDate, int teethAmount, boolean uniqueWolfField) {
        super(breed, name, cost, character, birthDate, teethAmount);
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
    public LocalDate getBirthday() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Wolf {" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", teethAmount=" + teethAmount +
                ", uniqueWolfField=" + uniqueWolfField +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Wolf wolf = (Wolf) o;
        return super.equals(o) && uniqueWolfField == wolf.uniqueWolfField;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), uniqueWolfField);
    }
}
