package HW_6.dto.Pet;

import HW_6.dto.CharacterEnum;
import HW_6.dto.NamesEnum;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Hamster extends Pet {
    public Hamster(HamsterBreeds breed, NamesEnum name, double cost, CharacterEnum character, LocalDate birthDate) {
        this.breed = breed.toString().replace("_", " ");
        this.name = name.toString();
        this.cost = new BigDecimal(cost).setScale(2, RoundingMode.HALF_UP);
        this.character = character.toString();
        this.birthDate = birthDate;
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
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    protected String getCare() {
        return "The " + this.getBreed().toLowerCase().replace("_", " ") + " wants to get care";
    }

    @Override
    public String toString() {
        return "Hamster [breed=" + breed + ", name=" + name + ", cost=" + cost + ", character=" + character + ", birthDate=" + birthDate + "]";
    }
}
