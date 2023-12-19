package HW_3.Class;

import HW_3.Interface.CreateAnimalService;

/**
 * Stores an overloaded method
 * <pre>    showUniqueAnimals(int n)</pre>
 * and overridden method from "CreateAnimalService" interface
 * <pre>    showUniqueAnimals()</pre> with "do while" cycle
 */
public class CreateAnimalServiceImpl implements CreateAnimalService {

    //Overloaded method. Show "n" unique animals
    public void showUniqueAnimals(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(CreateAnimalService.super.getUniqueAnimal());
        }
    }

    //Overridden method. Show 10 unique animals
    @Override
    public void showUniqueAnimals() {
        int i = 0;

        do {
            System.out.println(CreateAnimalService.super.getUniqueAnimal());
            i++;
        } while (i < 10);
    }
}
