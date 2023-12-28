package HW_3;

import HW_3.Class.CreateAnimalServiceImpl;

public class Main {

    public static void main(String[] args) {

        CreateAnimalServiceImpl createService = new CreateAnimalServiceImpl();

        // Shows 10 unique animals (do while)
        createService.showUniqueAnimals();

        // Shows "n" unique animals (for)
        createService.showUniqueAnimals(7);
    }
}
