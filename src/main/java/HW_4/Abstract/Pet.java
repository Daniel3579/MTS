package HW_4.Abstract;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Stores "friendIndex" field, and method that returns it
 */
public abstract class Pet extends AbstractAnimal {

    // Pet friend index ranging from 0 to 10
    protected int friendIndex;

    /**
     * Constructor
     *
     * @param breed pet breed
     * @param name pet name
     * @param cost pet cost
     * @param character pet character
     * @param birthDate pet birthday date
     * @param friendIndex pet friend index ranging from 0 to 10
     */
    public Pet(String breed, String name, BigDecimal cost, String character, LocalDate birthDate, int friendIndex) {
        super(breed, name, cost, character, birthDate);
        this.friendIndex = friendIndex;
    }

    // Returns pet friend index
    public int getFriendIndex() {
        return friendIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pet pet = (Pet) o;
        return super.equals(o) && friendIndex == pet.friendIndex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), friendIndex);
    }
}
