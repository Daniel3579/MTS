package HW_3;

import HW_3.Class.CreateAnimalServiceImpl;

/**
 * Main class
 */
public class Main {

    public static void main(String[] args) {

        //Shows 10 unique animals (do while)
        new CreateAnimalServiceImpl().showUniqueAnimals();

        //Shows "n" unique animals (for)
        new CreateAnimalServiceImpl().showUniqueAnimals(7);
    }
}
