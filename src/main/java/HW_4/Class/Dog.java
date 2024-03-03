package HW_4.Class;

import HW_4.Abstract.Pet;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Stores dog fields and behavior
 */
public class Dog extends Pet {

    // Unique dog class field
    private boolean uniqueDogField;

    /**
     * Constructor
     *
     * @param breed dog breed
     * @param name dog name
     * @param cost dog cost
     * @param character dog character
     * @param birthDate dog birthday date
     * @param friendIndex dog friend index ranging from 0 to 10
     * @param uniqueDogField unique dog class field
     */
    public Dog(String breed, String name, BigDecimal cost, String character, LocalDate birthDate, int friendIndex, boolean uniqueDogField) {
        super(breed, name, cost, character, birthDate, friendIndex);
        this.uniqueDogField = uniqueDogField;
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
        return "Dog {" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", friendIndex=" + friendIndex +
                ", uniqueDogField=" + uniqueDogField +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return super.equals(o) && uniqueDogField == dog.uniqueDogField;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), uniqueDogField);
    }
}
