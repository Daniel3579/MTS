package HW_3.Class;

import HW_3.Abstract.Predator;
import java.math.BigDecimal;

/**
 * <p>
 * Shark class extends Predator class
 * </p>
 * Stores shark fields and behavior
 */
public class Shark extends Predator {
    //Unique shark class field
    private boolean uniqueSharkField;

    /**
     * Constructor
     *
     * @param breed shark breed
     * @param name shark name
     * @param cost shark cost
     * @param character shark character
     * @param teethAmount shark teeth amount
     * @param uniqueSharkField unique shark class field
     */
    public Shark(String breed, String name, BigDecimal cost, String character, int teethAmount, boolean uniqueSharkField) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.teethAmount = teethAmount;
        this.uniqueSharkField = uniqueSharkField;
    }

    @Override
    public String toString() {
        return "Shark {" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                ", teethAmount=" + teethAmount +
                ", uniqueSharkField=" + uniqueSharkField +
                '}';
    }
}
