package HW_6.Class.Entity;

import HW_6.Abstract.Pet;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

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
     * @param birthDate cat birthday date
     * @param friendIndex cat friend index ranging from 0 to 10
     * @param uniqueCatField unique cat class field
     */
    public Cat(String breed, String name, BigDecimal cost, String character, LocalDate birthDate, int friendIndex, boolean uniqueCatField) {
        super(breed, name, cost, character, birthDate, friendIndex);
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
    public LocalDate getBirthday() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", friendIndex=" + friendIndex +
                ", uniqueCatField=" + uniqueCatField +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return super.equals(o) && uniqueCatField == cat.uniqueCatField;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueCatField);
    }
}
