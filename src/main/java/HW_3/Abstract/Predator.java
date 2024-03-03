package HW_3.Abstract;

/**
 * Stores "teethAmount" field, and method that returns it
 */
public abstract class Predator extends AbstractAnimal {

    // Predator teeth amount
    protected int teethAmount;

    // Returns predator teeth amount
    public int getTeethAmount() {
        return teethAmount;
    }
}
