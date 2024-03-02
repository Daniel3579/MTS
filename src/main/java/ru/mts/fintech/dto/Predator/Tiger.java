package ru.mts.fintech.dto.Predator;


import ru.mts.fintech.dto.CharacterEnum;
import ru.mts.fintech.dto.NamesEnum;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Tiger extends Predator {
    public Tiger(TigerBreeds breed, NamesEnum name, double cost, CharacterEnum character, LocalDate birthDate) {
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
    protected String hunt() {
        return "The " + this.getBreed().toLowerCase().replace("_", " ") + " starts hunting";
    }

    @Override
    public String toString() {
        return "Tiger [breed=" + breed + ", name=" + name + ", cost=" + cost + ", character=" + character + ", birthDate=" + birthDate + "]";
    }
}
