package HW_6.Class.Entity;

import HW_6.Abstract.Predator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

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
     * @param birthDate shark birthday date
     * @param teethAmount shark teeth amount
     * @param uniqueSharkField unique shark class field
     */
    public Shark(String breed, String name, BigDecimal cost, String character, LocalDate birthDate, int teethAmount, boolean uniqueSharkField) {
        super(breed, name, cost, character, birthDate, teethAmount);
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
    public LocalDate getBirthday() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Shark {" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", teethAmount=" + teethAmount +
                ", uniqueSharkField=" + uniqueSharkField +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Shark shark = (Shark) o;
        return super.equals(o) && uniqueSharkField == shark.uniqueSharkField;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), uniqueSharkField);
    }
}
