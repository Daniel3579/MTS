package HW_3.Abstract;

/**
 * <p>
 * Abstract Predator class extends AbstractAnimal class
 * </p>
 * Stores "teethAmount" field, and method that returns it
 */
public abstract class Predator extends AbstractAnimal {
    //Predator teeth amount
    protected int teethAmount;

    //Returns predator teeth amount
    int getTeethAmount() {
        return teethAmount;
    }
}
