package HW_3.Abstract;

/**
 * <p>
 * Abstract Pet class extends AbstractAnimal class
 * </p>
 * Stores "friendIndex" field, and method that returns it
 */
public abstract class Pet extends AbstractAnimal {
    //Pet friend index ranging from 0 to 10
    protected int friendIndex;

    //Returns pet friend index
    int getFriendIndex() {
        return friendIndex;
    }
}
